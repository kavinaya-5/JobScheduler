# Job Scheduler

## Overview
This is a simple Java-based backend job scheduling system that allows scheduling and executing jobs at specific times or intervals. The system supports hourly, daily, and weekly schedules.

When a job’s scheduled time occurs, it prints **\"Hello World\"** along with the current timestamp to the console.

---

## Features

- **Hourly scheduling:** Run job at a specific minute every hour.
- **Daily scheduling:** Run job at a specific hour and minute every day.
- **Weekly scheduling:** Run job on a specific day of the week, hour, and minute.
- Simple and easy to extend for more complex schedules.

---

## Project Structure

- \`Main.java\` – Entry point, accepts user input for scheduling parameters.
- \`Job.java\` – Represents a job with its schedule details.
- \`SchedulerService.java\` – Core logic to check the current time and execute jobs accordingly.

---

## How to Run

1. Compile the project:

   \`\`\`bash
   javac src/*.java
   \`\`\`

2. Run the program:

   \`\`\`bash
   java -cp src Main
   \`\`\`

3. Follow prompts to enter:

   - Schedule type (\`hourly\`, \`daily\`, or \`weekly\`)
   - Relevant time details (minute, hour, day)

4. The program runs indefinitely and prints “Hello World” when the schedule triggers.

---

## Sample Input / Output

\`\`\`
Enter schedule type (hourly / daily / weekly): daily
Enter hour (0-23): 14
Enter minute (0-59): 30

Scheduler started. Waiting to run job...

Hello World - 2025-06-04T14:30:00.123
\`\`\`

---

## Technologies Used

- Java (Core)
- Java Time API (\`java.time.LocalDateTime\`)

---

## Why This Project?

This project demonstrates basic backend scheduling concepts and Java programming skills. It is designed as a learning tool for job scheduling logic and can be extended to support real-world applications.

---

## Next Steps / Future Improvements

- Add support for monthly and yearly schedules.
- Persist jobs to a database.
- Add concurrency support for running multiple jobs.
- Implement logging to files.
- Create a simple web interface for scheduling.

---

## Author

Cutie  
2025
" > README.md
