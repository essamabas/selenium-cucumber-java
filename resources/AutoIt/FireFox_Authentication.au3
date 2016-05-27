# Read Command-Line Parameters
$cmd = UBound($CmdLine) - 1
ConsoleWrite('> = Blue' & @CRLF) ; > = blue text color

If $CmdLine[0] = 0 Then
   WinWait("Authentication Required","",10)
   If WinExists("Authentication Required") Then
	  WinActivate("Authentication Required")
	  Send("essam.abas{TAB}{SHIFTDOWN}Q{SHIFTUP}egabbe121{TAB}{ENTER}")
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
