from fastapi import FastAPI,HTTPException
from data import menu
from pydantic import BaseModel
app= FastAPI()

# //@app.get("/")
# //def home():
#     return {"message": "KAY BGTOS?"}

# @app.get("/myinfo")
# def myinfo():
#     return {"name": "Kay Bgtos", "age": 20, "location": "hinjewadi"}

# @app.get("/about")
# def about():
#     return {"message": "I am a software developer and I love coding."}

# @app.get("/about/{name}")
# def greet(name: str):
#     return {"message": f"im {name} and I am a software developer."}

# @app.get("/add/{num1}")
# def square(num1: int):
#     return {"result": num1 ** num1}

# @app.get("/add")
# def add(a: int, b: int):
#     return {"a": a, "b": b, "sum": a + b}

# @app.get("/divide")
# def divide(a: float, b: float):
#     if(b == 0):
#         raise HTTPException(status_code=400, detail="ZERO SE DIVIDE KYU KRRA")
#     return {"a": a, "b": b, "result": a / b}

#print(menu[0]["name"])
@app.get("/menu")
def get_menu():
    return {"menu": menu}

@app.get("/menu/{item_id}")
def get_item(item_id: int):
    for item in menu:
        if item["id"] == item_id:
            return {"name": item}
    raise HTTPException(status_code=404, detail="Item not found")

class NewItem(BaseModel):
    name: str
    price: float
    veg: bool

@app.post("/menu", status_code=201)
def add_items(item: NewItem):
    new_id= len(menu)+1
    item = {
        "id": new_id,
        "name": item.name,
        "price": item.price,
        "veg": item.veg
    }
    menu.append(item)
    return {"message": "Item added successfully", "item": item}

@app.delete("/delete/{item_id}")
def delete(item_id: int):
    for item in menu:
        if item["id"] == item_id:
            menu.remove(item)
            return {"message": f"Item with ID {item_id} deleted successfully"}
    raise HTTPException(status_code=404, detail="Item not found")