import java.util.*;

public class App {
        
        public static void main(String args[]){

                boolean resp = true;
                int cont = 0;
                int menu;


                Candidata candidatas[] = new Candidata[100];
                Controle controle = new Controle();
                ServiceCandidata serviceCandidata = new ServiceCandidata();

                Scanner entradas = new Scanner(System.in); //scanner de entrada de dados
                while(resp == true){
                        System.out.println("( 1 ) – Incluir\n( 2 ) – Consultar\n( 3 ) – Alterar\n( 4 ) – Excluir\n( 5 ) – Relatar\n( 6 ) – Sair");
                        menu = Integer.parseInt(entradas.next());
                        switch(menu){
                                case 1:
                                        candidatas[cont] = new Candidata();
                                        candidatas[cont] = controle.setCandidata(candidatas[cont],serviceCandidata);
                                        cont++;
                                        break;
                                case 2:
                                        System.out.print("deseja visualizar todas as candidatas ou uma em especifico[2/1]:");
                                        int respUsuario = Integer.parseInt(entradas.next());

                                        if(respUsuario==1){
                                                System.out.print("Digite o nome da candidata que deseja visualizar: ");
                                                String nomeConsult = entradas.next();
                                                controle.getCandidata(candidatas, nomeConsult,serviceCandidata);
                                                break;
                                        }
                                        controle.getCandidatas(candidatas, serviceCandidata);
                                        break;
                                case 3:
                                        System.out.print("Digite o nome da candidata que deseja alterar: ");
                                        String nomeUpdate = entradas.next();
                                        candidatas = controle.updateCandidata(candidatas, nomeUpdate, serviceCandidata);

                                        break;
                                case 4:
                                                
                                        System.out.print("Digite o nome da candidata que deseja excluir: ");
                                        String nomeDelete = entradas.next();
                                        candidatas = controle.deleteCandidata(candidatas, nomeDelete,serviceCandidata);
                                        
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