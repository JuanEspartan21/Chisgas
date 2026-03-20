package modelo;

import java.util.ArrayList;
import java.util.List;

public class Chisga {

    private String nombre;
    private List<Musico> musicos = new ArrayList<>();

    public Chisga(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMusico(Musico musico) {
        musicos.add(musico);
    }

    public void prepararseParaEvento() {
        System.out.println("Preparando instrumentos...");
        for (Musico m : musicos) {
            m.prepararse();
        }
    }

    public void tocarEvento(String evento) {

        System.out.println("\nLa chisga '" + nombre + "' toca en: " + evento);

        for (Musico m : musicos) {
            m.tocar();
        }
    }
}
