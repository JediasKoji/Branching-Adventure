public class ChoiceOriginal{

   private String prompt;
   private String choice1;
   private String choice2;
   int area1;
   int area2;
   boolean death;
   boolean win;

   public ChoiceOriginal(int area){
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
         this.area1 = 17;
         this.area2 = 16;
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
         this.prompt = "You push on through the corridor. Unfortunately, you encounter a hostile suit of armour. As you attempt to escape your legs give out.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      }
      else if(area == 22){
         this.prompt = "Nothing happens, you look like an idiot. What now?";
         this.choice1 = "Kill yourself.";
         this.choice2 = "Move on.";
         this.area1 = 26;
         this.area2 = 27;
      }
      else if(area == 23){
         this.prompt = "The angel statue falls and kills you. Maybe you should've flirted with it.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      }
      else if(area == 24){
         this.prompt = "You encounter a hostile suit of armor but you easily juke it out of its' shoes. Two corridors lie past the suit.";
         this.choice1 = "Left?";
         this.choice2 = "Right?";
         this.area1 = 28;
         this.area2 = 29;
      }
      else if(area == 25){
         this.prompt = "Surprisingly, you aren't dead. Hurry up and get a move on.";
         this.choice1 = "Continue down Corridor.";
         this.choice2 = "Take a nap.";
         this.area1 = 24;
         this.area2 = 30;
      }
      else if(area == 26){
         this.prompt = "Congratulations, you've died of embarrasment. Now get a move on.";
         this.choice1 = "Move on.";
         this.choice2 = "For the love on shrooms, move on.";
         this.area1 = 27;
         this.area2 = 27;
      }
      else if(area == 27){
         this.prompt = "You open the door at the other side of room. There's a paper stuck to the wall across from you.";
         this.choice1 = "Read the paper?";
         this.choice2 = "Go straight through room to the door on your right.";
         this.area1 = 31;
         this.area2 = 32;
      }
      else if(area == 28){
         this.prompt = "You enter an area that appears to be a dungeon. Light is scarce and dark figures dance at the edge of your vision.";
         this.choice1 = "Run as fast as you can to the exit at the end of the dungeon";
         this.choice2 = "Stop and try to ask some questions to the things in the jail cells";
         this.area1 = 32;
         this.area2 = 33;
      }
      else if(area == 29){
         this.prompt = "Unfortunately for you, right is not the right way.  A vat of lukewarm gravy tumbles from the ceiling and you drown in it.";
         this.choice1 = "die";
         this.choice2 = "die";
         this.death = true;
      }
      else if(area == 30){
         this.prompt = "As you nap, you have a dream in which you hear a voice telling you to wake up.";
         this.choice1 = "Stop dreaming";
         this.choice2 = "Keep dreaming";
         this.area1 = 34;
         this.area2 = 35;
      }
      else if(area == 31){
         this.prompt = "The paper reads, You've won the lottery!  Your money is in the large chest next to the sign.";
         this.choice1 = "Open the chest to claim your prize";
         this.choice2 = "Move on. It could be a trap";
         this.area1 = 36;
         this.area2 = 37;
      }
      else if(area == 32){
         this.prompt = "A spike flies out of the wall, Indiana Jones style, and you don't react as quickly as Indiana Jones.";
         this.choice1 = "die";
         this.choice2 = "die";
         this.death = true;
      }
      else if(area == 33){
         this.prompt = "The entities don't seem very communicative, except for a very fat one that offers to help you find your way out of the castle if you only let him out of his cell.";
         this.choice1 = "Let him out";
         this.choice2 = "Laugh at him and run away";
         this.area1 = 38;
         this.area2 = 39;
      }
      else if(area == 34){
         this.prompt = "The voice in your dream was quite helpful.  Waking up a moment later would have prevented you from noticing the massive black widow about to bite you.";
         this.choice1 = "Try to squish the black widow with your bare foot";
         this.choice2 = "Make a run for it";
         this.area1 = 40;
         this.area2 = 41;
      }
      else if(area == 35){
         this.prompt = "As you dream peacefully, you feel a small nip at your neck and your vision starts to go red";
         this.choice1 = "die";
         this.choice2 = "die";
         this.death = true;
      }
      else if(area == 36){
         this.prompt = "You really did win the lottery, and it isn't a trap.  But what can you do with money?";
         this.choice1 = "Try to find a vending machine.";
         this.choice2 = "Carry as much as possible.";
         this.area1 = 42;
         this.area2 = 43;
      }
      else if(area == 37){
         this.prompt = "It is a trap.  Every path through the room except for the one leading to the treasure chest is rigged with huge floor spikes";
         this.choice1 = "die";
         this.choice2 = "die";
         this.death = true;
      }
      else if(area == 38){
         this.prompt = "The fat entity is surprisingly trustworthy, and leads you out of the castle in about 3 minutes, where you find a car with a key in the ignition.";
         this.choice1 = "Leave the castle.";
         this.choice2 = "Wha?";
         this.area1 = 44;
         this.area2 = 38;
      
      }
      else if(area == 39){
         this.prompt = "You've enraged a creature weighing over 500lbs. He breaks out of his cell and sits on you...";
         this.choice1 = "die?";
         this.choice2 = "Try to fight.";
         this.death = true;
      
      }
      else if(area == 40){
         this.prompt = "It was massive. We said it was MASSIVE you dolt.";
         this.choice1 = "die?";
         this.choice2 = "contemplate your own stupidity and die.";
         this.death = true;
      
      }
      else if(area == 41){
         this.prompt = "You bolt towards the nearest opening in the wall but you suddenly notice that the ground falls away into a sheer cliff, and you hear the crashing of waves below you.";
         this.choice1 = "Turn back and fight the black widow.";
         this.choice2 = "Jump";
         this.area1 = 45;
         this.area2 = 46;
      
      }
      else if(area == 42){
         this.prompt = "Conveniently, there appears to be a vending machine just on the other side of the hall. 2$ per drink.";
         this.choice1 = "Water";
         this.choice2 = "Coke";
         this.area1 = 47;
         this.area2 = 48;
      
      }
      else if(area == 43){
         this.prompt = "You leave through a door you see to your right.  A ninja jumps out and asks for your money.";
         this.choice1 = "Give him your money";
         this.choice2 = "Dare him to impale you with his long, hard sword";
         this.area1 = 49;
         this.area2 = 50;
      
      }
      else if(area == 44){
         this.prompt = "You've successfully escaped the castle. What now?";
         this.choice1 = "go home";
         this.choice2 = "party hard";
         this.win = true;
      
      }
      else if(area == 45){
         this.prompt = "You fight valiantly but lose in a mere 3 seconds.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      
      }
      else if(area == 46){
         this.prompt = "You tumble through the air and fall softly into the water.  You wash up on a sandy beach, and... Hey, it's San Francisco, cool!";
         this.choice1 = "Sunbathe";
         this.choice2 = "Try to hit up some girls";
         this.win = true;
      
      }
      else if(area == 47){
         this.prompt = "We weren't able to think of anything and the worst cliche ending ever occurs.  It was all a dream and you wake up in your bed.";
         this.choice1 = "really?";
         this.choice2 = "lame";
         this.win = true;
      
      }
      else if(area == 48){
         this.prompt = "Plot twist!  It's actually cocaine!  You don't notice until it's too late.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      
      }
      else if(area == 49){
         this.prompt = "He stabs you anyway.";
         this.choice1 = "die?";
         this.choice2 = "die";
         this.death = true;
      
      }
      else if(area == 50){
         this.prompt = "You've been impaled by his long, hard sword.";
         this.choice1 = "die?";
         this.choice2 = "die?";
         this.death = true;
      
      }
      
      else{
         this.prompt = "How did you get here...?";
         this.choice1 = "wha?";
         this.choice2 = "huh?";
         this.area1 = 1;
         this.area2 = 1;
         
      }
   }
   public void askChoice(){
      System.out.println(this.prompt);
      System.out.println(this.choice1);
      System.out.println(this.choice2);
      
      
   }
   
   public boolean getWin(){
      return this.win;
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