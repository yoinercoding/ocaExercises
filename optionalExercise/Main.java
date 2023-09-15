package optionalExercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("Matematicas", 3));
        notas.add(new Nota("Fisica", 9));
        notas.add(new Nota("Frances", 5));
        notas.add(new Nota("Quimica", 4));

        Optional<Nota> oNota = buscarNotaSobresaliente(notas);
        if(oNota.isPresent()) {
            Nota nota = oNota.get();
            System.out.println(nota.getValor());
            System.out.println(nota.getAsignatura());
        }
    }

    public static Optional<Nota> buscarNotaSobresaliente(List<Nota> notas) {

        for (Nota unaNota:notas) {
            if(unaNota.getValor()>=9) {
                return Optional.of(unaNota);
            }
        }
        return Optional.empty();
    }
}
