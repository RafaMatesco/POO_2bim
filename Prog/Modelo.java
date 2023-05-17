import java.util.*;
public class Modelo {
        
        public static void main(String args[]){
            Imprime imprime = new Imprime();
            Scanner entrada = new Scanner(System.in);
            System.out.print("Numero de pessoas: ");
            int quant = Integer.parseInt(entrada.nextLine());
            Dados dados[] = new Dados[quant]; 
             
            for(int i=0;i<=quant-1;i++){  
               dados[i] = new Dados(); 
               System.out.print("Nome:");
               String nome = entrada.nextLine();
               System.out.print("Cidade:");
               String cidade = entrada.nextLine();
               System.out.print("Telefone:");
               String telefone = entrada.nextLine();
               
               dados[i].setnome(nome); 
               dados[i].setcidade(cidade);
               dados[i].settelefone(telefone);
             }  
       
              imprime.Impressao(dados);              
               
               
               
                 
        }
}