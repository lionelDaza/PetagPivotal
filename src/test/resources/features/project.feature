Feature: Project
#  @deleteAllProjects
#  @LoginSuccessfully
#  @goToHomePage
#  Scenario: Create private Project
#    When The user click on new project button
#    And Introduce a new project name PrivateProject
#    And Choose a the account Ptag
#    And Choose the type as private
#    And click on create project button
#    Then A new project PrivateProject should be created
#
#  @LoginSuccessfully
#  @deleteAllProjects
#  @goToHomePage
#  Scenario: Create public Project
#    When The user click on new project button
#    And Introduce a new project name PublicProject
#    And Choose a the account Ptag
#    And Choose the type as public
#    And click on create project button
#    Then A new project PublicProject should be created

  @deleteAllProjects
  @LoginSuccessfully
  @goToHomePage
  Scenario Outline: Create Project
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




