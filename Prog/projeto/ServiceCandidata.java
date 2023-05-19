class ServiceCandidata extends Relatar{

        public Candidata setCandidataService(Candidata dados){ //Seta os dados de uma candidata
            dados = setCandidata(dados);
            return dados;
        }

        public void getCandidatasService(Candidata dados[]){ //Puxa todos os dados de TODAS as candidatas
            getCandidatas(dados);
        }

        public void getCandidataService(Candidata dados[], String nome){ //Puxa todos os dados de acordo com o nome da candidata
            getCandidata(dados, nome);
        }

        public Candidata[] updateCandidataService(Candidata dados[], String nome){
            dados = updateCandidata(dados, nome);
            return dados;
        }

        public Candidata[] deleteCandidataService(Candidata dados[], String nome){
            dados = deleteCandidata(dados, nome);
            return dados;
        }

        public Candidata[] relatarService(Candidata dados[], int cont){
            dados = relatar(dados, cont);
            return dados;
        } 
    
}
