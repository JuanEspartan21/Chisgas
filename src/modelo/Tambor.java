
package modelo;

/**
 *
 * @author juan-
 */
public class Tambor implements Instrumento {

    @Override
    public void preparar() {
        // El tambor no necesita afinación
        System.out.println("El tambor está listo.");
    }

    @Override
    public void tocar() {
        System.out.println("El tambor está sonando.");
    }
}
