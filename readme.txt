Online Contact Management System:

Tech Stack: Maven, Spring

Each User in the contact list has 4 attributed
	* User ID(auto generated)
	* Name
	* Phone Number
	* Email

4 API endpoints have been created
 
    POST: /api/v1/users – add users
    GET: /api/v1/users/{id} – get details about a user
    PUT: /api/v1/users/{id} – update a user
    DELETE: /api/v1/users/{id} – delete a user
 CRUD operations have been implemented via the above mentioned APIs

sl4j has been used to log the info when new contact is created or modified.

h2 database has been used to store the contact information on which the above operations are being perfomed.


