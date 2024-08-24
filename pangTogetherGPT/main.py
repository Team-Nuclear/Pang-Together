import sys
import os
from flask import Flask, request, jsonify
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from pangTogetherGPT.gptUtil import *

app = Flask(__name__)

@app.route('/api/gpt', methods=['POST'])
def gpt():
    data = request.get_json()
    prompt = data.get('prompt')
    content = getGptResponse(prompt)
    response = {
        "content": content
    }
    
    return jsonify(response)

if __name__ == '__main__':
    app.run(debug=True)