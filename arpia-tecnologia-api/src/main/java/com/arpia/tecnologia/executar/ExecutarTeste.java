package com.arpia.tecnologia.executar;

import com.arpia.tecnologia.model.Cliente;
import com.arpia.tecnologia.model.Fornecedor;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class ExecutarTeste {

  public static void main(String[] args) {
    Cliente cliente = new Cliente("1", "Luis");

    ModelMapper modelMapper = new ModelMapper();
    Fornecedor fornecedor = modelMapper.map(cliente, Fornecedor.class);
    modelMapper.addMappings(new PropertyMap<Fornecedor, Cliente>() {

      @Override
      protected void configure() {
        map().setCodigo(source.getId());
        map().setNome(source.getDescricao());
      }
    });

    System.out.println(fornecedor);
  }
}
