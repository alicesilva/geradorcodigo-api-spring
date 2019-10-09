package org.xtext.tcc.mydsl.validation;

import org.xtext.tcc.mydsl.myDsl.Entidade;
import org.xtext.tcc.mydsl.myDsl.MyDslPackage;
import org.xtext.tcc.mydsl.myDsl.Entidades;

public class EntidadeValidator {

	public Exception verificaNomesEntidade(Entidades entidades) {
	  if(entidades.getEntidadeMais().size() > 0) {
		  for(Entidade entidade: entidades.getEntidadeMais()) {
			  if(entidades.getEntidade().getNomeEntidade().getNome().equals(entidade.getNomeEntidade().getNome())) {
				  return new Exception("Nome de entidade deve ser único.", MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
			  }
		  }
		  
		  
		  for(Entidade entidade: entidades.getEntidadeMais()) {
			  int count = 0;
			  for(Entidade entidadeI: entidades.getEntidadeMais()) {
				  if(entidade.getNomeEntidade().getNome().equals(entidadeI.getNomeEntidade().getNome())) {
					  count ++;
				  }
			  }
			  if(count > 1) {
				  return new Exception("Nome de entidade deve ser único.", MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
			  }
		  }
		  
		  return null;
	  }
	  
	  return null;
	}

/*	public Exception checkNomeEntidades(Api api) {
		for (Entidade entidade : api.getEntidades()) {
			int count = 0;
			for (Entidade entidadeI : api.getEntidades()) {
				if (entidadeI.getNomeEntidade().getNome().equals(entidade.getNomeEntidade().getNome())) {
					count++;
				}
			}

			if (count > 1) {
				return new Exception("Nome de entidade deve ser único.", MyDslPackage.Literals.API__ENTIDADES);
			}
		}
		return null;
	}

	public Exception checkTipoAtributo(Api api) {
		EList<Entidade> entidades = api.getEntidades();
		for (Entidade entidade : entidades) {
			EList<Atributo> atributos = entidade.getAtributos();
			for (Atributo atributo : atributos) {
				if (atributo.getAtributoTipo().getTipoObjeto() != null) {
					if (!verificaNomeAtributoEmEntidades(entidades, atributo.getAtributoTipo().getTipoObjeto())) {
						return new Exception(
								"Tipo do atributo dever ser algum tipo primitivo ou do tipo de alguma entidade definida anteriormente",
								MyDslPackage.Literals.API__ENTIDADES);
					}
				}
			}
		}
		return null;
	}

	private boolean verificaNomeAtributoEmEntidades(EList<Entidade> entidades, String tipoE) {
		for (Entidade entidade : entidades) {
			if (entidade.getNomeEntidade().getNome().equals(tipoE)) {
				return true;
			}
		}
		return false;
	}
	
	/*public Exception checkChavePrimaria(Api api) {
	for (Entidade e : api.getEntidades()) {
		String chavePrimaria = e.getChavePrimaria().getNome();
		if(!chavePrimaria.equalsIgnoreCase("id")) {
			EList<Atributo> atributos = e.getAtributos();
			int cont = 0;
			for (Atributo atributo : atributos) {
				if (atributo.getNomeAtributo().getNome().equalsIgnoreCase(chavePrimaria)) {
					cont++;
				}
			}
			if(cont == 0) {
				return new Exception("Chave Primraia deve ser ID ou algum atributo definido anteriormente.",
						MyDslPackage.Literals.API__ENTIDADES);
			}
		}
	}
	return null;
}*/
}
