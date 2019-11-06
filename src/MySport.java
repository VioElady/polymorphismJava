
public abstract class MySport {
    protected String complexity;
    protected int time;
    protected String name;

    public MySport(String complexity,int time,String name){
        this.complexity=complexity;
        this.time=time;
        this.name=name;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public  void show();

    public static void add(int wins,int equals){
       System.out.println("Wins and equals are :"+(wins+equals));
    }

    public static void add(int wins){
      System.out.println("\nWins are :"+ wins);
   }



}
