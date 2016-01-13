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

import java.text.DecimalFormat;

public class CalculerPrix {

    final static double FRAIS_DE_GARDE = 9.00;
    public static DecimalFormat chg = new DecimalFormat( "0.00" );

    public static double calculerPrixEntree( int nbEleves, int nbAdultes, String prixA, String prixE ) {
        prixA = FormaterPrix.prixFormater( prixA );
        prixE = FormaterPrix.prixFormater( prixE );
        double prixEleves = Double.parseDouble( prixE.substring( 0, prixE.length() - 1 ) );
        double prixAdultes = Double.parseDouble( prixA.substring( 0, prixA.length() - 1 ) );
        return (nbEleves * prixEleves) + (nbAdultes * prixAdultes);
        
    }
}
