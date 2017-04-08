function fnCheckLicence(){
    var age = prompt("Enter Age ", "18")
    var name = prompt("Enter Your Name ","No Name")

    if(age >=18){
        document.write("You are eligible for gettting driving licence");
    }else{
        document.write("Sorry wait for " + (18-age) +" years")
    }

}


function fnCheck(){
    var str = "ABC";
    var i =123;
    var b = true;

    console.log(str + i);
    console.log(i + b);
    console.log(5+154e-2);
    console.log("$$$ " + 5+154e-2);
    console.log("55" * 10 )


    console.log(true ==1);
    console.log("1"==1);

    console.log(true===1);

    console.log(10/"abc");

    if(isNaN(10/"abc")){
        console.log("please dont divide by chars")
    }else{
        console.log("well done ");
    }

}


/*

function display(val){
    console.log("Display with one args..." + val);
}
*/


function display(){
    console.log("Number of args passed -> " + display.arguments.length)
    for(i=0; i<display.arguments.length; i++){
        console.log(display.arguments[i]);
    }
}


result= 100;
function sum(){
    var val1 = 200;
    val2 = 200;
    console.log("val1 in sum " + val1);
    console.log("val 2 in sum " + val2);
    console.log("result in sum " + result)
}

function fnTest(){
    //  console.log("val1 in fnTest  " + val1);
    console.log("val 2 in fnTest " + val2);
    console.log("result in fnTest " + result)
}