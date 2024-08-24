import openai

openai.api_key = ''

def getGptResponse(prompt) :
    response = openai.chat.completions.with_raw_response.create(
        model="gpt-3.5-turbo",
        messages=[
            {
                "role": "user",
                "content": prompt,
            }
        ],
    )
    completion = response.parse()
    tRet = completion.choices[0].message.content
    return tRet
