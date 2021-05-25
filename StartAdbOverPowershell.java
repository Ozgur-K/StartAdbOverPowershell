
class StartAdbOverPowershell
{
	public static void main(String[] args)
	{
		try
		{
			Runtime.getRuntime().exec("cmd.exe /c start powershell /c cmd");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}