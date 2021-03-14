package analise;

import java.text.DecimalFormat;

public interface Metricas {
    public default void ShowCounters(long troca, long comparacao) {
        // System.out.println("\tNumero de trocas: "+this.troca);
        System.out.println("\tNumero de trocas: "+FormatLargeNumber(troca));
        // System.out.println("\tNumero de comparacoes: "+this.comparacao);
        System.out.println("\tNumero de comparacoes: "+FormatLargeNumber(comparacao));
    }
    public static String FormatLargeNumber(long value) {
        DecimalFormat number = new DecimalFormat("###,###,###,###,###,###");
        return number.format(value).replace(',', '.');
    }
}
