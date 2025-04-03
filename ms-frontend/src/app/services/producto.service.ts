import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
// @ts-ignore
import { Producto } from '../models/producto.model';  // Asegúrate de tener un modelo de Producto

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  private apiUrl = 'http://localhost:8081/productos';  // URL de tu backend

  constructor(private http: HttpClient) {}

  // Método para obtener los productos con filtros
  getProductos(codigo: string = '', fechaCreacion: string = ''): Observable<Producto[]> {
    let params = new HttpParams();
    if (codigo) {
      params = params.set('codigo', codigo);
    }
    if (fechaCreacion) {
      params = params.set('fechaCreacion', fechaCreacion);
    }

    return this.http.get<Producto[]>(this.apiUrl, { params });
  }
}
