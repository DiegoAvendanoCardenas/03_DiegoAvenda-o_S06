package S06_03;
/*
 * @author 03_DiegoAvendaño
 */
public class estudiante_03 {
      
    //Atributos 03_DiegoAvendaño
    String nombre;
    int edad;
    String colegio;
    int año;    /*1 , 2 ,3 ,4 ,5*/
    String seccion; /*A - B - C - D- E */
    
    //Metodos 03_DiegoAvendaño 
    public void IrAlBaño () {
        System.out.println("Profesor puedo ir al baño?");
    }
    
    public void SalirReceso() {
        System.out.println("Ire a comer Lonchera");
    }
    
    public void Exponer(){
        System.out.println("Toca exponer sobre la Programacion");
    }
    
    public void resolver() {
        System.out.println("Profesor quiero resolver ese ejercicio");
    }
    
    // Sobrecarga de Constructores 03_DiegoAvendaño

    public estudiante_03() {
    }

    public estudiante_03(String nombre, int edad, String colegio) {
        this.nombre = nombre;
        this.edad = edad;
        this.colegio = colegio;
    }

    public estudiante_03(String nombre, int edad, String colegio, int año, String seccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.colegio = colegio;
        this.año = año;
        this.seccion = seccion;
    }
    
    //Sobrecarga de Metodos 03_DiegoAvendaño
    public void Salida () {
    }
    
    public void Salida(int a,String b){
    }
    
    public void Salida(int year){
    }
    
    public void Salida(String saludo){
    }
    
    //Metodos con valores de Retorno 03_DiegoAvendaño 
    
    public String Curso (){
        System.out.println("Matematica");
        return "";
    }
    
    public int Nota(){
        System.out.println("Nota : 20");
        return 0;
    }
    
    public double Peso(){
        System.out.println("Quiero comprobar mi peso");
        return 0.0;
    }
}
