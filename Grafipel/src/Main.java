public class Main {
    public static void main(String[] args) {

        Pessoa[]p = new Pessoa[2];
        Livro[]l = new Livro[4];

        p[0] = new Pessoa("Lais", 17, "F");
        p[1] = new Pessoa("Ryhan", 17, "M");

        l[0] = new Livro("Verity", "Colleen Hoover", 320, p[0]);
        l[1] = new Livro("Maquinas Elétricas", "Nao sei", 400, p[1])

        l[0].folhear(330);
        System.out.println(l[0].detalhes());
    }
}