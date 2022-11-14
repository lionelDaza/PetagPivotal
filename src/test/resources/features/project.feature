Feature: Project
  @deleteAllProjects
  @LoginSuccessfully
  @goToHomePage
  Scenario: Create private Project
    When The user click on new project button
    And Introduce a new project name PrivateProject
    And Choose a the account Ptag
    And Choose the type as private
    And click on create project button
    Then A new project PrivateProject should be created

  @deleteAllProjects
  @goToHomePage
  Scenario: Create public Project
    When The user click on new project button
    And Introduce a new project name PublicProject
    And Choose a the account Ptag
    And Choose the type as public
    And click on create project button
    Then A new project PublicProject should be created

