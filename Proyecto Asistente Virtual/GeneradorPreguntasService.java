import java.util.ArrayList;
import java.util.List;

public class GeneradorPreguntasService {

    public List<Pregunta> generarPreguntas(String texto) {

        List<Pregunta> preguntas = new ArrayList<>();

        // Dividimos el texto en frases usando el punto
        String[] frases = texto.split("\\.");

        for (String frase : frases) {

            frase = frase.trim();

            // Ignoramos frases muy cortas
            if (frase.length() < 15) {
                continue;
            }

            // Buscamos frases que contengan " es "
            if (frase.contains(" es ")) {

                String[] partes = frase.split(" es ");

                if (partes.length >= 2) {

                    String preguntaTexto = "¿Qué es " + partes[0] + "?";
                    String respuesta = partes[1];

                    Pregunta pregunta = new Pregunta(
                            preguntaTexto,
                            respuesta
                    );

                    preguntas.add(pregunta);
                }
            }
        }

        return preguntas;
    }
}
