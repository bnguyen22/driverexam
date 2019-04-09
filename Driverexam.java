	/**
 * 
 * @author Ben Nguyen
 *
 */
	public class Driverexam 
					{
				private char[] correctAnswers;
					public Driverexam(char[] c)
								{
							correctAnswers=c;
						}
						public int totalCorrect(char[] userAnswers)
									{
								int correct = 0;
								for(int i=0; i<correctAnswers.length; i++)
									{
										if (correctAnswers[i]== userAnswers[i])
											{
												correct+=1;
												}
  
											}
								return correct;
							}
								public int totalwrong(char[] userAnswers)
									{
										return correctAnswers.length- totalCorrect(userAnswers);
										}
									public boolean pass(char[] userAnswers)
										{
											return  (totalCorrect(userAnswers)/correctAnswers.length>=0.75);
												}
										public int[] qustionsWrong(char[] userAnswers)
												{
												int[] incorrect= new int[totalwrong(userAnswers)];
													int index= 0;
														for (int i= 0; i<correctAnswers.length; i++)
																{
																if (correctAnswers[i] != userAnswers[i])
																		{
																		incorrect[index]= i+1;
																		index++;
																			}
																	}
														return incorrect;
													}
												}



