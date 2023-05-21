import java.util.Scanner;
class Controle {

    Candidata candidatas[] = new Candidata[100];
    ServiceCandidata serviceCandidata = new ServiceCandidata();

    Scanner entradas = new Scanner(System.in); //scanner de entrada de dados
    int cont = 0;

    public void incluirCandidata(){
        candidatas[cont] = new Candidata();
        candidatas[cont] = serviceCandidata.setCandidataService(candidatas[cont]);
        cont++;
    }

    public void consultarCandidata(){
        System.out.print("deseja visualizar  [1]todas as candidatas ou  [2]uma em especifico:");
        int respUsuario = Integer.parseInt(entradas.next());

        if(respUsuario==2){
            System.out.print("Digite o nome da candidata que deseja visualizar: ");
            String nomeConsult = entradas.next();
            serviceCandidata.getCandidataService(candidatas, nomeConsult);
        }else{
            serviceCandidata.getCandidatas(candidatas);
        }
        
    }

    public void alterarCandidatas(){
        System.out.print("Digite o nome da candidata que deseja alterar: ");
        String nomeUpdate = entradas.next();
        candidatas = serviceCandidata.updateCandidataService(candidatas, nomeUpdate);

    }

    public void excluirCandidatas(){
        System.out.print("Digite o nome da candidata que deseja excluir: ");
        String nomeDelete = entradas.next();
        candidatas = serviceCandidata.deleteCandidataService(candidatas, nomeDelete);
    }

    public void relatar(){
        candidatas = serviceCandidata.relatarService(candidatas, cont);
        serviceCandidata.getCandidatas(candidatas);
    }

}