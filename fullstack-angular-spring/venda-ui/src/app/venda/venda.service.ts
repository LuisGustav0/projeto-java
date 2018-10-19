import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class VendaService {
  private api = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  listar(): Observable<any> {
    return this.http.get<any>(`${this.api}/venda`);
  }

  adicionar(venda: any): Observable<any> {
    return this.http.post<any>(`${this.api}/venda`, venda);
  }

  listarClientes(): Observable<any> {
    return this.http.get<any>(`${this.api}/cliente`);
  }

  listarProdutos(): Observable<any> {
    return this.http.get<any>(`${this.api}/produto`);
  }

}
