import java.util.Scanner;

static void main() {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Escreva as notas do usuario para receber a media do aluno:" +
            "Matemática, Portugues e Historia");
    int Nmat;
    int NPort;
    int Nhist;
    double media;

    System.out.println("Matemática:");
    Nmat = leitor.nextInt();
    System.out.println("Portugues:");
    NPort = leitor.nextInt();
    System.out.println("Historia:");
    Nhist = leitor.nextInt();
    media = (Nmat + NPort + Nhist)/3;
    System.out.println("média:" + media);

    if (media > 7) {
        System.out.println("Aprovado");
    }
    if ( media < 6 && media > 4) {
        System.out.println("Recuperação");
    }
    if (media < 4) {
        System.out.println("Reprovado");
    }
}