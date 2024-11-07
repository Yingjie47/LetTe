from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/mrbs-1.11.4/")
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form/input[4]').click()
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="password"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="logon"]/fieldset[2]/div/input').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[1]/a[3]').click()

# Update the xpath for uploading the file to match the new version
driver.find_element(By.XPATH, '//*[@id="upload_file"]').send_keys(r"D:\MineResearch\datasets\mineDatasets\mrbs\test\booking.ics")

# Update the xpath and interaction for selecting default room and ignoring location
driver.find_element(By.XPATH, '//*[@id="import_default_room"]').click()
driver.find_element(By.XPATH, '//*[@id="ignore_location"]').click()

# Update the xpath for clicking on the Import button
driver.find_element(By.XPATH, '//*[@id="import"]').click()

# sleep(1)
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form[2]/input[6]').click()
driver.close()
driver.quit()

# this functionality doesn't work...
