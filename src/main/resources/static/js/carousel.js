var slideIndex = 1;
var num = 1;

showSlides(slideIndex);
toCcy(num);

function toCcy(num){
    var nf = new Intl.NumberFormat();
    num = Math.round(num*100)/100;
    num = nf.format(num);
    return num;
}

function formatAmt() {
    var num = document.getElementById("loanAmt").value;
    if (isNaN(num)){
        document.getElementById("loanAmt").value = '';
        document.getElementById('errorname').innerHTML="Please enter a valid loan amount.";
    } else {
        num = toCcy(num);
        document.getElementById('errorname').innerHTML="";
        document.getElementById("loanAmt").value = num;
    }
}

// format amounts on result window
function formatPayterm(){
    var numArr = document.querySelectorAll(".amt");
    for (var i = 0, len = numArr.length; i < len; i++) {
        var num = toCcy(numArr[i].innerHTML);
        numArr[i].innerHTML = num;
    }
}

function plusSlides(n) {
    showSlides(slideIndex += n);
}

function showSlides(n) {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    if (n > slides.length) {
        slideIndex = 1
    }
    if (n < 1) {slideIndex = slides.length}
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    
    slides[slideIndex-1].style.display = "block";
}