
/* Kirk's Quest - The descent || Challenge from http://www.codingame.com/cg/#!page:training 
*/

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Read init information from standard input, if any

        while (true) {
            // Read information from standard input
            int SX = in.nextInt();
            int SY= in.nextInt();
            int targetMountain;
            
            int []mountains=new int[8];
            
            mountains[0]=in.nextInt();
            mountains[1]=in.nextInt();
            mountains[2]=in.nextInt();
            mountains[3]=in.nextInt();
            mountains[4]=in.nextInt();
            mountains[5]=in.nextInt();
            mountains[6]=in.nextInt();
            mountains[7]=in.nextInt();
            
                        
            targetMountain=getHighestMountain(mountains);
            
            if(SX==targetMountain){
            
                System.out.println("FIRE");
            }else{
                System.out.println("HOLD");
                
            }               
     }
}
  
    
    
        public static int getHighestMountain(int[]arrayOfMountains){
           
           int highestMountain=0;
           int highValue=0;
           int currentHigh=0;
           
           for (int i=0;i<arrayOfMountains.length;i++){
              currentHigh= arrayOfMountains[i];
              System.err.println("Current High:" + currentHigh);
              System.err.println("High Value" + highValue);
              
              if(currentHigh>highValue){
                  highValue=currentHigh;
                  highestMountain=i;
              }
               
           }
           return highestMountain;
        }
        
}
