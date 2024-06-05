package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.SurveyXmark: ImageVector
    get() {
        if (_surveyXmark != null) {
            return _surveyXmark!!
        }
        _surveyXmark = Builder(name = "SurveyXmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.829f, 2.0f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                lineTo(3.0f, 2.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                horizontalLineToRelative(-5.171f)
                close()
                moveTo(11.63f, 18.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.254f, -1.254f)
                lineToRelative(-1.254f, 1.254f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.254f, -1.254f)
                lineToRelative(-1.254f, -1.254f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.254f, 1.254f)
                lineToRelative(1.254f, -1.254f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.254f, 1.254f)
                lineToRelative(1.254f, 1.254f)
                close()
                moveTo(11.63f, 11.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.254f, -1.254f)
                lineToRelative(-1.254f, 1.254f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.254f, -1.254f)
                lineToRelative(-1.254f, -1.254f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.254f, 1.254f)
                lineToRelative(1.254f, -1.254f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.254f, 1.254f)
                lineToRelative(1.254f, 1.254f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _surveyXmark!!
    }

private var _surveyXmark: ImageVector? = null
