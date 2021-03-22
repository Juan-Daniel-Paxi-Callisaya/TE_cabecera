  

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>INSCRIPCION DE CURSO</center></h1>
        <form action="salida_ins" method="post">
            <label>Nombre.-</label>
            <input name="nombre" type="text">
            <br><br>
            <label>Apellido.-</label>
            <input name="apellido" type="text">
            <br><br>
            <label>Cursos</label>
            <select name="cursos">
                <option value="Primero A">Primero A</option>
                <option value="Primero B">Primero B</option>
                <option value="Segundo A">Segundo A</option>
                <option value="Segundo B">Segundo B</option>
                <option value="Tercero A">Tercero A</option>
                <option value="Tercero B">Tercero B</option>
            </select>
            <br><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
