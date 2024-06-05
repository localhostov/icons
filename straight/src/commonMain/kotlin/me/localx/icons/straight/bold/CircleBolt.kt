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

public val Icons.Bold.CircleBolt: ImageVector
    get() {
        if (_circleBolt != null) {
            return _circleBolt!!
        }
        _circleBolt = Builder(name = "CircleBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.38f, 24.0f, 0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.38f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.38f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.04f, 3.0f, 3.0f, 7.04f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f)
                reflectiveCurveTo(16.96f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(15.7f, 13.68f)
                curveToRelative(0.38f, -0.63f, 0.4f, -1.42f, 0.05f, -2.07f)
                curveToRelative(-0.37f, -0.68f, -1.08f, -1.11f, -1.85f, -1.11f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(2.24f, -4.31f)
                lineToRelative(-2.66f, -1.39f)
                lineToRelative(-3.08f, 5.96f)
                curveToRelative(-0.19f, 0.64f, -0.07f, 1.34f, 0.33f, 1.87f)
                curveToRelative(0.4f, 0.54f, 1.03f, 0.85f, 1.7f, 0.85f)
                horizontalLineToRelative(2.3f)
                lineToRelative(-2.24f, 4.31f)
                lineToRelative(2.66f, 1.39f)
                lineToRelative(2.87f, -5.51f)
                close()
            }
        }
        .build()
        return _circleBolt!!
    }

private var _circleBolt: ImageVector? = null
