package ordenacao;

import analise.Metricas;

public class InsertionSort implements Metricas {
  public long troca;
  public long comparacao;

  public InsertionSort() {
    this.troca = 0;
    this.comparacao = 0;
  }
  public void resetCounters() {
    this.troca = 0;
    this.comparacao = 0;
  }
  public static void execute(int[] vetorCrescente, int[] vetorDecrescente, int[] vetorAleatorio) {
    InsertionSort sort = new InsertionSort();
    System.out.println("==================================================");
    System.out.println("QuickSort");
    System.out.println("==================================================");
    System.out.println("\tVetor crescente | Tamanho: " + Metricas.FormatLargeNumber(vetorCrescente.length));
    sort.sort(vetorCrescente);
    sort.ShowCounters(sort.troca, sort.comparacao);
    System.out.println("==================================================");
    System.out.println("\tVetor Decrescente | Tamanho: " + Metricas.FormatLargeNumber(vetorDecrescente.length));
    sort.resetCounters();
    sort.sort(vetorDecrescente);
    sort.ShowCounters(sort.troca, sort.comparacao);
    System.out.println("==================================================");
    System.out.println("\tVetor Aleatorio | Tamanho: " + Metricas.FormatLargeNumber(vetorAleatorio.length));
    sort.resetCounters();
    sort.sort(vetorAleatorio);
    sort.ShowCounters(sort.troca, sort.comparacao);
    System.out.println("==================================================");
  }

  public int[] sort(int[] vetor) {
    int j;
    int key;
    int i;

    for (j = 1; j < vetor.length; j++) {
      key = vetor[j];
      this.comparacao++;
      for (i = j - 1;
        (i >= 0) && (vetor[i] > key); i--) {
        this.troca++;
        vetor[i + 1] = vetor[i];
      }
      vetor[i + 1] = key;
    }

    return vetor;
  }

}
