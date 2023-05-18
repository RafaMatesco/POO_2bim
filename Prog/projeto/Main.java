import java.util.*;

public class Main {
        
        public static void main(String args[]){

                boolean resp = true;
                int cont = 0;
                int menu;


                Candidata candidatas[] = new Candidata[100];
                Controle controle = new Controle();

                Scanner entradas = new Scanner(System.in); //scanner de entrada de dados
                while(resp == true){
                        System.out.println("( 1 ) – Incluir\n( 2 ) – Consultar\n( 3 ) – Alterar\n( 4 ) – Excluir\n( 5 ) – Relatar\n( 6 ) – Sair");
                        menu = Integer.parseInt(entradas.next());
                        switch(menu){
                                case 1:
                                        candidatas[cont] = new Candidata();
                                        candidatas[cont] = controle.SetCandidata(candidatas[cont]);
                                        cont++;
                                        break;
                                case 2:
                                        System.out.print("deseja visualizar todas as candidatas ou uma em especifico[2/1]:");
                                        int respUsuario = Integer.parseInt(entradas.next());

                                        if(respUsuario==1){
                                                System.out.print("Digite o nome da candidata que deseja visualizar: ");
                                                String nome2 = entradas.next();
                                                controle.GetCandidata(candidatas, nome2);
                                                break;
                                        }
                                        controle.GetCandidatas(candidatas);
                                        break;
                                case 3:
                                        System.out.print("Digite o nome da candidata que deseja alterar: ");
                                        String nome3 = entradas.next();
                                        candidatas = controle.UpdateCandidata(candidatas, nome3);

                                        break;
                                case 4:
                                        
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
            /*
             
            for(int i=0;i<=quant-1;i++){  
               candidatas[i] = new Candidata(); 

               System.out.print("Nome da candidata:");
               String nome = entradas.nextLine();

               System.out.print("Nota de Simpatia:");
               String Simpatiastr = entradas.nextLine();
               int Simpatia = Integer.parseInt(Simpatiastr);

               System.out.print("Nota de Elegancia:");
               String Eleganciastr = entradas.nextLine();
               int Elegancia = Integer.parseInt(Eleganciastr);

               System.out.print("Nota de Beleza:");
               String Belezastr = entradas.nextLine();
               int Beleza = Integer.parseInt(Belezastr);
               
               candidatas[i].setNome(nome); 
               candidatas[i].setSimpatia(Simpatia);
               candidatas[i].setElegancia(Elegancia);
               candidatas[i].setBeleza(Beleza);
               System.out.println("");
             }  */
             
             //controle.Impressao(candidatas); //Imprime dados das candidatas
                 
        }
}