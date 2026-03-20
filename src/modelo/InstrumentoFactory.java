package modelo;

import java.util.List;
import java.util.Random;

public class InstrumentoFactory {

    private static final List<Instrumento> instrumentos = List.of(
        new Guitarra(),
        new Violin(),
        new Tambor()
    );

    private static final Random random = new Random();

    public static Instrumento crearInstrumentoAleatorio() {
        return instrumentos.get(random.nextInt(instrumentos.size()));
    }
}