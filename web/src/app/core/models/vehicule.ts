import { Chauffeur } from './chauffeur';
import { Trajet } from './trajet';

export interface Vehicule {
  id: number;
  marque: string;
  plaque: string;
  statut: string;
  chauffeur: Chauffeur;
  nbrPlaces: number;
  trajet: Trajet;
}
