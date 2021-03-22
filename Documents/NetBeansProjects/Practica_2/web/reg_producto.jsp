<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>REGISTRO DE PRODUCTOS</center></h1>
        <form action="salida_prod" method="post">

            <label>Producto.-</label>
            <input name="producto" type="text">
            <br><br>
            <label>Categoria</label>
            <select name="categoria">
                <option value="A">A</option>
                <option value="B"> B</option>
                <option value="C">C</option>
                <option value="D">D</option>
                <option value="E">E</option>
                <option value="F">F</option>
            </select>
            <br><br>
            <label>Existencia.-</label>
            <input name="existencia" type="text">
            <br><br>
            <label>Precio.-</label>
            <input name="precio" type="numer">
            <br><br>
            <input type="submit" value="Enviar">


        </form>
    </body>
</html>
