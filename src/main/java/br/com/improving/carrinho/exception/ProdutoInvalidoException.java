package br.com.improving.carrinho.exception;

public class ProdutoInvalidoException extends RuntimeException {

	public ProdutoInvalidoException(String message) {
		super(message);
	}
}