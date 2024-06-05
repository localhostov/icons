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

public val Icons.Bold.RiskAlt: ImageVector
    get() {
        if (_riskAlt != null) {
            return _riskAlt!!
        }
        _riskAlt = Builder(name = "RiskAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.404f, 11.87f)
                lineToRelative(-4.181f, -7.167f)
                curveToRelative(-0.547f, -0.937f, -1.9f, -0.937f, -2.447f, 0.0f)
                lineToRelative(-4.181f, 7.167f)
                curveToRelative(-0.551f, 0.944f, 0.13f, 2.13f, 1.224f, 2.13f)
                horizontalLineToRelative(8.361f)
                curveToRelative(1.093f, 0.0f, 1.774f, -1.186f, 1.224f, -2.13f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(11.0f, 9.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.561f, 21.439f)
                lineToRelative(-5.52f, -5.52f)
                curveToRelative(1.225f, -1.66f, 1.959f, -3.703f, 1.959f, -5.92f)
                curveTo(20.0f, 4.486f, 15.514f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.486f, 0.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.217f, 0.0f, 4.26f, -0.734f, 5.92f, -1.959f)
                lineToRelative(5.52f, 5.52f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                close()
                moveTo(3.0f, 10.0f)
                curveToRelative(0.0f, -3.859f, 3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.914f, -0.773f, 3.649f, -2.022f, 4.914f)
                curveToRelative(-0.012f, 0.011f, -0.027f, 0.014f, -0.038f, 0.025f)
                reflectiveCurveToRelative(-0.014f, 0.027f, -0.025f, 0.038f)
                curveToRelative(-1.265f, 1.249f, -3.0f, 2.022f, -4.914f, 2.022f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _riskAlt!!
    }

private var _riskAlt: ImageVector? = null
