from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/mrbs-1.11.1/")
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form/input[4]').click()
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="password"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="logon"]/fieldset[2]/div/input').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[1]/a[1]').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[1]/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[1]/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[2]/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[2]/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[2]/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[2]/li[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[2]/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[2]/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[3]/li/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[4]/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="site_faq_contents"]/ul[4]/li[2]/a').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form[2]/input[6]').click()
driver.close()
driver.quit()