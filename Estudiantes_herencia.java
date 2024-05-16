public class Estudiantes_herencia {



        public Estudiantes_herencia(String nombre){
            if (this.nombre.equals(nombre)) {
            String nombre_estudiante = getNombre(nombre);
            String edad_estudiante = getEdad(nombre);
            String dni_estudiante =  getDni(nombre);
            System.out.println("La edad del estudiante es: " + nombre_estudiante + " y su edad es : "  + edad_estudiante + " y su dni es: " +dni_estudiante);
            }

        }
        
        @Override
        public String toString(String nombre) {
            return "Nombre: " + getNombre(nombre) + ", Edad: " + getEdad(nombre) + ", Grado: " + getGrado(nombre);
        } 
}
/*
 * 
 * o"Herencia -Implementación de Clase Estudiante por [Nombre]"
 * o"Herencia -Implementación de Propiedad adicional para el grado por [Nombre]"
 * o"Herencia -Sobrescritura del método toString() por [Nombre]"
 * o"Herencia -Implementación de Constructores por [Nombre]"
 */