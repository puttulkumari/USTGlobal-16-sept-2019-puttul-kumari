const hobbies = ['Sleeping','Cricket','Eating','Coding','Roaming']
console.log(typeof hobbies);
const isArrayOrNot = Array.isArray(hobbies)
console.log('Hobbies array or not',isArrayOrNot);
const hasCricket = hobbies.includes('Cricket');
console.log('Using includes method',hasCricket)
hobbies.push('Guitar','Volleyball')
console.log('After push method',hobbies)
hobbies.pop()
console.log('After pop method',hobbies)
hobbies.unshift('Numismatics','Singing')
console.log('After Unshift method',hobbies)
hobbies.shift()
console.log('After Shift method',hobbies)


console.log('=====================')
const hobbies1 = ['Sleeping','Cricket','Eating','Coding','Roaming']
hobbies1.splice(1,2,'Bird Watching','PUBG')
console.log('After Slice method',hobbies1)

// const afterSlice = hobbies1.slice(2,4)
// console.log('After Slice method',hobbies1)
// console.log('After Slice method',afterSlice)

const afterSlice = hobbies1.slice(2,4)
console.log('After slice method',hobbies1)
console.log('After slice method',afterSlice)

const indexOfCoding = hobbies1.indexOf('Coding',2)
console.log('Index of coding,indexOfCoding')
const stringhobbies = hobbies1.join('-')
console.log('After join method ',stringhobbies)
const numbers = [100,200,300,400]
const nums1 = numbers.map(function(value,index){
    let newValue = value + 50
    return newValue
})
console.log('After Map method',nums1)

const nums2 = numbers.map(value=>value+50)
console.log('After Map arrow function',nums2)
console.log('=====================')
const filterNum = 
numbers.filter(function(value,index)
{
    if(value>200)
    {
        return true
    }
    else{
        return false
    }
})
console.log('After filter method',filterNumber)
// const filterNumArrow = 
numbers.filter(value=>value>200)






