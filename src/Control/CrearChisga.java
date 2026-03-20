package Control;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author juan-
 */
public class CrearChisga {

    public static void main(String[] args) {

        Chisga grupo = new Chisga("Cantores de Modelos");

        int nMusicos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos musicos van a tocar?"));
        for (int i = 1; i <= nMusicos; i++ ){
        grupo.agregarMusico(new Musico(JOptionPane.showInputDialog("Nombre de musico "+i+": "), InstrumentoFactory.crearInstrumentoAleatorio()));
        }
        grupo.prepararseParaEvento();
        grupo.tocarEvento("50 Años");
    }
}
