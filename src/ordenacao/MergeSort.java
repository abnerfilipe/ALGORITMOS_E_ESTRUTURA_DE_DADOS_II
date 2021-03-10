package ordenacao;

import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class MergeSort {

    public static void main(String[] args) {
        // int vetor[] = {7,2,9,4,3,0,8,6,1,5};

        // 1000
        // 100.000
        // 1.000.000
        // 10.000.000
        // 100.000.000
        
        int vetorCrescente[] = new int[1000000];
        for (int i=0; i< vetorCrescente.length; i++) {
            vetorCrescente[i] = i; // adding all the numbers between 1-1m to a list.
        }
        System.out.println("vetorCrescente");
        System.out.println(vetorCrescente[0]);
        System.out.println(vetorCrescente[vetorCrescente.length-1]);
        
        int vetorDecrescente[] = new int[1000000];
        for (int i=vetorDecrescente.length-1, cont=0 ; i > 0; i--, cont++) {
            vetorDecrescente[cont] = i; // adding all the numbers between 1-1m to a list.
        }
        System.out.println("vetorDecrescente");
        System.out.println(vetorDecrescente[0]);
        System.out.println(vetorDecrescente[vetorDecrescente.length-1]);
        
        Random gerador = new Random();
        int vetorRandomico[] = new int[1000000];
        for (int i=0; i< vetorRandomico.length; i++) {
            vetorRandomico[i] = gerador.nextInt(vetorRandomico.length); // adding all the numbers between 1-1m to a list.
        }
        System.out.println("vetorRandomico");
        System.out.println(vetorRandomico[0]);
        System.out.println(vetorRandomico[vetorRandomico.length-1]);
        
        
//        long vetor[]
        // printarVetor(vetor);
        // long tempoInicio = System.currentTimeMillis();
        // System.out.println("tempo inicio "+tempoInicio);
        // sort(vetor, 0, vetor.length-1);
        // // printarVetor(vetor);
        // System.out.println("Tempo Total de Execução: "+(System.currentTimeMillis()-tempoInicio)+ " Ms");
    }
 
    
    /**
     * @description Método recursivo, que faz a quebra do array criando
     * uma complexidade O(logn)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static void sort(long vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            sort(vetor, inicio, meio);
            sort(vetor, meio + 1, fim);
            intercalar(vetor, inicio, meio, fim);
        }
    }
 
    /**
     * @description Método responsável por intercalar e rearranjar os elementos
     * conforme for voltando no método recursivo
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static void intercalar(long vetor[], int inicio, int meio, int fim) {
        long secundario[] = new long[vetor.length];
        /*cópia do vetor*/
        for (int k = inicio; k <= fim; k++){
            secundario[k] = vetor[k];
        }
        int indiceEsquerdo = inicio;
        int indiceDireito = meio+1;
        // troca
        for (int k = inicio; k <= fim; k++) {
            if(indiceEsquerdo > meio) vetor[k] = secundario[indiceDireito++];
            else if(indiceDireito > fim) vetor[k] = secundario[indiceEsquerdo++];
            else if(secundario[indiceEsquerdo]<secundario[indiceDireito]) vetor[k] = secundario[indiceEsquerdo++];
            else vetor[k] = secundario[indiceDireito++];
        }
    }
    public static void printarVetor(long vetor[]) {
        System.out.print("vetor [");  
        for (long i : vetor) {
            System.out.print(i + " ");
        }
        System.out.print("]");  
        System.out.println();
    }
}
