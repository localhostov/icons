package me.localx.icons.rounded.filled

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

public val Icons.Filled.Procedures: ImageVector
    get() {
        if (_procedures != null) {
            return _procedures!!
        }
        _procedures = Builder(name = "Procedures", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 4.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.965f)
                lineToRelative(1.703f, -2.555f)
                curveToRelative(0.204f, -0.308f, 0.564f, -0.474f, 0.929f, -0.44f)
                curveToRelative(0.367f, 0.035f, 0.685f, 0.271f, 0.826f, 0.61f)
                lineToRelative(1.865f, 4.477f)
                lineToRelative(1.443f, -1.732f)
                curveToRelative(0.19f, -0.228f, 0.472f, -0.359f, 0.769f, -0.359f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.031f)
                lineToRelative(-2.2f, 2.641f)
                curveToRelative(-0.191f, 0.229f, -0.475f, 0.359f, -0.769f, 0.359f)
                curveToRelative(-0.05f, 0.0f, -0.1f, -0.004f, -0.149f, -0.011f)
                curveToRelative(-0.346f, -0.053f, -0.639f, -0.282f, -0.773f, -0.604f)
                lineToRelative(-1.781f, -4.275f)
                lineToRelative(-0.964f, 1.445f)
                curveToRelative(-0.186f, 0.278f, -0.498f, 0.445f, -0.832f, 0.445f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(6.5f, 14.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20.067f, 8.007f)
                lineToRelative(-0.762f, 0.914f)
                curveToRelative(-0.572f, 0.687f, -1.412f, 1.079f, -2.305f, 1.079f)
                curveToRelative(-0.141f, 0.0f, -0.281f, -0.01f, -0.421f, -0.029f)
                curveToRelative(-1.058f, -0.161f, -1.977f, -0.93f, -2.378f, -1.89f)
                curveToRelative(-1.826f, 0.37f, -3.201f, 1.984f, -3.201f, 3.919f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.186f, -1.756f, -3.957f, -3.933f, -3.993f)
                close()
                moveTo(2.0f, 5.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 5.0f)
                close()
            }
        }
        .build()
        return _procedures!!
    }

private var _procedures: ImageVector? = null
