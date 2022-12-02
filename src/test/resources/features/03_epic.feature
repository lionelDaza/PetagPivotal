Feature: Epic

  Background:
    When The user click on new project button
    And Introduce a new project name PrivateProject
    And Choose a the account Ptag
    And Choose the type as private
    And click on create project button
    Then A new project PrivateProject should be created

  @LoginSuccessfully
  @deleteAllProjects
  @goToWelcomePage
  Scenario: Create Epic
    When I click on Epics option
    And I click on a new epic button
    And I introduce the Epic name EpicPetag
    And I click on save epic button
    Then The EpicPetag should be displayed
