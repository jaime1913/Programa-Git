<?php

$conn = new mysqli("localhost", "root", "", "farmacia");

if ($conn->connect_error) {
    die("Error de conexión");
}

$nombre = $_POST['nombre'];
$telefono = $_POST['telefono'];

$sql = "INSERT INTO clientes(nombre, telefono)
VALUES('$nombre', '$telefono')";

if($conn->query($sql) === TRUE){

    echo "Cliente guardado correctamente";

}else{

    echo "Error al guardar";
}

$conn->close();

?>