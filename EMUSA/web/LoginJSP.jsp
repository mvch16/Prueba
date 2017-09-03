
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/LoginJS.js" type="text/javascript"></script>
    </head>
    <body>
        
         <div id="encabezado">
            <h2>Login</h2>
            <div class="botones">
                <a href="index.html"><button type="button" class="btn btn-primary glyphicon glyphicon glyphicon-info-sign" id="enviar"></button></a>
                <a href="LoginJSP.jsp"><button type="button" class="btn btn-success glyphicon glyphicon glyphicon-off"></button></a>
            </div>
        </div>
        <div id="Sub-encabezado">
            <h2>Ingrese sus credenciales</h2><br>
        </div>
        
        <!----------------------------------------->
        
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <br/>
                <form role="form" onsubmit="return false;" id="formLogin">
                    <div class="form-group" id="groupUsario">
                        <label for="nick">Usuario:</label>
                        <input type="text" class="form-control" id="usuario" autofocus="true" placeholder="Usuario">
                    </div>

                    <div class="form-group" id="groupPassword">
                        <label for="contrasena">Contraseña:</label>
                        <input type="password" class="form-control" id="password" placeholder="Contraseña" >
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-primary" onclick="login()">Ingresar</button>
                    </div>

                    <div class="form-group height25" >
                        <div class="alert alert-success hiddenDiv" id="mesajeResult">
                            <strong id="mesajeResultNeg">Info!</strong> 
                            <span id="mesajeResultText">This alert box could indicate a neutral informative change or action.</span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-md-4"></div>
          </div>
    </body>
</html>
