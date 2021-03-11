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

        int vetorCrescente[] = geradorVetor.crescente(tamanho6);
        int vetorDecrescente[] = geradorVetor.Decrescente(tamanho6);
        int vetorAleatorio[] = geradorVetor.randon(tamanho6);

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
        QuickSort quickSort1 = new QuickSort();
        quickSort1.sort(vetorCrescente,0,vetorCrescente.length-1);
        System.out.println("Numero de trocas: "+quickSort1.troca);
        System.out.println("Numero de comparacoes: "+quickSort1.comparacao);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("vetor Decrescente | Tamanho: "+vetorDecrescente.length);
        QuickSort quickSort2 = new QuickSort();
        quickSort2.sort(vetorDecrescente,0,vetorDecrescente.length-1);
        System.out.println("Numero de trocas: "+quickSort2.troca);
        System.out.println("Numero de comparacoes: "+quickSort2.comparacao);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("vetor Aleatorio | Tamanho: "+vetorAleatorio.length);
        QuickSort quickSort3 = new QuickSort();
        quickSort3.sort(vetorAleatorio,0,vetorAleatorio.length-1);
        System.out.println("Numero de trocas: "+quickSort3.troca);
        System.out.println("Numero de comparacoes: "+quickSort3.comparacao);
    }
   
}
