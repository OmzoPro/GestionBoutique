import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AccueilComponent} from "./Components/accueil/accueil.component";
import {AddProduitComponent} from "./Components/add-produit/add-produit.component";
import {ProduitsComponent} from "./Components/produits/produits.component";
import {EditProduitComponent} from "./Components/edit-produit/edit-produit.component";
import {AddCategorieComponent} from "./Components/add-categorie/add-categorie.component";
import {CategoriesComponent} from "./Components/categories/categories.component";
import {ProduitComponent} from "./Components/produit/produit.component";
import {CategorieComponent} from "./Components/categorie/categorie.component";
import {EditCategorieComponent} from "./Components/edit-categorie/edit-categorie.component";
import {AddFournisseurComponent} from "./Components/add-fournisseur/add-fournisseur.component";
import {FournisseurComponent} from "./Components/fournisseur/fournisseur.component";
import {FournisseursComponent} from "./Components/fournisseurs/fournisseurs.component";
import {EditFournisseurComponent} from "./Components/edit-fournisseur/edit-fournisseur.component";
import {AddVenteComponent} from "./Components/add-vente/add-vente.component";
import {VenteComponent} from "./Components/vente/vente.component";
import {VentesComponent} from "./Components/ventes/ventes.component";
import {EditVenteComponent} from "./Components/edit-vente/edit-vente.component";
import {TestComponent} from "./Components/test/test.component";
import {PanierComponent} from "./Components/panier/panier.component";
import {FactureComponent} from "./Components/facture/facture.component";

const routes: Routes = [
  {path:'header', redirectTo: '/', pathMatch: 'full'},
  {path: '', component:AccueilComponent},
  {path: 'accueil', component: AccueilComponent},
  {path: 'addProduit', component: AddProduitComponent},
  {path: 'produit/:id', component: ProduitComponent},
  {path: 'listeProduit', component: ProduitsComponent},
  {path: 'editProduit/:id', component: EditProduitComponent},
  {path: 'addCategorie', component: AddCategorieComponent},
  {path: 'categorie/:id', component: CategorieComponent},
  {path: 'listeCategorie', component: CategoriesComponent},
  {path: 'editCategorie/:id', component: EditCategorieComponent},
  {path: 'addFournisseur', component: AddFournisseurComponent},
  {path: 'fournisseur/:id', component: FournisseurComponent},
  {path: 'listeFournisseur', component: FournisseursComponent},
  {path: 'editFournisseur/:id', component: EditFournisseurComponent},
  {path: 'addVente', component: AddVenteComponent},
  {path: 'vente/:id', component: VenteComponent},
  {path: 'listeVente', component: VentesComponent},
  {path: 'editVente/:id', component: EditVenteComponent},
  {path: 'panier', component: PanierComponent},
  {path: 'facture', component: FactureComponent},
  {path: 'test', component: TestComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[AccueilComponent,AddVenteComponent,EditVenteComponent,VentesComponent,VenteComponent,AddCategorieComponent,EditCategorieComponent,CategoriesComponent,CategorieComponent,AddProduitComponent,EditProduitComponent,ProduitsComponent,ProduitComponent,AddFournisseurComponent,EditFournisseurComponent,FournisseursComponent,FournisseurComponent, PanierComponent, FactureComponent,TestComponent]
