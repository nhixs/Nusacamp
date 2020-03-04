<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
	<?php
	
	class pekerjaan{
		public function kerjaan(){
		echo "Work address: Surabaya <br>";
		echo "Company: PT. Aneka Usaha <br>";
		echo "Company address: Surabaya <br>";
		echo "Posisition: CEO <br>";
		echo "NPWP: 7127312034000 <br>";
		}
	}
	class profile extends pekerjaan{
		use caleg;
	public function profil(){
	echo "Nama: Mansyur <br>";
	echo "HP: 0821238373 <br>";
	echo "Gender: Laki-Laki <br>";
	echo "Alamat: Jakarta <br>";
	}
}
	trait caleg {
		public function caleg(){
			echo "Partai: Nusa Bangsa <br>";
			echo "No. Urut: 4 <br>";
			echo "Dapil: jakarta <br>";
			echo "Keluarga <br>";
			echo "Istri: Martinah <br>";
			echo "Anak 1: Louis<br>";
			echo "Anak 2: Michael <br>";
			echo "Anak 3: Jordan <br>";
		}
	}
	
	$test = new profile();
	$test -> profil();
	$test -> kerjaan();
	$test -> caleg();
	?>
</body>
</html>