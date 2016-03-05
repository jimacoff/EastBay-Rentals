document.getElementsByTagName('button').onClick = calc();


function calc(){
	var from = document.getElementById('from');
	var to = document.getElementById('to');
	alert(to.value);
}