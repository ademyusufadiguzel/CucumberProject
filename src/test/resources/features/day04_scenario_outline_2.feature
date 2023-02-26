# - When user go to
# - https://editor.datatables.net/
# - Click on the new button
# - When user enters all fields
# - When clicks create button
# - And search for the first name
# - Then verify the name fields contains first name
# - NOTE: Try getting the test data in different forms:
# - 1. Scenario outline
# - 2. Data tables
# - 3. Excel

@personel_olusturma
Feature: personal_olusturma

  Scenario Outline: TC01_personel_olustur
    Given kullanici "https://editor.datatables.net/" gider
    When kullanici new butonuna tiklar
    And kullanici first name "<firstname>" girer
    And kullanici last name "<lastname>" girer
    And kullanici positions "<positions>" girer
    And kullanici office "<office>" girer
    And kullanici extension "<extension>" girer
    And kullanici start_date "<start_date>" girer
    And kullanici salary "<salary>" girer
    And kullanici create butonuna basar

    Examples: personel_bilgileri
      | firstname | lastname | positions | office   | extension | start_date | salary |
      | john      | walker   | SDET      | ISTANBUL | 3548      | 2023-03-01 | 100000 |


