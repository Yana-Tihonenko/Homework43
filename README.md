
# Task 1
Create an abstract class "House". Take an address as a constructor argument.

Write a setter and getter for the address.

Create the classes "Private House" and "Apartment House" - successors of the class "House".

When creating an apartment building, additionally take an integer - the number of entrances - in the constructor.

In the toString() method output all known information about the house in a convenient form.

In the main file of the program create a list of houses, in which you put two private houses and one apartment building.

Output the information about the houses in the list using the for-each loop.

# Task 2
Add a virtual method "demolish" to the "House" class.

Rewrite this method in "Private house" and "Apartment house":

for a private house, output "You have demolished a private house";
for an apartment building, display "You have demolished an apartment building. %d entrances!". Instead of %d, the number of entrances should be the number of entrances.
