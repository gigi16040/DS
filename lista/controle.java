import java.util.ArrayList;
import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();

        String nome;

        // Cadastro dos alunos
        while (true) {

            System.out.print("Digite o nome do aluno (fim para parar): ");
            nome = sc.nextLine();

            if (nome.equals("fim")) {
                break;
            }

            System.out.print("Digite a primeira nota: ");
            int nota1 = sc.nextInt();

            System.out.print("Digite a segunda nota: ");
            int nota2 = sc.nextInt();

            sc.nextLine();

            Aluno aluno = new Aluno(nome, nota1, nota2);

            alunos.add(aluno);
        }

        // Média da turma
        double soma = 0;

        for (int i = 0; i < alunos.size(); i++) {

            double media = (alunos.get(i).getPrimeiraNota()
                    + alunos.get(i).getSegundaNota()) / 2.0;

            soma = soma + media;
        }

        double mediaTurma = soma / alunos.size();

        System.out.println("\nMedia da turma: " + mediaTurma);

        // Contar alunos
        int aprovados = 0;
        int finalistas = 0;
        int reprovados = 0;

        for (int i = 0; i < alunos.size(); i++) {

            double media = (alunos.get(i).getPrimeiraNota()
                    + alunos.get(i).getSegundaNota()) / 2.0;

            if (media >= 70) {
                aprovados++;
            } else if (media >= 50) {
                finalistas++;
            } else {
                reprovados++;
            }
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Final: " + finalistas);
        System.out.println("Reprovados: " + reprovados);

        // Alunos abaixo da média da turma
        System.out.println("\nAlunos abaixo da media da turma:");

        for (int i = 0; i < alunos.size(); i++) {

            double media = (alunos.get(i).getPrimeiraNota()
                    + alunos.get(i).getSegundaNota()) / 2.0;

            if (media < mediaTurma) {
                System.out.println(alunos.get(i).getNome());
            }
        }

        sc.close();
    }
}