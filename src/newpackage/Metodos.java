
package newpackage;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Metodos {//metodos
    private int i;
    private Alumno alum;
    private List <Alumno>reg;
    private boolean band;

    private void ingresoDatos() {
        String codigo;
        reg=new ArrayList<Alumno>();//creo mi Array y lo importo en la biblioteca
        reg = new ArrayList();
        i = 0;
        do {
            codigo=JOptionPane.showInputDialog("Digite 0 para salir\n"
                    + (i + 1) + ". Digite un codigo: ");
            alum=new Alumno(codigo);
            reg.add(alum);//se almacena en add en la variable alum
            i++;
        } while (!"0".equals(reg.get(i - 1).getCodigo()));//para q 
        reg.remove(i - 1);//lo q nos genera para eliminar
    }
    private void busquedaCodigo() {
        String u;
        u = JOptionPane.showInputDialog("Digite el codigo a buscar: ");
        band = true;//inicializo en verdadero
        for (i = 0; i < reg.size(); i++) {//lo busco para obtener el numero de elementos en mi arrayLit
            if (reg.get(i).getCodigo().equals(u)) {//sirve para saber si tenemos los mismos datos igualando al codigo u 
                band = false;//si encuentra el codigo q se busco cambia a false
            }
        }
        if (band == true) {
            JOptionPane.showMessageDialog(null, "No existe el codigo q digito");
        } else {
            JOptionPane.showMessageDialog(null, "El codigo si esta registrado");
        }
    }

    private void mostrarCodigos() {
        String cadena = " ";
        for (i = 0; i < reg.size(); i++) {//Lo uso para q me devuelva el numero de elementos de Arraylist
            cadena += (i + 1) + ". " + reg.get(i).getCodigo() + "\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }

    public void menu() {//metodo donde tengo la estructura donde lo invocare en el main
        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("\t\t\tMENU PRINCIPAL"
                    + "\n1. Ingreso de código "
                    + "\n2. Búsqueda de código"
                    + "\n3. Mostrar códigos"
                    + "\n4. salir"));
            
            switch (opc) {//enlazo con los metodos 
                case 1:
                    ingresoDatos();break;
                case 2:
                    busquedaCodigo();break;
                case 3:
                    mostrarCodigos();break;
                case 4:
                    JOptionPane.showMessageDialog(null, "\tGracias");break;
                default:
                    JOptionPane.showMessageDialog(null, "\tDigite nuevamente: ");//en caso q no digite los numeros
            }

        } while (opc != 4);//para cerrar mi menu

    }
}

