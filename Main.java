package laboratorio.lab5.a;

public class Main {

    public static void main(String[] args) {

        DAOAluno menu = new DAOAluno();

        Aluno aluno1 = new Aluno(1,"100","102.450.852-52","João","16/07/2000");
        Aluno aluno2 = new Aluno(2,"101","300.450.852-52","Marcos","28/03/2000");
        Aluno aluno3 = new Aluno(3,"102","308.450.852-52","Marco","30/03/2001");



       //adicionando um aluno
        menu.save(aluno1);
        System.out.println(menu.listaAlunos );
        System.out.println("");

        //adicionando aluno 2
        menu.save(aluno2);
        System.out.println(menu.listaAlunos );
        System.out.println("");

        // adicionando aluno 3
        menu.save(aluno3);
        System.out.println(menu.listaAlunos);
        System.out.println("");

        // adicionando aluno 3 novamente
        menu.save(aluno3);
        System.out.println(menu.listaAlunos);
        System.out.println("");

        //deletando aluno 3
        menu.delete(aluno3);
        System.out.println(menu.listaAlunos);
        System.out.println("");

        //deletando aluno 2
        menu.delete(aluno2);
        System.out.println(menu.listaAlunos);
        System.out.println("");

        //deletando aluno 1
        menu.delete(aluno1);
        System.out.println(menu.listaAlunos);
        System.out.println("");

        //deletando aluno 1 novamente
        menu.delete(aluno1);
        System.out.println(menu.listaAlunos);
        System.out.println("");

        System.out.println(menu.listaAlunos);


        // teste de update, interacao com usuario
        menu.save(aluno3);
        System.out.println(menu.listaAlunos);
        menu.update(aluno3);


    }
}
