package javaapplication15;

import javax.swing.JOptionPane;

public class JavaApplication15 {

    public static void main(String[] args) {
    punto p= new punto();
   int puntox = Integer.parseInt(JOptionPane.showInputDialog("dijite coordenada x"));
   int puntoy = Integer.parseInt(JOptionPane.showInputDialog("dijite coordenada y"));
   int puntoz = Integer.parseInt(JOptionPane.showInputDialog("dijite coordenada z"));
    p.setX(puntox);
    p.setY(puntoy);
    p.setZ(puntoz);
    p.setDimension("3D");
    System.out.println("dimension: " + p.getDimension());
    System.out.println("coordenada: " + p.getX());
    System.out.println("coordenada: " + p.getY());
    System.err.println("coordenada: " + p.getZ());
    }
}