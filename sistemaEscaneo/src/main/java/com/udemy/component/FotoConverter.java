package com.udemy.component;

import org.springframework.stereotype.Component;

import com.udemy.entity.Foto;
import com.udemy.model.FotoModel;

@Component("fotoConverter")
public class FotoConverter {
	
	public Foto convertFotoModel2Foto(FotoModel fotoModel) {
		Foto foto = new Foto();
		foto.setId(fotoModel.getId());
		foto.setNombre(fotoModel.getNombre());
		foto.setFile(fotoModel.getFile());
		foto.setCodigoDoc(fotoModel.getCodigoDoc());
		return foto;
	}
	
	public FotoModel convertFoto2FotoModel(Foto foto) {
		FotoModel fotoModel = new FotoModel();
		fotoModel.setId(foto.getId());
		fotoModel.setNombre(foto.getNombre());
		fotoModel.setFile(foto.getFile());
		fotoModel.setCodigoDoc(foto.getCodigoDoc());
		return fotoModel;
	}

}
