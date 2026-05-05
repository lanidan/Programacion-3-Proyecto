import java.util.ArrayList;
import java.util.List;

public class Materia {
private String nombre;
private List<Apunte> apuntes;


public Materia(String nombre) {
    this.nombre = nombre;
    this.apuntes = new ArrayList<>();
}

public void agregarApunte(apunte Apunte) {
    apuntes.add(Apunte);
}

public List<apunte> getApuntes() {
    return apuntes;
}

public String getNombre() {
    return nombre;
}


}
