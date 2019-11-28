//Named Functions
function add(num1,num2){
    console.log('Sum=',num1+num2);

}
add(10,20);
//Function Expression (Anonymous)
var sub = function(num1,num2)
{
var subValue = num1-num2;
return subValue;

}
var value = sub(90,89)
console.log('Value=',value);
console.log('hello'); //this is the place where we need to put ; color befor invoked the function
function add(num1,num2,num3)
{
    console.log('Sum Value=',num1+num2+num3);

}

(function(num1,num2)
{
    console.log('value=',num1*num2);
})(10,20)
var div=(num1,num2)=>{
    console.log('value=',num1/num2);
}
div(10,5);
var div1=num1=>{
    console.log('value=',num1);
}
div1(4);
var div2=num1=>console.log(num1);
var add1=(num1,num2)=>num1+num2;
var value=add(10,20);


greeting('puttul');
function greeting(msg){
    console.log('hello',msg);
}


greets('Dinga');
var greets=(msg)=> {
    console.log('hi',msg);
}
console.log(hoist);
var hoist = 10;
function hoisting(){
    console.log(hoistingA);
    var hoistingA=10;

}
hoisting();