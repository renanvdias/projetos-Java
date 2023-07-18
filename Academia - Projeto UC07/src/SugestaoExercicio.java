
public class SugestaoExercicio {
    private Musculacao exercicioMus;
    private Corrida exercicioCor;
    private Modelo sugereExercicio;
    
    public SugestaoExercicio(Modelo sugere){
        sugereExercicio = sugere;
    }
    public Musculacao getExercicioMus()
    {
        return exercicioMus;
    }
    
     public Corrida getExercicioCor()
    {
        return exercicioCor;
    }
     
     public void gerar(){
         exercicioMus = sugereExercicio.getMusculacao();
         exercicioCor = sugereExercicio.getCorrida();
     }
}
