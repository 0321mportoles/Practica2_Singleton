
package Main;

public class Main {

    public static void main(String[] args) {
        
        // llamo a la funcion SoyUnico para que me imprima los nombres. 
    	SoyUnico marta = SoyUnico.getSingletonInstance("Marta");
        SoyUnico jacinto = SoyUnico.getSingletonInstance("Jacinto");
        
        // marta y jacinto son referencias a un unico objeto de la clase SoyUnico
        System.out.println(marta.getNombre());
        System.out.println(jacinto.getNombre());
        
        // No se permite clonar un objeto de esta clase
        try{
            SoyUnico jacin = jacinto.clone(); 
            System.out.println(jacin.getNombre());
        } catch (NullPointerException ex){
//        	System.out.println("Error");
        	ex.printStackTrace();
        }

    }

}
