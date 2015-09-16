#### Week 4 (Methods) Assignment
Two assignments ago we wrote a large conditional menu with 5 options. For this assignment you will take the body of each __case__ or __if__ and move it into a **Method** and then call that **Method** in its place. At the end you should have a unique function for each unique body in your menu.

Example
```
// if your menu option condition looked like this
if(option == 1){
  System.out.println("WOW great choice");
}

// You should rewrite it to call a method instead and move the logic that was // there into a function
if(option == 1){
  printGreatChoice();
}
```



**Hint** _You cannot nest a function definition inside a function definition so you will have to use the modifier **public static** on all of your methods_

You will submit this as a Pull Request to the repo WCCCEDU/CPT-163-27-F2015-Assignment-4-functions

##### Setup for Github
- Fork the repo to your personal account
- Clone your fork to your local computer
  - From Github Desktop
    - click the + on the top left
    - select clone then search for `CPT-163-27-F2015-Assignment-4-functions` use the one under the section with your github name
  - From Command Line
    - Copy the `https` link from your fork on github.com (its below the settings button on the right hand side of the page)
    - run `git clone <copied url>` (this will create a folder the same name as the repo in the directory you ran this command)
- Create a branch on your fork of the Assignment-2 Repo using the format <github-name>/<feature_description>
  - From Github Desktop
    - Click the `Add a Branch` button (It should be the button next to the dropdown that says `master`)
    - Make sure you create your branch from master
  - From Command Line
    - run `git checkout -b <branch_name>`
- In Netbeans create a new project and set the __Project Directory__ to the folder that was created when you cloned your fork.
- Write Code!
- Create a commit
  - From Github Desktop
    - Select your fork and fill-in the commit summary
    - Click `Sync`
  - From Command Line
    - run `git add .`
    - run `git commit -m "<your commit message>"`
    - run `git push origin <your_branch_name>`
- Go to Github.com and open your PR by clicking on `Compare and Open Pull Request`
