import java.util.Scanner;

class UpdateCandidata extends GetCandidata{

    private Scanner entradas = new Scanner(System.in); //scanner de entrada de dados

    public Candidata[] updateCandidata(Candidata dados[], String nome){
        int i = 0;
        System.out.println("Qual campo deseja alterar?\n 1-Nome\n 2-Simpatia\n 3-Elegancia\n 4-Beleza");
        int resp = Integer.parseInt(entradas.next());
        while (dados[i]!= null){
            if(dados[i].getNome().equals(nome)){
                break;
            }
            i++;
        }
        if(resp == 1){
            System.out.println("Novo nome: ");
            String novoNome = entradas.next();
            dados[i].setNome(novoNome);
        }else if(resp == 2){
            System.out.println("Nova nota para simpatia: ");
            Float novoSimpatia = Float.parseFloat(entradas.next());
            dados[i].setSimpatia(novoSimpatia);
        }else if(resp == 3){
            System.out.println("Nova nota para elegancia: ");
            Float novoElegancia = Float.parseFloat(entradas.next());
            dados[i].setSimpatia(novoElegancia);
        }else if(resp == 4){
            System.out.println("Nova nota para beleza: ");
            Float novoBeleza = Float.parseFloat(entradas.next());
            dados[i].setBeleza(novoBeleza);
        }else{
            System.out.println("Digite uma das opcoes corretamente");
        }
        dados[i].setMediaPonderada(new Media());
        return dados;
    }

}
