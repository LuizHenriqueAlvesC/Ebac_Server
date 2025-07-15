/**
 * 
 */
package br.com.luiz.vendas.online.ProdutoServiceAlunos.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.luiz.vendas.online.ProdutoServiceAlunos.domain.Produto;
import br.com.luiz.vendas.online.ProdutoServiceAlunos.domain.Produto.Status;
import br.com.luiz.vendas.online.ProdutoServiceAlunos.exception.EntityNotFoundException;
import br.com.luiz.vendas.online.ProdutoServiceAlunos.repository.IProdutoRepository;

/**
 * @author rodrigo.pires
 *
 */
@Service
public class BuscaProduto {

	private IProdutoRepository produtoRepository;
	
	@Autowired
	public BuscaProduto(IProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Page<Produto> buscar(Pageable pageable) {
		return produtoRepository.findAll(pageable);
	}
	
	public Page<Produto> buscar(Pageable pageable, Status status) {
		return produtoRepository.findAllByStatus(pageable, status);
	}

	public Produto buscarPorCodigo(String codigo) {
		return produtoRepository.findByCodigo(codigo)
				.orElseThrow(() -> new EntityNotFoundException(Produto.class, "codigo", codigo));
	}

	
}
