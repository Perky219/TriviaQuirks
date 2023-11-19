package org.example;

public enum TriviaPreguntaTecnologia {
    PREGUNTA_1("¿En qué año se fundó la empresa Apple?", "1) 1976", "2) 1983", "3) 1991", (byte)1),
    PREGUNTA_2("¿Quién es el cofundador de Microsoft junto con Bill Gates?", "1) Steve Jobs", "2) Paul Allen", "3) Mark Zuckerberg", (byte)2),
    PREGUNTA_3("¿Cuál es el sistema operativo de código abierto desarrollado por Linus Torvalds?", "1) Windows", "2) macOS", "3) Linux", (byte)3),
    PREGUNTA_4("¿En qué año se lanzó la primera versión de Android?", "1) 2005", "2) 2007", "3) 2008", (byte)3),
    PREGUNTA_5("¿Cuál es la compañía que desarrolló el motor de búsqueda Google?", "1) Microsoft", "2) Apple", "3) Alphabet Inc.", (byte)3),
    PREGUNTA_6("¿Cuál es la red social centrada en la fotografía y propiedad de Facebook?", "1) Twitter", "2) Instagram", "3) Snapchat", (byte)2),
    PREGUNTA_7("¿Qué significa la sigla 'URL' en informática?", "1) Universal Resource Locator", "2) Uniform Resource Locator", "3) Universal Reference Locator", (byte)2),
    PREGUNTA_8("¿Cuál es el lenguaje de programación creado por James Gosling y Mike Sheridan?", "1) Java", "2) Python", "3) C++", (byte)1),
    PREGUNTA_9("¿En qué año se lanzó el primer iPhone?", "1) 2005", "2) 2007", "3) 2010", (byte)2),
    PREGUNTA_10("¿Cuál es el navegador web desarrollado por Mozilla?", "1) Chrome", "2) Firefox", "3) Safari", (byte)2),
    PREGUNTA_11("¿Cuál es la empresa líder en el desarrollo de procesadores para computadoras personales?", "1) AMD", "2) Intel", "3) NVIDIA", (byte)2),
    PREGUNTA_12("¿Qué sigla se utiliza para describir la memoria de acceso aleatorio?", "1) ROM", "2) RAM", "3) CPU", (byte)2),
    PREGUNTA_13("¿Cuál es el nombre del sistema operativo para dispositivos móviles desarrollado por Google?", "1) iOS", "2) Android", "3) Windows Phone", (byte)2),
    PREGUNTA_14("¿Qué significa 'www' en una dirección web?", "1) World Web Wide", "2) Web World Wide", "3) World Wide Web", (byte)3),
    PREGUNTA_15("¿Cuál es el protocolo de transferencia de archivos utilizado para cargar y descargar archivos en la web?", "1) FTP", "2) HTTP", "3) TCP", (byte)1),
    PREGUNTA_16("¿Qué sigla se utiliza para describir el formato de archivo de documentos portátiles?", "1) PDF", "2) TXT", "3) DOC", (byte)1),
    PREGUNTA_17("¿En qué año se lanzó el primer navegador web gráfico ampliamente utilizado?", "1) 1989", "2) 1993", "3) 1996", (byte)2),
    PREGUNTA_18("¿Cuál es el nombre del primer ordenador personal de Apple lanzado al mercado?", "1) Macintosh", "2) Apple II", "3) iMac", (byte)2),
    PREGUNTA_19("¿Qué significa 'HTML' en el contexto de desarrollo web?", "1) HyperText Markup Language", "2) High Tech Machine Language", "3) HyperTransfer Markup Language", (byte)1),
    PREGUNTA_20("¿Cuál es el nombre del primer virus informático conocido?", "1) ILOVEYOU", "2) Melissa", "3) Brain", (byte)3),
    PREGUNTA_21("¿Cuál es el propósito principal del software antivirus?", "1) Acelerar la computadora", "2) Proteger contra virus y malware", "3) Crear copias de seguridad", (byte)2),
    PREGUNTA_22("¿En qué año se lanzó la plataforma de videos en línea YouTube?", "1) 2003", "2) 2005", "3) 2007", (byte)2),
    PREGUNTA_23("¿Qué término se utiliza para describir el acto de copiar y pegar información en la web?", "1) Cut and Paste", "2) Copy and Paste", "3) Paste and Copy", (byte)2),
    PREGUNTA_24("¿Cuál es el nombre del primer videojuego de la historia?", "1) Pong", "2) Space Invaders", "3) Pac-Man", (byte)1),
    PREGUNTA_25("¿Qué sigla se utiliza para describir la resolución de pantalla estándar en alta definición?", "1) HD", "2) SD", "3) 4K", (byte)1),
    PREGUNTA_26("¿En qué año se fundó la empresa Microsoft?", "1) 1975", "2) 1980", "3) 1985", (byte)1),
    PREGUNTA_27("¿Cuál es el nombre del sistema operativo para computadoras personales desarrollado por Microsoft?", "1) macOS", "2) Windows", "3) Linux", (byte)2),
    PREGUNTA_28("¿Qué sigla se utiliza para describir la tecnología de comunicación inalámbrica de corto alcance?", "1) NFC", "2) GPS", "3) LTE", (byte)1),
    PREGUNTA_29("¿En qué año se lanzó el primer teléfono inteligente iPhone?", "1) 2005", "2) 2007", "3) 2010", (byte)2),
    PREGUNTA_30("¿Cuál es el nombre del sistema operativo móvil desarrollado por Apple?", "1) Android", "2) iOS", "3) Windows Phone", (byte)2);

    private final String pregunta;
    private final String respuestaA;
    private final String respuestaB;
    private final String respuestaC;
    private final byte respuestaCorrecta;

    private TriviaPreguntaTecnologia(String pregunta, String respuestaA, String respuestaB, String respuestaC, byte respuestaCorrecta) {
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
