package ordenacao;

import analise.Metricas;

public class BubbleSort implements Metricas {

    public long troca;
    public long comparacao;


    public BubbleSort(){
        this.troca = 0;
        this.comparacao = 0;
    }
 
    public void resetCounters() {
        this.troca = 0;
        this.comparacao = 0;
    }
    public static void execute(int[] vetorCrescente, int[] vetorDecrescente, int[]vetorAleatorio) {
        BubbleSort sort = new BubbleSort();
        System.out.println("==================================================");
        System.out.println("QuickSort"); 
        System.out.println("==================================================");
        System.out.println("\tVetor crescente | Tamanho: "+Metricas.FormatLargeNumber(vetorCrescente.length));
        sort.sort(vetorCrescente);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Decrescente | Tamanho: "+Metricas.FormatLargeNumber(vetorDecrescente.length));
        sort.resetCounters();
        sort.sort(vetorDecrescente);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Aleatorio | Tamanho: "+ Metricas.FormatLargeNumber(vetorAleatorio.length));
        sort.resetCounters();
        sort.sort(vetorAleatorio);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
    }
    public int[] sort(int[] vetor) {
        int i,j,aux;

        for(j = 0; j < vetor.length; j++) {
            for(i = 0; i < vetor.length - 1; i++) {
                this.comparacao++;
                if(vetor[i] > vetor[i + 1]) {
                    this.troca++;
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
        }
        return vetor;
    }

}