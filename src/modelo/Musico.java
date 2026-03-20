
package modelo;

/**
 *
 * @author juan-
 */

public class Musico {

    private String nombre;
    private Instrumento instrumento;

    public Musico(String nombre, Instrumento instrumento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }

    public void prepararse() {
        instrumento.preparar();
    }

    public void tocar() {
        System.out.println(nombre + " empieza a tocar:");
        instrumento.tocar();
    }
}

