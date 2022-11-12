import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.journal.service.JournalArticleServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;

long groupId = 20123;
String articleId = "47547";
String DDMStructureKey = "ODS";

if(Validator.isNull(groupId)) return;
if(Validator.isNull(articleId)) return;
if(Validator.isNull(DDMStructureKey )) return;​

JournalArticle	journalArticle= null;
journalArticle = JournalArticleServiceUtil.getArticle(groupId, articleId);
if(Validator.isNull(journalArticle)) return;
journalArticle.setDDMStructureKey(DDMStructureKey);
JournalArticleLocalServiceUtil.updateJournalArticle(journalArticle);
	