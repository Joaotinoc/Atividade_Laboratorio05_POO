package laboratorio.lab5.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class DAOAluno implements DAO<Aluno> {

    List<Aluno> listaAlunos = new ArrayList<>();

    Aluno aluno = new Aluno();

    Scanner le = new Scanner(System.in);

    public boolean eIgualh(Aluno aluno) {
        for (var i : listaAlunos) {
            if (aluno.getId() == i.getId()) {
                System.out.println("Id é igual ");
                return true;
            } else if (aluno.getId() == i.getId()) {
                System.out.println("Id não é igual ");
                return false;
            }
        }
        return false;
    }

    public boolean possoAddh(Aluno alunoAdd) {
        if (listaAlunos.isEmpty()) {
            System.out.println("Lista esta vazia");
            return true;
        } else {
            for (Aluno i : listaAlunos) {
                if (eIgualh(alunoAdd)) {
                    System.out.println("Ja possui um aluno com esse Id, não posso add.");
                    return false;
                } else {
                    System.out.println("Não possui aluno com o mesmo Id, posso add.");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean possoRemoverh(Aluno alunoRemo) {
        if (listaAlunos.isEmpty()) {
            System.out.println("Lista esta vazia, nao à aluno para remover");
            return false;
        } else {
            for (var i : listaAlunos) {
                if (eIgualh(alunoRemo)) {
                    System.out.println("Aulo existe, vamos remover");
                    return true;
                } else {
                    System.out.println("Não possui aluno com esse Id");
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public Optional<Aluno> getId(Aluno id) {
        //nao considerar implementacao do metodo
        for (var i : listaAlunos) {
            if (aluno.getId() == i.getId()) {
                System.out.println("Id é igual ");
                return getId(id);
            } else if (aluno.getId() == i.getId()) {
                System.out.println("Id não é igual ");
                return getId(id);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Aluno> getAll() {
        return listaAlunos;
    }

    @Override
    public void save(Aluno alunoSave) {
        if (possoAddh(alunoSave)) {
            listaAlunos.add(alunoSave);
            System.out.println("alunoSave adicionado com sucesso ");
        } else {
            System.out.println("Nao foi possivel adicionar esse alunoSave na lista ");
        }

    }

    @Override
    public void update(Aluno alunoUp) {

        int resposta = 0;

        System.out.println("");
        System.out.println("Voçê deseja atualizar dado do aluno " + alunoUp.getNome() +" ?");
        System.out.println("Digite 1 para SIM ou 2 para Não");
        resposta = le.nextInt();

        if (resposta == 1 ) {

            int opcao = 0;
            while (opcao != 4) {

                if (listaAlunos.isEmpty()) {
                    System.out.println("Não existe alunos para atualizar dado");
                    return;
                }

                System.out.println("Voçê deseja atualizar qual dado do aluno " + alunoUp.getNome() +" ?");
                System.out.println("--> 1 Atualizar Nome: ");
                System.out.println("--> 2 Atualizar CPF: ");
                System.out.println("--> 3 Atualizar data de nascimento: ");
                System.out.println("--> 4 Sair da pagina de atualização de dados: ");
                opcao = le.nextInt();

                switch (opcao) {
                    case 1:
                        le = new Scanner(System.in);
                        System.out.println("Atualizando Nome...");
                        if (eIgualh(alunoUp)) {
                            System.out.println("Informe o novo nome: ");
                            alunoUp.setNome(le.nextLine());
                            System.out.println("Nome alterado com sucesso para: " + alunoUp.getNome());
                            System.out.println("");
                        } else {
                            System.out.println("O id deste aluno não existe, impossível atualizar Nome. ");
                            System.out.println("");
                        }
                        break;

                    case 2:
                        le = new Scanner(System.in);
                        System.out.println("Atualizando CPF...");
                        if (eIgualh(alunoUp)) {
                            System.out.println("Informe o novo CPF: ");
                            alunoUp.setCpf(le.nextLine());
                            System.out.println("CPF alterado com sucesso para: " + alunoUp.getCpf());
                            System.out.println("");
                        } else {
                            System.out.println("O id deste aluno não existe, impossével atualizar CPF. ");
                            System.out.println("");
                        }
                        break;

                    case 3:
                        le = new Scanner(System.in);
                        System.out.println("Atualizando data de nascimento...");
                        if (eIgualh(alunoUp)) {
                            System.out.println("Informe a nova data de nascimento: ");
                            alunoUp.setDataDeNascimento(le.nextLine());
                            System.out.println("Data de nascimento alterada com sucesso para: " + alunoUp.getDataDeNascimento());
                            System.out.println("");
                        } else {
                            System.out.println("O id deste aluno não existe, impossével atualizar data de nascimento. ");
                            System.out.println("");
                        }
                        break;

                    case 4: {
                        System.out.println("Voçê saiu da sessão de atualização de dados.");
                        System.out.println("");
                        break;
                    }
                    default:
                        System.out.println("Opção inválida");
                        System.out.println("");
                        break;
                }
            }
        } else if (resposta == 2) {
            System.out.println("Voçê escolheu não atualizar nenhum dado.");
        } else {
            System.out.println("Resposta inválida.");
        }
    }


    @Override
    public void delete(Aluno alunoDel) {
        if (possoRemoverh(alunoDel)) {
            listaAlunos.remove(alunoDel);
            System.out.println("removido");
        } else {
            System.out.println("nao foi possivel remover!");
        }

    }
}
