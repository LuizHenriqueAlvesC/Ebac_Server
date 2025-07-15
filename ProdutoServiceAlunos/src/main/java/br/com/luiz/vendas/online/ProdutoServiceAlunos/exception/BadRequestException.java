package br.com.luiz.vendas.online.ProdutoServiceAlunos.exception;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = -7339546357706827674L;

	public BadRequestException(String message) {
        super(message);
    }

}