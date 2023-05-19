import java.util.Scanner;
class Controle {
    Candidata candidatas[] = new Candidata[100];
    ServiceCandidata serviceCandidata = new ServiceCandidata();
    Scanner entradas = new Scanner(System.in); //scanner de entrada de dados
    int cont = 0;

    public void incluirCandidata(){
        candidatas[cont] = new Candidata();
        candidatas[cont] = setCandidata(candidatas[cont]);
        cont++;
    }

    public void consultarCandidata(){
        System.out.print("deseja visualizar todas as candidatas ou uma em especifico[2/1]:");
        int respUsuario = Integer.parseInt(entradas.next());

        if(respUsuario==1){
                System.out.print("Digite o nome da candidata que deseja visualizar: ");
                String nomeConsult = entradas.next();
                getCandidata(candidatas, nomeConsult);
        }
        getCandidatas(candidatas);
    }

    public void alterarCandidatas(){
                System.out.print("Digite o nome da candidata que deseja alterar: ");
                String nomeUpdate = entradas.next();
                candidatas = updateCandidata(candidatas, nomeUpdate);

    }

    public void excluirCandidatas(){
                System.out.print("Digite o nome da candidata que deseja excluir: ");
                String nomeDelete = entradas.next();
                candidatas = deleteCandidata(candidatas, nomeDelete);
    }

 /* */
    public Candidata setCandidata(Candidata dados){ //Seta os dados de uma candidata
            dados = serviceCandidata.setCandidata(dados);
            return dados;
    }

    public void getCandidatas(Candidata dados[]){ //Puxa todos os dados de TODAS as candidatas
            serviceCandidata.getCandidatas(dados);
    }

    public void getCandidata(Candidata dados[], String nome){ //Puxa todos os dados de acordo com o nome da candidata
            serviceCandidata.getCandidata(dados, nome);
    }

    public Candidata[] updateCandidata(Candidata dados[], String nome){
        dados = serviceCandidata.updateCandidata(dados, nome);
        return dados;
    }

    public Candidata[] deleteCandidata(Candidata dados[], String nome){
        dados = serviceCandidata.deleteCandidata(dados, nome);
        return dados;
    }
}