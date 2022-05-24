//HTML selectors
let header = document.getElementById('header_title')
// let container = document.getElementsByClassName('container')
// console.log(header)
// console.log(container)

// let items = document.getElementsByName('list-group-item')
// for(item of items){
//     console.log(items)
// }
// let li = document.getElementsByTagName('li')
// let arr = Array.prototype.slice.call(li,1,3)
// for(item of arr){
//     console.log(item)
// }
// selector key word uses #
// let selectId = document.querySelector('.selectClass')
// console.log(selectId)
   // grapping specific class or selecting a page
// let selectId = document.querySelector('p.test')
// console.log(selectId)
    //grapping the tagname
// let tagName = document.querySelectorAll('font[color=blue]')
// console.log(tagName)

// function showChange(){n
//     let change = "change the text"
//     document.getElementById("myChnage").value=change
//     console.log(first)
// }
// let menu = document.getElementsByClassName('menu')

// let li = document.createElement('li')
// li.textContent="my new item 6";

// menu[0].appendChild(li);
// console.log(menu.innerHTML)


// let divOne = document.createElement('div')
// divOne.id = 'content';
// divOne.className= 'notes'
// divOne.innerHTML='<p> create new element</p>'
// document.body.appendChild(divOne)

// let hTwo = document.createElement("h2")
// h2.textContent = "Added a h2 element to div"
// divOne.appendChild(hTwo)


function menuItemCreate(name){
    let li = document.createElement('li')
    li.textContent = name
    return li
}

const menu = document.querySelector('#menu')
menu.appendChild(menuItemCreate('home'))
menu.appendChild(menuItemCreate('About'))
menu.appendChild(menuItemCreate('Blog'))


let btnOne= document.getElementsByClassName('btnOne')

function btnClick(){
    console.log("is clicked")
    const s = document.querySelector('span')
    s.textContent = 'I have been chaged'
    btnOne.textContent= "I was clicked"
}

btnOne[0].addEventListener('click',btnClick)


