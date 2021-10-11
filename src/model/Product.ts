import { Categorie } from "./Categorie";

export class Product {
  idProduct :number;
  nom : string;
  prix : number;
  description : string;
  qteStock : number;
  image : string;
  categorie:Categorie;
  qte:number;



  _links : {
    self : {
      href : string
    },
    product : {
      href : string
    },

  }
}
