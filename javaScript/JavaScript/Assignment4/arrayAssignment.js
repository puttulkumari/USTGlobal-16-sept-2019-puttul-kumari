//using array method
const movies = ['Dangal','Ghayal','Baaghi','Police Public','Aashiqui','Dream Girl']
const m1 = Array.isArray('movies');
console.log(m1);
const m2 = movies.includes('Ghayal',1);
console.log(m2);
const m3 = movies.push('3 idiot','teri meri kahani');
console.log(m3);
movies.pop();
const m4 =  movies.unshift('kabhi khushi kabhi gam','Raabta');
console.log(m4);
movies.shift();
movies.splice(1,0,'Rab Ne Bana Di Joori','Kalyaan');
movies.indexOf('Baaghi',3);
movies.join('-')


console.log('========================');
const college = ['Reva','President','KNS','MP']
const col = Array.isArray('Reva');
console.log(col);
const col2 = college.includes('RV college',2);
console.log(col2);
college.pop();
const col3 = college.unshift('Ramaiya');
console.log(col3)
college.shift();
movies.splice(1,2,'Reva','Temple');
movies.indexOf('MP',2);
movies.join('-')

console.log('========================');


const relations= ['Sister','Mom','Papa','Bro']
const rel = Array.isArray('Mom');
console.log(rel);
const rel2 = college.includes('Wife',2);
console.log(rel2);
college.pop();
const rel3 = college.unshift('maa');
console.log(rel3)
college.shift();
movies.splice(1,3,'Mom','GrandPaa');
movies.indexOf('Papa',2);
movies.join('-')


console.log('========================');


const company= ['ibm','tcs','cognizant','tata']
const com = Array.isArray('tcs');
console.log(com);
const com2 = company.includes('cisco',2);
console.log(com2);
college.pop();
const com3 = company.unshift('tata');
console.log(com3)
college.shift();
movies.splice(2,4,'Blue Green','Forest');
movies.indexOf('tcs',2);
movies.join('-')

console.log('========================');
const colors = ['Red','Yellow','Purple','Green']
const cr = Array.isArray('Green');
console.log(cr);
const cr1 = colors.includes('Black',2);
console.log(cr1);
college.pop();
const cr3 = colors.unshift('Pink');
console.log(cr3)
college.shift();
movies.splice(2,3,'Blue','Pink');
movies.indexOf('Red',0);
movies.join('-')

console.log('========================');


//using String method

let c1 = "Bangalore is golden city";
c2 = c1.toUpperCase();
console.log(c2);
c3 = c1.toLowerCase();
console.log(c3);
c4 = c1.charAt(5)
console.log(c4);
c5 = c1.indexOf('ga',3);
console.log(c5);
c6 = c1.includes('dd',4);
console.log(c6);
c7 = c1.replace('de','re');
console.log(c7);
c8 = c1.search('ol');
console.log(c8);
c9 = c1.trim();
console.log(c9);
c10 = c1.substr(0,6);
console.log(c10);
c11 = c1.split('l');
console.log(c11);
c12 = c1.split('g');
console.log(c12);

console.log('=======================')


let p2 = "Bangalore weather is always perfect";
p3 = p2.toUpperCase();
console.log(p3);
p4 = p2.toLowerCase();
console.log(p4);
p5 = p2.charAt(5)
console.log(p5);
p6 = p2.indexOf('we',5);
console.log(p6);
p7 = p2.includes('fe',6);
console.log(p7);
p8 = p2.replace('is','of');
console.log(p8);
p9 = p2.search('er');
console.log(p9);
p10 = p2.trim();
console.log(p10);
p11 = p2.substr(0,7);
console.log(p11);
p12 = p2.split('t');
console.log(p12);
p13 = p2.split('e');
console.log(p13);
console.log('=======================')


let k2 = "i love my parents";
k3 = k2.toUpperCase();
console.log(k3);
k4 = k2.toLowerCase();
console.log(k4);
k5 = k2.charAt(4)
console.log(k5);
k6 = k2.indexOf('re',3);
console.log(k6);
k7 = k2.includes('my',2);
console.log(k7);
k8 = k2.replace('lo','mo');
console.log(k8);
k9 = k2.search('ve');
console.log(k9);
k10 = k2.trim();
console.log(k10);
k11 = k2.substr(0,5);
console.log(k11);
k12 = k2.split('v');
console.log(k12);
k13 = k2.split('n');
console.log(k13);
console.log('=======================')


let f2 = "family is my life";
f3 = f2.toUpperCase();
console.log(f3);
f4 = f2.toLowerCase();
console.log(f4);
f5 = f2.charAt(3)
console.log(f5);
f6 = f2.indexOf('fa',3);
console.log(f6);
f7 = f2.includes('my',2);
console.log(f7);
f8 = f2.replace('is','of');
console.log(f8);
f9 = f2.search('is');
console.log(f9);
f10 = f2.trim();
console.log(f10);
f11 = f2.substr(0,7);
console.log(f11);
f12 = f2.split('m');
console.log(f12);
f13 = f2.split('l');
console.log(f13);
