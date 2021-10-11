import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {routingComponents} from "./app-routing.module";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './Components/menu/menu.component';
import { TestComponent } from './Components/test/test.component';
import { HeaderComponent } from './Components/header/header.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { PanierComponent } from './Components/panier/panier.component';
import { FactureComponent } from './Components/facture/facture.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    TestComponent,
    HeaderComponent,
    routingComponents,
    PanierComponent,
    FactureComponent
  ],
    imports: [
        HttpClientModule,
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
