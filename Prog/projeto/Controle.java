
class Controle {//scanner de entrada de dados

    ServiceCandidata serviceCandidata = new ServiceCandidata();

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