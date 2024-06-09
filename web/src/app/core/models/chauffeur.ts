import { User } from './user';
import { Vehicule } from './vehicule';

export interface Chauffeur extends User {
  vehicule: Vehicule;
}
