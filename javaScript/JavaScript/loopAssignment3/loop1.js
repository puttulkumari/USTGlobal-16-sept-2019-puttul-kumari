//For of loop
var laptop = ['Dell','Lenovo','HP','Apple'];
console.log('For of loop')
for(var element of laptop)
{
    console.log('Laptop =',element);
}
console.log('==================')
var cloths = ['top','jeans','tshirt','saari'];
console.log('For of loop')
for(var element of cloths)
{
console.log('cloths=',element);

}
console.log('=======================')
var oils = ['coconut','kesh king','amul'];
console.log('For of loop')
for(var element of oils)
{
    console.log('oils =',element)
}
console.log('======================')
var person = ['Puttul','Sona','Mona','kiyaan','Yash','Shanu'];
console.log('For of loop')
for(var element of person)
{
    console.log('person=',element)
}
console.log('====================')

var vehicles = ['car','motorcar','audi','hunda'];
console.log('For of loop')
for(var element of vehicles)
{
    console.log('vehicles =',element)
}                                                                           //for of loop
console.log('================')
var vegitables=['Potato','Tomato','Cabage'];
console.log('For of loop')
for(var element of vegitables)
{
    console.log('vegitables=',element)
}
console.log('=================')


var NailPentColor=['Red','Yellow','purple'];
console.log('For of loop')
for(var element of NailPentColor)
{
    console.log('naliPentColor=',element)
}
console.log('=================')
var college=['Reva','KPM','Ramaiya'];
console.log('For of loop')
for(var element of college)
{
    console.log('College=',element)
}
console.log('=================')
var shops=['Surf','Rice','Daal'];
console.log('For of loop')
for(var element of shops)
{
    console.log('Shops=',shops)
}
console.log('=================')
var states=['MP','Bihar','UP'];
console.log('For of loop')
for(var element of states)
{
    console.log('States=',states)
}
console.log('=================')

console.log('=================')
//For in Loop

console.log('For in loop')
for(var index in vegitables)
{
    console.log('Value = ',vegitables[index])
}

console.log('=================')
console.log('For in loop')
for(var index in vehicles)
  {
      console.log('value = ',vehicles[index]);
  }  
  
  console.log('=================')
  console.log('For in loop')
for(var index in person)
{
    console.log('values = ',person[index])
}
console.log('==================')
console.log('For in loop')                                             //for in loop
for(var index in oils)
{
    console.log('values = ',oils[index])
}
console.log('==================')
console.log('For in loop')
for(var index in laptop)
{
    console.log('values = ',laptop[index])
}
console.log('==================')
console.log('For in loop')
for(var index in cloths)
{
    console.log('values = ',cloths[index])
}
console.log('For in loop')
for(var index in states)
{
    console.log('values = ',states[index])
}
console.log('==================')
//For in loop with Object
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
console.log('=====================')
console.log('For in loop in object')

var items = {
    item: 'Potato',
    price: 10,
    id: 2
    }
    for(var key in items)
    {
        console.log('value = ',items[key])
    }
    console.log('==================')
    console.log('For in loop in object')

var laptops = {
    laptop: 'Dell',
    id: 1,
    color: 'Silver'
}
for(var key in laptops)
{
    console.log('value = ',laptops[key])
}

console.log('==================')
console.log('For in loop in object')
var items = {
    item : 'bangles',
    id : 1,
    price : 100
}
for(var key in items)
{
    console.log('value = ',items[key])
}
console.log('==================')

//ForEach Method plus forEach method 


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
console.log('===================')
var vegitables = ['Potato','Tomato','cauliflower'];
vegitables.forEach(function(value,index){
console.log('vegitables = ',value)

})
console.log('=======================')
var items = [{
item: 'Potato',
price: 10,
id: 2
},
{
    item: 'Tomato',
    id: 1,
    price: 23

},
{
    item: 'Cauliflower',
    id: 5,
    price: 40
}]
items.forEach(function(item,index)
{
    console.log('Item = ',item)
    console.log('Index of item = ',index)
})


console.log('========================')
var cloths = ['top','jeans','tshirt','lower'];
cloths.forEach(function(value,index)
{
    console.log('cloths = ',value)
})
console.log('========================')
var items = [{
    item: 'top',
    id: 1,
    color: 'white'
},
{
    item: 'jeans',
    id: 2,
    color: 'black'
},
{
    item: 'tshirt',
    id: 5,
    color: 'red'
},
{
    item: 'lower',
    id: 4,
    color: 'green'
}]
items.forEach(function(item,index)
{
console.log('Item = ',item)
console.log('Index of item = ',index)
})

console.log('=============================')
var person = ['puttul','sona','mona','kiyaan','yash','shanu'];
person.forEach(function(value,index)
{
    console.log('person = ',value)
})
var persons = [{
    person: 'puttul',
    id: 1,
    color: 'Yellow'
},
{
person: 'sona',
id: 4,
color: 'white'
},
{
    person: 'mona',
    id: 2,
    color: 'white'
},
{
    person: 'kiyaan',
    id: 3,
    color: 'white'
}]
persons.forEach(function(value,index)
{
    console.log('Persons = ',person)
    console.log('Index of person = ',index)
})
console.log('===================')
var laptop = ['Dell','Lenovo','Apple'];
laptop.forEach(function(value,index)
{
    console.log('laptop = ',value)
})
var laptops = [{
    laptop: 'Dell',
    id: 1,
    color: 'Silver'
},
{
    laptop: 'Lenovo',
    id: 2,
    color: 'Black'
},
{
    laptop: 'Apple',
    id: 3,
    color: 'Red'
}]
laptops.forEach(function(laptop,index)
{
    console.log('Laptops = ',laptop)
    console.log('Index of laptop = ',index)

})
console.log('======================')
//For loop
var names = ['puttul','sona','mona','yash']
for(var i=0;i<names.length;i++)
{
console.log(names[i])
}
console.log('======================')
var colors = ['Green','Red','Yellow']
for(var i=0;i<colors.length;i++)
{
    console.log(colors[i])
}
console.log('======================')
var vehicles = ['Car','Byke','Audi']
for(var i=0;i<vehicles.length;i++)
{
    console.log(vehicles[i])
}
console.log('======================')
var fruits = ['Mango','Lichi','Orange']
for(var i=0;i<fruits.length;i++)
{
    console.log(fruits[i])
}
console.log('======================')
var items = ['Bangles','Eyeliner','Lipstick']
for(var i=0;i<items.length;i++)
{
    console.log(items[i])
}
console.log('======================')
var states = ['Bihar','MP','UP']
for(var i=0;i<states.length;i++)
{
    console.log(states[i])
}