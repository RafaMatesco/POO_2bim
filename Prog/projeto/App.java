import java.util.Scanner;
class App {
        public static void main(String args[]){
                Scanner entradas = new Scanner(System.in); //scanner de entrada de dados   
                Controle controle = new Controle();
                
                int menu;  
                boolean resp = true;
                while(resp == true){
                        System.out.println("( 1 ) - Incluir\n( 2 ) - Consultar\n( 3 ) - Alterar\n( 4 ) - Excluir\n( 5 ) - Relatar\n( 6 ) - Sair");
                        menu = Integer.parseInt(entradas.next());
                        if(menu == 1){
                                controle.incluirCandidata();
                        }else if(menu == 2){
                                controle.consultarCandidata();
                        }else if(menu == 3){
                                controle.alterarCandidatas();
                        }else if(menu == 4){
                                controle.excluirCandidatas();
                        }else if(menu == 5){
                                controle.relatar();
                        }else if(menu == 6){
                                break;
                        }else{
                                System.out.println("Digite uma das opcoes corretamente");
                        }
                }
                entradas.close();
        }
           
}
