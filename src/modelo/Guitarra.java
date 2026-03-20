
package modelo;

/**
 *
 * @author juan-
 */
public class Guitarra implements Instrumento {

    public void afinar() {
        System.out.println("Afinando la guitarra.");
    }

    @Override
    public void preparar() {
        afinar();
    }

    @Override
    public void tocar() {
        System.out.println("La guitarra está sonando.");
    }
}