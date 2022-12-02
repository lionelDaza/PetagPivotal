Feature: Story

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
  Scenario: Verify that it is possible to add user stories in the Icebox of a project
    When I click on Icebox option
    And I click on a new story button
    And I introduce the story name storyPetag
    And I introduce the story description Story Petag Story Description
    And I click on save story button
    Then A new story named storyPetag should be displayed

  @LoginSuccessfully
  @deleteAllProjects
  @goToWelcomePage
  Scenario:Verify that it is possible to move user stories from Icebox to Current Iteration/Backlog
    When I click on Icebox option
    And I click on a new story button
    And I introduce the story name storyPetagToBacklog
    And I introduce the story description Story Petag Story Description
    And I click on save story button
    And A new story named storyPetagToBacklog should be displayed
    And In IceBox I set 2 points for the story
    And In Icebox I click on start story
    And I click on Current/backlog option
    Then In Backlog the Story: storyPetagToBacklog should be displayed

