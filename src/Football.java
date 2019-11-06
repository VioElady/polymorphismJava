
public class Football extends MySport {
    private int nrPlayers;
    private int nrEquals;

    public Football(String complexity,int time,String name,int nrPlayers,int nrEquals){
        super(complexity,time,name);
        this.nrPlayers=nrPlayers;
        this.nrEquals=nrEquals;
    }

    public int getNrPlayers() {
        return nrPlayers;
    }

    public void setNrPlayers(int nrPlayers) {
        this.nrPlayers = nrPlayers;
    }

    public int getNrEquals() {
        return nrEquals;
    }

    public void setNrEquals(int nrEquals) {
        this.nrEquals = nrEquals;
    }

    @Override
    public void show() {
        System.out.println("Football is difficult!");
    }

    @Override
    public String toString() {
        return (" \n Sport: " + name +
                ";\n complexity: " + complexity +
                ";\n time: " + time +
                "; \n nombre players: " + nrPlayers+
                "; \n nombre equals : "+ nrEquals);
    }

}
