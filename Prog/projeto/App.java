import java.util.*;

public class App {
        
        public static void main(String args[]){

                boolean resp = true;

                int menu;


                
                Controle controle = new Controle();

                Scanner entradas = new Scanner(System.in); //scanner de entrada de dados

                while(resp == true){
                        System.out.println("( 1 ) – Incluir\n( 2 ) – Consultar\n( 3 ) – Alterar\n( 4 ) – Excluir\n( 5 ) – Relatar\n( 6 ) – Sair");
                        menu = Integer.parseInt(entradas.next());
                        switch(menu){
                                case 1:
                                        controle.incluirCandidata();
                                        break;
                                case 2:
                                       controle.consultarCandidata();
                                        break;
                                case 3:
                                        controle.alterarCandidatas();
                                        break;
                                case 4:
                                        controle.excluirCandidatas();
                                        break;
                                case 5:

                                        break;
                                case 6:
                                        resp = false;
                                        break;
                                default:
                                        System.out.println("Digite uma das opcoes corretamente");
                                        break;
                        }
                }
           entradas.close();
                 
        }
}