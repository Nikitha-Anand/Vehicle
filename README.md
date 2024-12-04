# Class Vehicle

- ID : STRING - stores the identification number of the vehicle
- MaxSpeed : INTEGER - stores the maximum speed
- CurrentSpeed : INTEGER - stores the current speed
- IncreaseAmount : INTEGER - stores the amount CurrentSpeed increases by
- HorizontalPosition : INTEGER - stores the horizontal position
---

- Constructor() - initialises ID, MaxSpeed and IncreaseAmount to the parameter values, initialises both CurrentSpeed and HorizontalPosition to 0
- GetCurrentSpeed() - returns the current speed
- GetIncreaseAmount() - returns the increase amount
- GetHorizontalPosition() - returns the horizontal position
- GetMaxSpeed() - returns the maximum speed
- SetCurrentSpeed() - assigns the parameter to the current speed
- SetHorizontalPosition() - assigns the parameter to the horizontal position
- IncreaseSpeed() - calculates and stores the new speed and horizontal position of the vehicle
- PrintVehicle() - outputes the horizontal position and speed of the vehicle

# Class Helicopter

Child Class Helicopter inherits from the parent class Vehicle

---
- VerticalPosition : INTEGER - stores the vertical position
- VerticalChange : INTEGER - stores the amount VerticalPosition changes by
- MaxHeight : INTEGER - stores the maximum height the helicopter can reach
---

- Constructor() - takes the ID, maximum speed, increase amount, vertical change and maximum height as parameters initialises the vertical position to 0
- GetVerticalPosition() - returns the vertical position
- IncreaseSpeed() - overrides the parent method; changes the current speed, horizontal and vertical position of the helicopter
- PrintVehicle() - overrides parent method; outputes the horizontal position, vertical position, and speed of the vehicle

# Class Main

- instantiate a car as a new vehicle with the ID "Tiger", a maximum speed of 100 and an increase amount of 20
- instantiate a new helicopter with the ID "Lion", a maximum speed of 350, an increase amount of 40, a vertical change of 3 and a maximum height of 100
- call IncreaseSpeed() twice for the car and then call PrintVehicle() method for the car
- call IncreaseSpeed() twice for the helicopter and then call PritVehicle() method for the helicopter



