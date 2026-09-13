# assignment1-builder-pattern

Components:
- Course - the product being created
- CourseBuilder - an interface that declares the construction steps
- OfflineCourseBuilder & OnlineCourseBuilder - build the products
- Director - knows construction recipe
- Main - a client that asks for course

## What the product is?
- The product is Course. A university course that contains shared fields (name, instructor, course type, credits and schedule) and representation related fields. An offline course has classroom number and computer availability, while online course has platform, link to the platform and recording availability.

## How to build each representation?
- For Offline representation, first set shared fields with name(), instructor(), courseType(), credits(), schedule(), and then set field related to offline representation that are roomNumber() and computersAvailable(). End with build().
- For Online representation, first set shared fields with name(), instructor(), courseType(), credits(), schedule(), and then set field related to online representation that are platform(), platformLink() and recordingAvailable(). End with build().
- The Director provides four recipes that are createAMCS(builder), createSDP(builder) for offline courses, and createWEB(builder), createOS(builder) for online courses.

## How to run it?
- Open the terminal and use cd command to navigate to exact folder
  ```bash
  cd path/to/your/folder
  ```

- Compile the code and run the program
  ```bash
  javac Main.java
  java Main
  ```
