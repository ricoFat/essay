/*
 * Copyright 2015 Erick K.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ecole;

public class Bus extends Transport {

    final double PRIX_AUTOBUS_40 = 4.00;
    final double PRIX_AUTOBUS_PLUS_40 = 4.95;
    final int NB_PERSONNES_BUS = 30;
    final int DISTANCE_MOYENNE = 40;
    protected int distance;

    public Bus( int age, int nbEnfant, int nbAdultes, int distance ) {
        super( age, nbEnfant, nbAdultes );
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public int nombreBus() {
        int nbPersonnes = super.getNbAdultes() + super.getNbEnfant();
        int nbBus = nbPersonnes / NB_PERSONNES_BUS;
        if ( nbPersonnes % NB_PERSONNES_BUS > 0 ) {
            nbBus += 1;
        }
        return nbBus;
    }

    protected double calculerMontantBus() {
        double montantBus;
        if ( getDistance() < DISTANCE_MOYENNE ) {
            montantBus = (distance * PRIX_AUTOBUS_40) * nombreBus();
        } else {
            montantBus = (distance * PRIX_AUTOBUS_PLUS_40) * nombreBus();

        }
        return montantBus;
    }

    protected double montantCredite( double montant ) {
        double busCredite = montant;
        if ( getAge() <= super.AGE_MIN ) {
            busCredite = busCredite - (busCredite / 10);
        }
        return busCredite;
    }

    @Override
    public double getPrixTransport() {
        return montantCredite( calculerMontantBus() );
    }

}
