

object Company {
  def main(args: Array[String]){
    
   println("*******XYZ & Co..********\n")
   print("Take home salary of an employee who works 40 (normal) and 20(OT) hours per week : ")
   
   var ne = normal(40) + OT(20)
   var ta = tax(ne) 
   var finalsal = takehome(ne, ta)
   print(finalsal)
    
  }
  
  def normal(hours:Int) = hours * 150
  
  def OT(hours:Int) = hours * 75
  
  def tax(total:Double) = total * 10/100
  
  def takehome(net:Int, tax:Double) = net - tax
  
}