from fastapi import FastAPI

app= FastAPI()

@app.get("/")
def home():
    return {"message": "KAY BGTOS?"}

@app.get("/myinfo")
def myinfo():
    return {"name": "Kay Bgtos", "age": 20, "location": "hinjewadi"}

@app.get("/about")
def about():
    return {"message": "I am a software developer and I love coding."}

@app.get("/about/{name}")
def greet(name: str):
    return {"message": f"im {name} and I am a software developer."}

@app.get("/add/{num1}")
def square(num1: int):
    return {"result": num1 ** num1}