import ordenacao.*;

public class App {
    public static void main(String[] args) throws Exception {
        // 1000
        int tamanho1 = 1000;
        // 10.000
        int tamanho2 = 10000;
        // 100.000
        int tamanho3 = 100000;
        // 1.000.000
        int tamanho4 = 1000000;
        // 10.000.000
        int tamanho5 = 10000000;
        // 100.000.000
        int tamanho6 = 100000000;

        int vetorCrescente[] = geradorVetor.crescente(tamanho1);
        int vetorDecrescente[] = geradorVetor.Decrescente(tamanho1);
        int vetorAleatorio[] = geradorVetor.randon(tamanho1);

//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println("Insert Sort");
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println("vetor crescente | Tamanho: "+vetorCrescente.length);
//        InsertionSort.sort(vetorCrescente);
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println("vetor Decrescente | Tamanho: "+vetorCrescente.length);
//        InsertionSort.sort(vetorDecrescente);
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println("vetor Aleatorio | Tamanho: "+vetorCrescente.length);
//        InsertionSort.sort(vetorAleatorio);

//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println("ShellSort");
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println("vetor crescente | Tamanho: "+vetorCrescente.length);
//        ShellSort.sort(vetorCrescente);
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println("vetor Decrescente | Tamanho: "+vetorCrescente.length);
//        ShellSort.sort(vetorDecrescente);
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println("vetor Aleatorio | Tamanho: "+vetorCrescente.length);
//        ShellSort.sort(vetorAleatorio);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("QuickSort");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("vetor crescente | Tamanho: "+vetorCrescente.length);
        QuickSort.sort(vetorCrescente,0,vetorCrescente.length-1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("vetor Decrescente | Tamanho: "+vetorCrescente.length);
        QuickSort.sort(vetorDecrescente,0,vetorCrescente.length-1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("vetor Aleatorio | Tamanho: "+vetorCrescente.length);
        QuickSort.sort(vetorAleatorio,0,vetorCrescente.length-1);
    }
   
}
