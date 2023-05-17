import java.util.*;

class Controle {
    private Scanner entradas = new Scanner(System.in); //scanner de entrada de dados

    public Candidata SetCandidata(Candidata dados){ //Seta os dados de uma candidata
            System.out.print("Nome da candidata:");
            String nome = entradas.next();

            System.out.print("Nota de Simpatia:");
            float Simpatia = entradas.nextFloat();

            System.out.print("Nota de Elegancia:");
            float Elegancia = entradas.nextFloat();

            System.out.print("Nota de Beleza:");
            float Beleza = entradas.nextFloat();

            float MediaPonderada = ((Simpatia*1) + (Elegancia*3) + (Beleza*4))/8;

            dados.setNome(nome);
            dados.setSimpatia(Simpatia);
            dados.setElegancia(Elegancia);
            dados.setBeleza(Beleza);
            dados.setMediaPonderada(MediaPonderada);
            return dados;
    }

    public void GetCandidatas(Candidata dados[]){ //Puxa todos os dados de TODAS as candidatas
            for(int i=0;i<=dados.length-1;i++){
                System.out.printf("\nNome: %s\n", dados[i].getNome());
                System.out.printf("Nota de Simpatia: %.2f\n", dados[i].getSimpatia());
                System.out.printf("Nota de Elegancia: %.2f\n", dados[i].getElegancia());
                System.out.printf("Nota de Beleza: %.2f\n\n", dados[i].getBeleza());
                System.out.printf("Media Ponderada: %.2f", dados[i].getMediaPonderada());
             }
    }

    public void GetCandidata(Candidata dados[], String nome, int cont){ //Puxa todos os dados de acordo com o nome da candidata
             
            for(int i=0;i<=cont-1;i++){
                if(dados[i].getNome() == nome){
                    System.out.printf("\nNome: %s\n", dados[i].getNome());
                    System.out.printf("Nota de Simpatia: %.2f\n", dados[i].getSimpatia());
                    System.out.printf("Nota de Elegancia: %.2f\n", dados[i].getElegancia());
                    System.out.printf("Nota de Beleza: %.2f\n\n", dados[i].getBeleza());
                    System.out.printf("Media Ponderada: %.2f\n", dados[i].getMediaPonderada());
                }
            }
    }

    public Candidata UpdateCandidata(Candidata dados[], String nome){
        int x = 0;
            for(int i=0;i<=dados.length-1;i++){
                if(nome == dados[i].getNome()){
                    dados[i] = SetCandidata(dados[i]);
                    x = i ;
                }
            }
            return dados[x];
    }

}
