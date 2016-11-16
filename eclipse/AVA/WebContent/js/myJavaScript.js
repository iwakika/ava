function abrirNav() {
	var mySidenav = document.getElementById("mySidenav");
	var myMain = document.getElementById("myMain");

	if (mySidenav.style.display === 'block') {
		mySidenav.style.display = 'none';
		myMain.style.margin = '0px 0px';
	} else {
		mySidenav.style.display = 'block';
		myMain.style.margin = '0px 300px';
	}
}

/*function validaForm() {
	var user = document.forms["myForm"]["usuario"].value;
	var pass = document.forms["myForm"]["senha"].value; 
	
	if (user == "" || user == null || pass == "" || pass == null) {
		alert("Usuario e senha devem ser preenchido")
	}
}*/
