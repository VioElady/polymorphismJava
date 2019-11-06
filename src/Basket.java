
public class Basket extends MySport {
    private int nrLosses;

    public Basket(String complexity,int time,String name,int nrLosses){
        super(complexity,time,name);
        this.nrLosses =nrLosses;
    }

    public int getNrLosses() {
        return nrLosses;
    }

    public void setNrLosses(int nrLosses) {
        this.nrLosses = nrLosses;
    }

    @Override
    public void show() {
        System.out.println(" Basket is light!");
    }

    @Override
    public String toString() {
        return("\n Sport: "+name+
                ";\n complexity: "+ complexity+
                "; \n time: "+time+
                "; \n nombre losses: "+ nrLosses);
    }

}
