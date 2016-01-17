<?php
	header('Content-Type: text/html; charset=utf-8');
?>
<html>
<head>
	<title>Bug report</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
</head>
<body>
	<form action="feldolgoz.php" method="POST">
	<table>
		<tr>
			<td style="width:50%;">
				Email cím:
			</td>
			
			<td style="width:50%;">
				<input type="text" name="email" value="" />
			</td>
		</tr>
		
		<tr>
			<td style="width:50%;">
				Hiba tipusa:
			</td>
			
			<td style="width:50%;">
				<select name="tipus">
					<option value="0">Megjelenítés</option>
					<option value="1">Működés</option>
				</select>
			</td>
		</tr>
		
		<tr>
			<td style="width:50%;">
				Hiba fontossága:
			</td>
			
			<td style="width:50%;">
				<select name="fontossag">
					<option value="0">Kis hiba</option>
					<option value="1">Átlagos</option>
					<option value="2">Súlyos hiba</option>
				</select>
			</td>
		</tr>
		
		<tr>
			<td style="width:50%;">
				Részletek:
			</td>
			
			<td style="width:50%;">
				<textarea name="reszletek" cols="50" rows="5"></textarea>
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" value="mentés" style="width:200px;" />
			</td>
		</tr>
	</table>
	</form>
</body>
</html>