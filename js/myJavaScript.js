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

var text = "";
var disciplinas = ["CMP.103.0.1", "CMP.93.0.1", "SIS.82.2.1", "CMP.151.0.3"];
var descricao = ["Desenvolvimento para Web", "Linguagens de Programação", "Processo de Software II", "Teoria dos Grafos"];

for (var i = 0; i < disciplinas.length; i++) {
    text += '<dt><a href="#" class="padding"><i class="material-icons colored">class</i>&nbsp; ' + disciplinas[i] + '</a></dt>';
    text += '<dd>' + descricao[i] + '</dd>';
}
document.getElementById("id01").innerHTML = text;
