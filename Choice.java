public class Choice{

   private String prompt;
   private String choice1;
   private String choice2;
   int area1;
   int area2;
   boolean death;

   public Choice(int area){
      if(area == 1){
         this.prompt = "The dots of purple trail off leading to a small table.  Atop the table are two drinks, a frothy green one and a swirling red.  Which one do you drink?";
         this.choice1 = "The red one.";
         this.choice2 = "The green one.";
         this.area1 = 2;
         this.area2 = 3;
      }
      else if(area == 2){
         this.prompt = "Your head begins to swirl and you black out.  When you awake the previously featureless turret has two exits, a large wooden door and a large frought-iron one.  How shall you egress?";
         this.choice1 = "Through the wooden door.";
         this.choice2 =  "Through the frought-iron door.";
         this.area1 = 4;
         this.area2 = 5;
      }
      else if(area == 3){
         this.prompt = "You convulse violently and somehow structurally destabilize the turret.  As the floor gives out, you see a coiled rope above you and a gaping blackness below you.  Go for the rope, or leap?";
         this.choice1 = "Use the rope to scale down the outside of the turret.";
         this.choice2 = "Make a leap of faith into the blackness and hope you land on something soft.";
         this.area1 = 6;
         this.area2 = 7;
      }
      else if(area == 4){
         this.prompt = "Opening the wooden door you see a staircase spiraling downward.  You start down cautiously and stop at a door.  It is labeled, LIBRARY.  Enter it or go further down?";
         this.choice1 = "Enter it.";
         this.choice2 = "Continue down the staircase.";
         this.area1 = 8;
         this.area2 = 9;
      }
      else if(area == 5){
         this.prompt = "As you pass through the iron door, it abruptly closes behind you, clanging ominously. You see what appears to be a snoring sphinx in front of you.  What do you do?";
         this.choice1 = "Fight it.";
         this.choice2 =  "Try to quietly move around it.";
         this.area1 = 10;
         this.area2 = 11;
      }
      else if(area == 6){
         this.prompt = "You are able to get out of the building, but as you scale down the rope gives out and you fall 50 feet, breaking both legs.  You see a pathway leading behind you, but also see a half-open gate at the other end of the courtyard.  Where do you turn?";
         this.choice1 = "Down the pathway.";
         this.choice2 =  "Across the empty courtyard toward the door.";
         this.area1 = 12;
         this.area2 = 13;
      }
      else if(area == 7){
         this.prompt = "Your calculated risk worked out.  You land in a deep fountain, drenching you but not harming you.  Your foot bumps against something metallic on the bottom as you bob in the water.  Investigate it or get out of the fountain?";
         this.choice1 = "Investigate.";
         this.choice2 =  "Just get out of the fountain.";
         this.area1 = 14;
         this.area2 = 15;
      }
      else if(area == 8){
         this.prompt = "You enter the library. A musty scent invades your nostrils. The last thing you see is a giant book falling from the ceiling";
         this.choice1 = "die?";
         this.choice2 =  "die?";
         this.death = true;
      }
      else if(area == 9){
         this.prompt = "You hear a loud rumbling below you and you can feel the stairwell shaking.";
         this.choice1 = "Run back up the stairs";
         this.choice2 =  "Continue down to investigate the noise";
         this.area1 = 16;
         this.area2 = 17;
      }
      else if(area == 10){
         this.prompt = "You try to fight it with your barehands. You use your best kungfu action movie moves but one whiff of the sphinx's breath kills you instantly";
         this.choice1 = "die?";
         this.choice2 =  "die?";
         this.death = true;
      }
      else if(area == 11){
         this.prompt = "As you try to sneak quietly around it, you trip, land on your face, and die.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      }
      else if(area == 12){
         this.prompt = "You decide to crawl down the pathway but your vision starts to fade. Things start to blur as you close your eyes.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      }
      else if(area == 13){
         this.prompt = "You open the door and find a bottle listed as 'potion' on the side. What do you do?";
         this.choice1 = "Drink it?";
         this.choice2 = "Don't drink it?";
         this.area1 = 18;
         this.area2 = 19;
      }
      else if(area == 14){
         this.prompt = "You decide to investigate the metal plating. Suddenly the bottom of the found caves in with you in it. The fall was not cushioned";
         this.choice1 = "Die?";
         this.choice2 = "Die?";
         this.death = true;
      }
      else if(area == 15){
         this.prompt = "As you get of the fountain it caves in nearly taking you with it. You're wet and exhausted. There seems to be only one corridor in the room. What do you do?";
         this.choice1 = "Take a rest.";
         this.choice2 = "Push on.";
         this.area1 = 20;
         this.area2 = 21;
      }
      else if(area == 16){
         this.prompt = "You make it to the bottom of the stairwell just as it crumbles. A large sculpture of an angel fills the center of the room. There's a door on the other side. What do you do?";
         this.choice1 = "Flirt with the angel sculpture.";
         this.choice2 = "Quickly walk around.";
         this.area1 = 22;
         this.area2 = 23;
      }
      else if(area == 17){
         this.prompt = "The stairwell quickly collapses with you in it. Red fills your vision.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      }
      else if(area == 18){
         this.prompt = "Lol, it's actually poison.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      }
      else if(area == 19){
         this.prompt = "You bleed out on the floor. Well done. Great job by you.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      }
      else if(area == 20){
         this.prompt = "You feel refreshed after your short break.";
         this.choice1 = "Continue to corridor.";
         this.choice2 = "Rest some more.";
         this.area1 = 24;
         this.area2 = 25;
      }
      else if(area == 21){
         this.prompt = "";
         this.choice1 = "";
         this.choice2 = "";
      }
      else if(area == 21){
         this.prompt = "";
         this.choice1 = "";
         this.choice2 = "";
      }
      else if(area == 21){
         this.prompt = "";
         this.choice1 = "";
         this.choice2 = "";
      }
      else if(area == 21){
         this.prompt = "";
         this.choice1 = "";
         this.choice2 = "";
      }
      else{
         
      }
   }
   public String askChoice(){
      return prompt;
      
      
   }
   
   public String presentChoice1(){
   return choice1;
   }
   
   public String presentChoice2(){
   return choice2;
   }
   
   public int getArea(int a){
      if(a ==1){
         return this.area1;
      }
      else{
         return this.area2;
      }
   }
   
   public boolean getIsDead(){
      return this.death;
   }

}