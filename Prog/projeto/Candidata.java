class Candidata {
       private String nome;
       private float simpatia;
       private float elegancia;
       private float beleza;
       private float media;
       
       public void setNome(String nome){
               this.nome = nome;
       }
       public void setSimpatia(float simpatia){
               this.simpatia = simpatia;
       }
       public void setElegancia(float elegancia){
               this.elegancia = elegancia;
       }
       public void setBeleza(float beleza){
               this.beleza = beleza;
       }

       public String getNome(){
               return this.nome;
       }
       public float getSimpatia(){
               return this.simpatia;
       }
       public float getElegancia(){
               return this.elegancia;
       }
       public float getBeleza(){
               return this.beleza;
       }
       public void setMediaPonderada(Media medias){
                float[] valores = {this.beleza, this.elegancia, this.simpatia};
                float[] pesos = {4,3,1}; 
                this.media = medias.MediaPonderada(valores,pesos);
       }
       public float getMedia(){
                return this.media;
       }
}
