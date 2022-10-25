
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
try{
BowlerStudioController.setCsg(MobileBaseCadManager.get(base).getAllCad())
BowlerStudioController.addObject(MobileBaseCadManager.get(left).getAllCad(), null)
BowlerStudioController.addObject(MobileBaseCadManager.get(right).getAllCad(), null)


}catch(Throwable t){}
println "Initialize!"
