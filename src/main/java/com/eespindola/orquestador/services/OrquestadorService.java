package com.eespindola.orquestador.services;

import com.eespindola.orquestador.exceptions.InvalidArgument;
import com.eespindola.orquestador.models.dto.Result;
import com.eespindola.orquestador.models.Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface OrquestadorService {

    @PostMapping
    Result<Usuario> GetAll(HttpSession session);

    @PostMapping("/{folioId}")
    Result<Usuario> GetByFolio(@PathVariable String folioId, HttpSession session);

    @PostMapping("/post")
    Result<Void> Post(@RequestBody Usuario usuario, HttpSession session) throws InvalidArgument;

    @PostMapping("/put")
    Result<Void> Put(@RequestBody Usuario usuario, HttpSession session) throws InvalidArgument;

    @PostMapping("/delete/{folioId}")
    Result<Void> Delete(@PathVariable String folioId, HttpSession session);
}
