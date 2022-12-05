import java.util.Scanner;
import java.util.regex.*;
public class ProjetoProva {
         public static boolean validaSenha(String senha ){

 String senhas = "^(?=.*[0-9])"
                       + "(?=.*[aA-zZ])"
                       + "(?=.*<!#-!)"
                       + "(?=.*[@$&]).{5,20}$";
        Pattern p = Pattern.compile(senhas);
  
        if (senha == null) {
            return true;
        }
        Matcher m = p.matcher(senha);
        return m.matches();
    }
         public static boolean validaCpf(String cpf){
             String cpfs = "(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)";
              Pattern p1 = Pattern.compile(cpfs);
  
        if (cpf == null) {
            return true;
        }else if(cpf.equals("000.000.000-00") ){
            return false;
        }
               Matcher m = p1.matcher(cpf);
        return m.matches();
             
}
        public static boolean  validaTexto(String texto){
            String textos = "^(=.*[aA-zZ].{5,20})";
                                        
             Pattern p2 = Pattern.compile(textos);
             if(texto == null){
                 return true;
             }
             
                   Matcher m = p2.matcher(texto);
        return m.matches();
             
        } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("Digite seu CPF:");
        String cpf = s.next();
        System.out.println(validaCpf(cpf));
        
    
 /*---------------------------------------------------------*/
 
           System.out.println("Digite sua senha:");
      String senha = s.next();
        System.out.println(validaSenha(senha));
 /*---------------------------------------------------------*/
         String imprimeNome = s.next().toUpperCase();
        String nome = s.next();
        s.nextLine();
        String sexo = s.next();
        char primeiro = imprimeNome.charAt(0);
        char fim = imprimeNome.charAt(imprimeNome.length() - 1);


        String[] vect = nome.split(" ");
        char inicialNome = vect[0].charAt(0);
        String finalNome = vect[vect.length - 1];
        String inicialSexo = sexo.substring(0, 3);

        if (imprimeNome.contains("Doutorado") || imprimeNome.contains("Mestrado") || imprimeNome.contains("Graduação") || sexo.contains("Feminino") || sexo.contains("Masculino")) {

            System.out.println(new String(new char[] {
                primeiro,
                fim
            }) + ". " + finalNome + " " + inicialNome + ". " + " " + inicialSexo + ".");

        } else {
            System.out.println("Dados Inválidos");

        }
/*---------------------------------------------------------*/
          System.out.println("Digite seu texto:");
          String texto = s.next();
          System.out.println(validaTexto(texto));

    }

}
 