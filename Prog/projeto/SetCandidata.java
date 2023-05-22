import java.util.Scanner;

class SetCandidata {
    private Scanner entradas = new Scanner(System.in); //scanner de entrada de dados

    public Candidata setCandidata(Candidata dados){ //Seta os dados de uma candidata
        System.out.print("Nome da candidata:");
        String nome = entradas.next();

        System.out.print("Nota de Simpatia:");

        float simpatia = entradas.nextFloat();
        while(simpatia>10 || simpatia<0){
            System.out.print("valor invalido (entre 0 e 10)");
            simpatia = entradas.nextFloat();

        }

        System.out.print("Nota de Elegancia:");
        float elegancia = entradas.nextFloat();
        while(elegancia>10 || elegancia<0){
            System.out.print("valor invalido (entre 0 e 10)");
            elegancia = entradas.nextFloat();

        }

        System.out.print("Nota de Beleza:");
        float beleza = entradas.nextFloat();
        while(beleza>10 || beleza<0){
            System.out.print("valor invalido (entre 0 e 10)");
            beleza = entradas.nextFloat();
        }


        dados.setNome(nome);
        dados.setSimpatia(simpatia);
        dados.setElegancia(elegancia);
        dados.setBeleza(beleza);
        dados.setMediaPonderada(new Media());
        return dados;
}
}
