package ordenacao;

import java.util.Arrays;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class ShellSort {

    /**
     * @description Método shell sort O(n^2)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return int [] - vetor ordenado 
     */
    public static int[] sort(int[] v) {
        long timeInicio =  System.currentTimeMillis();
        int h = v.length / 2;
        int valor, j, i;
        long comparacao = 0;
        long troca = 0;
        while(h > 0) {
            for(i = h; i < v.length; i++) {
                valor = v[i];
                j = i;
                comparacao++;
                while(j >= h && v[j-h] > valor) {
                    troca++;
                    v[j] = v[j-h];
                    j = j-h; 
                }
                v[j] = valor;
            }
          h = h / 2;  
        }
        System.out.println("Numero de trocas: "+troca);
        System.out.println("Numero de comparacoes: "+comparacao);
        System.out.println("Tempo total: "+(System.currentTimeMillis() - timeInicio) +" MS");
       return v;
    }
}
