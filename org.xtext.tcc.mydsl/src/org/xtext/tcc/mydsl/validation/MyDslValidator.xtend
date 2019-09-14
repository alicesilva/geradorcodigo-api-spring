/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.tcc.mydsl.myDsl.EntidadeNome
import org.xtext.tcc.mydsl.myDsl.Api
import org.xtext.tcc.mydsl.myDsl.Entidade

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
	def checkEntidadesIguais(Api api){
		if(entidadeValidator.checkNomeEntidades(api) !== null){
			var Exception erro = entidadeValidator.checkNomeEntidades(api);
			error(erro.erro, erro.feature)
		}
	}

	@Check
	def checkChavePrimaria(Entidade e){
		if(entidadeValidator.checkChavePrimaria(e) !== null){
			var Exception erro = entidadeValidator.checkChavePrimaria(e);
			error(erro.erro, erro.feature)
		}
	}
	
	@Check
	def checkTipoAtributos(Api api){
		if(entidadeValidator.checkTipoAtributo(api) !== null){
			var Exception erro = entidadeValidator.checkTipoAtributo(api);
			error(erro.erro, erro.feature)
		}
	}
	
}
