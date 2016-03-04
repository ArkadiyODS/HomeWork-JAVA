/* 17.	Королю нужно убить дракона, но средства его казны – ограничены.  Нужно создать программу, 
которая поможет рассчитать минимальное количество копейщиков, которое необходимо, 
чтобы убить дракона. Данные очков здоровья и атаки дракона и одного копейщика вводятся с клавиатуры. 
Защиту, удачу, мораль, меткость и т.п. не учитывать. Копейщики наносят удар первыми (общий нанесённый урон 
– это сумма атак всех живых копейщиков). Если атака дракона превышает значение очков здоровья копейщика 
(например, у копейщика хп 10, а атака дракона - 15),  то копейщик погибает, а оставшийся урон действует на
оставшихся в живых копейщиков. Например, жизнь дракона 500, атака 55, жизнь одного копейщика 10, атака 10,
а количество копейщиков - 20. Лог боя для данного примера должен выглядеть так:
•	Копейщики атакуют (урон 200) – у дракона осталось 300 очков здоровья.
•	Дракон атакует (урон 55) – осталось 15 копейщиков, один из которых ранен (осталось 5 очков здоровья).
•	Копейщики атакуют (урон 150) – у дракона осталось 150 очков здоровья.
•	Дракон атакует (урон 55) – осталось 9 копейщиков.
•	Копейщики атакуют (урон 90) – у дракона осталось 60 очков здоровья.
•	Дракон атакует (урон 55) – осталось 4 копейщика, один из которых ранен (осталось 5 жизней).
•	Копейщики атакуют (урон 40) – у дракона осталось 20 очков здоровья.
•	Дракон атакует  и побеждает.
 */
package hw_dragonfight;
import java.util.*;
 
public class Hw_DragonFight {

    public static void main(String[] args) {
       int dHealth, dAttack, sHealth, sAttack,minSquad,maxSquad,
               dDamage,sKilled, squad, firstAttack, squadHealth;
       boolean squadKilled;
       
        dHealth = input("Dragon","health"); 
        dAttack = input("Dragon","attack");  
        sHealth = input("Spearman","health");  
        sAttack = input("Spearman","attack");  
        
        if(dHealth <= 0 || dAttack <= 0 || sHealth <= 0 || sAttack <= 0) {
           System.out.println("Wrong input. Goodbye");
           return;
       }   
        
        
        minSquad = 1;
        squad = 1; 
        dDamage = 0;
         
        
        sKilled = dAttack / sHealth;
        maxSquad = sKilled;        
        firstAttack = (int) java.lang.Math.ceil((double)dHealth/sAttack) ;
                
        while(dDamage < dHealth) {
                minSquad = maxSquad; 
                maxSquad+=sKilled;
                dDamage+= maxSquad * sAttack;
        }
        
        if(minSquad > firstAttack)
            minSquad = firstAttack;
               
        while (true){
            dDamage = 0;
            squadKilled = false;     
            squad = (maxSquad - minSquad)/2 + minSquad; 
            squadHealth = squad * sHealth;
            int tempSquad = squad;
        
            while(true) {
                dDamage += tempSquad*sAttack;
                if(dDamage >= dHealth) break;
                squadHealth -= dAttack;
                tempSquad = (int) java.lang.Math.ceil((double)squadHealth / sHealth);
                if(tempSquad <= 0){
                    squadKilled = true;
                    break;
                }  
            } 
            if(squadKilled)
            {            
                if(maxSquad - minSquad == 1){
                    squad = maxSquad;
                    break;
                }                
                minSquad = squad;
            }
            else    
            {
                if(maxSquad - minSquad == 1){
                    squad = minSquad;
                    break;
                }
                maxSquad = squad; 
            }
        
        } 
                
        System.out.println("Needed squad is: " + squad);   
        System.out.println();
        System.out.println("* * * * BATTLE * * * *" );   
        
         
        squadHealth = squad * sHealth;
        dDamage = 0;
         while(true) {
                dDamage += squad*sAttack;
                System.out.println("Squad attack: " + squad*sAttack );  
                System.out.println("Dragon's health: " + (dHealth - dDamage) ); 
                if(dDamage >= dHealth) {                    
                    System.out.println("Dragon is killed"); 
                    break;
                }
                squadHealth -= dAttack;
                System.out.println("Dragon attack: " + dAttack  );  
               
                squad = (int) java.lang.Math.ceil((double)squadHealth / sHealth); 
                
                System.out.println("Spearmen remained: " + squad ); 
                System.out.println("Spearmen's health: " + squadHealth ); 
                if(squad <= 0){
                    System.out.println("Spearmen are killed");   
                    break;
                }  
                System.out.println("************************");
            } 
    }
    
    public static int input(String name, String object)
    {
        Scanner cs = new Scanner(System.in);
        System.out.printf("Please enter %s %s: ", name, object);
        try{
        return cs.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    } 
    
}

/*
run:
Please enter Dragon health: 500
Please enter Dragon attack: 55
Please enter Spearman health: 10
Please enter Spearman attack: 10
Needed squad is: 21

* * * * BATTLE * * * *
Squad attack: 210
Dragon's health: 290
Dragon attack: 55
Spearmen remained: 16
Spearmen's health: 155
************************
Squad attack: 160
Dragon's health: 130
Dragon attack: 55
Spearmen remained: 10
Spearmen's health: 100
************************
Squad attack: 100
Dragon's health: 30
Dragon attack: 55
Spearmen remained: 5
Spearmen's health: 45
************************
Squad attack: 50
Dragon's health: -20
Dragon is killed
BUILD SUCCESSFUL (total time: 9 seconds)

*/