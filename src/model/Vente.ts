import {Produit} from "./Produit";

export class Vente{
  idVent:number;
  client: string;
  produit: Produit;
  qteVendu: number;
  totale: number;
  reference: string;
  dateOperation: string;
}
