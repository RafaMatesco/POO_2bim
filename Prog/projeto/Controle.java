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


            dados.setNome(nome);
            dados.setSimpatia(Simpatia);
            dados.setElegancia(Elegancia);
            dados.setBeleza(Beleza);
            return dados;
    }

    public void GetCandidatas(Candidata dados[]){ //Puxa todos os dados de TODAS as candidatas
            int i = 0;
            while (dados[i]!= null) {
                System.out.printf("\nNome: %s\n", dados[i].getNome());
                System.out.printf("Nota de Simpatia: %.2f\n", dados[i].getSimpatia());
                System.out.printf("Nota de Elegancia: %.2f\n", dados[i].getElegancia());
                System.out.printf("Nota de Beleza: %.2f\n\n", dados[i].getBeleza());
                System.out.printf("Media Ponderada: %.2f", dados[i].MediaPonderada());
                i++;
            }
    }

    public void GetCandidata(Candidata dados[], String nome){ //Puxa todos os dados de acordo com o nome da candidata
            int i = 0;    
            while (dados[i]!= null){
                if(dados[i].getNome().equals(nome)){
                    System.out.printf("\nNome: %s\n", dados[i].getNome());
                    System.out.printf("Nota de Simpatia: %.2f\n", dados[i].getSimpatia());
                    System.out.printf("Nota de Elegancia: %.2f\n", dados[i].getElegancia());
                    System.out.printf("Nota de Beleza: %.2f\n\n", dados[i].getBeleza());
                    System.out.printf("Media Ponderada: %.2f\n", dados[i].MediaPonderada());
                    break;
                }
                i++;
            }
    }

    public Candidata[] UpdateCandidata(Candidata dados[], String nome){
            int x = 0;
            int i = 0;
            while (dados[i]!= null){
                if(dados[i].getNome().equals(nome)){
                    dados[i] = SetCandidata(dados[i]);
                    break;
                }
            }
            return dados;
    }

}
