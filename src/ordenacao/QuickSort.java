package ordenacao;

import java.util.Arrays;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class QuickSort {
    public long troca;
    public long comparacao;

   public int[] sort(int[] v, int inicio, int fim) {
       int i = inicio;
       int j = fim;
       int pivo = v[(inicio + fim)/2];

       while(i <= j) {
           comparacao++;
           if(v[i] < pivo){
               i++;
           }else{
               comparacao++;
               if(v[j] > pivo){
                   j--;
               }else {
                   comparacao++;
                   if(i <= j) {
                       troca++;
                       trocar(v,i,j);
                       i++;
                       j--;
                   }
               }
           }
       }

       if(inicio < j)
           sort(v, inicio, j);

       if(i < fim)
           sort(v, i, fim);
 
//       System.out.println("Tempo total: "+(System.currentTimeMillis() - timeInicio) +" MS");
       return v;
   }

    private static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] =  aux;
    }
}
