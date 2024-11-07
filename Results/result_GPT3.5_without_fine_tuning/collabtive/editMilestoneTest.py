from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/collabtive-3.1/")
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="pass"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[3]').click()
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[4]/button').click()
sleep(1)
driver.find_element(By.XPATH, '/html/body/div[1]/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/a').click()
driver.find_element(By.XPATH, '//*[@id="contentwrapper"]/div[1]/ul/li[2]/a').click()
sleep(1)
# Update the XPath to click on the first milestone for editing
driver.find_element(By.XPATH, '/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[5]/div[2]/div/table/tbody/tr[1]/td[6]/a[1]').click()
sleep(1)
driver.switch_to.frame(driver.find_element(By.XPATH, '//*[@id="desc_ifr"]'))
# Clear the description field before entering the new description
description_field = driver.find_element(By.XPATH, '/html/body')
description_field.clear()
description_field.send_keys('123')
driver.switch_to.default_content()
driver.find_element(By.XPATH, '//*[@id="changeallduedates"]').click()
driver.find_element(By.XPATH, '//*[@id="content-left-in"]/div/div[2]/form/fieldset/div[9]/button').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="mainmenue"]/li[4]/a').click()
driver.close()
driver.quit()