package superPatinhas;
import java.math.BigDecimal;

/**
 *
 * @author carol
 */
public class AjudaFinanceira {
    private Integer Id = -1;
    private BigDecimal quantidade;


    public Integer getId() {return Id;}

    public void setId(Integer id) {this.Id = id;}

    public AjudaFinanceira(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
}
