from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/mantisbt-2.24.3/")
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("administrator")
driver.find_element(By.XPATH, '//*[@id="login-form"]/fieldset/input[2]').click()
driver.find_element(By.XPATH, '//*[@id="password"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="login-form"]/fieldset/input[3]').click()
# sleep(1)
driver.find_element(By.LINK_TEXT, '查看问题').click()
driver.find_element(By.XPATH, '//*[@id="buglist"]/tbody/tr/td[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-container"]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tfoot/tr/td/div/div[6]/form/fieldset/input[3]').click()
driver.find_element(By.XPATH, '//*[@id="report_bug_form"]/div/div[2]/div[1]/div/table/tbody/tr[17]/td/select').click()
driver.find_element(By.XPATH, '//*[@id="report_bug_form"]/div/div[2]/div[1]/div/table/tbody/tr[17]/td/select/option[3]').click()
driver.find_element(By.XPATH, '//*[@id="report_bug_form"]/div/div[2]/div[1]/div/table/tbody/tr[18]/td[2]/label[1]').click()
driver.find_element(By.XPATH, '//*[@id="report_bug_form"]/div/div[2]/div[2]/input').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/ul/li[4]/a').click()
driver.close()
driver.quit()