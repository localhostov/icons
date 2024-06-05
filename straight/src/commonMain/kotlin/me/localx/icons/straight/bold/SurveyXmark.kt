package me.localx.icons.straight.bold

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

public val Icons.Bold.SurveyXmark: ImageVector
    get() {
        if (_surveyXmark != null) {
            return _surveyXmark!!
        }
        _surveyXmark = Builder(name = "SurveyXmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.662f, 2.0f)
                curveToRelative(-0.562f, -1.182f, -1.769f, -2.0f, -3.162f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.394f, 0.0f, -2.6f, 0.818f, -3.162f, 2.0f)
                lineTo(2.0f, 2.0f)
                lineTo(2.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-5.338f)
                close()
                moveTo(19.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(11.63f, 8.784f)
                lineToRelative(-1.254f, 1.254f)
                lineToRelative(1.254f, 1.254f)
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
                close()
                moveTo(11.63f, 15.784f)
                lineToRelative(-1.254f, 1.254f)
                lineToRelative(1.254f, 1.254f)
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
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _surveyXmark!!
    }

private var _surveyXmark: ImageVector? = null
