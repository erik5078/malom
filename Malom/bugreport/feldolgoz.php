<?php
	header('Content-Type: text/html; charset=utf-8');
	include("connect.php");
	
	$email = $_POST["email"];
	$tipus = $_POST["tipus"];
	$fontossag = $_POST["fontossag"];
	$reszletek = $_POST["reszletek"];
	
	$sql = "insert into bugreport (email, tipus, fontossag, reszletek, kesz) values ('$email', $tipus, $fontossag, '$reszletek', 0);";
	mysql_query($sql);
	mysql_close($kapcsolat);
	print $sql;
	//header("location: feldolgozva.php");
	exit;
?>
