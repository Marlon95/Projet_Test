#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Tp Test

  @tag2
  Scenario Outline: Rentrer dans un bar
    Given Il y a <personnes> sur <capacite> dans le bar
    When <entrant> sont arrives
    Then le bar est complet : <resultat> 

    Examples: 
      | personnes  | capacite | entrant  | resultat |
      | 9          |     10   |  2       | "false"  |
      | 8          |     10   |  2       | "true"   |
