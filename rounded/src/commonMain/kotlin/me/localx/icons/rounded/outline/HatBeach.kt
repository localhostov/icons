package me.localx.icons.rounded.outline

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

public val Icons.Outline.HatBeach: ImageVector
    get() {
        if (_hatBeach != null) {
            return _hatBeach!!
        }
        _hatBeach = Builder(name = "HatBeach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.5f)
                curveToRelative(0.0f, 3.645f, -5.271f, 6.5f, -12.0f, 6.5f)
                reflectiveCurveTo(0.0f, 18.145f, 0.0f, 14.5f)
                curveToRelative(0.0f, -2.167f, 1.854f, -4.123f, 5.0f, -5.318f)
                verticalLineToRelative(-0.182f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                curveToRelative(1.23f, 0.0f, 2.441f, 0.324f, 3.501f, 0.937f)
                curveToRelative(0.478f, 0.277f, 0.642f, 0.889f, 0.364f, 1.367f)
                curveToRelative(-0.276f, 0.477f, -0.887f, 0.641f, -1.366f, 0.365f)
                curveToRelative(-0.756f, -0.438f, -1.62f, -0.668f, -2.499f, -0.668f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(1.993f)
                curveToRelative(0.0f, 0.357f, 0.182f, 0.679f, 0.486f, 0.86f)
                curveToRelative(0.876f, 0.523f, 2.37f, 1.146f, 4.514f, 1.146f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-2.6f, 0.0f, -4.447f, -0.777f, -5.539f, -1.429f)
                curveToRelative(-0.801f, -0.478f, -1.308f, -1.316f, -1.416f, -2.235f)
                curveToRelative(-1.9f, 0.857f, -3.045f, 2.012f, -3.045f, 3.164f)
                curveToRelative(0.0f, 2.128f, 4.107f, 4.5f, 10.0f, 4.5f)
                reflectiveCurveToRelative(10.0f, -2.372f, 10.0f, -4.5f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(15.956f, 6.64f)
                curveToRelative(0.853f, -0.853f, 2.235f, -0.853f, 3.088f, 0.0f)
                curveToRelative(0.464f, 0.464f, 0.666f, 1.084f, 0.626f, 1.691f)
                curveToRelative(0.607f, -0.041f, 1.227f, 0.162f, 1.691f, 0.626f)
                curveToRelative(0.853f, 0.853f, 0.853f, 2.236f, 0.0f, 3.088f)
                curveToRelative(-0.464f, 0.464f, -1.084f, 0.666f, -1.691f, 0.626f)
                curveToRelative(0.041f, 0.607f, -0.162f, 1.227f, -0.626f, 1.691f)
                curveToRelative(-0.853f, 0.853f, -2.235f, 0.853f, -3.088f, 0.0f)
                curveToRelative(-0.464f, -0.464f, -0.666f, -1.084f, -0.626f, -1.691f)
                curveToRelative(-0.607f, 0.041f, -1.227f, -0.162f, -1.691f, -0.626f)
                curveToRelative(-0.853f, -0.853f, -0.853f, -2.235f, 0.0f, -3.088f)
                curveToRelative(0.464f, -0.464f, 1.084f, -0.666f, 1.691f, -0.626f)
                curveToRelative(-0.041f, -0.607f, 0.162f, -1.227f, 0.626f, -1.691f)
                close()
                moveTo(16.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hatBeach!!
    }

private var _hatBeach: ImageVector? = null
