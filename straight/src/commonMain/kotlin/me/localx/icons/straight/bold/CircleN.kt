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

public val Icons.Bold.CircleN: ImageVector
    get() {
        if (_circleN != null) {
            return _circleN!!
        }
        _circleN = Builder(name = "CircleN", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(14.0f, 6.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.515f)
                curveToRelative(0.0f, 0.889f, -0.573f, 1.653f, -1.425f, 1.904f)
                curveToRelative(-0.189f, 0.056f, -0.38f, 0.082f, -0.568f, 0.082f)
                curveToRelative(-0.661f, 0.0f, -1.287f, -0.331f, -1.661f, -0.914f)
                lineToRelative(-3.346f, -5.156f)
                verticalLineToRelative(6.069f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.889f, 0.573f, -1.653f, 1.425f, -1.904f)
                curveToRelative(0.854f, -0.25f, 1.749f, 0.083f, 2.229f, 0.832f)
                lineToRelative(3.346f, 5.156f)
                verticalLineToRelative(-6.084f)
                close()
            }
        }
        .build()
        return _circleN!!
    }

private var _circleN: ImageVector? = null
