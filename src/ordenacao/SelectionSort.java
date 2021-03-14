package ordenacao;

import analise.Metricas;

public class SelectionSort implements Metricas {
    public long troca;
    public long comparacao;


    public SelectionSort(){
        this.troca = 0;
        this.comparacao = 0;
    }
    public void resetCounters() {
        this.troca = 0;
        this.comparacao = 0;
    }

    public static void execute(int[] vetorCrescente, int[] vetorDecrescente, int[]vetorAleatorio) {
        SelectionSort sort = new SelectionSort();
        System.out.println("==================================================");
        System.out.println("SelectionSort"); 
        System.out.println("==================================================");
        System.out.println("\tVetor crescente | Tamanho: "+Metricas.FormatLargeNumber(vetorCrescente.length));
        sort.ShowCounters(sort.troca,sort.comparacao);
        sort.sort(vetorCrescente);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Decrescente | Tamanho: "+Metricas.FormatLargeNumber(vetorDecrescente.length));
        sort.resetCounters();
        sort.ShowCounters(sort.troca,sort.comparacao);
        sort.sort(vetorDecrescente);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Aleatorio | Tamanho: "+ Metricas.FormatLargeNumber(vetorAleatorio.length));
        sort.resetCounters();
        sort.ShowCounters(sort.troca,sort.comparacao);
        sort.sort(vetorAleatorio);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
    }

    public int[] sort(int[] vetor) {
        int i,j,min,aux;

        for(i = 0; i < vetor.length; i++) {
            min = i;
            
            for(j = i + 1; j < vetor.length; j++) {      
                this.comparacao++;  
                if(vetor[j] < vetor[min]) {
                    this.troca++;
                    min = j;
                }

            }
            aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }

        return vetor;
    }

    public static void printarVetor(int vetor[]) {
        System.out.print("vetor [ ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        System.out.print("];");
    }
}
