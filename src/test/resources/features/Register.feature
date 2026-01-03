Feature: Create supporter account

  As a new user
  I want to register an account
  So that I can show my support

  Background:
    Given i am on the website


  Scenario: account creates succsessfully
    When i enter date "02/02/2000"
    And i enter first name "Philip"
    And i enter last name "Arvidsson"
    And i enter mail "philip.guearv@gmail.com"
    And i confirm mail "philip.guearv@gmail.com"
    And i enter pass "Lösenord1"
    And i confirm pass "Lösenord1"
    And i accept tos
    And i accept that im above 18 years
    And i accept the ethics
    And i press register button
    Then registration passed
    

  Scenario: last name missing
    When i enter date "02/02/2000"
    And i enter first name "Philip"
    And i enter mail "philip.guearv@gmail.com"
    And i confirm mail "philip.guearv@gmail.com"
    And i enter pass "Lösenord1"
    And i confirm pass "Lösenord1"
    And i accept tos
    And i accept that im above 18 years
    And i accept the ethics
    And i press register button
    Then account isnt created



  Scenario: Password missmatch
    When i enter date "02/02/2000"
    And i enter first name "Philip"
    And i enter last name "Arvidsson"
    And i enter mail "philip.guearv@gmail.com"
    And i confirm mail "philip.guearv@gmail.com"
    And i enter pass "Lösenord1"
    And i confirm pass "Lösenord2"
    And i accept tos
    And i accept that im above 18 years
    And i accept the ethics
    And i press register button
    Then account isnt created



  Scenario: tos not accepted
    When i enter date "02/02/2000"
    And i enter first name "Philip"
    And i enter last name "Arvidsson"
    And i enter mail "philip.guearv@gmail.com"
    And i confirm mail "philip.guearv@gmail.com"
    And i enter pass "Lösenord1"
    And i confirm pass "Lösenord1"
    And i accept that im above 18 years
    And i accept the ethics
    And i press register button
    Then account isnt created

