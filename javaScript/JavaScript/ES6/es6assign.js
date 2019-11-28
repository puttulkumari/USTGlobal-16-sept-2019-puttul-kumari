const employees = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name: 'puttul',
            age: 22
        },{
            name: 'Yash',
            age: 8
        }])
    }else{
        reject('Failed')
    }
})
employees.then(function(data){
    console.log('employees Data',data)
}).catch(function(error){
    console.log('Failure Message',error)
})
//Closures
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value',counter)

