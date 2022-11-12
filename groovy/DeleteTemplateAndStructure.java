import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.service.DDMStructureLocalServiceUtil;
import com.liferay.dynamic.data.mapping.service.DDMTemplateLocalServiceUtil;

String ddmStructureId="123123";
//DDMStructure structure = DDMStructureLocalServiceUtil.getDDMStructure(Long.valueOf(ddmStructureId));
DDMStructureLocalServiceUtil.deleteDDMStructure(Long.valueOf(ddmStructureId));
String templateId="123123";
DDMTemplateLocalServiceUtil.deleteDDMTemplate(Long.valueOf(templateId));


