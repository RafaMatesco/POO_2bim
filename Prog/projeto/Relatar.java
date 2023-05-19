class Relatar extends DeleteCandidata{

    public Candidata[] relatar(Candidata dados[], int cont){
        float valorAtual;
        int posicao;
        for(int index = 1; index<cont; index++){
            System.out.print(index-1);
            
            if(dados[index-1] != null){
                valorAtual = dados[index].MediaPonderada;
                posicao = index;

                while(posicao > 0 && dados[index-1].MediaPonderada() > valorAtual){
                    dados[posicao].MediaPonderada = dados[posicao-1].MediaPonderada;
                    posicao = posicao-1;
                }
                dados[posicao].MediaPonderada = valorAtual;
            }
        }
        return dados;
    } 
    
}
