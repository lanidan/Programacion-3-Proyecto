public class ResumenService {


public String resumir(String texto) {
    String[] frases = texto.split("\\.");
    StringBuilder resumen = new StringBuilder();

    int limite = Math.min(3, frases.length);

    for (int i = 0; i < limite; i++) {
        resumen.append(frases[i]).append(". ");
    }

    return resumen.toString();
}


}
