

object tickett {
  
  def main(args: Array[String]){
    
   println("When ticket price is Rs. 5, profit is  " + netprofit(5) )
   println("When ticket price is Rs.10, profit is  " + netprofit(10) )
   println("When ticket price is Rs.15, profit is  " + netprofit(15) )
   println("When ticket price is Rs.20, profit is  " + netprofit(20) )
   println("When ticket price is Rs.25, profit is  " + netprofit(25) )
   println("When ticket price is Rs.30, profit is  " + netprofit(30) )
   println("When ticket price is Rs.35, profit is  " + netprofit(35) )
   println("When ticket price is Rs.40, profit is  " + netprofit(40) )
   println("When ticket price is Rs.45, profit is  " + netprofit(45) )
   
  }
  
  def people(ticket:Int) = 120 + (15 - ticket)/5*20
  
  def income(ticket:Int) = people(ticket)*ticket
  
  def cost(ticket:Int) = 500 + people(ticket)
  
  def netprofit(ticket:Int) = income(ticket) - cost(ticket) 
  
}