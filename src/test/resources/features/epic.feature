Feature: Epic

  Background:
    When The user click on new project button
    And Introduce a new project name PublicProject
    And Choose a the account Ptag
    And Choose the type as private
    And click on create project button
    Then A new project PublicProject should be created

  @LoginSuccessfully
  @deleteAllProjects
  Scenario: Create Epic
    When I click on Epics option
