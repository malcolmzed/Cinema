
  Cinema layout looks like this:
  
  A  ()  ()  ()  ()  () 
  B  ()  ()  ()  ()  () 
  C  ()  ()  ()  ()  () 
      1   2   3   4   5 
	  
  Seats must be sold in the order A 1->5,  B 1->5, C 1->5
  
  First thought is to use a 3x5 array, but this would be overly complicated,
  snaking from A5 to B1 and then B5 to C1
  
  So use a 1D array with 15 elements, mapped like this:
  
			A1 A2 A3 A4 A5 B1 B2 B3 B4 B5 C1 C2 C3 C4 C5 
			
  Initially each element should contain a value of zero [meaning available]
  When a seat is sold, the corresponding element will be populated with the customerId

  To find the next free seat, just move along the array - going from A5 to B1
  and B5 to C1 without any effort
  
  Create the following classes [as per UML diagram]:
  
	+ Theatre
	+ Screen
	+ Film
	+ Event
	
  For each class, create a @Test method to populate the class using setters and then 
  retrieve the data using getters.  
  Assert that the retrieved data matches the original data
  
  Create a checkBookingProcess method which invokes the above @Test methods
  [to poluplate some data, not to test] and then sells random quantities 
  of seats to random customers
  
  At each step, print the cinema layout showing 
  available seats as "()" and sold seats as, for example, "59" :
    
		A  10  59  59  22  51 
		B  19  19  16  16  16 
		C  21  ()  ()  ()  () 
			1   2   3   4   5

"# Cinema" 
