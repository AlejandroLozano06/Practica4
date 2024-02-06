public class Usuario{
  public String nombre;
  public String apellidos;
  public String email;
}

import java.util.Scanner;
public class Principal{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el numero de usuarios a crear: ");
    int numUsuarios = teclado.nextInt();
  }

public static Usuario[] crearUsuarios(int num){
  Scanner teclado = new Usuario[num];
for (int i = 0; i < num; i++){
  usuarios[i] = new Usuario();
  System.out.println("Ingrese los datos del usuario " + (i + 1) + ":");
  System.out.println("Nombre: ");
  usuarios[i].nombre = teclado.next();
  System.out.println("Apellidos: ");
  usuarios[i].apellidos = teclado.next();
  System.out.println("Email: ");
  usuarios[i].email = teclado.next();
}
  return usuarios;
}
public static void mostrarUsuarios(Usuario[]usuarios){
    System.out.println("Usuarios creados:");
  for (Usuario usuario : usuario){
    System.out.println("Nombre: " + usuario.nombre);
    System.out.println("Apellidos: " + usuario.apellidos);
    System.out.println("Email: " + usuario.email);
    }
  }
}


