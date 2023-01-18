Feature: Project

  @deleteAllProjects
  @LoginSuccessfully
  @goToHomePage
  Scenario Outline: Verify that it is possible to create a Private and Public project
    When The user click on new project button
    And Introduce a new project name <ProjectName>
    And Choose a the account Ptag
    And Choose the type as <Type>
    And click on create project button
    Then A new project <ProjectName> should be created
    Examples:
      |ProjectName    | Type    |
      |PrivateProject | private |
      |PublicProject  | public  |




