import { Vehicule } from './vehicule';
import { Course } from './course';

export interface Trajet {
  id: number;
  depart: string;
  arriver: string;
  date: Date;
  prix: number;
  vehicules: Vehicule[];
  courses: Course[];
}

export interface TrajetAdd {
  depart: string;
  arriver: string;
  date: Date;
  prix: number;
  vehicules?: Vehicule[];
  courses?: Course[];
}

