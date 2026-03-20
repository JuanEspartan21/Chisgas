# Modelos - Chisgas

## Integrantes:
Juan Steban Valbuena Nuncira - 20232020340
Jonathan Esteban

## Diagrama UML (plantUML):

@startuml
interface Instrumento {
    +tocar()
    +preparar()
}

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
class Musico {
    -nombre : String
    -instrumento : Instrumento
    +Musico(nombre, instrumento)
    +prepararse()
    +tocar()
}

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


Instrumento <|.. Guitarra
Instrumento <|.. Violin
Instrumento <|.. Tambor

CrearChisga --> Chisga
Musico --> Instrumento : usa
Chisga "1" o-- "*" Musico : contiene

@enduml

