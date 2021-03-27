package superPatinhas;
import java.math.BigDecimal;

public class AjudaFinanceira {
    private BigDecimal quantidade;

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
