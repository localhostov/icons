package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.CircleQuartersAlt: ImageVector
    get() {
        if (_circleQuartersAlt != null) {
            return _circleQuartersAlt!!
        }
        _circleQuartersAlt = Builder(name = "CircleQuartersAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.941f, 0.0f, 3.741f, 0.618f, 5.212f, 1.667f)
                lineToRelative(-5.212f, 5.212f)
                lineToRelative(-5.212f, -5.212f)
                curveToRelative(1.472f, -1.049f, 3.271f, -1.667f, 5.212f, -1.667f)
                close()
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -1.941f, 0.618f, -3.741f, 1.667f, -5.212f)
                lineToRelative(5.212f, 5.212f)
                lineToRelative(-5.212f, 5.212f)
                curveToRelative(-1.049f, -1.472f, -1.667f, -3.271f, -1.667f, -5.212f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-1.941f, 0.0f, -3.741f, -0.618f, -5.212f, -1.667f)
                lineToRelative(5.212f, -5.212f)
                lineToRelative(5.212f, 5.212f)
                curveToRelative(-1.472f, 1.049f, -3.271f, 1.667f, -5.212f, 1.667f)
                close()
                moveTo(19.333f, 17.212f)
                lineToRelative(-5.212f, -5.212f)
                lineToRelative(5.212f, -5.212f)
                curveToRelative(1.049f, 1.472f, 1.667f, 3.271f, 1.667f, 5.212f)
                reflectiveCurveToRelative(-0.618f, 3.741f, -1.667f, 5.212f)
                close()
            }
        }
        .build()
        return _circleQuartersAlt!!
    }

private var _circleQuartersAlt: ImageVector? = null
