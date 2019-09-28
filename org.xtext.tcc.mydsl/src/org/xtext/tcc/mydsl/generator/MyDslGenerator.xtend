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
import org.xtext.tcc.mydsl.myDsl.Api

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// for(e: resource.allContents.toIterable.filter(Entidade)){
		// fsa.generateFile(e.nomeEntidade.nome.toFirstUpper.toString + ".java", e.compile);
		// fsa.generateFile(e.nomeEntidade.nome.toFirstUpper.toString + "Controller.java", e.compileController);
		// }
		for (a : resource.allContents.toIterable.filter(Api)) {
			for (e : resource.allContents.toIterable.filter(Entidade)) {
				fsa.generateFile(e.nomeEntidade.nome.toFirstUpper.toString + ".java", e.compile);
				fsa.generateFile(e.nomeEntidade.nome.toFirstUpper.toString + "Repository.java", compileRepository(e));
				fsa.generateFile(e.nomeEntidade.nome.toFirstUpper.toString + "Service.java", compileService(e));
				fsa.generateFile(e.nomeEntidade.nome.toFirstUpper.toString + "Controller.java", compileController(a, e));

			}

		}

	}

	def compile(Entidade entidade) '''
		package «entidade.package.nome»;
		import javax.persistence.*;
		
		@Entity
		public class «entidade.nomeEntidade.nome.toFirstUpper» {
			
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private Long id;
			
			«compileAtributos(entidade.atributos)»
			«compileGetersSeters(entidade.atributos)»
			
		}
	'''

	def compileAtributos(EList<Atributo> atributos) '''
		«FOR a : atributos»
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
		«FOR a : atributos»
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

	def compileRepository(Entidade entidade) '''
		package «entidade.package.nome»;
		import org.springframework.data.jpa.repository.JpaRepository;
		import org.springframework.stereotype.Repository;
		
		@Repository
		public interface «entidade.nomeEntidade.nome.toFirstUpper»Repository extends JpaRepository<«entidade.nomeEntidade.nome.toFirstUpper», Long>{
		
		}
		
	'''

	def compileService(Entidade entidade) '''
		package «entidade.package.nome»;
		
		import java.util.List;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.stereotype.Service;
		
		@Service
		public class «entidade.nomeEntidade.nome.toFirstUpper»Service {
			
			@Autowired
			«entidade.nomeEntidade.nome.toFirstUpper»Repository «entidade.nomeEntidade.nome»Repository;
			
			public void save(«entidade.nomeEntidade.nome.toFirstUpper» «entidade.nomeEntidade.nome») {
				«entidade.nomeEntidade.nome»Repository.save(«entidade.nomeEntidade.nome»);
			}
			
			public List<«entidade.nomeEntidade.nome.toFirstUpper»> get«entidade.nomeEntidade.nome.toFirstUpper»s(){
				return «entidade.nomeEntidade.nome»Repository.findAll();
			}
			
			public «entidade.nomeEntidade.nome.toFirstUpper» get«entidade.nomeEntidade.nome.toFirstUpper»ById(Long id) {
				if(exists«entidade.nomeEntidade.nome.toFirstUpper»ById(id)) {
					return «entidade.nomeEntidade.nome»Repository.getOne(id);
				}else {
					return null;
				}
			}
			
			public void deleteAll«entidade.nomeEntidade.nome.toFirstUpper»() {
				«entidade.nomeEntidade.nome»Repository.deleteAll();
			}
			
			public Boolean delete«entidade.nomeEntidade.nome.toFirstUpper»(Long id) {
				if(exists«entidade.nomeEntidade.nome.toFirstUpper»ById(id)) {
					«entidade.nomeEntidade.nome»Repository.deleteById(id);
					return true;
				}
				return false;
			}
				
			private boolean exists«entidade.nomeEntidade.nome.toFirstUpper»ById(Long id) {
				return «entidade.nomeEntidade.nome»Repository.existsById(id);
			}
			
			public Boolean update«entidade.nomeEntidade.nome.toFirstUpper»(Long id, «entidade.nomeEntidade.nome.toFirstUpper» «entidade.nomeEntidade.nome»Update) {
				if(exists«entidade.nomeEntidade.nome.toFirstUpper»ById(id)) {
					«entidade.nomeEntidade.nome.toFirstUpper» «entidade.nomeEntidade.nome» = get«entidade.nomeEntidade.nome.toFirstUpper»ById(id);
					«FOR a : entidade.atributos»
					«entidade.nomeEntidade.nome».set«a.nomeAtributo.nome.toFirstUpper»(«entidade.nomeEntidade.nome»Update.get«a.nomeAtributo.nome.toFirstUpper»());
					«ENDFOR»
					«entidade.nomeEntidade.nome»Repository.save(«entidade.nomeEntidade.nome»);
					return true;
				}
				return false;
			}
		}
	'''

	def compileController(Api api, Entidade entidade) '''
		package «entidade.package.nome»;
		
		import java.util.List;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.http.*;
		import org.springframework.web.bind.annotation.*;
		
		@RestController
		@RequestMapping("/«api.nomeApi.nome»-api")
		public class «entidade.nomeEntidade.nome.toFirstUpper»Controller {
			
			@Autowired
			«entidade.nomeEntidade.nome.toFirstUpper»Service «entidade.nomeEntidade.nome»Service;
			
			@PostMapping(value = "/«entidade.nomeEntidade.nome»s", consumes = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<«entidade.nomeEntidade.nome.toFirstUpper»> save(@RequestBody «entidade.nomeEntidade.nome.toFirstUpper» «entidade.nomeEntidade.nome») {
				if(«entidade.nomeEntidade.nome» == null) {
					return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
				}
				
				this.«entidade.nomeEntidade.nome»Service.save(«entidade.nomeEntidade.nome»);
				
				return new ResponseEntity<«entidade.nomeEntidade.nome.toFirstUpper»>(«entidade.nomeEntidade.nome», HttpStatus.CREATED);
			}
			
			@GetMapping(value = "«entidade.nomeEntidade.nome»s", produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<List<«entidade.nomeEntidade.nome.toFirstUpper»>> get«entidade.nomeEntidade.nome.toFirstUpper»s(){
				List<«entidade.nomeEntidade.nome.toFirstUpper»> «entidade.nomeEntidade.nome»s = this.«entidade.nomeEntidade.nome»Service.get«entidade.nomeEntidade.nome.toFirstUpper»s();
				
				return new ResponseEntity<List<«entidade.nomeEntidade.nome.toFirstUpper»>>(«entidade.nomeEntidade.nome»s, HttpStatus.OK);
			}
			
			@GetMapping(value = "«entidade.nomeEntidade.nome»s/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<«entidade.nomeEntidade.nome.toFirstUpper»> get«entidade.nomeEntidade.nome.toFirstUpper»(@PathVariable("id") Long id){
				if(id == null) {
					return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
				}
				«entidade.nomeEntidade.nome.toFirstUpper» «entidade.nomeEntidade.nome» = «entidade.nomeEntidade.nome»Service.get«entidade.nomeEntidade.nome.toFirstUpper»ById(id);
				
				if(«entidade.nomeEntidade.nome» == null) {
					return new ResponseEntity<«entidade.nomeEntidade.nome.toFirstUpper»>(«entidade.nomeEntidade.nome», HttpStatus.NOT_FOUND);
				}
				
				return new ResponseEntity<«entidade.nomeEntidade.nome.toFirstUpper»>(«entidade.nomeEntidade.nome», HttpStatus.OK);
			}
			
			@DeleteMapping(value = "«entidade.nomeEntidade.nome»")
			public ResponseEntity<String> deleteAll«entidade.nomeEntidade.nome.toFirstUpper»(){
				«entidade.nomeEntidade.nome»Service.deleteAll«entidade.nomeEntidade.nome.toFirstUpper»();
				return new ResponseEntity<String>("«entidade.nomeEntidade.nome.toFirstUpper»s removidos com sucesso.", HttpStatus.OK);
			}
			
			@DeleteMapping(value = "«entidade.nomeEntidade.nome»s/{id}")
			public ResponseEntity<String> delete«entidade.nomeEntidade.nome.toFirstUpper»(@PathVariable("id") Long id){
				if(id == null) {
					return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
				}
				Boolean delete = «entidade.nomeEntidade.nome»Service.delete«entidade.nomeEntidade.nome.toFirstUpper»(id);
				
				if(!delete) {
					return new ResponseEntity<String>("«entidade.nomeEntidade.nome.toFirstUpper» nao esta cadastrado", HttpStatus.NOT_FOUND);
				}
				
				return new ResponseEntity<String>("«entidade.nomeEntidade.nome.toFirstUpper» removido com sucesso.", HttpStatus.OK);
			}
			
			@PutMapping(value = "«entidade.nomeEntidade.nome»s/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<String> update«entidade.nomeEntidade.nome.toFirstUpper»(@PathVariable("id") Long id, @RequestBody «entidade.nomeEntidade.nome.toFirstUpper» «entidade.nomeEntidade.nome»){
				if(id == null || «entidade.nomeEntidade.nome» == null) {
					return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
				}
				Boolean update = «entidade.nomeEntidade.nome»Service.update«entidade.nomeEntidade.nome.toFirstUpper»(id, «entidade.nomeEntidade.nome»);
				
				if(!update) {
					return new ResponseEntity<String>("«entidade.nomeEntidade.nome.toFirstUpper»nao esta cadastrado", HttpStatus.NOT_FOUND);
				}
				
				return new ResponseEntity<String>("«entidade.nomeEntidade.nome.toFirstUpper» atualizado com sucesso.", HttpStatus.OK);
			}
		}
	'''

}
