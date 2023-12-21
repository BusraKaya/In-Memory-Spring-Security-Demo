**This demo project is a simple inmemory security application example in my Spring Security learning adventure.
**When sending requests to APIs, it is important to observe in which cases we get the 401 Unauthorized error and in which cases we get the 403 Forbidden error.

"In-memory authentication" refers to a method of authentication where user credentials, such as usernames and passwords, are stored in memory (RAM) during the runtime of an application. In this approach, the authentication information is typically hard-coded or configured within the application code or configuration, rather than being stored in an external database.

This method is commonly used for development and testing purposes, providing a simple and quick way to set up authentication for applications without the need for a full-fledged database. It is often used in scenarios where the focus is on rapid prototyping, quick setup, and ease of testing.

Here is a conceptual overview of how in-memory authentication might work:

Configuration: User credentials (usernames, passwords, roles) are configured within the application code or configuration files.

Authentication: When a user attempts to authenticate, the application checks the provided credentials against the in-memory data.

Authorization: If the authentication is successful, the application may also check the user's roles or permissions stored in memory to determine what actions or resources the user is allowed to access.

While in-memory authentication is useful for development and testing, it is generally not recommended for production environments due to security concerns. Hard-coding sensitive information within the application code or configuration files can expose the credentials to unauthorized access, and it lacks the security features and scalability that database-backed authentication systems provide.
