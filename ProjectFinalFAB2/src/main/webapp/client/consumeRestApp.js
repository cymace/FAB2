$http.get("http://10.48.101.6:8080/ProjectFinalFAB2/plates").
success(function(data, status) {
    $scope.donnees = data;
}).
error(function(data, status) {
    document.getElementById("erreur").innerHTML = "Erreur lors de l'appel du json"
});

