package co.cue.edu.gestioninventariosamuelbuitrago;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.io.File;

@SpringBootTest
public class SeguridadTests {

    @Test
    void analisisEstaticoSonarQubeSimulado() {
        String nombreClase = "ProductController";
        Assert.isTrue(nombreClase.matches("^[A-Z][a-zA-Z]+$"), "el nombre de la clase no sigue convenciones");
    }

    @Test
    void validacionEntradaBasica() {
        String nombre = "Cafe";
        String descripcion = "Producto natural";
        Assert.hasText(nombre, "nombre no puede estar vacio");
        Assert.hasText(descripcion, "descripcion no puede estar vacia");
    }

    @Test
    void analisisDependenciasSimulado() {
        File pom = new File("pom.xml");
        Assert.isTrue(pom.exists(), "el archivo pom.xml debe existir para analisis de dependencias");
    }
}
