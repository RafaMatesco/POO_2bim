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
        
        for(int i=0; i < cont; i++){
            if(dados[i+1] != null){
                if(dados[i].getMedia() == dados[i+1].getMedia()){
                    System.out.println(colocacao+"o. -"+ dados[i].getNome() +"| nota:"+dados[i].getMedia());
                }else{
                    System.out.println(colocacao+"o. -"+ dados[i].getNome() +"| nota:"+dados[i].getMedia());
                    colocacao++;
                }
            }else{
                System.out.println(colocacao+"o. -"+ dados[i].getNome() +"| nota:"+dados[i].getMedia());
            }

        }
    } 
    
}
/*
 * String tempS = dados[j].getNome();
dados[j].setNome(dados[j+1].getNome());
dados[j+1].setNome(tempS);

float tempF = dados[j].getMedia();
dados[j].setMediaPonderada(dados[j+1].getMedia());
dados[j+1].SetMedia(tempF);

tempF = dados[j].getElegancia();
dados[j].setElegancia(dados[j+1].getElegancia());
dados[j+1].setElegancia(tempF);

tempF = dados[j].getSimpatia();
dados[j].setSimpatia(dados[j+1].getSimpatia());
dados[j+1].setSimpatia(tempF);

tempF = dados[j].getBeleza();
dados[j].setBeleza(dados[j+1].getBeleza());
dados[j+1].setBeleza(tempF);
 */
