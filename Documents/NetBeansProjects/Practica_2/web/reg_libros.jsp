<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>Registro de libros</center></h1>
        <form action="salida_lib" method="post">
            <label>Titulo</label>
            <input name="titulo" type="text">
            <br><br>
            <label>Autor</label>
            <input name="autor" type="text">
            <br><br>
            <label>Resumen</label>
            <textarea name="resumen"></textarea>
            <br><br>
            <label>Medio</label>
            <br><br>
            <input type="radio" name="medio" value="fisico">fisico
            <br>
            <input type="radio" name="medio" value="Magneto" />Magneto
            <br><br>
            <input type="submit" value="enviar">
        </form>
    </body>
</html>
