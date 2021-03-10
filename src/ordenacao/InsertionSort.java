package ordenacao;

import java.util.Timer;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class InsertionSort {

    /**
     * @description Método insertion sort O(n^2)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static int[] sort(int[] vetor) { 
        long timeInicio =  System.currentTimeMillis();
        int j;
        int key;
        int i;
        int troca = 0;
        int comparacao = 0;

        for (j = 1; j < vetor.length; j++) {
          key = vetor[j];
          comparacao++;
          for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
            troca++;
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }
        System.out.println("Numero de trocas: "+troca);
        System.out.println("Numero de comparacoes: "+comparacao);
        System.out.println("Tempo total: "+(System.currentTimeMillis() - timeInicio) +" MS");
        return vetor;
    }

}
