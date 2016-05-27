# Read Command-Line Parameters
$cmd = UBound($CmdLine) - 1
ConsoleWrite('> = Blue' & @CRLF) ; > = blue text color

If $CmdLine[0] = 0 Then
   WinWait("[REGEXPTITLE:(?i).*?Opening.*?]","",10)
   If WinExists("[REGEXPTITLE:(?i).*?Opening.*?]") Then
	  WinActivate("[REGEXPTITLE:(?i).*?Opening.*?]")
	  Send("{DOWN}")
	  Sleep(5000)
	  Send("{ENTER}")
   EndIf
Else
   ReadCmdLineParams()
EndIf

Func ReadCmdLineParams()
    For $i = 1 To $cmd
	  ConsoleWrite ($CmdLine[$i])
	  MsgBox(0,$CmdLine[$i])
    Next
EndFunc   ;==>ReadCmdLineParams