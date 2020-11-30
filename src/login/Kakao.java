package login;

public class Kakao implements OAuth{
	private String provider;
	private String id;
	private String pass;
	private String name;
	
	public Kakao() {
		this("kakao","ssar@nate.com","123","±úºÀ");
	}

	public Kakao(String provider, String id, String pass, String name) {
		this.provider = provider;
		this.id = id;
		this.pass = pass;
		this.name = name;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String oauthProvider() {
		return provider;
	}

	@Override
	public String oauthId() {
		return id;
	}

	@Override
	public String oauthPassword() {
		return pass;
	}

	@Override
	public String oauthNick() {
		return name;
	}
	
	
}
