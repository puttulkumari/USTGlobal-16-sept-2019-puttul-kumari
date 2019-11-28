let myName: string = "mikel";
console.log(myName,typeof myName);

let age: number;
console.log(age,typeof age);

let mobileNumber = "835839618";
console.log(mobileNumber,typeof mobileNumber);

let address;//it is any type memans anything it can take as a input
address = "frgwr";//that is why typeScript is dynamic in nature
address = 85865;
console.log(address,typeof address);

let calAge = function() : void{
    console.log("age is 26");

}
calAge();

class  Person {
    constructor(public name: string,public age: number){

    }
}
let person1 = new Person("mikel",24);
console.log(person1);

class Student extends Person{
    constructor(name: string,age: number,public rollno: number){
        super(name,age);
    }
}

let student1 = new Student("john",24,122);
console.log(student1);
          



