public class SugereResistencia implements Modelo {
    public Corrida getCorrida(){
        return new Circuito();
    }
    
    public Musculacao getMusculacao(){
        return new Abdominal();
    }
}
