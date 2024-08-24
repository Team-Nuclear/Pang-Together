import requests

url = "http://127.0.0.1:5000/api/gpt"

payload = {
    "prompt": "남자 5명이서 1박 2일 캠핑가는데 장볼거 추천 좀 해줘"
}

response = requests.post(url, json=payload)  # Use the 'json' parameter

print(response.json())