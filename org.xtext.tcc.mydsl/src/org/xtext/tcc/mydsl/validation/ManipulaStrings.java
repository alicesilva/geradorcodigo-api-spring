package org.xtext.tcc.mydsl.validation;

import org.xtext.tcc.mydsl.myDsl.Api;
import org.xtext.tcc.mydsl.myDsl.Atributo;
import org.xtext.tcc.mydsl.myDsl.Entidade;
import org.xtext.tcc.mydsl.myDsl.OperacaoCascada;

public class ManipulaStrings {
	
	
	public void manipulaString(Api api) {
		api.getNomeApi().setNome(api.getNomeApi().getNome().substring(1, api.getNomeApi().getNome().length() - 1));
		validaEntidade(api.getEntidades().getEntidade());
		if(api.getEntidades().getEntidadeMais().size() > 0){
			for(Entidade entidade: api.getEntidades().getEntidadeMais()){
				validaEntidade(entidade);
				System.out.println(entidade.getNomeEntidade().getNome());
			}
		}
	}

	private void validaEntidade(Entidade entidade) {
		entidade.getNomeEntidade().setNome(entidade.getNomeEntidade().getNome().substring(1, entidade.getNomeEntidade().getNome().length() - 1));
		
		validaAtributo(entidade.getAtributos().getAtributo());
		if(entidade.getAtributos().getAtributoMais().size() > 0){
			for(Atributo atributo: entidade.getAtributos().getAtributoMais()){
				validaAtributo(atributo);
			}
		}
		
		
	}

	private void validaAtributo(Atributo atributo) {
		atributo.getNomeAtributo().setNome(atributo.getNomeAtributo().getNome().substring(1, atributo.getNomeAtributo().getNome().length() - 1));
		if(atributo.getAtributoTipo().getTipoPrimitivo() != null){
			atributo.getAtributoTipo().setTipoPrimitivo(atributo.getAtributoTipo().getTipoPrimitivo().substring(1, atributo.getAtributoTipo().getTipoPrimitivo().length()-1));
		}else if(atributo.getAtributoTipo().getTipoColecao() != null){
			atributo.getAtributoTipo().setTipoColecao(atributo.getAtributoTipo().getTipoColecao().substring(1, atributo.getAtributoTipo().getTipoColecao().length()-1));
		}else{
			atributo.getAtributoTipo().setTipoObjeto(atributo.getAtributoTipo().getTipoObjeto().substring(1, atributo.getAtributoTipo().getTipoObjeto().length()-1));
		}
		
		if(!atributo.getAssociacao().getAssociacao().equals("")){
			atributo.getAssociacao().setAssociacao(atributo.getAssociacao().getAssociacao().substring(1, atributo.getAssociacao().getAssociacao().length()-1));
		}
		
		if(atributo.getOperacao() != null){
			atributo.getOperacao().getOpCascada().setOperacao(atributo.getOperacao().getOpCascada().getOperacao().substring(1, atributo.getOperacao().getOpCascada().getOperacao().length() - 1));		
			if(atributo.getOperacao().getOpCascadaMais().size() > 0){
				for(OperacaoCascada operacao: atributo.getOperacao().getOpCascadaMais()){
					operacao.setOperacao(operacao.getOperacao().substring(1, operacao.getOperacao().length() - 1));
				}
			}
		}
		
	}

}
