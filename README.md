[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- Project Logo -->

<br>
<div align = "center">
    <a href="#">
        <img src="images/logo.png" alt="Logo" width="80" height="80">
    </a>
</div>
<h3 align="center">Custom Expandable Array</h3>

## About The Project

Through my journey in learning Java something I learnt is that Java's inbuilt Array method doesn't 
allow to expand the array after the array exceeds the initialized limit. This is something i found interesting Java as someone who started to learn programing
with python, even though there are solutions to such these such as LinkedLists in Java itself I tried to create my own custom array object that could expand itself (for fun of course and educational purposes😊).

### Features
 * Only supports String type values
 * Can be expanded as user wishes.
 * Custom methods to:
   * Print each element inside the array
   * Convert to string (to be able to print the list)
   * Get value by index
 
### How I approached this...

This expandable array class is built on top of the built-in array class in Java

1. Initialized an array object with a set size of 1 and a variable to use for when initialising a new list
2. Checked if the list is larger than the values trying to be added
   - If it is not the value will be appended
   - If it is larger, 
     - the variable used to set the size of the list is increased 
     - then a new list is initialised with the size being the variable mentioned above
     - the old list is copied to the new list and the new value is the appended to the list
     - The variable pointer of the new list is changed to the old variable causing the old list to be garbage collected and disregarded.


This custom array has built in methods to check the length of the array, to loop through the objects in the array and get the objects inside the array by the index

















[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/eran-perera-112a8a219/