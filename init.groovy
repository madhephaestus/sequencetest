
MobileBase base=DeviceManager.getSpecificDevice( "JackSkellington",{
	//If the device does not exist, prompt for the connection

	MobileBase m = MobileBaseLoader.fromGit(
			"https://github.com/Halloween2022RodPuppet/RodPuppetKinematics.git",
			"rodpuppet.xml"
			)
	return m
})

MobileBase left=DeviceManager.getSpecificDevice( "JackSkellingtonLeftHand",{
	//If the device does not exist, prompt for the connection

	MobileBase m = MobileBaseLoader.fromGit(
			"https://github.com/Halloween2022RodPuppet/RodPuppetKinematics.git",
			"rodpuppet2.xml"
			)
	return m
})

MobileBase right=DeviceManager.getSpecificDevice( "JackSkellingtonRightHand",{
	//If the device does not exist, prompt for the connection

	MobileBase m = MobileBaseLoader.fromGit(
			"https://github.com/Halloween2022RodPuppet/RodPuppetKinematics.git",
			"rodpuppet3.xml"
			)
	return m
})

println "Initialize!"
