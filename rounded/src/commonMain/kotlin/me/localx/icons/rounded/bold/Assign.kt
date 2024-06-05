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

public val Icons.Bold.Assign: ImageVector
    get() {
        if (_assign != null) {
            return _assign!!
        }
        _assign = Builder(name = "Assign", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.5f, 4.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(20.5f, 6.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(19.056f, 17.225f)
                lineToRelative(-6.056f, -1.705f)
                verticalLineToRelative(-4.926f)
                curveToRelative(0.0f, -0.704f, -0.447f, -1.368f, -1.129f, -1.543f)
                curveToRelative(-1.001f, -0.256f, -1.884f, 0.492f, -1.884f, 1.449f)
                verticalLineToRelative(9.269f)
                lineToRelative(-1.64f, -1.296f)
                curveToRelative(-0.866f, -0.722f, -2.153f, -0.604f, -2.874f, 0.261f)
                curveToRelative(-0.722f, 0.866f, -0.605f, 2.153f, 0.261f, 2.874f)
                lineToRelative(1.68f, 1.483f)
                curveToRelative(0.663f, 0.585f, 1.516f, 0.908f, 2.4f, 0.908f)
                horizontalLineToRelative(0.762f)
                curveToRelative(1.338f, 0.0f, 2.423f, -1.085f, 2.423f, -2.423f)
                verticalLineToRelative(-2.94f)
                lineToRelative(5.219f, 1.469f)
                curveToRelative(1.065f, 0.319f, 1.781f, 1.281f, 1.781f, 2.395f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -2.448f, -1.575f, -4.565f, -3.944f, -5.275f)
                close()
                moveTo(6.948f, 9.027f)
                curveToRelative(-0.506f, -1.159f, -1.859f, -1.989f, -3.448f, -1.989f)
                reflectiveCurveTo(0.558f, 7.868f, 0.052f, 9.027f)
                curveToRelative(-0.216f, 0.496f, 0.28f, 1.011f, 0.922f, 1.011f)
                horizontalLineToRelative(5.052f)
                curveToRelative(0.642f, 0.0f, 1.139f, -0.516f, 0.922f, -1.011f)
                close()
                moveTo(9.473f, 8.0f)
                horizontalLineToRelative(5.052f)
                curveToRelative(0.642f, 0.0f, 1.139f, -0.516f, 0.922f, -1.011f)
                curveToRelative(-0.506f, -1.159f, -1.859f, -1.989f, -3.448f, -1.989f)
                reflectiveCurveToRelative(-2.942f, 0.83f, -3.448f, 1.989f)
                curveToRelative(-0.216f, 0.496f, 0.28f, 1.011f, 0.922f, 1.011f)
                close()
                moveTo(23.948f, 8.989f)
                curveToRelative(-0.506f, -1.159f, -1.859f, -1.989f, -3.448f, -1.989f)
                reflectiveCurveToRelative(-2.942f, 0.83f, -3.448f, 1.989f)
                curveToRelative(-0.216f, 0.496f, 0.28f, 1.011f, 0.922f, 1.011f)
                horizontalLineToRelative(5.052f)
                curveToRelative(0.642f, 0.0f, 1.139f, -0.516f, 0.922f, -1.011f)
                close()
            }
        }
        .build()
        return _assign!!
    }

private var _assign: ImageVector? = null
