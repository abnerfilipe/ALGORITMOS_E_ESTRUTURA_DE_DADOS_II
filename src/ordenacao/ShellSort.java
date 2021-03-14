package ordenacao;

import analise.Metricas;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class ShellSort implements Metricas{
    public long comparacao;
    public long troca;

    public ShellSort(){
        this.comparacao = 0;
        this.troca = 0;
    }

    public void resetCounters() {
        this.troca = 0;
        this.comparacao = 0;
      }
    public static void execute(int[] vetorCrescente, int[] vetorDecrescente, int[]vetorAleatorio) {
        ShellSort sort = new ShellSort();
        System.out.println("==================================================");
        System.out.println("ShellSort"); 
        System.out.println("==================================================");
        System.out.println("\tVetor crescente | Tamanho: "+Metricas.FormatLargeNumber(vetorCrescente.length));
        sort.sort(vetorCrescente);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Decrescente | Tamanho: "+Metricas.FormatLargeNumber(vetorDecrescente.length));
        sort.resetCounters();
        sort.sort(vetorDecrescente);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
        System.out.println("\tVetor Aleatorio | Tamanho: "+ Metricas.FormatLargeNumber(vetorAleatorio.length));
        sort.resetCounters();
        sort.sort(vetorAleatorio);
        sort.ShowCounters(sort.troca,sort.comparacao);
        System.out.println("==================================================");
    }

      
    public int[] sort(int[] v) {
        int h = v.length / 2;
        int valor, j, i;

        while(h > 0) {
            for(i = h; i < v.length; i++) {
                valor = v[i];
                j = i;
                this.comparacao++;
                while(j >= h && v[j-h] > valor) {
                    this.troca++;
                    v[j] = v[j-h];
                    j = j-h; 
                }
                v[j] = valor;
            }
          h = h / 2;  
        }
       return v;
    }
}
