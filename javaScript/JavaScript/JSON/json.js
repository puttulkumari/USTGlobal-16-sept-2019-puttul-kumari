const person = {
    name: 'Sundara',
    age: 100,
    address: {
        city: 'Bijapur',
        state: 'karnataka',
        pincode: 591115
    },
    hobbies: ['Coding','Bird Watching','Singing']
}
console.log('javaScript person Object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person Object',jsonObject)
const javaScriptPersonObject = JSON.parse(jsonObject)
console.log('javaScript person Object after parse,javaScriptObjectPerson')
localStorage.setItem('email','puttul.kumari01@gmail.com')
const emailID = localStorage.getItem('email')
console.log('Email ID',emailID)
localStorage.clear();



