import { Productarticle } from "./Productarticle";

export class Paniers {
  nom:string;
  panierArticle:Map<number,Productarticle>=new Map();
  constructor(name: string) {
    this.nom = name;
  }

}
