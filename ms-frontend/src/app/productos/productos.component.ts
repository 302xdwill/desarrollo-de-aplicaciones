import { Component, OnInit } from '@angular/core';
// @ts-ignore
import { ProductoService } from "../services/producto.service";
// @ts-ignore
import { Producto } from '../models/producto.model';
import {FormsModule} from "@angular/forms";  // Asegúrate de tener un modelo de Producto

@Component({
  selector: 'app-productos',
  templateUrl: './productos.component.html',
  imports: [
    FormsModule
  ],
  styleUrls: ['./productos.component.css']
})
export class ProductosComponent implements OnInit {

  productos: Producto[] = [];  // Lista para almacenar los productos
  codigoFiltro: string = '';
  fechaFiltro: string = '';

  constructor(private productoService: ProductoService) {}

  ngOnInit(): void {
    this.obtenerProductos();  // Obtén los productos al iniciar
  }

  obtenerProductos(): void {
    this.productoService.getProductos(this.codigoFiltro, this.fechaFiltro).subscribe(
      (data) => {
        this.productos = data;
      },
      (error) => {
        console.error('Error al obtener productos', error);
      }
    );
  }

  aplicarFiltro(): void {
    this.obtenerProductos();
  }

}
