from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.03.90/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[7]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[8]/a').click()
driver.find_element(By.XPATH, '//*[@id="ddlink13"]').click()
driver.find_element(By.XPATH, '//*[@id="menu-13"]/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="ddlink13"]').click()
driver.find_element(By.XPATH, '//*[@id="menu-13"]/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="ddlink13"]').click()
driver.find_element(By.XPATH, '//*[@id="menu-13"]/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="ddlink13"]').click()
driver.find_element(By.XPATH, '//*[@id="menu-13"]/li[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="ddlink13"]').click()
driver.find_element(By.XPATH, '//*[@id="menu-13"]/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="ddlink13"]').click()
driver.find_element(By.XPATH, '//*[@id="menu-13"]/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="ddlink13"]').click()
driver.find_element(By.XPATH, '//*[@id="menu-13"]/li[7]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[10]/a').click()
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[3]/a').click()
# sleep(1)
driver.find_element(By.XPATH, '(//a[contains(text(),"Logout")])[2]').click()
driver.close()
driver.quit()