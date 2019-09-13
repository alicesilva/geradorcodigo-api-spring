package org.xtext.tcc.mydsl.validation;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.tcc.mydsl.myDsl.Api;
import org.xtext.tcc.mydsl.myDsl.Atributo;
import org.xtext.tcc.mydsl.myDsl.Entidade;
import org.xtext.tcc.mydsl.myDsl.MyDslPackage;

public class EntidadeValidator {

	public Exception checkNomeEntidades(Api api) {
		for (Entidade entidade : api.getEntidades()) {
			String nome = entidade.getNomeEntidades().getId();
			System.out.println(nome);
			System.out.println(Collections.frequency(api.getEntidades(), nome));
			if(Collections.frequency(api.getEntidades(), nome) > 1) {
				System.out.println(Collections.frequency(api.getEntidades(), nome));
				return new Exception("Mais de uma entidade com o mesmo nome", MyDslPackage.Literals.API__ENTIDADES);
			}
		}
		return null;
	}
	
	public Exception checkChavePrimaria(Entidade e) {
		String chavePrimaria = e.getChavePrimaria().getId();
		if(!chavePrimaria.equalsIgnoreCase("id")) {
			EList<Atributo> atributos = e.getAtributos();
			for (Atributo atributo : atributos) {
				if(atributo.getAtributoNome().getId().equalsIgnoreCase(chavePrimaria)) {
					return null;
				}
			}
			return new Exception("Chave Primraia deve ser ID ou algum atributo definido anteriormente.", MyDslPackage.Literals.ENTIDADE__CHAVE_PRIMARIA);
		}else{
			return null;
		}
	}
}
