
class Controle {//scanner de entrada de dados

    public Candidata setCandidata(Candidata dados, ServiceCandidata serviceCandidata){ //Seta os dados de uma candidata
            dados = serviceCandidata.setCandidata(dados);
            return dados;
    }

    public void getCandidatas(Candidata dados[], ServiceCandidata serviceCandidata){ //Puxa todos os dados de TODAS as candidatas
            serviceCandidata.getCandidatas(dados);
    }

    public void getCandidata(Candidata dados[], String nome,  ServiceCandidata serviceCandidata){ //Puxa todos os dados de acordo com o nome da candidata
            serviceCandidata.getCandidata(dados, nome);
    }

    public Candidata[] updateCandidata(Candidata dados[], String nome, ServiceCandidata serviceCandidata){
        dados = serviceCandidata.updateCandidata(dados, nome);
        return dados;
    }

    public Candidata[] deleteCandidata(Candidata dados[], String nome, ServiceCandidata serviceCandidata){
        dados = serviceCandidata.deleteCandidata(dados, nome);
        return dados;
    } 
    public void relatorio(Candidata dados[], ServiceCandidata serviceCandidata, int cont){
        serviceCandidata.relatar(dados,cont);
    }
}