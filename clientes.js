guardarCliente() {

    let nombre = document.getElementById("nombre").value;
    let telefono = document.getElementById("telefono").value;

    if(nombre === "" || telefono === "") {

        document.getElementById("mensaje").innerHTML =
        "Complete todos los campos";

        return;
    }

    fetch("guardar_cliente.php", {

        method: "POST",

        headers: {
            "Content-Type": "application/x-www-form-urlencoded"
        },

        body:
        "nombre=" + encodeURIComponent(nombre) +
        "&telefono=" + encodeURIComponent(telefono)

    })

    .then(response => response.text())

    .then(data => {

        document.getElementById("mensaje").innerHTML = data;

        document.getElementById("nombre").value = "";
        document.getElementById("telefono").value = "";

    });
}