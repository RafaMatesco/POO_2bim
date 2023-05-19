class UpdateCandidata extends GetCandidata{
    
    public Candidata[] updateCandidata(Candidata dados[], String nome){
        int i = 0;
        while (dados[i]!= null){
            if(dados[i].getNome().equals(nome)){
                dados[i] = setCandidata(dados[i]);
                break;
            }
        }
        return dados;
    }

}
