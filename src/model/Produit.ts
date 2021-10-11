import {Categorie} from "./Categorie";
import {Fournisseur} from "./Fournisseur";

export class Produit{
  categorie: Categorie;
  fournisseur: Fournisseur;
  nomProduit: String;
  descriptionProduit: String;
  prix: Number;
  qteProduit: Number;
  matriculeProduit: String;
  image: String;
  dateFourni: String;
  idProduit: number;
  prixTotal: Number;
  Totale: number;
  isAdded:boolean;
  constructor(idProduit?:number, nomProduit?:string, descriptionProduit?:string, prix?:number,qteProduit?:number, matriculeProduit?:string, image?:string, categorie?: Categorie, fournisseur?:Fournisseur,dateFourni?:string) {

  }
}
