import java.util.Scanner;

static void main() {

    String[] alunos= new String[6];
    double[] notas = new double[6];
    alunos[1]="João";
    alunos[2]="Luana";
    alunos[3]="Cauã";
    alunos[4]="Savio";
    alunos[5]="Edson";

    Scanner leitor = new Scanner(System.in);
    System.out.println("Escreva as notas do usuario para receber a media do aluno:" +
            "Matemática, Portugues e Historia");
    int Nmat;
    int NPort;
    int Nhist;
    double media1;
    double media2;
    double media3;
    double media4;
    double media5;
    System.out.println(alunos[1] + " Matemática:");
    Nmat = leitor.nextInt();
    System.out.println(alunos[1] + " Portugues");
    NPort = leitor.nextInt();
    System.out.println(alunos[1] + " Historia");
    Nhist = leitor.nextInt();
    media1 = (Nmat + NPort + Nhist)/3;


    System.out.println(alunos[2] + " Matemática:");
    Nmat = leitor.nextInt();
    System.out.println(alunos[2] + " Portugues");
    NPort = leitor.nextInt();
    System.out.println(alunos[2] + " Historia");
    Nhist = leitor.nextInt();
    media2 = (Nmat + NPort + Nhist)/3;

    System.out.println(alunos[3] + " Matemática:");
    Nmat = leitor.nextInt();
    System.out.println(alunos[3] + " Portugues");
    NPort = leitor.nextInt();
    System.out.println(alunos[3] + " Historia");
    Nhist = leitor.nextInt();
    media3 = (Nmat + NPort + Nhist)/3;

    System.out.println(alunos[4] + " Matemática:");
    Nmat = leitor.nextInt();
    System.out.println(alunos[4] + " Portugues");
    NPort = leitor.nextInt();
    System.out.println(alunos[4] + " Historia");
    Nhist = leitor.nextInt();
    media4 = (Nmat + NPort + Nhist)/3;

    System.out.println(alunos[5] + " Matemática:");
    Nmat = leitor.nextInt();
    System.out.println(alunos[5] + " Portugues");
    NPort = leitor.nextInt();
    System.out.println(alunos[5] + " Historia");
    Nhist = leitor.nextInt();
    media5 = (Nmat + NPort + Nhist)/3;

    notas[1] = media1;
    if (media1 > 7) {
        System.out.println(alunos[1] + " Aprovado:" + "Media:" + notas[1]);
    }
    else  if ( media1 < 6 && media1 > 4) {
        System.out.println(alunos[1] + " Recuperação:" + "Media:" + notas[1]);
    }
    else  if (media1 < 4) {
        System.out.println(alunos[1] + " Reprovado:" + "Media:" + notas[1]);
    }

    notas[2] = media2;
    if (media2 > 7) {
        System.out.println(alunos[2] + " Aprovado:" + "Media:" + notas[2]);
    }
    else  if ( media2 < 6 && media2 > 4) {
        System.out.println(alunos[2] + " Recuperação:" + "Media:" + notas[2]);
    }
    else  if (media2 < 4) {
        System.out.println(alunos[2] + " Reprovado:" + "Media:" + notas[2]);
    }

    notas[3] = media3;
    if (media3 > 7) {
        System.out.println(alunos[3] + " Aprovado:" + "Media:" + notas[3]);
    }
    else if  ( media3 < 6 && media3 > 4) {
        System.out.println(alunos[3] + " Recuperação:" + "Media:" + notas[3]);
    }
    else if (media3 < 4) {
        System.out.println(alunos[3] + " Reprovado:" + "Media:" + notas[3]);
    }

    notas[4] = media4;
    if (media4 > 7) {
        System.out.println(alunos[4] + " Aprovado:" + "Media:" + notas[4]);
    }
    else  if ( media4 < 6 && media4 > 4) {
        System.out.println(alunos[4] + " Recuperação:" + "Media:" + notas[4]);
    }
    else if (media4 < 4) {
        System.out.println(alunos[4] + " Reprovado:" + "Media:" + notas[4]);
    }

    notas[5] = media5;
    if (media5 > 7) {
        System.out.println(alunos[5] + " Aprovado:" + "Media:" + notas[5]);
    }
    else  if ( media5 < 6 && media5 > 4) {
        System.out.println(alunos[5] + " Recuperação:" + "Media:" + notas[5]);
    }
    else  if (media5 < 4) {
        System.out.println(alunos[5] + " Reprovado:" + "Media:" + notas[5]);
    }
}