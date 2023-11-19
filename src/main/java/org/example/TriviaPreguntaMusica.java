package org.example;

public enum TriviaPreguntaMusica {
    PREGUNTA_1("¿Quién es conocido como el 'Rey del Pop'?", "1) Elvis Presley", "2) Michael Jackson", "3) Madonna", (byte)2),
    PREGUNTA_2("¿Cuál es el álbum más vendido de todos los tiempos?", "1) Thriller (Michael Jackson)", "2) The Dark Side of the Moon (Pink Floyd)", "3) Back in Black (AC/DC)", (byte)1),
    PREGUNTA_3("¿Quién es la cantante conocida como 'Queen of Pop'?", "1) Whitney Houston", "2) Madonna", "3) Beyoncé", (byte)2),
    PREGUNTA_4("¿Cuál es el género musical asociado con Bob Marley?", "1) Reggae", "2) Salsa", "3) Jazz", (byte)1),
    PREGUNTA_5("¿Quién es el guitarrista principal de la banda Led Zeppelin?", "1) Eric Clapton", "2) Jimmy Page", "3) Jimi Hendrix", (byte)2),
    PREGUNTA_6("¿Cuál es el género musical de la banda U2?", "1) Rock", "2) Pop", "3) Rap", (byte)1),
    PREGUNTA_7("¿Qué instrumento tocaba el legendario músico Miles Davis?", "1) Trompeta", "2) Saxofón", "3) Piano", (byte)1),
    PREGUNTA_8("¿Cuál es la banda conocida como 'The Fab Four'?", "1) The Rolling Stones", "2) The Beatles", "3) The Who", (byte)2),
    PREGUNTA_9("¿En qué década surgió el movimiento del punk rock?", "1) 1960", "2) 1970", "3) 1980", (byte)2),
    PREGUNTA_10("¿Quién es el vocalista de la banda Queen?", "1) Freddie Mercury", "2) Mick Jagger", "3) Robert Plant", (byte)1),
    PREGUNTA_11("¿Cuál es el nombre completo de la artista conocida como 'Adele'?", "1) Adele Laurie Blue Adkins", "2) Adele Marie Johnson", "3) Adele Grace Smith", (byte)1),
    PREGUNTA_12("¿Quién es el cantante principal de la banda Coldplay?", "1) Chris Martin", "2) Thom Yorke", "3) Eddie Vedder", (byte)1),
    PREGUNTA_13("¿Cuál es el álbum más vendido de la banda Queen?", "1) A Night at the Opera", "2) News of the World", "3) The Game", (byte)1),
    PREGUNTA_14("¿Qué banda británica lanzó el álbum 'The Wall'?", "1) The Rolling Stones", "2) The Who", "3) Pink Floyd", (byte)3),
    PREGUNTA_15("¿En qué año se formó la banda de rock Guns N' Roses?", "1) 1985", "2) 1987", "3) 1989", (byte)2),
    PREGUNTA_16("¿Cuál es el nombre completo del rapero Eminem?", "1) Marshall Mathers", "2) Michael Mathews", "3) Mark Mathison", (byte)1),
    PREGUNTA_17("¿Quién es la vocalista de la banda No Doubt?", "1) Gwen Stefani", "2) Avril Lavigne", "3) Shakira", (byte)1),
    PREGUNTA_18("¿Cuál es la canción más reproducida en la historia de Spotify hasta el momento?", "1) Despacito", "2) Shape of You", "3) See You Again", (byte)2),
    PREGUNTA_19("¿Cuál es el género musical principal de la banda Metallica?", "1) Rock alternativo", "2) Heavy metal", "3) Punk rock", (byte)2),
    PREGUNTA_20("¿En qué década se popularizó el rock and roll?", "1) 1940", "2) 1950", "3) 1960", (byte)2),
    PREGUNTA_21("¿Quién es el compositor de la ópera 'Carmen'?", "1) Wolfgang Amadeus Mozart", "2) Giuseppe Verdi", "3) Georges Bizet", (byte)3),
    PREGUNTA_22("¿Cuál es el nombre de la banda liderada por Bono?", "1) U2", "2) Coldplay", "3) Radiohead", (byte)1),
    PREGUNTA_23("¿Quién es el legendario guitarrista conocido como 'Slowhand'?", "1) Eric Clapton", "2) Jimi Hendrix", "3) Jimmy Page", (byte)1),
    PREGUNTA_24("¿Cuál es el nombre completo de la cantante Beyoncé?", "1) Beyoncé Giselle Knowles", "2) Beyoncé Marie Johnson", "3) Beyoncé Grace Carter", (byte)1),
    PREGUNTA_25("¿Cuál es el álbum más exitoso de la banda AC/DC?", "1) Highway to Hell", "2) Back in Black", "3) Let There Be Rock", (byte)2),
    PREGUNTA_26("¿Quién es el líder de la banda The Rolling Stones?", "1) Paul McCartney", "2) Mick Jagger", "3) John Lennon", (byte)2),
    PREGUNTA_27("¿Cuál es la canción de Nirvana que se convirtió en un éxito masivo en la década de 1990?", "1) Smells Like Teen Spirit", "2) Come as You Are", "3) In Bloom", (byte)1),
    PREGUNTA_28("¿En qué década surgieron los Bee Gees?", "1) 1950", "2) 1960", "3) 1970", (byte)3),
    PREGUNTA_29("¿Quién es conocido como el 'Rey del Rock'?", "1) Elvis Presley", "2) Chuck Berry", "3) Little Richard", (byte)1),
    PREGUNTA_30("¿Cuál es la canción más exitosa de la banda Queen?", "1) Bohemian Rhapsody", "2) We Will Rock You", "3) Another One Bites the Dust", (byte)1);

    private final String pregunta;
    private final String respuestaA;
    private final String respuestaB;
    private final String respuestaC;
    private final byte respuestaCorrecta;

    private TriviaPreguntaMusica(String pregunta, String respuestaA, String respuestaB, String respuestaC, byte respuestaCorrecta) {
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