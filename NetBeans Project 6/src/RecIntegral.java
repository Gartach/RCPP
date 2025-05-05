import java.io.Serializable;

public class RecIntegral implements Serializable {
    private static final long serialVersionUID = 1L;
    private double lowerLimit;
    private double upperLimit;
    private double step;
    private double result;

    public RecIntegral(double lowerLimit, double upperLimit, double step, double result) throws CustomException {
         if (lowerLimit < 0.000001 || lowerLimit > 1000000)  {
            throw new CustomException ("Значение должно быть в диапазоне от 0.000001 до 1000000.");
        }
        if (upperLimit < 0.000001 || upperLimit> 1000000)  {
            throw new CustomException ("Значение должно быть в диапазоне от 0.000001 до 1000000.");
        }
        if (step < 0.000001 || step > 1000000)  {
            throw new CustomException ("Значение должно быть в диапазоне от 0.000001 до 1000000.");
        }
        if (lowerLimit> upperLimit)  {
            throw new CustomException ("Нижний предел должен быть меньше верхнего предела.");
        }
        if ((upperLimit - lowerLimit) < step)  {
            throw new CustomException ("Шаг интегрирования должен быть меньше интервала.");
        }
        
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.step = step;
        this.result = result;
    }
    

    public double getLowerLimit() {
        return lowerLimit;
    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public double getStep() {
        return step;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
