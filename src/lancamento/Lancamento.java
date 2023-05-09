package lancamento;

import java.math.BigDecimal;
import java.time.LocalDate;

import categoriaFinanceira.CategoriaFinanceira;
import user.User;

public class Lancamento {
	private int id;
	private BigDecimal valor;
	private LocalDate data;
	private CategoriaFinanceira categoria_id;
	private User usuario_id;
	
	public Lancamento(int id, BigDecimal valor, LocalDate data, CategoriaFinanceira categoria_id, User usuario_id) {
		super();
		this.id = id;
		this.valor = valor;
		this.data = data;
		this.categoria_id = categoria_id;
		this.usuario_id = usuario_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public CategoriaFinanceira getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(CategoriaFinanceira categoria_id) {
		this.categoria_id = categoria_id;
	}

	public User getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(User usuario_id) {
		this.usuario_id = usuario_id;
	}
	
}
