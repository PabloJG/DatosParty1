package array;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Dado {

    public static void main(String[] args) {
        {
            int frecuencia[] = new int[ 7 ];
            // tirar un dado 2 veces; usar el valor del dado como índice de frecuencia
            for ( int tiro = 1; tiro <= 2; tiro++ )
                ++frecuencia[ 1 + ( int ) ( Math.random() * 6 ) ];
            String salida = "Cara\tFrecuencia";
            // anexar frecuencias al String salida
            for ( int cara = 1; cara < frecuencia.length; cara++ )
                salida += "\n" + cara + "\t" + frecuencia[ cara ];
            JTextArea areaSalida = new JTextArea();
            areaSalida.setText( salida );
            JOptionPane.showMessageDialog( null, areaSalida,"Tirar un dado 2 veces", JOptionPane.INFORMATION_MESSAGE );
            System.exit( 0 );
        } // fin de main
    }} // fin de la clase TirarDado