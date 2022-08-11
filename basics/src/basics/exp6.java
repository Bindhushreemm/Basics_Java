class exp6
{
	public static void main(String args[])
	{
		int age=21;
		int ht=165;
		int wt=55;

		if(age >= 18 && age <= 25)
		{
			if(ht >= 170)
			{
				if(wt >= 50 && wt <= 60)
					System.out.println("Eligible for INDIAN ARMY");
				else
					System.out.println("Minimum required weight is 50kgs yours "+wt+"kgs");
			}
			else
				System.out.println("Minimum required height is 170cms yours "+ht+"cms");
		}
		else
			System.out.println("Minimum required age is 18yrs");
	}
}
