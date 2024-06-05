package me.localx.icons.straight.outline

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

public val Icons.Outline.GalaxyAlt: ImageVector
    get() {
        if (_galaxyAlt != null) {
            return _galaxyAlt!!
        }
        _galaxyAlt = Builder(name = "GalaxyAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 12.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(9.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(21.0f, 14.0f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-0.182f, 0.0f, -0.359f, -0.021f, -0.54f, -0.027f)
                curveToRelative(0.334f, -0.584f, 0.54f, -1.251f, 0.54f, -1.973f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -1.174f, -0.424f, -2.241f, -1.105f, -3.096f)
                curveToRelative(-0.281f, -1.52f, -1.135f, -2.835f, -2.329f, -3.721f)
                curveToRelative(3.107f, 0.714f, 5.434f, 3.496f, 5.434f, 6.817f)
                close()
                moveTo(3.697f, 19.747f)
                curveToRelative(-0.382f, 0.559f, -0.609f, 1.225f, -0.665f, 1.939f)
                curveToRelative(-1.119f, -0.706f, -2.136f, -1.558f, -3.032f, -2.524f)
                verticalLineToRelative(-3.286f)
                curveToRelative(0.959f, 1.528f, 2.208f, 2.857f, 3.697f, 3.871f)
                close()
                moveTo(15.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 4.486f, 7.486f, 0.0f, 13.0f, 0.0f)
                curveToRelative(0.182f, 0.0f, 0.359f, 0.021f, 0.54f, 0.027f)
                curveToRelative(-0.334f, 0.584f, -0.54f, 1.251f, -0.54f, 1.973f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                curveToRelative(0.0f, 1.174f, 0.424f, 2.241f, 1.105f, 3.096f)
                curveToRelative(0.281f, 1.52f, 1.135f, 2.835f, 2.329f, 3.721f)
                curveToRelative(-3.107f, -0.714f, -5.434f, -3.496f, -5.434f, -6.817f)
                close()
                moveTo(24.0f, 4.838f)
                verticalLineToRelative(3.286f)
                curveToRelative(-0.959f, -1.528f, -2.208f, -2.857f, -3.697f, -3.871f)
                curveToRelative(0.382f, -0.559f, 0.609f, -1.225f, 0.665f, -1.939f)
                curveToRelative(1.119f, 0.706f, 2.136f, 1.558f, 3.032f, 2.524f)
                close()
            }
        }
        .build()
        return _galaxyAlt!!
    }

private var _galaxyAlt: ImageVector? = null
