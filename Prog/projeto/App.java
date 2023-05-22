/* *******************************************************************
 * Colegio Técnico Antônio Teixeira Fernandes (Univap)
 * Curso Técnico em Informática - Data de Entrega: 22/05/2023
 * Autores do Projeto: Rafael Giordano Matesco
 *                      Paulo Renato Durante
 * 
 * Turma: 3H0  Disciplina: Programação - II
 * Avaliação parcial referente ao 2 - Bimestre
 * Observação: <colocar se houver>
 * 
 * App.java
 * ******************************************************************/

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
                        System.out.println("( 1 ) - Incluir\n( 2 ) - Consultar\n( 3 ) - Alterar\n( 4 ) - Excluir\n( 5 ) - Relatar\n( 6 ) - Sair");
                        menu = Integer.parseInt(entradas.next());
                        switch(menu){
                                case 1:
                                        candidatas[cont] = new Candidata();
                                        candidatas[cont] = controle.setCandidata(candidatas[cont],serviceCandidata);
                                        cont++;
                                        break;
                                case 2:
                                        System.out.print("deseja visualizar todas as candidatas[2] ou uma em especifico[1]:");
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
                                        controle.getCandidata(candidatas, nomeDelete,serviceCandidata);                                     
                                        System.out.println("Deseja exlcluir esta candidata? s/n");
                                        String resposta = entradas.next();
                                        if(resposta.equals("s")){
                                            candidatas = controle.deleteCandidata(candidatas, nomeDelete,serviceCandidata);
                                            cont--;
                                        }
                                        
                                        
                                        
                                        break;
                                case 5:
                                        controle.relatorio(candidatas, serviceCandidata, cont);

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