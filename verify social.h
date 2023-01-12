#include <iostream>
#include <chrono>

using namespace std;
	class Program{
	private:
	long accountNumber;
	int duration;
	int loginAttempts;
	int ssn;
	public:
		void setaAccountNumber(long accNum){
		if(accNum < 10){
		std::cout << "Account number must be 10 digits";
	
}else{
accountNumber=accNum;
	
}
	
}
		void setaDuration(int dur){duration = dur;}
		
		void setaLoginAttempts(int logAtt){loginAttempts=logAtt;}
		void setaUserSocial(int social){
if(social < 9 || social > 9){std::cout << "A social security number must be 9 digits long";}else{ssn=social;}}

		long getAccountNumber(){return accountNumber;}
		int returnDurarion(){return duration;}
		int returnLoginAttempts(){return loginAttempts;}
		int returnSocialNumber(){return ssn;}
	};
int main() {
	Program progObj;
	progObj.setaAccountNumber(3933333403);
	progObj.setaUserSocial(293748283);
	std::cout
	
}