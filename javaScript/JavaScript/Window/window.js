console.log('Window object',window);
console.log('This Keyword',this);
console.log(this === window)//window obj is equal to this obj that is true

// window.alert('Welcome to javaScript Class')
// alert('Welcome UST Global and Test Yantra')

// confirm('Are you sure you want to delete');


// let confirmDelete = confirm('Are you sure you want to delete')
// console.log('Confirm Delete',confirmDelete)

// let userName = prompt('What is your name','puttul')
// console.log('User Name',userName)
const person = {
    firstName : 'Alia',
    age : 26,
    lastName: 'Kapoor',
    getName: function(){              //function expression
        return this.firstName + ' '+this.lastName
    }
}
let fullName = person.getName()//invoking function using keyword that is why using this keyword and complete obj store inside of this keyword
console.log('Full Name',fullName)

