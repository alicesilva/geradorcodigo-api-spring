/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.tcc.mydsl.myDsl.Api
import org.xtext.tcc.mydsl.myDsl.Entidade
import org.xtext.tcc.mydsl.myDsl.Atributo
import org.xtext.tcc.mydsl.myDsl.Entidades
import org.xtext.tcc.mydsl.myDsl.MyDslPackage
import org.xtext.tcc.mydsl.myDsl.Atributos
import java.util.ArrayList
import java.util.List
import java.util.Arrays

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {

	EntidadeValidator entidadeValidator = new EntidadeValidator();

//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Check
	def validaNomes(Api api) {
		api.nomeApi.nome = api.nomeApi.nome.substring(1, api.nomeApi.nome.length - 1);
		validaEntidade(api.entidades.entidade);
		for (e : api.entidades.entidadeMais) {
			if (e !== null) {
				validaEntidade(e);
			}
		}
	}

	def validaEntidade(Entidade entidade) {
		entidade.nomeEntidade.nome = entidade.nomeEntidade.nome.substring(1, entidade.nomeEntidade.nome.length - 1);
		entidade.package.nome = entidade.package.nome.substring(1, entidade.package.nome.length - 1);

		validaAtributo(entidade.atributos.atributo);
		for (atributo : entidade.atributos.atributoMais) {
			if (atributo !== null) {
				validaAtributo(atributo)
			}
		}
	}

	def validaAtributo(Atributo atributo) {
		atributo.nomeAtributo.nome = atributo.nomeAtributo.nome.substring(1, atributo.nomeAtributo.nome.length - 1);

		if (atributo.atributoTipo.tipoPrimitivo !== null) {
			atributo.atributoTipo.tipoPrimitivo = atributo.atributoTipo.tipoPrimitivo.substring(1,
				atributo.atributoTipo.tipoPrimitivo.length - 1);
		} else if (atributo.atributoTipo.tipoColecao !== null) {
			atributo.atributoTipo.tipoColecao = atributo.atributoTipo.tipoColecao.substring(1,
				atributo.atributoTipo.tipoColecao.length - 1);
		} else {
			atributo.atributoTipo.tipoObjeto = atributo.atributoTipo.tipoObjeto.substring(1,
				atributo.atributoTipo.tipoObjeto.length - 1);
		}

		if (!atributo.associacao.associacao.equals("")) {
			atributo.associacao.associacao = atributo.associacao.associacao.substring(1,
				atributo.associacao.associacao.length - 1)
		}

		if (atributo.operacao !== null) {
			atributo.operacao.opCascada.operacao = atributo.operacao.opCascada.operacao.substring(1,
				atributo.operacao.opCascada.operacao.length - 1);
			if (atributo.operacao.opCascadaMais.size() > 0) {
				for (operacao : atributo.operacao.opCascadaMais) {
					operacao.operacao = operacao.operacao.substring(1, operacao.operacao.length - 1);
				}
			}
		}
	}

	@Check
	def validaNomeEntidade(Entidades entidades) {
		for (entidade : entidades.entidadeMais) {
			if (entidade !== null) {
				if (entidades.entidade.nomeEntidade.nome == entidade.nomeEntidade.nome) {
					error('Nome de entidade deve ser único.', MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS)
				}
			}
		}

		for (entidade : entidades.entidadeMais) {
			var int count = 0;
			for (entidadeI : entidades.entidadeMais) {
				if (entidade.nomeEntidade.nome == entidadeI.nomeEntidade.nome) {
					count++;
				}
			}
			if (count > 1) {
				error("Nome de entidade deve ser único.", MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
			}
		}
	}

	@Check
	def validaTipoAtributo(Entidades entidades) {
		var List<String> nomesEntidades = new ArrayList();
		nomesEntidades.add(entidades.entidade.nomeEntidade.nome)

		for (e : entidades.entidadeMais) {
			if (e !== null) {
				nomesEntidades.add(e.nomeEntidade.nome)
			}
		}

		validaTipoAtributo(entidades.entidade.atributos, nomesEntidades)
		
		for (e : entidades.entidadeMais) {
			if (e !== null) {
				validaTipoAtributo(e.atributos, nomesEntidades)
			}
		}
		
	}
	
	
	def validaTipoAtributo(Atributos atributos, List<String> nomesEntidades) {
		var List<String> tiposPrimitivos = new ArrayList(
			Arrays.asList("Boolean", "Integer", "Long", "String", "Float", "Double", "Time", "Timestamp", "Date",
				"ENUM"));
		if (atributos.atributo.atributoTipo.tipoColecao !== null) {
			var tipo = getNomeTipoColecao(atributos.atributo.atributoTipo.tipoColecao)
			if (!nomesEntidades.contains(tipo) && !tiposPrimitivos.contains(tipo)) {
				error(
					"Tipo dos objetos da coleção devem ser algum tipo primitivo ou do tipo de alguma entidade já definida",
					MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
			}
		}else if(atributos.atributo.atributoTipo.tipoObjeto !== null){
			if(!nomesEntidades.contains(atributos.atributo.atributoTipo.tipoObjeto)){
				error(
					"Tipo do atributos dever ser algum tipo primitivo ou de alguma entidade definida anteriormente",
					MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
			}
			
		}

		for (a : atributos.atributoMais) {
			if (a !== null) {
				if (a.atributoTipo.tipoColecao !== null) {
					var tipo = getNomeTipoColecao(a.atributoTipo.tipoColecao)
					if (!nomesEntidades.contains(tipo) && !tiposPrimitivos.contains(tipo)) {
						error(
							"Tipos dos objetos da coleção devem ser algum tipo primitivo ou do tipo de alguma entidade já definida",
							MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
					}
				} else if (a.atributoTipo.tipoObjeto !== null) {
					if (!nomesEntidades.contains(a.atributoTipo.tipoObjeto)) {
						error(
							"Tipo do atributos dever ser algum tipo primitivo ou de alguma entidade definida anteriormente",
							MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
					}

				}
			}
		}

	}

	def getNomeTipoColecao(String nomeTipo) {
		var int inicio = 0;
		var int fim = 0;
		for (var int i = 0; i < nomeTipo.length; i++) {
			var c = nomeTipo.charAt(i).toString;
			if (c == '<') {
				inicio = i
			}
			if (c.equals(">")) {
				fim = i
			}
		}
		var nome = nomeTipo.substring(inicio + 1, fim);
		return nome;
	}
}
