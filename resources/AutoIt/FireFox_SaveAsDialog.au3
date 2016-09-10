# Read Command-Line Parameters
$cmd = UBound($CmdLine) - 1
ConsoleWrite('> = Blue' & @CRLF) ; > = blue text color

If $CmdLine[0] = 0 Then
   WinWait("Enter name of file to save to…","",10)
   If WinExists("Enter name of file to save to…") Then
	  MsgBox (0,"Info","Dialog is found")
	  WinActivate("Enter name of file to save to…")
	  Send("C:\Users\MyData\variant.a2l{TAB}{TAB}{ENTER}")
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
