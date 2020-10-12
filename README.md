# Missionaries and Cannibals
 
This is a Java solution to the [Missionaries and cannibals problem](https://en.wikipedia.org/wiki/Missionaries_and_cannibals_problem).
 
### State

A state has been defined as the positions and number of cannibals and missionaries. They can be located in the right or left side of the river and inside the boat.

For each state we are listing all the valid children states, then explore them. When the final states is reach, go back in the tree to the initial state to see how we get here.
 
### Note
 
There are way better and optimized solutions for this problem, I did it quickly without digging a lot in it. 

### Output

The algorithm is able to found out a solution. 

L stand for Left side of the river.
B stand for boat.
R stand for right side of the river.

C stand for Cannibals
M stand for missionaries

Initial State:
Config: L:[C:3 M: 3] B:[C:0 M:0] R:[C:0 M: 0] isBoatLeft: true

Printing solution:
Config: L:[C:0 M: 0] B:[C:0 M:0] R:[C:3 M: 3] isBoatLeft: false
Config: L:[C:0 M: 0] B:[C:1 M:1] R:[C:2 M: 2] isBoatLeft: false
Config: L:[C:0 M: 1] B:[C:1 M:0] R:[C:2 M: 2] isBoatLeft: true
Config: L:[C:0 M: 1] B:[C:2 M:0] R:[C:1 M: 2] isBoatLeft: false
Config: L:[C:1 M: 1] B:[C:1 M:0] R:[C:1 M: 2] isBoatLeft: true
Config: L:[C:1 M: 1] B:[C:1 M:1] R:[C:1 M: 1] isBoatLeft: false
Config: L:[C:1 M: 2] B:[C:1 M:0] R:[C:1 M: 1] isBoatLeft: true
Config: L:[C:1 M: 2] B:[C:2 M:0] R:[C:0 M: 1] isBoatLeft: false
Config: L:[C:2 M: 2] B:[C:1 M:0] R:[C:0 M: 1] isBoatLeft: true
Config: L:[C:2 M: 2] B:[C:1 M:1] R:[C:0 M: 0] isBoatLeft: false
Config: L:[C:3 M: 3] B:[C:0 M:0] R:[C:0 M: 0] isBoatLeft: true
