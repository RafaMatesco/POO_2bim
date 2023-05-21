class Relatar extends DeleteCandidata{

    public Candidata[] relatar(Candidata dados[], int cont){
        for (int i=0; i < cont-1; i++){
            System.out.println(i);
            if(dados[i] != null){
                for (int j = 0; j < cont - i - 1; j++){
                    System.out.println(j);
                    if (dados[j].getMedia() > dados[j+1].getMedia()) {
                        float temp = dados[j].getMedia();
                        dados[j].SetMedia(dados[j+1].getMedia());
                        dados[j+1].SetMedia(temp);
                    }
                }
            }
        }
        return dados;
    } 
    
}
