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

public val Icons.Outline.Tricycle: ImageVector
    get() {
        if (_tricycle != null) {
            return _tricycle!!
        }
        _tricycle = Builder(name = "Tricycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.425f, 13.084f)
                curveToRelative(-0.301f, -3.376f, -0.916f, -6.452f, -1.403f, -8.497f)
                curveToRelative(-0.643f, -2.701f, -3.041f, -4.587f, -5.832f, -4.587f)
                horizontalLineToRelative(-0.19f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.19f)
                curveToRelative(1.861f, 0.0f, 3.458f, 1.254f, 3.886f, 3.05f)
                curveToRelative(0.228f, 0.959f, 0.485f, 2.16f, 0.724f, 3.504f)
                curveToRelative(-1.872f, 0.136f, -5.244f, 0.604f, -8.249f, 2.13f)
                lineToRelative(-1.069f, -2.684f)
                horizontalLineToRelative(1.517f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(4.0f, 6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.33f)
                lineToRelative(1.483f, 3.722f)
                curveToRelative(-1.485f, 1.059f, -2.739f, 2.48f, -3.508f, 4.348f)
                curveToRelative(-1.874f, 0.331f, -3.305f, 1.962f, -3.305f, 3.93f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.714f, -1.089f, -3.167f, -2.606f, -3.736f)
                curveToRelative(2.44f, -4.713f, 9.445f, -5.572f, 11.725f, -5.727f)
                curveToRelative(0.118f, 0.826f, 0.22f, 1.686f, 0.302f, 2.571f)
                curveToRelative(-2.517f, 0.503f, -4.42f, 2.729f, -4.42f, 5.392f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                curveToRelative(0.0f, -2.717f, -1.982f, -4.974f, -4.575f, -5.416f)
                close()
                moveTo(6.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.896f, -1.999f, 1.998f, -2.0f)
                curveToRelative(0.0f, 0.0f, 0.001f, 0.0f, 0.002f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.001f, 0.0f, 0.002f, 0.0f)
                curveToRelative(1.102f, 0.001f, 1.998f, 0.897f, 1.998f, 2.0f)
                close()
                moveTo(18.5f, 22.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(20.0f, 18.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _tricycle!!
    }

private var _tricycle: ImageVector? = null
