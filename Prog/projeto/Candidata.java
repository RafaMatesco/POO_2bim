class Candidata {
       private String nome;
       private float Simpatia;
       private float Elegancia;
       private float Beleza;
       private float MediaPonderada;
       
       public void setNome(String nome){
               this.nome = nome;
       }
       public void setSimpatia(float simpatia){
               this.Simpatia = simpatia;
       }
       public void setElegancia(float elegancia){
               this.Elegancia = elegancia;
       }
       public void setBeleza(float beleza){
               this.Beleza = beleza;
       }
       public void setMediaPonderada(float mediaponderada){
                this.MediaPonderada = mediaponderada;
       }

       public String getNome(){
               return this.nome;
       }
       public float getSimpatia(){
               return this.Simpatia;
       }
       public float getElegancia(){
               return this.Elegancia;
       }
       public float getBeleza(){
               return this.Beleza;
       }
       public float getMediaPonderada(){
                return this.MediaPonderada;
       }
}