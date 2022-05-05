
<?php

$file = file ("nmapTest.xml");

$servername = "XML";
$username ="Jack";
$password = "password";

preg_match()


 = new mysql($servername, $username, $password, $db);

if ($conn->connect_error){
	die("Connection failed: ". $conn->connect_error);
}


$sql = "select * from log";
$results = $conn->query($sql);


$ip;
$mac;
$vendor;
$hostname;
$port;
$portArray = array();
$portList;
$timestamp;



foreach($file as $line){
    
    //get ports
    if (strpos($line,'portid="')==True){
        // preg match is the command that finds the patterns in the xml file
       // preg_match(' /portid=".*><state/',&line,$results);
        $port = implode(" ",$results);
        $port = ltrim($port,'portid="');
        $port =rtrim($port, '"><state');
        print "port: $port<br>";
        array_push($portArray, $port);
    }
      
    }
//}
