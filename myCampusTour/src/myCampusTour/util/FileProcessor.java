package myCampusTour.util;
// import java.io.FileWriter;
// import java.io.BufferedWriter; 
// import java.io.File;
// import java.io.IOException;
// import java.io.PrintWriter;
enum School_building {
    bus_ride,
    on_foot
}

enum gift {
    Event_centre,
    University_Union
}

public class FileProcessor {

    // // School_building sb;
    // School_building sb=School_building.bus_ride;
    // switch(sb){
    //     case bus_ride:
    //         System.out.println("The option chosen in Bus_ride");
    //         break;
    //     case on_foot:
    //         System.out.println("The option chosen in Bus_ride");  
    //         break;    
    // }

    // gift gf = gift.Event_centre;
    // switch(gf) {
    //     case Event_centre:
    //         System.out.println("The option for gift is event_centre");
    //         break;
    //     case University_Union:
    //         System.out.println("The option for gift chosen is University_Union");
    //         break;
    // }

    // Cafeteria cf = Cafeteria.queue;switch(sb)
    // {
    //     Case queue;
    //     System.out.println("The option for choosing to stand in the queue");
    //     break;
    //     Case Mountain_view;
    //     System.out.println("The option for choosing online");
    //     break;
    // }

    // Lecture lec = Lecture.attend_inperson;switch(sb)
    // {
    //     Case attend_inperson;
    //     System.out.println("The option for attending CS542 lecture");
    //     break;
    //     Case video_lecture;
    //     System.out.println("The option for video streaming CS540 Lecture");
    //     break;
    // }
}


//  //Create ErrorLog File
//  public void CreateLogFile() {
        
//     try {
        
//       File myObj = new File("errorLog.txt");
//       if(!myObj.exists()){
      
//         myObj.createNewFile();
//         System.out.println("File created: " + myObj.getName());
//         WriteToFile();
        
//       }
//       else
//       {
//         WriteToFile();
//       }
//     } 
//     catch(IOException e)
//             {
//                 System.out.println("issue" +e);
//             }
//     }


//     public static void WriteToFile() {
//     try (FileWriter f = new FileWriter("errorLog.txt", false);
//     BufferedWriter b = new BufferedWriter(f);
//     PrintWriter p = new PrintWriter(b);) 
//     { 
//       p.println(" File doesn't exist"); 
//     } 
//      catch (IOException i) 
//      { i.printStackTrace(); }
//     }
//   }
  