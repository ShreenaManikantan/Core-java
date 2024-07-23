class SpotifyRunner{
	
	public static void main(String[]music){
		
		
		boolean isSpotifyCreated = Spotify.createSpotifyAccount("sana",null,"9762933401","kliop","03/06/2000");
		if(isSpotifyCreated == true)
		Spotify.readSpotifyAccount();
		
	}

}