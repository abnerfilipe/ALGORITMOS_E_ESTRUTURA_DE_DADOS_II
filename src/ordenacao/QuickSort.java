package ordenacao;

import analise.Metricas;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class QuickSort implements Metricas {
    public long troca;
    public long comparacao;


    public QuickSort(){
        this.troca = 0;
        this.comparacao = 0;
    }
 
    public void resetCounters() {
        this.troca = 0;
        this.comparacao = 0;
    }
    public static void execute(int[] vetorCrescente, int[] vetorDecrescente, int[]vetorAleatorio) {
        QuickSort quickSort = new QuickSort();
        System.out.println("==================================================");
        System.out.println("QuickSort"); 
        System.out.println("==================================================");
        System.out.println("\tVetor crescente | Tamanho: "+Metricas.FormatLargeNumber(vetorCrescente.length));
        quickSort.sort(vetorCrescente,0,vetorCrescente.length-1);
        quickSort.ShowCounters(quickSort.troca,quickSort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Decrescente | Tamanho: "+Metricas.FormatLargeNumber(vetorDecrescente.length));
        quickSort.resetCounters();
        quickSort.sort(vetorDecrescente,0,vetorDecrescente.length-1);
        quickSort.ShowCounters(quickSort.troca,quickSort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Aleatorio | Tamanho: "+ Metricas.FormatLargeNumber(vetorAleatorio.length));
        quickSort.resetCounters();
        quickSort.sort(vetorAleatorio,0,vetorAleatorio.length-1);
        quickSort.ShowCounters(quickSort.troca,quickSort.comparacao);
        System.out.println("==================================================");
    }

    public int[] sort(int[] v, int inicio, int fim) {
       int i = inicio;
       int j = fim;
       int pivo = v[(inicio + fim)/2];

       while(i <= j) {
           this.comparacao++;
           if(v[i] < pivo){
               i++;
           }else{
               this.comparacao++;
               if(v[j] > pivo){
                   j--;
               }else {
                   this.comparacao++;
                   if(i <= j) {
                       this.troca++;
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
