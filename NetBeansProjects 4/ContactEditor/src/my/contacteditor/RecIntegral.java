package my.contacteditor;



public class RecIntegral {
    
    
    private double vp;
    private double np;
    private double st;
    private double result;
    
    private boolean ValidValue(double value) {
        return value >= 0.000001 && value <= 1000000;
    }
    
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
    
    public RecIntegral (double np, double vp, double st, String someAdditionalParam) throws CustomException {
        if (np < 0.000001 || np > 1000000)  {
            throw new CustomException ("Значение должно быть в диапазоне от 0.000001 до 1000000.");
        }
        if (vp < 0.000001 || vp > 1000000)  {
            throw new CustomException ("Значение должно быть в диапазоне от 0.000001 до 1000000.");
        }
        if (st < 0.000001 || st > 1000000)  {
            throw new CustomException ("Значение должно быть в диапазоне от 0.000001 до 1000000.");
        }
        if (np > vp)  {
            throw new CustomException ("Нижний предел должен быть меньше верхнего предела.");
        }
        if ((vp - np) < st)  {
            throw new CustomException ("Шаг интегрирования должен быть меньше интервала.");
        }
        this.vp = vp;
        this.np = np;
        this.st = st;    
    }
    
    public double getNP(){
        return this.np;
    }
     public double getVP(){
        return this.vp;
    }
      public double getST(){
        return this.st;
    }
       public double getRES(){
        return result;
    }
    
    public void setRES(double result){
       this.result = result; 
    }
    
}

