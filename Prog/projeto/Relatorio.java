class Relatorio extends DeleteCandidata{

    public void relatar(Candidata dados[], int cont){
        
        for(int i=0; i < cont-1; i++){
            if(dados[i] != null){
                for (int j = 0; j < cont - i - 1; j++){
                    if (dados[j].getMedia() < dados[j+1].getMedia()) {
                        Candidata aux = dados[j];

                        dados[j] = dados[j+1];
                        dados[j+1] = aux;
                    }
                }
            }
        }
        int colocacao = 1;
        System.out.println("");
        for(int i=0; i < cont; i++){
            if(dados[i+1] != null){
                if(dados[i].getMedia() == dados[i+1].getMedia()){
                    System.out.printf("%do.- %s | nota: %.2f\n", colocacao, dados[i].getNome(), dados[i].getMedia());
                }else{
                    System.out.printf("%do.- %s | nota: %.2f\n", colocacao, dados[i].getNome(), dados[i].getMedia());
                    colocacao++;
                }
            }else{
                System.out.printf("%do.- %s | nota: %.2f\n", colocacao, dados[i].getNome(), dados[i].getMedia());
            }

        }
    } 
    
}
