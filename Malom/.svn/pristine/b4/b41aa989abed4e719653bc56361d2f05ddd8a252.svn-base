<?php
	header('Content-Type: text/html; charset=utf-8');
	include("connect.php");
	
	$id = $_GET["id"];
	
	$sql = "update bugreport set kesz=1 where id=$id;";
	mysql_query($sql);
	mysql_close($kapcsolat);
	header("location: admin.php");
	exit;
?>
