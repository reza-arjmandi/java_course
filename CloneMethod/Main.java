class objects implements Cloneable 
{ 
    int num; 
    public Object clone() throws
                   CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
} 
  
// Driver class 
class Main 
{ 
    public static void main(String args[]) throws
                          CloneNotSupportedException 
    { 
        objects object1=new objects();//creating object1
        object1.num=5;//setting object1's num = 5
        objects object2=new objects();//creating object2
        
        //display object1's num      
        System.out.println("Initially Object1's num is : " + object1.num);

        //Creating a cloned object
        objects clonedObject=(objects)object1.clone();
        clonedObject.num=10;//changing cloned object's num
        System.out.println("After cloning Object1's num is : " + object1.num);

        object2=object1; //using assignment operator
        object2.num=10; //changing object2's num
        
        //display object1's num 
        System.out.println("After assignment operator Object1's num is : " + object1.num);

    }
} 