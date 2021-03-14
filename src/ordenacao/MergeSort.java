package ordenacao;

import analise.Metricas;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class MergeSort implements Metricas{
    public long troca;
    public long comparacao;

    public MergeSort(){
        this.troca = 0;
        this.troca = 0;
    }

    public void resetCounters() {
        this.troca = 0;
        this.comparacao = 0;
      }

      public static void execute(int[] vetorCrescente, int[] vetorDecrescente, int[]vetorAleatorio) {
        MergeSort sort = new MergeSort();
        System.out.println("==================================================");
        System.out.println("MergeSort"); 
        System.out.println("==================================================");
        System.out.println("\tVetor crescente | Tamanho: "+Metricas.FormatLargeNumber(vetorCrescente.length));
        sort.sort(vetorCrescente,0,vetorCrescente.length-1);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Decrescente | Tamanho: "+Metricas.FormatLargeNumber(vetorDecrescente.length));
        sort.resetCounters();
        sort.sort(vetorDecrescente,0,vetorDecrescente.length-1);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Aleatorio | Tamanho: "+ Metricas.FormatLargeNumber(vetorAleatorio.length));
        sort.resetCounters();
        sort.sort(vetorAleatorio,0,vetorAleatorio.length-1);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
    }

    public void sort(int vetor[], int inicio, int fim) {
      
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            sort(vetor, inicio, meio);
            sort(vetor, meio + 1, fim);
            intercalar(vetor, inicio, meio, fim, this.troca, this.comparacao);
        }
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
