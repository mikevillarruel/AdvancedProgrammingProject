/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    /*Escucha el evento submit del boton ubicado en myform*/
    $("#dateForm").submit(function () {

        var search = $("#idTicket").val();
        $("#result").empty();
        if (search == '') {

            alert("Please enter something in the field first");

        } else {
            /*Ejecuta la consulta y activa la funcion que tiene como parametro la respuesta de dicha consulta*/
            $.ajax({
                url: "http://localhost:8080/SalesCompany/sales/service/calculateDate/" + search,
                dataType: "json",
                type: "get",
                success: function (response) {
                    var fv = response.FechaDeVuelo;
                    if (fv != "Expirada") {
                        flightDate = $('<br><div><label for="flightDate">Flight Date</label><input class="form-control" id="flightDate" value=' + response.FechaDeVuelo + '></div>');
                        missingDays = $('<br><div><label for="missingDays">Missing Days</label><input class="form-control" id="missingDays" value=' + response.DiasFaltantes + '></div>');
                        currentDate = $('<br><div><label for="currentDate">Current Date</label><input class="form-control" id="currentDate" value=' + response.FechaActual + '></div>');
                        flightDate.appendTo('#result');
                        missingDays.appendTo('#result');
                        currentDate.appendTo('#result');
                    } else {
                        flightDate = $('<br><div><label for="flightDate">Flight Date</label><input class="form-control" id="flightDate" value=' + response.FechaDeVuelo + '></div>');
                        flightDate.appendTo('#result');
                    }
                }
            });
        }
        return false;
    });
});