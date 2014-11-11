<!DOCTYPE HTML>

<html>
<head>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
	
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	
	<style type="text/css">
      html, body, #map-canvas { height: 100%; margin: 0; padding: 0;}
    </style>
    <script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?">
    </script>
    <script type="text/javascript">
      function initialize() {
        var mapOptions = {
          center: { lat: 40.9253725, lng: -74.2765441},
          zoom: 8
        };
        var map = new google.maps.Map(document.getElementById('map-canvas'),
            mapOptions);
      }
      
      function codeAddress() {
    	  var zip = document.getElementById('zip').value;
    	  geocoder.geocode( { 'zip': zip}, function(results, status) {
    	    if (status == google.maps.GeocoderStatus.OK) {
    	      map.setCenter(results[0].geometry.location);
    	      var marker = new google.maps.Marker({
    	          map: map,
    	          position: results[0].geometry.location
    	      });
    	    } else {
    	      alert('Geocode was not successful for the following reason: ' + status);
    	    }
    	  });
    	}
      google.maps.event.addDomListener(window, 'load', initialize);
      
    </script>
</head>

<body>

<div class="row">
	<form role="form">
	  	<div class="col-md-6">
	  		<div class="form-group">
			  <label for="exampleInputEmail1">Name</label>
			  <input type="name" class="form-control" id="exampleInputEmail1" placeholder="Enter name">
			</div>
			<div class="form-group">
			  <label for="exampleInputEmail1">Address</label>
			  <input type="address" class="form-control" id="exampleInputEmail1" placeholder="Enter address">
			</div>
			<div class="form-group">
			  <label for="exampleInputEmail1">City</label>
			  <input type="city" class="form-control" id="exampleInputEmail1" placeholder="Enter city">
			</div>
			<div class="form-group">
			  <label for="exampleInputEmail1">State</label>
			  <input type="state" class="form-control" id="exampleInputEmail1" placeholder="Enter state">
			</div>
			<div class="form-group">
			  <label for="exampleInputEmail1">Zip</label>
			  <input type="zip" class="form-control" id="exampleInputEmail1" placeholder="Enter zip">
			</div>
			<div class="form-group">
			  <label for="exampleInputEmail1">Contact Name</label>
			  <input type="contactName" class="form-control" id="exampleInputEmail1" placeholder="Contact Name">
			</div>
			<div class="form-group">
			  <label for="exampleInputEmail1">Contact Phone</label>
			  <input type="contactPhone" class="form-control" id="exampleInputEmail1" placeholder="Contact Phone">
			</div>
		</div>
	  	<div class="col-md-6">
			<div class="form-group">
			  <label for="exampleInputEmail1">Location</label>
			  <input type="location" class="form-control" id="exampleInputEmail1" placeholder="Location">
			</div>
			<div class="form-group">
			  <label for="exampleInputEmail1">IP Address</label>
			  <input type="ipAddress" class="form-control" id="exampleInputEmail1" placeholder="127.0.0.1">
			</div>
			<div class="form-group">
			  <label for="exampleInputEmail1">Longitude</label>
			  <input type="longitude" class="form-control" id="exampleInputEmail1" placeholder="Longitude">
			</div>
			<div class="form-group">
			  <label for="exampleInputEmail1">Latitude</label>
			  <input type="latitude" class="form-control" id="exampleInputEmail1" placeholder="Latitude">
			</div>
			
			<input class="btn btn-default" type="submit" value="Submit">
			
			
		</div>
	</form>
	
</div>
<div id="map-canvas"></div>
	


		
</body>
</html>