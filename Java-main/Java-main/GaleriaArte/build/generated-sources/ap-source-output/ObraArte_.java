import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ObraArte.class)
public abstract class ObraArte_ {

	public static volatile SingularAttribute<ObraArte, String> titulo;
	public static volatile SingularAttribute<ObraArte, String> tecnica;
	public static volatile SingularAttribute<ObraArte, Integer> id;
	public static volatile SingularAttribute<ObraArte, Calendar> dataObra;
	public static volatile SingularAttribute<ObraArte, String> autor;

	public static final String TITULO = "titulo";
	public static final String TECNICA = "tecnica";
	public static final String ID = "id";
	public static final String DATA_OBRA = "dataObra";
	public static final String AUTOR = "autor";

}

