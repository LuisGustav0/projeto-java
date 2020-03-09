package com.unialfa.resources;

import com.unialfa.model.NotaFiscal;
import com.unialfa.service.NotaFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/nota-fiscal")
public class NotaFiscalResource {

    @Autowired
    private NotaFiscalService notaFiscalService;

    @GetMapping("/{id}")
    public ResponseEntity<NotaFiscal> findById(@PathVariable Long id) {
        Optional<NotaFiscal> optNotaFiscal = this.notaFiscalService.findById(id);

        return optNotaFiscal.map(ResponseEntity::ok)
                            .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<NotaFiscal> findAll() {
        return this.notaFiscalService.findAll();
    }

    @PostMapping
    public ResponseEntity<NotaFiscal> save(@RequestBody NotaFiscal notaFiscal) {
        NotaFiscal notaFiscalSalvo = this.notaFiscalService.save(notaFiscal);

        return ResponseEntity.status(HttpStatus.CREATED).body(notaFiscalSalvo);
    }

    @PutMapping("/{idCliente}/status/{status}")
    public NotaFiscal atualizarStatusParaPago(@PathVariable Long id,
                                              @RequestBody NotaFiscal notaFiscal) {
        return this.notaFiscalService.atualizar(id, notaFiscal);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        this.notaFiscalService.deleteById(id);
    }
}
