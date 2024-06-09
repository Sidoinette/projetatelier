export interface RestResponse<T>{
    totalItems?: number,
    pages?: number[],
    totalPages?: Number,
    currentPage?: number,
    results : T,
    statut : number
}

export interface ResponseForCoursForm{
  id: number,
  name: string,
  total?: number
}

export interface DtoForCoursForm{
  id?:number;
  module:String;
  professeur:String;
  niveau:String;
  heureGlobal:String;
  classes?:String[];
  semestre:String;
}

export interface DtoResponseOneCours{
  id?:number;
  module:String;
  professeur:String;
  niveau:String;
  heureGlobal:String;
  heurePlanifie: String;
  semestre:String;
}

export interface DtoRequestClasseList{
  id?:number;
  libelle:string;
  niveau:string;
  filiere:string;
  effectif:number;
}

export interface DtoResponseClasse{
  libelle:string;
  niveau:string;
  filiere:string;
  effectif:number;
  modules:string[];
}

export interface DtoRequestProfesseurList{
  id:number;
  nomComplet:string;
  telephone:string;
  grade:string;
  specialite:string;
}

export interface DataSlect2{
  datas:string[];
}

export interface DtoRequestProfesseurDetail{
  id?:number;
  nomComplet:string;
  telephone:string;
  specialite:string;
  grade:string;
  modules:string[];
}

export interface DtoRequestInscriptionList {
  id:number;
  matricule:string;
  nomComplet:string;
  date:string;
  telephone:string;
  classe:string;
}

export interface DtoRequestInscriptionForm {
  id?:number;
  matricule:string;
  nomComplet:string;
  telephone:string;
  classe:string;
  tuteur:string;
  adresse:string;
}

export interface DtoRequestGenerateMatricule {
  matricule:string;
}
