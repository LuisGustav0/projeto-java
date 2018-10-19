import { Component, OnInit } from '@angular/core';
import { VendaService } from '../venda.service';

@Component({
  selector: 'app-venda-pesquisa',
  templateUrl: './venda-pesquisa.component.html',
  styleUrls: ['./venda-pesquisa.component.css']
})
export class VendaPesquisaComponent implements OnInit {
  
  listaVenda: Array<any>;

  constructor(private vendaService: VendaService) { }

  ngOnInit() {
    this.listar();
  }

  listar() {
    this.vendaService.listar()
      .subscribe(response => 
        this.listaVenda = response
      );
  }
}
