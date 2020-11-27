
public class Student {
 private String Name;
    private double[]Scores=new double[6];
    private double percent;
    private int IBG=0;

  

    Student() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
    public void setName(String X){
        Name=X;
    }
    public String getName(){
        return Name;
    }
    
    public void setScores(double[]Y){
        Scores=Y;
    }
    public double[] getScores(){
        return Scores;
    }
    
    public double getPercent(){
        double sum=0;
        for(int i=0; i<6; i++){
            sum=Scores[i]+sum;
        }
        
        percent=(sum/240)*100;
        return percent;
    }
    
    public int getIBG(){
        if(percent>=90 && percent<=100){
            IBG=7;
        }
        
        if(percent>=80 && percent<90){
            IBG=6;
        }
        
        if(percent>=75 && percent<80){
            IBG=5;
        }
        if(percent>50 && percent<75){
            IBG=4;
        }
        if(percent>=30 && percent<50){
            IBG=3;
        }
        if(percent>=20 && percent<30){
            IBG=2;
        }
        if(percent>=0 && percent<20){
            IBG=1;
        }
         
        return IBG;
    }
    
    public Student(String Name, double[]Scores){
        this.Name=Name;
        this.Scores=Scores;
    }

}

   

