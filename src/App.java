public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = {5,3,2,4,7,1,8,6};
        printarVetor("Vetor Inicial",vetor);
        printarVetor("Ordenacao Insert Sort",insertSort(vetor));
        printarVetor("Ordenacao Select Sort",selectSort(vetor));
        printarVetor("Ordenacao Bubble Sort",bubbleSort(vetor));
    }
    public static int[] insertSort(int vetor[]){
        int i, j, key;
        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            i = j -1;
            while (i>=0 && vetor[i] > key) {
                vetor[i+1]= vetor[i];
                i--;
            }
            vetor[i+1] = key;
        }
        return vetor;
    }
    public static int[] selectSort(int vetor[]){
        int min, aux;
        for (int i = 0; i < vetor.length -1; i++) {
            aux = i;
            for (int j = i+1; j < vetor.length; j++) {
                if(vetor[j] < vetor[aux]){
                    aux = j;
                }
            }
            min = vetor[aux];
            vetor[aux] = vetor[i];
            vetor[i] = min;
        }
        return vetor;
    }
    public static int[] bubbleSort(int vetor[]){
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length-1; j++) {
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j +1];
                    vetor[j+1]= aux;
                }
            }
        }
        return vetor;
    }

    public static void printarVetor(String nome,int vetor[]){
        System.out.println(nome);
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+"\t");
        }
        System.out.println("]");
    }
}
