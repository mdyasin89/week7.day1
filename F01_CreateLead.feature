Feature: Leaftaps login functionality

//Background: 
//Given Enter the username as 'DemoSalesManager'
//And Enter the password as 'crmsfa'
//When click on Login button as className 'decorativeSubmit'
//Then Home Page should be displayed
//When click on 'CRM/SFA' link

Scenario:   Create Lead to the TestLeaf application

When click on 'Create Lead' button
Then 'Create Lead' page should be displayed
Given Enter 'createLeadForm_companyName'
And   Enter 'createLeadForm_firstName'
And   Enter 'createLeadForm_lastName'
And   Enter 'createLeadForm_primaryPhoneNumber'
When  click on Login button as className 'submitButton'

