public class Imprime {
        public void Impressao(Dados dados[]){ 
          for(int i=0;i<=dados.length-1;i++){
             System.out.println(dados[i].getnome());
             System.out.println(dados[i].getcidade());
             System.out.println(dados[i].gettelefone());
          }            
        }
}