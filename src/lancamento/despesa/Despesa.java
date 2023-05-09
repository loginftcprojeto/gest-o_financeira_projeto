package lancamento.despesa;

import java.math.BigDecimal;
import java.time.LocalDate;

import categoriaFinanceira.CategoriaFinanceira;
import lancamento.Lancamento;
import user.User;

public class Despesa extends Lancamento {
	
	public Despesa(int id, BigDecimal valor, LocalDate data, CategoriaFinanceira categoria_id, User usuario_id) {
		super(id, valor, data, categoria_id, usuario_id);
	}
	

}
