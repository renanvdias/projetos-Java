package br.com.podflix.podflix;
  import jakarta.persistence.Entity;
  import jakarta.persistence.GeneratedValue;
  import jakarta.persistence.GenerationType;
  import jakarta.persistence.Id;
  import java.sql.Time;

@Entity
public class Podcasts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nome_ep;
    private int num_ep;
    private Time duracao;
    private String url;

    public Podcasts() {
    }

    public Podcasts(int id, String produtor, String nomeEp, int numEp, Time duracao, String url) {
        this.id = id;
        this.produtor = produtor;
        this.nome_ep = nomeEp;
        this.num_ep = numEp;
        this.duracao = duracao;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNomeEp() {
        return nome_ep;
    }

    public void setNomeEp(String nomeEp) {
        this.nome_ep = nomeEp;
    }

    public int getNumEp() {
        return num_ep;
    }

    public void setNumEp(int numEp) {
        this.num_ep = numEp;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
