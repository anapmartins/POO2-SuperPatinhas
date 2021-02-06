package superPatinhas;

public class Adocao {

    private String documentosExigidos;

    private String estadoAdocao;

    private String animal;

    public String getDocumentosExigidos() {
        return documentosExigidos;
    }

    public void setDocumentosExigidos(String documentosExigidos) {
        this.documentosExigidos = documentosExigidos;
    }

    public String getEstadoAdocao() {
        return estadoAdocao;
    }

    public void setEstadoAdocao(String estadoAdocao) {
        this.estadoAdocao = estadoAdocao;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Adocao(String documentosExigidos, String estadoAdocao, String animal) {
        this.documentosExigidos = documentosExigidos;
        this.estadoAdocao = estadoAdocao;
        this.animal = animal;
    }
}
