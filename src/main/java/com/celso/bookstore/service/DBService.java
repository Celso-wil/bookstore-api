package com.celso.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celso.bookstore.domain.Categoria;
import com.celso.bookstore.domain.Livro;
import com.celso.bookstore.repositories.CategoriaRepository;
import com.celso.bookstore.repositories.LivroRepository;
@Service
public class DBService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
public void InstaciaBD() {

	Categoria cat1 = new Categoria(null, "informatica", "livros de TI");
	Categoria cat2 = new Categoria(null, "terror", "livros de terror");
	Categoria cat3 = new Categoria(null, "fantasia", "livros fantasia");


	Livro l1 = new Livro(null, "clean code", "Robert Martin", "Loren ipsum", cat1);
	Livro l2 = new Livro(null, "morte subita", "cleiton ferreira", "e morreu", cat2);
	Livro l3 = new Livro(null, "magia para idiotas", "jose bezerra", "bola de fogo", cat3);
	Livro l4 = new Livro(null, "batatas e machados", "aristides padua", "machadada veloz", cat3);





	cat1.getLivros().addAll(Arrays.asList(l1));
	cat2.getLivros().addAll(Arrays.asList(l2));
	cat3.getLivros().addAll(Arrays.asList(l3,l4));
	
	
	

this.categoriaRepository.saveAll(Arrays.asList(cat1));
this.livroRepository.saveAll(Arrays.asList(l1));

	
	
	
	
	
}



}
