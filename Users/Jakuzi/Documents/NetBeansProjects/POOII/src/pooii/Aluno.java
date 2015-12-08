
package pooii;

public class Aluno {

    private String nome;
    private String sexo;
    private String[] disciplinas;
    private String comentario;
    
    public Aluno(String nome, String sexo, String[] disciplinas, String comentario){
    this.nome = nome;
    this.sexo = sexo;
    this.disciplinas = disciplinas;
    this.comentario = comentario;
    }
    public Aluno(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
