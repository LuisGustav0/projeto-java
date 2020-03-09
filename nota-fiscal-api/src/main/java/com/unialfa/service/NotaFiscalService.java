package com.unialfa.service;

import com.unialfa.model.NotaFiscal;
import com.unialfa.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaFiscalService {

    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    public Optional<NotaFiscal> findById(Long id) {
        return this.notaFiscalRepository.findById(id);
    }

    public List<NotaFiscal> findAll() {
        return this.notaFiscalRepository.findAll();
    }

    public NotaFiscal save(NotaFiscal notaFiscal) {
        return this.notaFiscalRepository.save(notaFiscal);
    }

    public void deleteById(Long id) {
        this.notaFiscalRepository.deleteById(id);
    }

    public NotaFiscal atualizar(Long id, NotaFiscal notaFiscal) {
        return this.notaFiscalRepository.findById(id)
                                        .map(notaFiscalMap -> {
                                            notaFiscalMap.setEmpresa(notaFiscal.getEmpresa());
                                            notaFiscalMap.setValorBruto(notaFiscal.getValorBruto());
                                            notaFiscalMap.setValorBruto(notaFiscal.getImposto());

                                            return this.notaFiscalRepository.save(notaFiscalMap);
                                        })
                                        .orElseGet(() -> {
                                            notaFiscal.setId(id);
                                            return this.notaFiscalRepository.save(notaFiscal);
                                        });
    }
}
