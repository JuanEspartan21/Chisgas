
package modelo;

/**
 *
 * @author juan-
 */
public class Violin implements Instrumento {

    public void afinar() {
        System.out.println("Afinando el violín.");
    }

    @Override
    public void preparar() {
        afinar();
    }

    @Override
    public void tocar() {
        System.out.println("El violín está sonando.");
    }
}