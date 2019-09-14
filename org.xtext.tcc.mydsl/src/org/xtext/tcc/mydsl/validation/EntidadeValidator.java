package org.xtext.tcc.mydsl.validation;

import org.eclipse.emf.common.util.EList;
import org.xtext.tcc.mydsl.myDsl.Api;
import org.xtext.tcc.mydsl.myDsl.Atributo;
import org.xtext.tcc.mydsl.myDsl.Entidade;
import org.xtext.tcc.mydsl.myDsl.MyDslPackage;

public class EntidadeValidator {

	public Exception checkNomeEntidades(Api api) {
		for (Entidade entidade : api.getEntidades()) {
			int count = 0;
			for(Entidade entidadeI: api.getEntidades()) {
				if(entidadeI.getNomeEntidades().getId().equals(entidade.getNomeEntidades().getId())) {
					count++;
				}
			}

			if(count > 1) {
				return new Exception("Nome de entidade deve ser único.",
						MyDslPackage.Literals.API__ENTIDADES); 
			}
		}
		return null;
	}

	public Exception checkChavePrimaria(Entidade e) {
		String chavePrimaria = e.getChavePrimaria().getId();
		if (!chavePrimaria.equalsIgnoreCase("id")) {
			EList<Atributo> atributos = e.getAtributos();
			for (Atributo atributo : atributos) {
				if (atributo.getAtributoNome().getId().equalsIgnoreCase(chavePrimaria)) {
					return null;
				}
			}
			return new Exception("Chave Primraia deve ser ID ou algum atributo definido anteriormente.",
					MyDslPackage.Literals.ENTIDADE__CHAVE_PRIMARIA);
		} else {
			return null;
		}
	}

	public Exception checkTipoAtributo(Api api) {
		EList<Entidade> entidades = api.getEntidades();
		for (Entidade entidade : entidades) {
			EList<Atributo> atributos = entidade.getAtributos();
			for (Atributo atributo : atributos) {
				if (atributo.getAtributoTipo().getTipoE() != null) {
					if (!auxiliar(entidades, atributo.getAtributoTipo().getTipoE())) {
						return new Exception(
								"Tipo do atributo dever ser algum tipo primitivo ou do tipo de alguma entidade definida anteriormente",
								MyDslPackage.Literals.API__ENTIDADES);
					}
				}
			}
		}
		return null;
	}

	private boolean auxiliar(EList<Entidade> entidades, String tipoE) {
		for (Entidade entidade: entidades) {
			if (entidade.getNomeEntidades().getId().equals(tipoE)) {
				return true;
			}
		}
		return false;
	}
}
