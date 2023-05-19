class DeleteCandidata extends UpdateCandidata{
    
    public Candidata[] deleteCandidata(Candidata dados[], String nome){
        int i = 0;
        boolean deletado = false;
        while (dados[i]!= null){
            if(dados[i].getNome().equals(nome)){
                deletado = true;
               
            }
            if(deletado){
                dados[i] = dados[i+1];
            }
            i++;
        }
        dados[i] = null;
        return dados;
    }

}
