public class Principal {

    public static void main (String[] args) {
IdadePessoa idade = new IdadePessoa();

idade.setNome("Túlio");
idade.setIdade(33);

IdadePessoa idade2 = new IdadePessoa();
idade2.setNome("Marina");
idade2.setIdade(33);

IdadePessoa idade3 = new IdadePessoa();
idade3.setNome("Bradock");
idade3.setIdade(1);
String termo;
if (idade3.getIdade() == 1) {
    termo = "ano";
}
else {
    termo = "anos";
}


System.out.println(idade.getNome() + " tem " + idade.getIdade() + " anos");
idade.verificarIdade();
System.out.println(idade2.getNome() + " tem " + idade2.getIdade() + " anos");
idade2.verificarIdade();
System.out.println(idade3.getNome() + " tem " + idade3.getIdade() + " " + termo);
idade3.verificarIdade();


    }
}
