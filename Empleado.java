
//**
* Clase que representa a un empleado en la empresa.
*/
public class Empleado {
   private String nombre;
   private String cargo;
   private double salario;

   /**
    * Constructor de la clase Empleado.
    * @param nombre El nombre del empleado.
    * @param cargo El cargo del empleado.
    * @param salario El salario del empleado.
    */
   public Empleado(String nombre, String cargo, double salario) {
       this.nombre = nombre;
       this.cargo = cargo;
       this.salario = salario;
   }

   /**
    * Obtiene el nombre del empleado.
    * @return El nombre del empleado.
    */
   public String getNombre() {
       return nombre;
   }

   /**
    * Establece el nombre del empleado.
    * @param nombre El nuevo nombre del empleado.
    */
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   /**
    * Obtiene el cargo del empleado.
    * @return El cargo del empleado.
    */
   public String getCargo() {
       return cargo;
   }

   /**
    * Establece el cargo del empleado.
    * @param cargo El nuevo cargo del empleado.
    */
   public void setCargo(String cargo) {
       this.cargo = cargo;
   }

   /**
    * Obtiene el salario del empleado.
    * @return El salario del empleado.
    */
   public double getSalario() {
       return salario;
   }

   /**
    * Establece el salario del empleado.
    * @param salario El nuevo salario del empleado.
    */
   public void setSalario(double salario) {
       this.salario = salario;
   }

   @Override
   public String toString() {
       return "Empleado{" +
               "nombre='" + nombre + '\'' +
               ", cargo='" + cargo + '\'' +
               ", salario=" + salario +
               '}';
   }
}