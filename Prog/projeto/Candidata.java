class Candidata {
       private String nome;
       private float Simpatia;
       private float Elegancia;
       private float Beleza;
       
       public float MediaPonderada;
       
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
       
       public float MediaPonderada(){
                this.MediaPonderada = ((this.Simpatia*1) + (this.Elegancia*3) + (this.Beleza*4))/8;
                return this.MediaPonderada;
       }
}
