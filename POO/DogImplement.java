import javax.swing.JOptionPne;
public class Doglmplement{
  public static void main(String[] args) {
    Dog fido = new Dog();
    fido.color ="black";
    fido.eyeColor ="blue";
    fido.height = 0.50d;
    fido.weight = 30.0d;

    Dog chilaquil = new Dog();
    chilaquil.color ="browwn";
    chilaquil.eyeColor ="green";
    chilaquil.height = 0.78d;
    chilaquil.weight = 25.0d;

    JOptionPane.showMessageDialogo(null,"FIDO es de color  " + fido.color);
    JOptionPne.showMessageDialogo(null,"CHILAQUIL es de color  " + chilaquil.color);
    System.out.println( fido.sit());

    fido.sint();
    fido.layDow("mi nombre es fido");
    fido.sleep();
  }
}
