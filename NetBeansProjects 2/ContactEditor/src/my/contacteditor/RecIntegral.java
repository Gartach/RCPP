package my.contacteditor;

public class RecIntegral {
    private double vp;
    private double np;
    private double st;
    private double result;
    
    
    public RecIntegral (double np, double vp, double st){
        this.vp = vp;
        this.np = np;
        this.st = st;
        this.result = 0.0;
    }
    public RecIntegral (double np, double vp, double st, double result){
        this.vp = vp;
        this.np = np;
        this.st = st;
        this.result = result;
    }
    
    public double getNP(){
        return np;
    }
     public double getVP(){
        return vp;
    }
      public double getST(){
        return st;
    }
       public double getRES(){
        return result;
    }
    
    public void setRES(double result){
       this.result = result; 
    }
    
}

