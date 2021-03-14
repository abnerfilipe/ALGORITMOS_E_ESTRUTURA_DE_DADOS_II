package analise;

public class MedirExecucao {
    public long timeInicio;
    public long tempoTotal;
    
    public MedirExecucao(){
        this.timeInicio = 0;
        this.tempoTotal = 0;
    }

    public void ResetarTempo() {
        this.timeInicio = 0;
        this.tempoTotal = 0;
    }
    public void IniciarTempo() {
        this.timeInicio = System.currentTimeMillis();
    }
    public void FinalizarTempo() {
        this.tempoTotal =  System.currentTimeMillis() - this.timeInicio;
    }
    public void MostrarTempoDeExecucao() {
        System.out.println("\t==================================================");
        System.out.println("\tTempo Total de Execucao: "+this.tempoTotal+" Ms ou "+(this.tempoTotal/1000)+" Seg" );
        System.out.println("\t==================================================");
    }

}
