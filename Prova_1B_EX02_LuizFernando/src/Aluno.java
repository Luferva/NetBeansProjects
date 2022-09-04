
public class Aluno {

    String nome;
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    void status() {
        System.out.println("Aluno:" + this.nome);
        System.out.println("Sua primeira nota: " + this.nota1);
        System.out.println("Sua segunda nota: " + this.nota2);
        System.out.println("Sua terceira nota: " + this.nota3);
        System.out.println("Sua quarta nota: " + this.nota4);
        System.out.println("Sua media: " + this.obterMedia());
        System.out.println("O aluno esta: " + this.obterSituação());
    }

    public double obterMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public String obterSituação() {
        double media;
        String situacao;
        media = obterMedia();
        if (media < 40) {
            situacao = "REPROVADO";
        } else if (media < 70) {
            situacao = "RECUPERAÇÃO";
        } else {
            situacao = "APROVADO";
        }

        return situacao;

    }

}
