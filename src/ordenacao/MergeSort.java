package ordenacao;

import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class MergeSort {
    public static void sort(int vetor[], int inicio, int fim) {
        long timeInicio =  System.currentTimeMillis();
        long troca = 0;
        long comparacao =0;
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            sort(vetor, inicio, meio);
            sort(vetor, meio + 1, fim);
            intercalar(vetor, inicio, meio, fim, troca, comparacao);
        }
        System.out.println("Numero de trocas: "+troca);
        System.out.println("Numero de comparacoes: "+comparacao);
        System.out.println("Tempo total: "+(System.currentTimeMillis() - timeInicio) +" MS");
    }

    public static void intercalar(int vetor[], int inicio, int meio, int fim, long trocaLocal, long comparacaoLocal) {

        int secundario[] = new int[vetor.length];
        /*cópia do vetor*/
        for (int k = inicio; k <= fim; k++){
            secundario[k] = vetor[k];
        }
        int indiceEsquerdo = inicio;
        int indiceDireito = meio+1;
        // troca
        for (int k = inicio; k <= fim; k++) {
            comparacaoLocal++;
            if(indiceEsquerdo > meio) {
                trocaLocal++;
                vetor[k] = secundario[indiceDireito++];
            }
            else if(indiceDireito > fim){
                trocaLocal++;
                vetor[k] = secundario[indiceEsquerdo++];
            }
            else if(secundario[indiceEsquerdo]<secundario[indiceDireito]){
                trocaLocal++;
                vetor[k] = secundario[indiceEsquerdo++];
            }
            else {
                trocaLocal++;
                vetor[k] = secundario[indiceDireito++];
            };
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
