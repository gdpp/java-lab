package arithmetic_package;

/**
 *
 * @author gushi
 */
public class Arithmetic {
    private int valueOne;
    private int valueTwo;
    
    public Arithmetic(){}
    
    public Arithmetic(int v1, int v2){
        this.valueOne = v1;
        this.valueTwo = v2;
    }
    
    void Add(){
        var result = valueOne + valueTwo;
        
        System.out.println(result);
    }
    
    void Substract(){
        var result = valueOne - valueTwo;
        
        System.out.println(result);
    }
    
    public int getValueOne(){
        return this.valueOne;
    }
    
    public void setValueOne(int valueOne){
        this.valueOne = valueOne;
    }
    
    public int getValueTwo(){
        return this.valueTwo;
    }
    
    public void setValueTwo(int valueTwo){
        this.valueTwo = valueTwo;
    }
        
    public static void main(String[] args) {
        System.out.println("Aritmethic");
        
        var aritmetica1 = new Arithmetic(5, 7);
        aritmetica1.Add();
        aritmetica1.Substract();
        
        var aritmetica2 = new Arithmetic(12, 16);       
        aritmetica2.Add();
        aritmetica2.Substract();
        
    }
}
