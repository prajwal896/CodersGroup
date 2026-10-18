from fastapi import FastAPI,HTTPException
from data import menu
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

print(menu[0]["name"])