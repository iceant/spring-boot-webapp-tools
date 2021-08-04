@echo off
set REPOSITORY_PATH=%userprofile%\.m2\repository
@echo SEARCHING...
for /f "delims=" %%i in ('dir /b /s "%REPOSITORY_PATH%\*lastUpdated*"') do (
    del /s /q %%i
)
@echo DONE
pause