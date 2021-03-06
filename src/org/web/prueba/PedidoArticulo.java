package org.web.prueba;

// Generated 05/09/2014 17:49:27 by Hibernate Tools 4.0.0

/**
 * PedidoArticulo generated by hbm2java
 */
public class PedidoArticulo implements java.io.Serializable {

	private PedidoArticuloId id;
	private Articulo articulo;
	private Pedido pedido;

	public PedidoArticulo() {
	}

	public PedidoArticulo(PedidoArticuloId id, Articulo articulo, Pedido pedido) {
		this.id = id;
		this.articulo = articulo;
		this.pedido = pedido;
	}

	public PedidoArticuloId getId() {
		return this.id;
	}

	public void setId(PedidoArticuloId id) {
		this.id = id;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
