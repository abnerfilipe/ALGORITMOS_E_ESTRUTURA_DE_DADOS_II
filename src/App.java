import ordenacao.*;
import analise.*;

public class App {
    public static void main(String[] args) throws Exception {
        // int tamanho1 = 1000;
        // int tamanho2 = 10000;
        // int tamanho3 = 100000;
        // int tamanho4 = 1000000;
        // int tamanho5 = 10000000;
        // int tamanho6 = 100000000;

        // int opcao = tamanho4;

        int tamanho = 0;
        switch (4) {
            case 1:
            System.out.println("Tamanho 1");
            tamanho = 1000; 
                break;
            case 2:
            System.out.println("Tamanho 2");
            tamanho = 10000; 
                break;
            case 3:
            System.out.println("Tamanho 3");
            tamanho = 100000; 
                break;
            case 4:
            System.out.println("Tamanho 4");
            tamanho = 1000000; 
                break;
            case 5:
            System.out.println("Tamanho 5");
            tamanho = 10000000; 
                break;
            case 6:
            System.out.println("Tamanho 6");
            tamanho = 100000000; 
                break;
            default:
                break;
        }

        QuickSort.execute(GeradorVetor.crescente(tamanho), GeradorVetor.Decrescente(tamanho), GeradorVetor.Aleatorio(tamanho));
        BubbleSort.execute(GeradorVetor.crescente(tamanho), GeradorVetor.Decrescente(tamanho), GeradorVetor.Aleatorio(tamanho));
        InsertionSort.execute(GeradorVetor.crescente(tamanho), GeradorVetor.Decrescente(tamanho), GeradorVetor.Aleatorio(tamanho));
        SelectionSort.execute(GeradorVetor.crescente(tamanho), GeradorVetor.Decrescente(tamanho), GeradorVetor.Aleatorio(tamanho));
        ShellSort.execute(GeradorVetor.crescente(tamanho), GeradorVetor.Decrescente(tamanho), GeradorVetor.Aleatorio(tamanho));
        MergeSort.execute(GeradorVetor.crescente(tamanho), GeradorVetor.Decrescente(tamanho), GeradorVetor.Aleatorio(tamanho));
    }
   
}
