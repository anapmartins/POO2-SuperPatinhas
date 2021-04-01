package superPatinhas;
import superPatinhas.DAOs.Entity;

import java.math.BigDecimal;

public class AjudaFinanceira extends Entity {

    private Integer Id = -1;
    private BigDecimal quantidade;

    public BigDecimal getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
    public AjudaFinanceira(BigDecimal quantidade) {

        this.quantidade = quantidade;
    }

}
