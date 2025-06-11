Last updated: June 10, 2025

This project follows a Main + Features + Fixes strategy to support clean development with test-driven design.

✅ Main Branches
Branch	Purpose
main	Stable, production-ready code
dev	(Optional) Integration branch for features before merging into main

✨ Feature Branches
Use this format for all new functionality:

php-template
Copy
Edit
feature/<feature-name>
Example Branch	Description
feature/maven-setup	Maven project structure setup
feature/employee-model	Employee class + sample data
feature/tdd-employee-service	TDD for employee services
feature/console-ui	Console interface with menu/input

🐛 Fix Branches
For bug fixes, use:

cpp
Copy
Edit
fix/<short-description>
Example Branch	Description
fix/maven-build-error	Fix build issues in Maven setup
fix/invalid-input-handler	Correct CLI input validation logic

🧪 Test Branches (Optional)
For isolated test-driven development:

arduino
Copy
Edit
test/<component-or-module>
Example Branch	Purpose
test/employee-service	TDD for service layer
test/console-handler	Unit tests for CLI logic

🔄 Lifecycle
Typical development flow:

bash
Copy
Edit
git checkout main
git pull
git checkout -b feature/<your-feature-name>
# Do your work
git add .
git commit -m "Add <your feature>"
git push -u origin feature/<your-feature-name>
# Open PR to merge into main
🧹 After Merge
Delete the feature branch if no longer needed:

bash
Copy
Edit
git branch -d feature/<your-feature-name>           # delete local
git push origin --delete feature/<your-feature-name> # delete remote
Happy coding! 💻

