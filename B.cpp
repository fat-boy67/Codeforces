#include <bits/stdc++.h>
using namespace std;

int arr[10000];

int main()
{
	bool ans=true;
	int n;
	cin>>n;

	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	char line[n][101];

	int count[n]={0};

	for(int i=0;i<=n;i++)
	{
		fgets (line[i], 100, stdin);
	}

	for(int i=0;i<n;i++)
	{
		
		char temp;
		for(int j=0;line[i+1][j]!='\0';++j)
		{
			temp=line[i+1][j];
			if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='y')
				count[i]++;
			
		}
	}
	for(int i=0;i<n;i++)
	{
		if(count[i] != arr[i])
		{
			ans=false;
				
		}
		
	}
		

	if(ans==true)
		cout<<"YES";
	else
		cout<<"NO";

	return 1;
}