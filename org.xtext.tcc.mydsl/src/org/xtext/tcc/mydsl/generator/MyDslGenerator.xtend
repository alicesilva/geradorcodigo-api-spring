/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.tcc.mydsl.myDsl.Entidade
import org.eclipse.emf.common.util.EList
import org.xtext.tcc.mydsl.myDsl.Atributo

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {
		
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(e: resource.allContents.toIterable.filter(Entidade)){
			fsa.generateFile(e.nomeEntidade.nome.toFirstUpper.toString + ".java", e.compile)
		}
	}
	
	def compile(Entidade entidade)'''
		package «entidade.package.nome»;
		import javax.persistence.*;
		
		@Entity
		public class «entidade.nomeEntidade.nome.toFirstUpper» {
			
			«IF entidade.chavePrimaria.nome.equalsIgnoreCase("id")»
				@Id
				@GeneratedValue(strategy=GenerationType.IDENTITY)
				private Integer id;
			«ENDIF»
			
			«compileAtributos(entidade.chavePrimaria.nome, entidade.atributos)»
			«compileGetersSeters(entidade.atributos)»
			
		}
	'''
		
	def compileAtributos(String chaveParimaria, EList<Atributo> atributos)'''
		«FOR a: atributos»
			«IF a.nomeAtributo.nome.equals(chaveParimaria)»
				@Id
			«ENDIF»
			«IF !(a.associacao.associacao.equals("None-Associacao"))»
				«IF a.operacao.opCascada.equals("None-Operacao")»
					@«a.associacao.associacao»
				«ELSE»
				     @«a.associacao.associacao»(cascade = CascadeType.«a.operacao.opCascada»)
				«ENDIF»
			«ENDIF»
			«IF a.atributoTipo.tipoP !== null»
				private «a.atributoTipo.tipoP.toFirstUpper» «a.nomeAtributo.nome.toFirstLower»;
			«ELSE»
				private «a.atributoTipo.tipoE.toFirstUpper» «a.nomeAtributo.nome.toFirstLower»;
			«ENDIF»
			
		«ENDFOR»
	'''
	
	def compileGetersSeters(EList<Atributo> atributos) '''
		«FOR a: atributos»
			«IF a.atributoTipo.tipoP !== null»
				public «a.atributoTipo.tipoP» get«a.nomeAtributo.nome.toFirstUpper»(){
					return «a.nomeAtributo.nome»;
				}
				
				public void set«a.nomeAtributo.nome.toFirstUpper»(«a.atributoTipo.tipoP» «a.nomeAtributo.nome»){
					this.«a.nomeAtributo.nome» = «a.nomeAtributo.nome»;
				}
			«ELSE»
				public «a.atributoTipo.tipoE» get«a.nomeAtributo.nome.toFirstUpper»(){
					return «a.nomeAtributo.nome»;
				}
				
				public void set «a.nomeAtributo.nome.toFirstUpper»(«a.atributoTipo.tipoP» «a.nomeAtributo.nome»){
					this.«a.nomeAtributo.nome» = «a.nomeAtributo.nome»;
				}
			«ENDIF»
		«ENDFOR»
	'''
		
}
