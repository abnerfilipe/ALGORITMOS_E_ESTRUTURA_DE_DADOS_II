import ordenacao.*;

public class App {
    public static void main(String[] args) throws Exception {
        // 1000
        int tamanho1 = 1000;
        // 100.000
        int tamanho2 = 100000;
        // 1.000.000
        int tamanho3 = 1000000;
        // 10.000.000
        int tamanho4 = 10000000;
        // 100.000.000.
        int tamanho5 = 100000000;

        int vetorCrescente[] = geradorVetor.crescente(tamanho3);
        int vetorDecrescente[] = geradorVetor.Decrescente(tamanho3);
        int vetorAleatorio[] = geradorVetor.randon(tamanho3);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("vetor crescente | Tamanho: "+vetorCrescente.length);
        InsertionSort.sort(vetorCrescente);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("vetor Decrescente | Tamanho: "+vetorCrescente.length);
        InsertionSort.sort(vetorDecrescente);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("vetor Aleatorio | Tamanho: "+vetorCrescente.length);
        InsertionSort.sort(vetorAleatorio);
    }
   
}
