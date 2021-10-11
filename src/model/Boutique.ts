import {Gerant} from "./Gerant";

export class Boutique{
  constructor(public idBoutique?:number,nomBoutique?:string, adresseBoutique?:string, telephoneBoutique?:string, gerant?: Gerant) {
  }
}
