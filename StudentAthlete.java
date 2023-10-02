public class StudentAthlete extends StudentT {
    private int sport;
    private int yearsPlayed;

    public StudentAthlete(int id, String name, int sport){
        super(id,name);
        this.sport = sport;
        this.yearsPlayed = 0;
    }

    @Override
    public boolean qualifiesForScholarship(){
        return this.getGpa() >= 2.75 && yearsPlayed >= 1 ? true: false;
    }
    
    public void setYearsPlayed(int yearsPlayed){
        this.yearsPlayed = yearsPlayed;
    }

    

    
}