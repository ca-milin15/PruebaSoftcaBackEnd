package com.api.arbolb.apirestarbolb.usuario;

import org.springframework.stereotype.Service;

import com.api.arbolb.apirestarbolb.usuario.bean.Usuario;
import com.api.arbolb.apirestarbolb.usuario.bean.UsuarioRequest;
import com.api.arbolb.apirestarbolb.usuario.bean.UsuarioResponse;
import com.api.arbolb.apirestarbolb.usuario.repository.UsuarioRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

	UsuarioRepository usuarioRepository;
	
	@Override
	public UsuarioResponse buscarUsuarioPorId(Integer idUsuario) {
		return new UsuarioResponse(usuarioRepository.buscarUsuarioPorId(idUsuario));
	}

	@Override
	public UsuarioResponse crearUsuario(UsuarioRequest usuarioRequest) {
		var usuario = usuarioRepository.crearUsuario(new Usuario(usuarioRequest));
		return new UsuarioResponse(usuario);
	}

	@Override
	public UsuarioResponse actualizarUsuario(Integer idUsuario, UsuarioRequest usuarioRequest) {
		var usuario = usuarioRepository.actualizarUsuario(idUsuario, new Usuario(usuarioRequest));
		return new UsuarioResponse(usuario);
	}

}
