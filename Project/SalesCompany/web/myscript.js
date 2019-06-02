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
                    var flightDateAux = response.FechaDeVuelo;
                    if (flightDateAux != "Expirada") {
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

    $("#insertSellerForm").submit(function () {

        var data = {
            address: $("#address").val(),
            email: $("#email").val(),
            idSeller: parseInt($("#idSeller").val()),
            lastName: $("#lastName").val(),
            name: $("#firstName").val(),
            pendingValues: 0,
            telephone: $("#telephone").val(),
            userName: $("#userName").val(),
            password: $("#password").val()
        };
        //alert(JSON.stringify(data));
        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/seller",
            dataType: "json",
            type: "post",
            contentType: "application/json",
            data: JSON.stringify(data),
            success: function () {
                alert("Registro Correcto");
            },
            error: function () {
                alert("Error");
            }
        });

        return false;
    });

    $("#comissionForm").submit(function () {

        var search = $("#idTicket").val();
        $("#result").empty();

        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/calculateCommission/" + search,
            dataType: "json",
            type: "GET",
            success: function (response) {
                comission = $('<br><div><label for="comission">Comission</label><input class="form-control" id="comission" value=' + response.Comision + '></div>');
                comission.appendTo('#result')
            },
            error: function () {
                alert("Error");
            }
        });

        return false;
    });

    $("#loginForm").submit(function () {

        var data = {
            userName: $("#userName").val(),
            password: $("#password").val()
        };

        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/login",
            dataType: "json",
            type: "post",
            contentType: "application/json",
            data: JSON.stringify(data),
            success: function (response) {
                if (response.Execution == true) {
                    alert("Acceso Correcto");
                } else {
                    alert("Acceso Incorrecto");
                }
            },
            error: function () {
                alert("Error");
            }
        });
        return false;
    });

    $("#selectTicketForm").submit(function () {

        var search = $("#idTicket").val();
        $("#result").empty();

        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/ticket/" + search,
            dataType: "json",
            type: "get",
            success: function (response) {

                airline = $('<br><div><label for="airline">Airline</label><input class="form-control" id="airline" value=' + response.airline + '></div>');
                arrival = $('<br><div><label for="arrival">Arrival</label><input class="form-control" id="arrival" value=' + response.arrival + '></div>');
                clas = $('<br><div><label for="clas">Class</label><input class="form-control" id="clas" value=' + response.clas + '></div>');
                departure = $('<br><div><label for="departure">Departure</label><input class="form-control" id="departure" value=' + response.departure + '></div>');
                discount = $('<br><div><label for="discount">Discount</label><input class="form-control" id="discount" value=' + response.clas + '></div>');
                flightNumber = $('<br><div><label for="flightNumber">Flight Number</label><input class="form-control" id="flightNumber" value=' + response.flightNumber + '></div>');
                gate = $('<br><div><label for="gate">Gate</label><input class="form-control" id="gate" value=' + response.gate + '></div>');
                hour = $('<br><div><label for="hour">Hour</label><input class="form-control" id="hour" value=' + response.hour + '></div>');
                idSeller = $('<br><div><label for="idSeller">Id Seller</label><input class="form-control" id="idSeller" value=' + response.idSeller + '></div>');
                idTicket = $('<br><div><label for="idTicket">Id Ticket</label><input class="form-control" id="idTicket" value=' + response.idTicket + '></div>');
                price = $('<br><div><label for="price">Price</label><input class="form-control" id="price" value=' + response.price + '></div>');
                seat = $('<br><div><label for="seat">Seat</label><input class="form-control" id="seat" value=' + response.seat + '></div>');
                stock = $('<br><div><label for="stock">Stock</label><input class="form-control" id="stock" value=' + response.stock + '></div>');

                airline.appendTo('#result');
                arrival.appendTo('#result');
                clas.appendTo('#result');
                departure.appendTo('#result');
                discount.appendTo('#result');
                flightNumber.appendTo('#result');
                gate.appendTo('#result');
                hour.appendTo('#result');
                idSeller.appendTo('#result');
                idTicket.appendTo('#result');
                price.appendTo('#result');
                seat.appendTo('#result');
                stock.appendTo('#result');
            }
        });

        return false;
    });


    $("#insertTicketForm").submit(function () {

        var data = {
            airline: $("#airline").val(),
            arrival: $("#arrival").val(),
            clas: $("#clas").val(),
            date: $("#date").val(),
            departure: $("#departure").val(),
            discount: $("#discount").val(),
            flightNumber: $("#flightNumber").val(),
            gate: $("#gate").val(),
            idSeller: $("#idSeller").val(),
            idTicket: $("#idTicket").val(),
            price: $("#price").val(),
            seat: $("#seat").val(),
            stock: $("#stock").val()
        };
        //alert(JSON.stringify(data));
        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/ticket",
            dataType: "json",
            type: "post",
            contentType: "application/json",
            data: JSON.stringify(data),
            success: function () {
                alert("Registro Correcto");
            },
            error: function () {
                alert("Error");
            }
        });

        return false;
    });

    $("#deleteTicketForm").submit(function () {

        var eliminate = $("#idTicket").val();
        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/ticket/" + eliminate,
            dataType: "json",
            type: "delete",
            success: function () {
                alert("Eliminacion Correcta");
            },
            error: function () {
                alert("Error");
            }
        });

        return false;
    });


    $("#selectSellerForm").submit(function () {

        var search = $("#idTicket").val();
        $("#result").empty();

        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/seller/" + search,
            dataType: "json",
            type: "get",
            success: function (response) {

                address = $('<br><div><label for="address">Address</label><input class="form-control" id="address" value=' + response.address + '></div>');
                email = $('<br><div><label for="email">Email</label><input class="form-control" id="email" value=' + response.email + '></div>');
                idSeller = $('<br><div><label for="idSeller">Id Seller</label><input class="form-control" id="idSeller" value=' + response.idSeller + '></div>');
                lastName = $('<br><div><label for="lastName">Last Name</label><input class="form-control" id="lastName" value=' + response.lastName + '></div>');
                names = $('<br><div><label for="name">Name</label><input class="form-control" id="name" value=' + response.name + '></div>');
                pendingValues = $('<br><div><label for="pendingValues">Pending Values</label><input class="form-control" id="pendingValues" value=' + response.pendingValues + '></div>');
                telephone = $('<br><div><label for="telephone">Telephone</label><input class="form-control" id="telephone" value=' + response.telephone + '></div>');
                userName = $('<br><div><label for="userName">User Name</label><input class="form-control" id="userName" value=' + response.userName + '></div>');

                address.appendTo('#result');
                email.appendTo('#result');
                idSeller.appendTo('#result');
                lastName.appendTo('#result');
                names.appendTo('#result');
                pendingValues.appendTo('#result');
                telephone.appendTo('#result');
                userName.appendTo('#result');

            }
        });

        return false;
    });

    $("#deleteSellerForm").submit(function () {

        var eliminate = $("#idTicket").val();
        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/seller/" + eliminate,
            dataType: "json",
            type: "delete",
            success: function () {
                alert("Eliminacion Correcta");
            },
            error: function () {
                alert("Error");
            }
        });

        return false;
    });


    $("#insertSellerForm").submit(function () {

        var search = $("#idTicket").val();
        var data = {
            address: $("#address").val(),
            email: $("#email").val(),
            lastName: $("#lastName").val(),
            name: $("#firstName").val(),
            telephone: $("#telephone").val(),
            userName: $("#userName").val()
        };
        //alert(JSON.stringify(data));
        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/seller/" + search,
            dataType: "json",
            type: "put",
            contentType: "application/json",
            data: JSON.stringify(data),
            success: function () {
                alert("Actualizacion Correcta");
            },
            error: function () {
                alert("Error");
            }
        });

        return false;
    });

    $("#discountForm").submit(function () {

        var search = $("#idTicket").val();
        $("#result").empty();

        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/calculateDiscount/" + search,
            dataType: "json",
            type: "GET",
            success: function (response) {
                discount = $('<br><div><label for="discount">Discount</label><input class="form-control" id="discount" value=' + response.Descuento + '></div>');
                discount.appendTo('#result')
            },
            error: function () {
                alert("Error");
            }
        });

        return false;
    });

    $("#selectSellerTicketForm").submit(function () {

        var search = $("#idTicket").val();
        $("#result").empty();

        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/sellerTicket/" + search,
            dataType: "json",
            type: "get",
            success: function (response) {

                address = $('<br><div><label for="address">Address</label><input class="form-control" id="address" value=' + response.address + '></div>');
                email = $('<br><div><label for="email">Email</label><input class="form-control" id="email" value=' + response.email + '></div>');
                idSeller = $('<br><div><label for="idSeller">Id Seller</label><input class="form-control" id="idSeller" value=' + response.idSeller + '></div>');
                lastName = $('<br><div><label for="lastName">Last Name</label><input class="form-control" id="lastName" value=' + response.lastName + '></div>');
                names = $('<br><div><label for="name">Name</label><input class="form-control" id="name" value=' + response.name + '></div>');
                pendingValues = $('<br><div><label for="pendingValues">Pending Values</label><input class="form-control" id="pendingValues" value=' + response.pendingValues + '></div>');
                telephone = $('<br><div><label for="telephone">Telephone</label><input class="form-control" id="telephone" value=' + response.telephone + '></div>');
                userName = $('<br><div><label for="userName">User Name</label><input class="form-control" id="userName" value=' + response.userName + '></div>');

                address.appendTo('#result');
                email.appendTo('#result');
                idSeller.appendTo('#result');
                lastName.appendTo('#result');
                names.appendTo('#result');
                pendingValues.appendTo('#result');
                telephone.appendTo('#result');
                userName.appendTo('#result');

            }
        });

        return false;
    });

    $("#buyForm").submit(function () {

        var idTicket = $("#idTicket").val();
        var quantity = $("#quantity").val();
        $("#result").empty();

        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/buy/" + idTicket + "/" + quantity,
            dataType: "json",
            type: "GET",
            success: function (response) {
                var totalAux = response.Total;
                if (totalAux != null) {
                    total = $('<br><div><label for="total">Total</label><input class="form-control" id="total" value=' + response.Total + '></div>');
                    subtotal = $('<br><div><label for="subtotal">Subtotal</label><input class="form-control" id="subtotal" value=' + response.Subtotal + '></div>');
                    discount = $('<br><div><label for="discount">Discount</label><input class="form-control" id="discount" value=' + response.Descuento + '></div>');
                    comission = $('<br><div><label for="comission">Comission</label><input class="form-control" id="comission" value=' + response.Comision + '></div>');

                    total.appendTo('#result');
                    subtotal.appendTo('#result');
                    discount.appendTo('#result');
                    comission.appendTo('#result');
                } else {
                    stock = $('<br><div><label for="stock">Stock</label><input class="form-control" id="stock" value=' + response.Stock + '></div>');
                    stock.appendTo('#result');
                }

            },
            error: function () {
                alert("Error");
            }
        });

        return false;
    });


    $("#payForm").submit(function () {

        var idSeller = $("#idSeller").val();
        var payment = $("#payment").val();
        $("#result").empty();

        $.ajax({
            url: "http://localhost:8080/SalesCompany/sales/service/pay/" + idSeller + "/" + payment,
            dataType: "json",
            type: "GET",
            success: function (response) {
                if (response.Execution == true) {
                    alert("Pago Correcto");
                } else {
                    alert("Pago Incorrecto");
                }
            },
            error: function () {
                alert("Error");
            }
        });

        return false;
    });
});