package S06_03;
/*
 * @author 03_DiegoAvendaño
 */
public class calculadora_03 {
  
    //Atributos
    int num1;
    int num2;
    int resultado;
    String tipo; /*Basica o Cientifica*/
    
    //Metodos
    public void Sumar(){
        System.out.println(num1 + num2);
    }
    
    public void Resta(){
        System.out.println(num1 - num2);
    }
    public void Dividir(){
        System.out.println(num1 / num2);
    }
    public void Multiciplicar(){
        System.out.println(num1 * num2);
    }
    
    // Sobrecarga de Constructores
    public calculadora_03() {
    }
    
    public calculadora_03(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public calculadora_03(int num1, int num2, int resultado, String tipo) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
        this.tipo = tipo;
    }
    
    
    //Sobrecarga de Metodos
    
    public void operacion(){
    }
    public void operacion(int n1){
    }
    public void operacion(String marca){
    }
    public void operacion(int n2, String color){
    }
    
    
    
    
    //Metodos con valores de Retorno
    public int respuesta(){
        return 0;
    }
    
    public String TipoDeOperacion(){
        return "";
    }
    
    public double OperacionComa(){
        return 0.0;
    }   
}
