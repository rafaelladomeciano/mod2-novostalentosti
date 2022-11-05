package introducao.avaliacao2;

import java.util.ArrayList;

public class Curriculo {

    private ArrayList<Formacao> listaFormacoes = new ArrayList<>();
    private ArrayList<ExperienciaProfissional> listaExperienciaProfissionais = new ArrayList<>();
    private Pessoa pessoa;

    public ArrayList<ExperienciaProfissional> getListaExperienciaProfissionais() {
        return listaExperienciaProfissionais;
    }

    public void setListaExperienciaProfissionais(ArrayList<ExperienciaProfissional> listaExperienciaProfissionais) {
        this.listaExperienciaProfissionais = listaExperienciaProfissionais;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Formacao> getListaFormacoes() {
        return listaFormacoes;
    }

    public void setListaFormacoes(ArrayList<Formacao> listaFormacoes) {
        this.listaFormacoes = listaFormacoes;
    }

    public String gerarCurriculo() {
        StringBuilder montador = new StringBuilder();
        
        montador.append("Nome pessoa: " + getPessoa().getNome() + "\n");
        montador.append("Data nascimento: " + getPessoa().getDataNascimento() + "\n");

        for (var umExp : getListaExperienciaProfissionais()) {
            montador.append("Experiência : " + umExp.getNome() + "\n");
            montador.append("Ano de conclusão: " + umExp.getAnoConclusao() + "\n");
        }
        for (var umForm : getListaFormacoes()) {
            montador.append("Formação: " + umForm.getNome() + "\n");
            montador.append("Ano de conclusão: " + umForm.getAnoConclusao() + "\n");
        }
        return montador.toString();
    }
}
    