class GetCandidata extends SetCandidata{

    public void getCandidatas(Candidata dados[]){ //Puxa todos os dados de TODAS as candidatas
        int i = 0;
        while (dados[i]!= null) {
            System.out.printf("\nNome: %s\n", dados[i].getNome());
            System.out.printf("Nota de Simpatia: %.2f\n", dados[i].getSimpatia());
            System.out.printf("Nota de Elegancia: %.2f\n", dados[i].getElegancia());
            System.out.printf("Nota de Beleza: %.2f\n\n", dados[i].getBeleza());
            System.out.printf("Media Ponderada: %.2f\n\n", dados[i].getMedia());
            i++;
        }
}

public void getCandidata(Candidata dados[], String nome){ //Puxa todos os dados de acordo com o nome da candidata
        int i = 0;    
        while (dados[i]!= null){
            if(dados[i].getNome().equals(nome)){
                System.out.printf("\nNome: %s\n", dados[i].getNome());
                System.out.printf("Nota de Simpatia: %.2f\n", dados[i].getSimpatia());
                System.out.printf("Nota de Elegancia: %.2f\n", dados[i].getElegancia());
                System.out.printf("Nota de Beleza: %.2f\n\n", dados[i].getBeleza());
                System.out.printf("Media Ponderada: %.2f\n\n", dados[i].getMedia());
                break;
            }
            i++;
        }
}
    
}
