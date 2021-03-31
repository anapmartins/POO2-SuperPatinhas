package superPatinhas;
import java.math.BigDecimal;

public class AjudaFinanceira {
    private Integer Id = -1;
    private BigDecimal quantidade;

    public Integer getId() {return Id;}

    public void setId(Integer id) {this.Id = id;}

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public void AjudaFinanceira(BigDecimal quantidade) {

        this.quantidade = quantidade;
    }
}
