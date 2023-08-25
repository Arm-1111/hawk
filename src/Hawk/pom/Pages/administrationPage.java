package pom.Pages;

import hawkBase.hawkBase;
import pom.locators.administration_locators;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class administrationPage {

    public static void openAccoladesCateogry() {
        hawkBase.waitForLoad();
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.accolades.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.accoladesCategory.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.selectAccoladesCategory.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveAccoladesButton.isDisplayed(), is(Boolean.TRUE));
    }

    public static void openBillingFrequency() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.billing.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectBillingFrequency.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.billingFrequency.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.BillingOther.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveBillingFrequnecy.isDisplayed(), is(Boolean.TRUE));
    }

    public static void openBudegetBasis() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.budget.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectBudgetBasis.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.budgedBasis.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.otherBudgedBasis.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveBudgedBasis.isDisplayed(), is(Boolean.TRUE));

    }

    public static void openContractRole() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.contractRole.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.saveClientRole.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.contractRoleInvoice.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.selectContractRole.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.contractRoleInput.isDisplayed(), is(Boolean.TRUE));

    }

    public static void openComplaintCategory() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.complaintCategoty.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectComplaintCategory.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.ComplaintCategoryInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.complaintCategorySaveButton.isDisplayed(), is(Boolean.TRUE));

    }

    public static void openCretification() {
        hawkBase.waitForLoad();
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.cretification.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectCertification.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.certificationInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.certificationSave.isDisplayed(), is(Boolean.TRUE));
    }

    public static void openClientContactInterest() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.clientContact.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectClientContact.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.clientContactInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveClientContact.isDisplayed(), is(Boolean.TRUE));

    }

    public static void openClientType() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.clientType.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectClinetType.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.clientTypeInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.otherClinetType.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveClientType.isDisplayed(), is(Boolean.TRUE));

    }

    public static void openContactType() {
        hawkBase.waitForLoad();
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.contactType.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectContactType.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.contactTypeInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveContactType.isDisplayed(), is(Boolean.TRUE));

    }

    public static void openContractType() {
        administration_locators.adminTab.hover();
        hawkBase.waitForLoad();
        administration_locators.refTables.click();
        administration_locators.contractType.click();
        assertThat(administration_locators.selectContractType.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.contractTypeInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveContractType.isDisplayed(), is(Boolean.TRUE));
    }

    public static void openContry() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.country.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectCountry.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.countryInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.countryPhoneCode.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.countryCurrecnyCode.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.countryCurrencySign.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.selectCountry.isDisplayed(), is(Boolean.TRUE));

    }

    public static void openDistributionMethod() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.distributionMethod.click();
       hawkBase.waitForLoad();
        assertThat(administration_locators.selectDistributionMethod.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.distributionMethodInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.distributionOther.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveDistribution.isDisplayed(), is(Boolean.TRUE));

    }

    public static void openDivision() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.division.click();
       hawkBase.waitForLoad();
        assertThat(administration_locators.selectDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.divisionInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.selectSageDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveDivision.isDisplayed(), is(Boolean.TRUE));
    }

    public static void openEngagementFrequency() {
        administration_locators.adminTab.hover();
        hawkBase.waitForLoad();
        administration_locators.refTables.click();
        administration_locators.engagementFrequency.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectEngagementFrequency.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.engagmentFrequencyInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.engagmentOther.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.engagmentSave.isDisplayed(), is(Boolean.TRUE));
    }

    public static void openExchangeRate() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.exchangeRate.click();
       hawkBase.waitForLoad();
        assertThat(administration_locators.ratesSelectDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.rateUnit.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.AED.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.BRL.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.EGP.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.INR.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.MYR.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.SAR.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.TRY.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.ZAR.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.AOA.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.CAD.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.EUR.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.JPY.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.NGN.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.SEK.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.TTD.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.ARS.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.CNY.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.GBP.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.KRW.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.NOK.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.SGD.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.VEF.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.AUD.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.COP.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.IDR.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.MXN.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.RUB.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.THB.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.VND.isDisplayed(), is(Boolean.TRUE));
    }

    public void openHawkaEntity() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        hawkBase.waitForLoad();
        administration_locators.hawkEntity.click();
         hawkBase.waitForLoad();
        assertThat(administration_locators.selectHawkEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntityRelationship.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntityName.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntityAddress.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntityCity.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntityState.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntityPostalCode.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntityCountry.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntityDefaultCurrency.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntityOrder.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.hawkEntitySaveButton.isDisplayed(), is(Boolean.TRUE));

    }

    public void openInspectionType() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.inspectionType.click();
       hawkBase.waitForLoad();
        assertThat(administration_locators.selectInspectionType.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.inspectionTypeInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveInspectionType.isDisplayed(), is(Boolean.TRUE));

    }

    public void openIRS() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.IRS.click();
       hawkBase.waitForLoad();
        assertThat(administration_locators.IRSForm.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.reComputeMileageRates.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.addLineButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.IRSsaveButton.isDisplayed(), is(Boolean.TRUE));
    }

    public void openJobRole() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.jobRole.click();
        hawkBase.waitForLoad();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectJobRole.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.jobRoleInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.jobRoleSave.isDisplayed(), is(Boolean.TRUE));

    }

    public  static void openMeetingType() {
        if (administration_locators.adminTab.isDisplayed()) {
            administration_locators.adminTab.hover();
            administration_locators.refTables.click();
            administration_locators.meetingType.click();
            hawkBase.waitForLoad();
            assertThat(administration_locators.selectMeetingType.isDisplayed(), is(Boolean.TRUE));
            assertThat(administration_locators.meetingTypeInput.isDisplayed(), is(Boolean.TRUE));
            assertThat(administration_locators.meetingTypeSave.isDisplayed(), is(Boolean.TRUE));

        } else {
            hawkBase.waitForLoad();
            administration_locators.nextMenu.click();
        }
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.meetingType.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectMeetingType.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.meetingTypeInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.meetingTypeSave.isDisplayed(), is(Boolean.TRUE));
    }

    public static void openPartnerCompany(){
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.partnerCompany.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectPartnerCompany.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.partnerCompanyInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.partnerCompanySave.isDisplayed(), is(Boolean.TRUE));

    }

    public void openPaymentTerms() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.paymentTerms.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectPaymentTerms.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.paymentTermsInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.paymentTermsDays.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.paymentTermsOther.isDisplayed(), is(Boolean.TRUE));
    }

    public void openRCAreview() {
        hawkBase.waitForLoad();
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.RCAReview.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectRCAreview.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.RCAreviewInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.RCAreviewOther.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.RCAsave.isDisplayed(), is(Boolean.TRUE));

    }

    public void openRCAstatus() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.RCAStatus.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectRCAstatus.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.RCAstatusInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.RCAstatusOther.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.RCAstatusSave.isDisplayed(), is(Boolean.TRUE));
    }

    public void openRelationshipEmergencyContact() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.relationshipEmergencyContact.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectReleationshipEmergencyContact.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.relEmerContInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.relEmerContOther.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.relEmerContSave.isDisplayed(), is(Boolean.TRUE));
    }

    public void openRequierdAttachment() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.requiredAttachment.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectRequiredAttachment.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.requiredAttachmentInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.requiredAttachmentOther.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.requiredAttachmentSave.isDisplayed(), is(Boolean.TRUE));
    }

    public void openResourceClass() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.resourceClass.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectResourceClass.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.resourceClassInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.resourceClassOther.isDisplayed(), is(Boolean.TRUE));
    }

    public void openResourceType() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.resourceType.click();
       hawkBase.waitForLoad();
        assertThat(administration_locators.selectResourceType.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.resourceTypeInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.recourceBurdenFactor.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.resourceOther.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveResourceType.isDisplayed(), is(Boolean.TRUE));

    }

    public void openSafetyRequirement() {
        hawkBase.waitForLoad();
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.safetyReq.click();
       hawkBase.waitForLoad();
        assertThat(administration_locators.selectSafteyRequiremant.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.safetyReqInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveSafetyReq.isDisplayed(), is(Boolean.TRUE));
    }

    public void openState() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.state.click();
       hawkBase.waitForLoad();
        assertThat(administration_locators.selectCountryState.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.selectState.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.stateInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.codeInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.saveState.isDisplayed(), is(Boolean.TRUE));
    }

    public void openTaxonomy() {
        administration_locators.adminTab.hover();
        administration_locators.refTables.click();
        administration_locators.taxonomy.click();
        hawkBase.waitForLoad();
        assertThat(administration_locators.selectTaxaonomy.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.taxNumber.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.taxPrimaryGroup.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.taxSubGroup.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.tax3rdLevel.isDisplayed(), is(Boolean.TRUE));
        assertThat(administration_locators.taxSave.isDisplayed(), is(Boolean.TRUE));
    }

}
