public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de cadastro iniciado...");
        Aluno aluno1 = new Aluno(
                "Amanda Nunes",
                22991821,
                "Ciência da Computação");
                
        aluno1.ExibirDados();
        System.out.println();

        Aluno aluno2 = new Aluno(
                "Roberto Carlos",
                22001283,
                "Sistemas de informação");

        aluno2.ExibirDados();
    }
}




              