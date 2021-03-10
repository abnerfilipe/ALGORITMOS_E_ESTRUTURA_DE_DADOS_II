
public class criadorDeVetor {
    public static void main(String[] args) {
        long v[] = GerarCemMilhoes();
        System.out.println(v.length);
        // long tempoInicio = System.currentTimeMillis();
        // long list_1[] = new long[1000000];
        // for (int i=0; i<1000000; i++) {
        //     list_1[i] = i; // adding all the numbers between 1-1m to a list.
        // }
        // System.out.println("1 milhão de elementos: "+list_1.length);
        // System.out.println("Tempo Total de Execução: "+(System.currentTimeMillis()-tempoInicio)+ " Ms");
        
        // tempoInicio = System.currentTimeMillis();
        // long list_2[] = new long[100000000];
        // for (int i=0; i<100000000; i++) {
        //     list_2[i] = i; // adding all the numbers between 1-1m to a list.
        // }
        // System.out.println("100 milhōes de elementos: "+list_2.length);
        // System.out.println("Tempo Total de Execução: "+(System.currentTimeMillis()-tempoInicio)+ " Ms");
        
        // tempoInicio = System.currentTimeMillis();
        // long list_3[] = new long[1000000000];
        // for (int i=0; i<1000000000; i++) {
        //     list_3[i] = i; // adding all the numbers between 1-1m to a list.
        // }
        // System.out.println("1 bilhão de elementos: "+list_3.length);
        // System.out.println("Tempo Total de Execução: "+(System.currentTimeMillis()-tempoInicio)+ " Ms");
    }
    public static long[] GerarUmMilhao() {
        // long tempoInicio = System.currentTimeMillis();
        long list_2[] = new long[100000000];
        for (int i=0; i<100000000; i++) {
            list_2[i] = i; // adding all the numbers between 1-1m to a list.
        }
        return list_2;
        // System.out.println("100 milhōes de elementos: "+list_2.length);
        // System.out.println("Tempo Total de Execução: "+(System.currentTimeMillis()-tempoInicio)+ " Ms");
    }
    public static long[] GerarCemMilhoes() {
        // long tempoInicio = System.currentTimeMillis();
        long list_2[] = new long[1000000000];
        for (int i=0; i<1000000000; i++) {
            list_2[i] = i; // adding all the numbers between 1-1m to a list.
        }
        return list_2;
        // System.out.println("100 milhōes de elementos: "+list_2.length);
        // System.out.println("Tempo Total de Execução: "+(System.currentTimeMillis()-tempoInicio)+ " Ms");
    }
    public static long[] GerarUmBilhao() {
        // long tempoInicio = System.currentTimeMillis();
        long list_2[] = new long[1000000000];
        for (int i=0; i<1000000000; i++) {
            list_2[i] = i; // adding all the numbers between 1-1m to a list.
        }
        return list_2;
        // System.out.println("100 milhōes de elementos: "+list_2.length);
        // System.out.println("Tempo Total de Execução: "+(System.currentTimeMillis()-tempoInicio)+ " Ms");
    }

}
