import { Component, OnInit, Output } from '@angular/core';
import { EventEmitter } from 'protractor';
import { VendaService } from './../venda.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-venda-cadastro',
  templateUrl: './venda-cadastro.component.html',
  styleUrls: ['./venda-cadastro.component.css']
})
export class VendaCadastroComponent implements OnInit {

  venda: any;
  item: any;
  listaCliente: Array<any>;
  listaProduto: Array<any>;
  @Output() vendaSalva = new EventEmitter();

  constructor(
    private vendaService: VendaService,
    private messageService: MessageService) { }

  ngOnInit() {
    this.vendaService.listarClientes()
      .subscribe(response => 
        this.listaCliente = response
      );

    this.vendaService.listarProdutos()
      .subscribe(response => 
        this.listaProduto = response
      );

    this.novaVenda();
  }

  novaVenda() {
    this.venda = { itens: [], frete: 0.0, total: 0.0 };
    this.item = {};
  }

  incluirItem() {
    this.item.total = (this.item.produto.valor * this.item.quantidade);

    this.venda.itens.push(this.item);

    this.item = {};

    this.calcularTotal();
  }

  calcularTotal() {
    const totalItens = this.venda.itens
      .map(i => (i.produto.valor * i.quantidade))
      .reduce((total, v) => total + v, 0);

    this.venda.total = totalItens + this.venda.frete;
  }

  adicionar(frm: FormGroup) {
    this.vendaService.adicionar(this.venda).subscribe(response => {
      frm.reset();

      this.novaVenda();

      this.messageService.add({ severity: 'success', detail: 'Venda adicionada com sucesso!' });

      this.vendaSalva.emit(response);
    });
  }

}

