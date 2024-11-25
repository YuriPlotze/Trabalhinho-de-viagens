package com.yuriviagens.api_agencia_viagem.controller;

import com.yuriviagens.api_agencia_viagem.model.Destino;
import com.yuriviagens.api_agencia_viagem.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinos")
public class DestinoController {
    @Autowired
    private DestinoService destinoService;

    @PostMapping
    public ResponseEntity<Destino> cadastrarDestino(@RequestBody Destino destino) {
        return ResponseEntity.ok(destinoService.cadastrarDestino(destino));
    }

    @GetMapping
    public ResponseEntity<List<Destino>> listarDestinos() {
        return ResponseEntity.ok(destinoService.listarDestinos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Destino> buscarDestino(@PathVariable Long id) {
        Destino destino = destinoService.buscarDestino(id);
        return destino != null ? ResponseEntity.ok(destino) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirDestino(@PathVariable Long id) {
        destinoService.excluirDestino(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Destino>> pesquisarDestinos(@RequestParam String termo) {
        List<Destino> resultado = destinoService.pesquisarDestinos(termo);
        return ResponseEntity.ok(resultado);
    }

    @PostMapping("/{id}/reservar")
    public ResponseEntity<String> reservarPacote(@PathVariable Long id) {
        Destino destino = destinoService.buscarDestino(id);
        if (destino != null) {
            return ResponseEntity.ok("Reserva realizada com sucesso para o destino: " + destino.getNome());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Destino não encontrado.");
        }
    }

}
