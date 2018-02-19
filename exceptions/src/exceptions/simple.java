package exceptions;
/*class A extends B
{
	
}
 class C extends A
{
}*/
class simple {

	public static void main(String[] args) {
		
    try
    {
	 throw new  Exception("new throw Exception");
    }
    
     catch(Exception e)
     {
	   System.out.println(e.getMessage());
     }
	}

}
