# Modelos - Chisgas

## Integrantes:
Juan Steban Valbuena Nuncira - 20232020340
Jonathan Esteban

## Diagrama UML (plantUML):

@startuml

' ---------------- INTERFACE ----------------
interface Instrumento {
    +tocar()
    +preparar()
}

' ---------------- INSTRUMENTOS ----------------
class Guitarra {
    +afinar()
    +tocar()
    +preparar()
}

class Violin {
    +afinar()
    +tocar()
    +preparar()
}

class Tambor {
    +tocar()
    +preparar()
}

class InstrumentoFactory {
    +crearInstrumentoAleatorio() : Instrumento
}
' ---------------- MUSICO ----------------
class Musico {
    -nombre : String
    -instrumento : Instrumento
    +Musico(nombre, instrumento)
    +prepararse()
    +tocar()
}

' ---------------- CHISGA ----------------
class Chisga {
    -nombre : String
    -musicos : List<Musico>
    +Chisga(nombre)
    +agregarMusico(musico)
    +prepararseParaEvento()
    +tocarEvento(evento)
}

class CrearChisga {
+main(String[] args)
}

' ---------------- RELACIONES ----------------

Instrumento <|.. Guitarra
Instrumento <|.. Violin
Instrumento <|.. Tambor

CrearChisga --> Chisga
CrearChisga --> InstrumentoFactory
Musico --> Instrumento : usa
Chisga "1" o-- "*" Musico : contiene

InstrumentoFactory --> Instrumento : crea
InstrumentoFactory --> Guitarra
InstrumentoFactory --> Violin
InstrumentoFactory --> Tambor

@enduml
