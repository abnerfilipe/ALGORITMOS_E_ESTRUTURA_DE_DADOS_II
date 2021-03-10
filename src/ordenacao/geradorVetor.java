import java.util.Random;

public class geradorVetor {
    public static int[] crescente(int tamanho) {

        int vetorCrescente[] = new int[tamanho];
        for (int i = 0; i < vetorCrescente.length; i++) {
            vetorCrescente[i] = i; // adding all the numbers between 1-1m to a list.
        }
        return vetorCrescente;
    }

    public static int[] Decrescente(int tamanho) {
        int vetorDecrescente[] = new int[tamanho];
        for (int i = vetorDecrescente.length - 1, cont = 0; i > 0; i--, cont++) {
            vetorDecrescente[cont] = i; // adding all the numbers between 1-1m to a list.
        }
        return vetorDecrescente;
    }
    public static int[] randon(int tamanho) {
        Random gerador = new Random();
        int vetorRandomico[] = new int[tamanho];
        for (int i = 0; i < vetorRandomico.length; i++) {
            vetorRandomico[i] = gerador.nextInt(vetorRandomico.length); // adding all the numbers between 1-1m to a list.
        }
        return vetorRandomico;
    }
}
