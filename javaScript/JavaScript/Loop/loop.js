var brands = ['kingfisher','bisleri','kinley'];
console.log('For of Loop')
for(var element of brands){
    console.log('Brand=',element);
}
console.log('=====================');
console.log('For in Loop')
for(var index in brands){
    console.log('Brand=',brands[index])
}
console.log('=========================');
console.log('For in Loop for Object')
var person = {
    name : 'Sundari',
    age : 33,
    color : 'white'
}
for(var key in person)
{
    console.log('Value=',person[key])

}
console.log('=====================');
var movies = ['Sholay','kabhi khushi khabhi gam','Jay ho','Dream Girl'];
movies.forEach(function(value,index){
    console.log('movie=',value)
})
console.log('===================')
var items = [{
    item : 'bangles',
    id : 1,
    price : 100
},
{
    item : 'watch',
    id : 3,
    price : 5000
},
{
    item : 'bike',
    id : 4,
    price : 10000000
}
]
items.forEach(function(item,index){
    console.log('Item=',item)
    console.log('Index of item = ',index)
})


// Variable caese possible in javaScript

console.log('=======================')
var name;
var name = 'Pailwan';
name = 'Prasthanam'
//console.log(name1)
let name1;
//let name1 = 'Saaho'
name1 = 'Valmiki'
//const name2;
const name2 = 'Dream Girl'
//name2 = 'Kabir Singh'

// for(var i = 0;i<5;i++)
// {
//     console.log('Inside for loop',i)

// }
// console.log('Outside for loop',i)
console.log('=======================')
for(let i = 0;i<5;i++)
{
    console.log('Inside for loop',i)

}
console.log('Outside for loop',i)
console.log('=======================')

