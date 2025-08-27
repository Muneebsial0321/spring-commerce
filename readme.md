# Java Productivity Generator Tool 🚀

This is a simple **Java productivity tool** designed to help you **generate boilerplate Java files quickly** for your monolith projects.  
With this tool, you can scaffold:

- Controller
- Service
- Repository
- Entity

automatically using a **Plop.js CLI**, so you can focus more on **business logic** instead of writing repetitive code.

---

## How It Works

1. Make sure you have **Node.js** installed.
2. Install Plop globally (optional but recommended):
   \`\`\`bash
   npm install -g plop
   \`\`\`
3. Navigate to your Java project root and place the generator files:
   - \`plopfile.js\`
   - \`plop-templates/\`
4. Run the generator:
   \`\`\`bash
   plop module
   \`\`\`
   You will be prompted to enter the **module name** (e.g., \`auth\`, \`user\`, \`order\`).

5. **Base Directory**: The generator will place files inside your Java project under the **base directory** you specify (e.g., \`src/main/java/com/example\`).

---

## Features

- Generates **Controller, Service, Repository, and Entity** files automatically
- Includes **CRUD boilerplate** using JPA/Hibernate
- All endpoints follow the convention \`GET /s/{id}\` for single records
- Entities come with **createdAt** and **updatedAt** timestamps
- Optional **Lombok support** to reduce boilerplate
- Supports **field injection** with \`@Autowired\` or constructor injection

---

## Happy Coding! 🎉

Just enter your **base directory** for your project, and this tool will generate files fastly and efficiently.  
No more repetitive coding — focus on writing amazing business logic!
