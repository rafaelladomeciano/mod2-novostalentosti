package introducao.avaliacao2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AppAvaliacao2 {
    public static void main(String[] args) {
    
    Curriculo curr1 = new Curriculo();

    Pessoa pessoa1 = new Pessoa();
    pessoa1.setNome("Zezinho");
    Calendar calendario = GregorianCalendar.getInstance();
    calendario.set(1980,12,01);
    pessoa1.setDataNascimento(calendario.getTime());
    curr1.setPessoa(pessoa1);

    Formacao form1 = new Formacao();
    form1.setNome("Ensino Médio");
    form1.setAnoConclusao(1999);

    Formacao form2 = new Formacao();
    form2.setNome("Curso Novos Talentos TI");
    form2.setAnoConclusao(2022);

    ExperienciaProfissional exp1 = new ExperienciaProfissional();
    exp1.setNome("Monstro em Java");
    exp1.setAnoConclusao("2022");

    curr1.getListaFormacoes().add(form1);
    curr1.getListaFormacoes().add(form2);
    curr1.getListaExperienciaProfissionais().add(exp1);

    Pessoa pessoa2 = new Pessoa();
    pessoa2.setNome("Mariazinha");
    Calendar calendario2 = GregorianCalendar.getInstance();
    calendario.set(1981,07,10);
    pessoa2.setDataNascimento(calendario2.getTime());

    Formacao form3 = new Formacao();
    form3.setNome("Ensino Médio");
    form3.setAnoConclusao(2000);

    Formacao form4 = new Formacao();
    form4.setNome("Curso Novos Talentos TI");
    form4.setAnoConclusao(2022);

    ExperienciaProfissional exp2 = new ExperienciaProfissional();
    exp2.setNome("DBA em MariaDB");
    exp2.setAnoConclusao("2022");

    ExperienciaProfissional exp3 = new ExperienciaProfissional();
    exp3.setNome("Desenvolvedora FullStack");
    exp3.setAnoConclusao("2021");

    Curriculo curr2 = new Curriculo();
    curr2.setPessoa(pessoa2);
    curr1.getListaFormacoes().add(form3);
    curr1.getListaFormacoes().add(form4);
    curr1.getListaExperienciaProfissionais().add(exp2);
    curr1.getListaExperienciaProfissionais().add(exp3);

    String montador = curr1.gerarCurriculo();
    System.out.println(montador);

    }
}
