[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=7184176&assignment_repo_type=AssignmentRepo)
# CSC 240 Computer Science III
## Homework 5 - Simulating Probability

[![Points badge](../../blob/badges/.github/badges/points.svg)](../../actions)

1. Implement the Simulation of the Birthday Problem (from the slides) to empirically find the minimum number of people needed to have more than a 50% chance for a pair of people to have the same birthday. Also determine the empirical probability of there being a pair of people with the same birthday in a group of 100 people. You may use the classes from the slides as a starting point.
2. Implement the Simulation of the Hatcheck Problem (from the slides) to empirically find the chance that no person gets their hat back for values of `n = {2,7,12,17,...,42,47}` and print a table with the results. You may use the classes from the slides as a starting point.
3. Modify the [autograding.json](.github/classroom/autograding.json) file to run and test the two above simulations. Use the second and third test group to compile and run your test programs.


Current contents of [autograding.json](.github/classroom/autograding.json)

```json
{
  "tests": [
    {
      "name": "Minimum points 50",
      "setup": "",
      "run": "echo mininum points 50",
      "input": "",
      "output": "",
      "comparison": "included",
      "timeout": 10,
      "points": 50
    },
    {
      "name": "Birthday Simulation",
      "setup": "echo change this string, possibly to: javac BirthdaySimulation.java",
      "run": "echo change this string, possibly to: java BirthdaySimulation",
      "input": "",
      "output": "change this to the output you expect when your BirthdaySimulation is correct",
      "comparison": "included",
      "timeout": 10,
      "points": 25
    },
    {
      "name": "Hatcheck Simulation",
      "setup": "echo change this string, possibly to: javac HatcheckSimulation.java",
      "run": "echo change this string, possibly to: java HatcheckSimulation",
      "input": "",
      "output": "change this to the output you expect when your HatcheckSimulation is correct",
      "comparison": "included",
      "timeout": 10,
      "points": 25
    }
  ]
}
```
