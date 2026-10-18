from fastapi import FastAPI

app= FastAPI()

@app.get("/")
def home():
    return {"message": "KAY BGTOS?"}

@app.get("/myinfo")
def myinfo():
    return {"name": "Kay Bgtos", "age": 20, "location": "hinjewadi"}