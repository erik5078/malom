<?php
	header('Content-Type: text/html; charset=utf-8');
	include("connect.php");
	$sql = "select * from bugreport;";
	$eredmeny = mysql_query($sql);
	$db = mysql_num_rows($eredmeny);
	$i = 0;
	
	while ($sor = mysql_fetch_array($eredmeny))
	{
		$sorok[$i] = $sor;
		$i++;
	}
	
	mysql_close($kapcsolat);
?>
<html>
<head>
	<title>Admin</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
</head>
<body>
	<table style="width:100%;">
		<tr>
			<td style="width:20%;">
				Email cím
			</td>
			
			<td style="width:20%;">
				Hiba típusa
			</td>
			
			<td style="width:20%;">
				Hiba Fontossága
			</td>
			
			<td style="width:20%;">
				Részletek
			</td>
			
			<td style="width:20%;">
				Kész
			</td>
		</tr>
		
		<?php
			for ($i = 0; $i < $db; $i++)
			{
		?>
		<tr>
			<td style="width:20%;">
				<?php echo $sorok[$i]["email"]; ?>
			</td>
			
			<td style="width:20%;">
				<?php
					if ($sorok[$i]["tipus"] == 0)
					{
						echo "Megjelenítés";
					}
					else
					{
						echo "Működés";
					}
				?>
			</td>
			
			<td style="width:20%;">
				<?php
					if ($sorok[$i]["fontossag"] == 0)
					{
						echo "Kis hiba";
					}
					else if ($sorok[$i]["fontossag"] == 1)
					{
						echo "Átlagos";
					}
					else
					{
						echo "Súlyos hiba";
					}
				?>
			</td>
			
			<td style="width:20%;">
				<?php echo $sorok[$i]["reszletek"] ?>
			</td>
			
			<td style="width:20%;">
				<?php
					if ($sorok[$i]["kesz"] == 0)
					{
						echo "nincs kész <a href='kesz.php?id=".$sorok[$i]["id"]."'>Javítva</a>";
					}
					else
					{
						echo "Kész";
					}
				?>
			</td>
		</tr>
		
		<?php
			}
		?>
	</table>
</body>
</html>