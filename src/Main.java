import java.util.Scanner;

static void main() {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Escreva as notas do usuario para receber a media do aluno:" +
            "Matemática, Portugues e Historia");
    int Nmat;
    int NPort;
    int Nhist;
    System.out.println("Matemática:");
    Nmat = leitor.nextInt();
    System.out.println("Portugues:");
    NPort = leitor.nextInt();
    System.out.println("Historia:");
    Nhist = leitor.nextInt();
}

