<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>REGISTRO DE USUARIO</center></h1>
        <form action="salida_usu" method="post">
            <label>Nombre.-</label>
            <input name="nombre" type="text">
            <br><br>
            <label>Apellido.-</label>
            <input name="apellido" type="text">
            <br><br>
            <label>Correo Electronico.-</label>
            <input name="correo" type="gmail">
            <br><br>
            <label>Contraseña.-</label>
            <input name="contra" type="passwoed">
            <br><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
