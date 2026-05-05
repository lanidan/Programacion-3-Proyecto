public class Main {
public static void main(String[] args) {


    Apunte apunte = new Apunte(
        "POO",
        "La programación orientada a objetos es un paradigma. Se basa en clases y objetos. Permite reutilizar código."
    );

    ResumenService resumenService = new ResumenService();

    String resumen = resumenService.resumir(apunte.getContenido());

    System.out.println("Resumen:");
    System.out.println(resumen);
}


}
