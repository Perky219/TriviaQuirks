package org.example;

public enum TriviaPreguntaDeporte {
    PREGUNTA_1("¿En qué año se celebró la primera Copa Mundial de la FIFA?", "1) 1930", "2) 1950", "3) 1974", (byte)1),
    PREGUNTA_2("¿Quién es considerado el mejor jugador de baloncesto de todos los tiempos?", "1) Michael Jordan", "2) LeBron James", "3) Kobe Bryant", (byte)1),
    PREGUNTA_3("¿Cuál es el deporte más popular en el mundo?", "1) Fútbol (Soccer)", "2) Baloncesto", "3) Cricket", (byte)1),
    PREGUNTA_4("¿En qué ciudad se celebraron los Juegos Olímpicos de 2016?", "1) Río de Janeiro", "2) Londres", "3) Pekín", (byte)1),
    PREGUNTA_5("¿Cuál es el récord mundial de velocidad en los 100 metros lisos?", "1) 9.58 segundos", "2) 10.12 segundos", "3) 9.86 segundos", (byte)1),
    PREGUNTA_6("¿Qué equipo de fútbol ha ganado más Copas de Europa/Champions League?", "1) Real Madrid", "2) Barcelona", "3) AC Milan", (byte)1),
    PREGUNTA_7("¿Cuántos jugadores hay en un equipo de baloncesto durante un partido?", "1) 5", "2) 6", "3) 7", (byte)1),
    PREGUNTA_8("¿En qué deporte se utiliza la expresión 'strike'?", "1) Béisbol", "2) Tenis", "3) Golf", (byte)1),
    PREGUNTA_9("¿Quién tiene el récord de más medallas de oro olímpicas en atletismo?", "1) Usain Bolt", "2) Carl Lewis", "3) Jesse Owens", (byte)1),
    PREGUNTA_10("¿Cuál es el equipo de fútbol más antiguo del mundo?", "1) Sheffield FC", "2) Manchester United", "3) Barcelona", (byte)1),
    PREGUNTA_11("¿En qué año se fundó la NBA?", "1) 1946", "2) 1954", "3) 1967", (byte)1),
    PREGUNTA_12("¿Quién ganó el Super Bowl más reciente?", "1) Kansas City Chiefs", "2) San Francisco 49ers", "3) Tampa Bay Buccaneers", (byte)3),
    PREGUNTA_13("¿En qué país se originó el cricket?", "1) Inglaterra", "2) Australia", "3) India", (byte)1),
    PREGUNTA_14("¿Cuál es el deporte nacional de Japón?", "1) Sumo", "2) Judo", "3) Karate", (byte)1),
    PREGUNTA_15("¿Quién es conocido como 'The Greatest' en el boxeo?", "1) Mike Tyson", "2) Muhammad Ali", "3) Floyd Mayweather Jr.", (byte)2),
    PREGUNTA_16("¿En qué año se celebró la primera edición de los Juegos Olímpicos modernos?", "1) 1886", "2) 1896", "3) 1904", (byte)2),
    PREGUNTA_17("¿Cuál es el deporte más practicado en el mundo?", "1) Fútbol (Soccer)", "2) Baloncesto", "3) Tenis", (byte)1),
    PREGUNTA_18("¿Quién es el máximo goleador en la historia de la Copa Mundial de la FIFA?", "1) Ronaldo Nazário", "2) Miroslav Klose", "3) Pelé", (byte)2),
    PREGUNTA_19("¿En qué deporte se utiliza una pista de hielo?", "1) Hockey sobre hielo", "2) Patinaje artístico", "3) Curling", (byte)1),
    PREGUNTA_20("¿Cuál es el deporte principal en el Tour de Francia?", "1) Ciclismo", "2) Atletismo", "3) Natación", (byte)1),
    PREGUNTA_21("¿Quién es el jugador de fútbol con más Balones de Oro?", "1) Lionel Messi", "2) Cristiano Ronaldo", "3) Neymar", (byte)1),
    PREGUNTA_22("¿Cuál es el equipo más exitoso en la historia de la Fórmula 1?", "1) Ferrari", "2) Mercedes", "3) Red Bull Racing", (byte)1),
    PREGUNTA_23("¿En qué deporte se utiliza un guante de béisbol?", "1) Fútbol", "2) Béisbol", "3) Golf", (byte)2),
    PREGUNTA_24("¿Cuántos jugadores hay en un equipo de fútbol durante un partido?", "1) 9", "2) 11", "3) 7", (byte)2),
    PREGUNTA_25("¿En qué ciudad se encuentra el famoso estadio Maracaná?", "1) Buenos Aires", "2) Río de Janeiro", "3) Madrid", (byte)2),
    PREGUNTA_26("¿Cuál es el deporte principal en los Juegos Olímpicos de Invierno?", "1) Esquí alpino", "2) Patinaje sobre hielo", "3) Luge", (byte)2),
    PREGUNTA_27("¿Quién es conocido como 'The Black Mamba' en el baloncesto?", "1) Magic Johnson", "2) Kobe Bryant", "3) Shaquille O'Neal", (byte)2),
    PREGUNTA_28("¿Cuál es el país de origen del tenista Rafael Nadal?", "1) Suiza", "2) España", "3) Estados Unidos", (byte)2),
    PREGUNTA_29("¿En qué deporte se utiliza una red y una pelota?", "1) Voleibol", "2) Bádminton", "3) Rugby", (byte)1),
    PREGUNTA_30("¿Cuál es el récord de más Grand Slams ganados en el tenis masculino?", "1) Roger Federer", "2) Rafael Nadal", "3) Novak Djokovic", (byte)3);

    private final String pregunta;
    private final String respuestaA;
    private final String respuestaB;
    private final String respuestaC;
    private final byte respuestaCorrecta;

    private TriviaPreguntaDeporte(String pregunta, String respuestaA, String respuestaB, String respuestaC, byte respuestaCorrecta) {
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
