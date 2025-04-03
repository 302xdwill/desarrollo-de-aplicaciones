import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { ProductosComponent } from './productos/productos.component';  // Asegúrate de que este componente esté importado
import { HttpClientModule } from '@angular/common/http';  // Importa HttpClientModule para las peticiones HTTP

@NgModule({
  declarations: [
    ProductosComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppComponent,
    // Asegúrate de incluir esto aquí
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
