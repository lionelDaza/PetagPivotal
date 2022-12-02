Feature: Backlog

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
  Scenario: Verify that it is possible to add user stories in the Current of a project
    When I click on Current/backlog option
    And I click on a new story button in Backlog
    And I introduce the story in Backlog named BacklogStoryPetag
    And I introduce the story in Backlog description Petag Story Description in Backlog
    And I click on save story button in Backlog
    Then A new story in Backlog named BacklogStoryPetag should be displayed

  @LoginSuccessfully
  @deleteAllProjects
  @goToWelcomePage
  Scenario: Verify that the user stories that are being worked on are displayed in My Work
    When I click on Current/backlog option
    And I click on a new story button in Backlog
    And I introduce the story in Backlog named BacklogStoryPetag
    And I introduce the story in Backlog description Petag Story Description in Backlog
    And I click on save story button in Backlog
    And I set 2 points for the story
    And I click on start story
    And I click on My work option
    Then Story BacklogStoryPetag should be displayed in My work
