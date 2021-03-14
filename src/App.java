import ordenacao.*;
import analise.*;

public class App {
    public static void main(String[] args) throws Exception {
        int tamanho1 = 1000;
        int tamanho2 = 10000;
        int tamanho3 = 100000;
        int tamanho4 = 1000000;
        int tamanho5 = 10000000;
        int tamanho6 = 100000000;

        int opcao = tamanho4;

        QuickSort.execute(GeradorVetor.crescente(opcao), GeradorVetor.Decrescente(opcao), GeradorVetor.Aleatorio(opcao));
        BubbleSort(GeradorVetor.crescente(opcao), GeradorVetor.Decrescente(opcao), GeradorVetor.Aleatorio(opcao));
    }
    public static void BubbleSort(int[] vetorCrescente, int[] vetorDecrescente, int[]vetorAleatorio) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("==================================================");
        System.out.println("BubbleSort");
        System.out.println("==================================================");
        System.out.println("\tVetor crescente | Tamanho: "+Metricas.FormatLargeNumber(vetorCrescente.length));
        bubbleSort.ShowCounters(bubbleSort.troca,bubbleSort.comparacao);
        bubbleSort.sort(vetorCrescente);
        bubbleSort.ShowCounters(bubbleSort.troca,bubbleSort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Decrescente | Tamanho: "+Metricas.FormatLargeNumber(vetorDecrescente.length));
        bubbleSort.resetCounters();
        bubbleSort.ShowCounters(bubbleSort.troca,bubbleSort.comparacao);
        bubbleSort.sort(vetorDecrescente);
        bubbleSort.ShowCounters(bubbleSort.troca,bubbleSort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Aleatorio | Tamanho: "+ Metricas.FormatLargeNumber(vetorAleatorio.length));
        bubbleSort.resetCounters();
        bubbleSort.ShowCounters(bubbleSort.troca,bubbleSort.comparacao);
        bubbleSort.sort(vetorAleatorio);
        bubbleSort.ShowCounters(bubbleSort.troca,bubbleSort.comparacao);
        System.out.println("==================================================");
    }
   
}
