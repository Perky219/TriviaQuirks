package org.example;

public enum TriviaPreguntaSorpresa {
    PREGUNTA_1("¿Cuál es la capital de Australia?", "1) Sídney", "2) Melbourne", "3) Canberra", (byte)3),
    PREGUNTA_2("¿En qué año se fundó Google?", "1) 1996", "2) 1998", "3) 2000", (byte)2),
    PREGUNTA_3("¿Quién escribió 'Cien años de soledad'?", "1) Mario Vargas Llosa", "2) Gabriel García Márquez", "3) Julio Cortázar", (byte)2),
    PREGUNTA_4("¿Cuál es la montaña más alta del mundo?", "1) Everest", "2) K2", "3) Kilimanjaro", (byte)1),
    PREGUNTA_5("¿En qué año se lanzó el primer iPhone?", "1) 2005", "2) 2007", "3) 2010", (byte)2),
    PREGUNTA_6("¿Cuántos continentes hay en el mundo?", "1) 5", "2) 6", "3) 7", (byte)3),
    PREGUNTA_7("¿Quién pintó la Mona Lisa?", "1) Vincent van Gogh", "2) Leonardo da Vinci", "3) Pablo Picasso", (byte)2),
    PREGUNTA_8("¿Cuál es el océano más grande?", "1) Atlántico", "2) Índico", "3) Pacífico", (byte)3),
    PREGUNTA_9("¿En qué año se estableció la Declaración de Independencia de los Estados Unidos?", "1) 1776", "2) 1789", "3) 1804", (byte)1),
    PREGUNTA_10("¿Cuál es el idioma más hablado en el mundo?", "1) Inglés", "2) Mandarín", "3) Español", (byte)2),
    PREGUNTA_11("¿Cuál es la moneda oficial de Japón?", "1) Yuan", "2) Won", "3) Yen", (byte)3),
    PREGUNTA_12("¿En qué año se firmó la Declaración de Derechos Humanos?", "1) 1945", "2) 1948", "3) 1952", (byte)2),
    PREGUNTA_13("¿Quién fue el primer presidente de Estados Unidos?", "1) Thomas Jefferson", "2) Abraham Lincoln", "3) George Washington", (byte)3),
    PREGUNTA_14("¿Cuál es el país más grande del mundo por territorio?", "1) China", "2) Canadá", "3) Rusia", (byte)3),
    PREGUNTA_15("¿En qué año comenzó la Primera Guerra Mundial?", "1) 1914", "2) 1917", "3) 1920", (byte)1),
    PREGUNTA_16("¿Quién escribió 'Romeo y Julieta'?", "1) William Shakespeare", "2) Jane Austen", "3) Charles Dickens", (byte)1),
    PREGUNTA_17("¿Cuál es la segunda lengua más hablada del mundo?", "1) Hindi", "2) Español", "3) Inglés", (byte)2),
    PREGUNTA_18("¿En qué año se inauguró la Torre Eiffel?", "1) 1885", "2) 1889", "3) 1895", (byte)2),
    PREGUNTA_19("¿Quién pintó 'La noche estrellada'?", "1) Claude Monet", "2) Vincent van Gogh", "3) Pablo Picasso", (byte)2),
    PREGUNTA_20("¿Cuál es el río más largo del mundo?", "1) Amazonas", "2) Nilo", "3) Yangtsé", (byte)1),
    PREGUNTA_21("¿En qué país se originó el sushi?", "1) China", "2) Japón", "3) Tailandia", (byte)2),
    PREGUNTA_22("¿Cuál es el instrumento musical más antiguo?", "1) Flauta", "2) Tambor", "3) Lira", (byte)1),
    PREGUNTA_23("¿Qué científico formuló la teoría de la relatividad?", "1) Isaac Newton", "2) Galileo Galilei", "3) Albert Einstein", (byte)3),
    PREGUNTA_24("¿Cuál es el desierto más grande del mundo?", "1) Atacama", "2) Sáhara", "3) Gobi", (byte)2),
    PREGUNTA_25("¿En qué año se estableció la Unión Europea?", "1) 1957", "2) 1972", "3) 1985", (byte)1),
    PREGUNTA_26("¿Quién escribió '1984'?", "1) Aldous Huxley", "2) George Orwell", "3) Ray Bradbury", (byte)2),
    PREGUNTA_27("¿Cuál es el planeta más grande del sistema solar?", "1) Marte", "2) Júpiter", "3) Saturno", (byte)2),
    PREGUNTA_28("¿En qué año se fundó la Cruz Roja?", "1) 1863", "2) 1875", "3) 1891", (byte)1),
    PREGUNTA_29("¿Quién es el autor de 'Don Quijote de la Mancha'?", "1) Miguel de Cervantes", "2) Federico García Lorca", "3) Gabriel García Márquez", (byte)1),
    PREGUNTA_30("¿Cuál es el metal más abundante en la corteza terrestre?", "1) Hierro", "2) Aluminio", "3) Cobre", (byte)2);

    private final String pregunta;
    private final String respuestaA;
    private final String respuestaB;
    private final String respuestaC;
    private final byte respuestaCorrecta;

    private TriviaPreguntaSorpresa(String pregunta, String respuestaA, String respuestaB, String respuestaC, byte respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaA = respuestaA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getPregunta() {
        return this.pregunta;
    }

    public String getRespuestaA() {
        return this.respuestaA;
    }

    public String getRespuestaB() {
        return this.respuestaB;
    }

    public String getRespuestaC() {
        return this.respuestaC;
    }

    public byte getRespuestaCorrecta() {
        return this.respuestaCorrecta;
    }
}