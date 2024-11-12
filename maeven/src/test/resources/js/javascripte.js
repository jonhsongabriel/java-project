
function ajouterLigne() { 
var nom = document.getElementById('nom').value; 
var prenom = document.getElementById('prenom').value; 
var age = document.getElementById('age').value; 
var adresse = document.getElementById('adresse').value; 
var contact = document.getElementById('contact').value; 
var email = document.getElementById('email').value; 
var table = document.getElementById('userTable'); 
var row = table.insertRow(); 
row.innerHTML = '<td>' + nom  +'</td><td>' + prenom + '</td><td>'+  age + '</td><td>' + adresse + '</td><td>' + contact  +'</td><td>'+  email + '</td>'; 
                        
} 