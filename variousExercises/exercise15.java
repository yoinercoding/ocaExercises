package variousExercises;

public class exercise15 {
    public static void main(String[] args) {
    }
    public void bubble(int[] A) {
        int i, j, aux;
        for(i = 0; i < A.length; i++) {
            for(j = 0; j < A.length -i -1; j++) {
                if(A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
