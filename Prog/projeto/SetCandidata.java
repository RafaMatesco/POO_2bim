import java.util.Scanner;

class SetCandidata {
    private Scanner entradas = new Scanner(System.in); //scanner de entrada de dados

    public Candidata setCandidata(Candidata dados){ //Seta os dados de uma candidata
        System.out.print("Nome da candidata:");
        String nome = entradas.next();

        System.out.print("Nota de Simpatia:");
        float Simpatia = entradas.nextFloat();

        System.out.print("Nota de Elegancia:");
        float Elegancia = entradas.nextFloat();

        System.out.print("Nota de Beleza:");
        float Beleza = entradas.nextFloat();

        float mediaPond = ((Simpatia*1)+(Elegancia*3)+(Beleza*4))/8;

        dados.setNome(nome);
        dados.setSimpatia(Simpatia);
        dados.setElegancia(Elegancia);
        dados.setBeleza(Beleza);
        dados.SetMedia(mediaPond);
        return dados;
}
}
