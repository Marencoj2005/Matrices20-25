import java.util.Scanner;

public class metodo {
    public ObjectPersona [][] fullObjetMatrix(int d){
        ObjectPersona [][] matrix = new ObjectPersona[d][d];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                //llenar la matriz con la cantidad de atributos
                // se deben utilizar los set para acceder a los datos que estan en privado

                ObjectPersona objectPersona = new ObjectPersona();
                System.out.println("Ingrese el nombre ");
                objectPersona.setNombre(scanner.next());
                System.out.println("Ingrese el apellido ");
                objectPersona.setApellido(scanner.next());
                System.out.println("Ingrese direcció ");
                objectPersona.setDireccion(scanner.next());
                System.out.println("Ingrese el telefono ");
                objectPersona.setTelefono(scanner.nextInt());
            }
        }
        return matrix;
    }

    public void mostrarObjeto(ObjectPersona [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                //System.out.println(m); muestra el espacio en disco
                System.out.println("Nombre " + m[i][j].getNombre());
                System.out.println("Apellido " + m[i][j].getApellido());
                System.out.println("direccion " + m[i][j].getDireccion());
                System.out.println("Telefono " + m[i][j].getTelefono());
            }
            System.out.println("");
        }
    }
    

}

/*
 * private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
 */
