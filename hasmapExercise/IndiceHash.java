package hasmapExercise;

import java.util.Objects;

    /*
    *       Tambien se pueden agregar valores con otra clase con equals y hashCode
    */

public class IndiceHash {
    private Integer indice;

    public IndiceHash(int i) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndiceHash that = (IndiceHash) o;
        return Objects.equals(indice, that.indice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indice);
    }
}
