/* ************************************************************************** */
/*                                                                            */
/*                                                                            */
/*   Main.java                                                                */
/*                                                                            */
/*   By: Loïc <lbertran@student.42lyon.fr>                                    */
/*                                                                            */
/*   Created: 2020/11/30 21:05:54 by Loïc                                     */
/*   Updated: 2020/11/30 21:05:54 by Loïc                                     */
/*                                                                            */
/* ************************************************************************** */
package me.loic;

public class Main {

    private static String doubleToHours(double input) {
        int hours = (int) input;
        String decimalPlaces = String.valueOf(input).replace(".", ",").split(",")[1];
        int minutes = (int) (Double.parseDouble("0." + decimalPlaces) * 60);
        return (hours + "h" + minutes);
    }

    public static void main(String[] args) {
        double manaValue = 6.593261686556339; // 1000  / 151.67 (objectif de mana par mois / moyenne mensuelle d'heures ouvrables pour 35h par semaine)
        double manaBank = 223; //ta quantité de mana
        double hoursBank = 25.0833333333333333; //ton logtime convertit en double (heures + (minutes / 60))

        double logTimeToMana = hoursBank * manaValue;
        double manaToLogTime = manaBank / manaValue;


        String logTimeToManaFormatted = String.format("%.2f", logTimeToMana);


        System.out.println("Ton logtime equivaut a " + logTimeToManaFormatted + " mana.");
        System.out.println("Ton mana equivaut a " + doubleToHours(manaToLogTime) + " de logtime.");
        System.out.println("Tu as un total equivalent a "
                +  doubleToHours(manaToLogTime + hoursBank) + " de logtime ou "
                + String.format("%.2f", (logTimeToMana + manaBank)) + " mana");
    }
}
