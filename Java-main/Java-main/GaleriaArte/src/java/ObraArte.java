


import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="dados")
public class ObraArte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    @Column(name = "nome_autor", nullable = true)
    private String autor;
    private String tecnica;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_obra", nullable = true)
    private Calendar dataObra;
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTecnica(){
        return tecnica;
    }
    public void setTecnica(String tecnica){
        this.tecnica = tecnica;
    }
    
    
}
