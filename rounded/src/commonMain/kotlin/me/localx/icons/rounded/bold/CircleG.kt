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

public val Icons.Bold.CircleG: ImageVector
    get() {
        if (_circleG != null) {
            return _circleG!!
        }
        _circleG = Builder(name = "CircleG", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.404f, 11.57f)
                curveToRelative(0.555f, 0.557f, 0.595f, 1.269f, 0.594f, 1.473f)
                curveToRelative(0.0f, 2.892f, -2.128f, 5.144f, -4.95f, 5.232f)
                curveToRelative(-0.05f, 0.002f, -0.1f, 0.003f, -0.15f, 0.003f)
                curveToRelative(-0.451f, 0.0f, -0.902f, -0.065f, -1.343f, -0.193f)
                curveToRelative(-2.094f, -0.615f, -3.554f, -2.604f, -3.554f, -4.835f)
                verticalLineToRelative(-2.403f)
                curveToRelative(0.0f, -1.377f, 0.573f, -2.722f, 1.571f, -3.688f)
                curveToRelative(0.983f, -0.951f, 2.27f, -1.447f, 3.605f, -1.406f)
                curveToRelative(1.114f, 0.036f, 2.159f, 0.426f, 3.021f, 1.127f)
                curveToRelative(0.643f, 0.523f, 0.74f, 1.468f, 0.217f, 2.11f)
                curveToRelative(-0.522f, 0.643f, -1.467f, 0.742f, -2.11f, 0.217f)
                curveToRelative(-0.349f, -0.284f, -0.772f, -0.441f, -1.226f, -0.457f)
                curveToRelative(-0.525f, -0.024f, -1.027f, 0.183f, -1.42f, 0.564f)
                curveToRelative(-0.418f, 0.404f, -0.657f, 0.962f, -0.657f, 1.532f)
                verticalLineToRelative(2.403f)
                curveToRelative(0.0f, 0.91f, 0.574f, 1.714f, 1.396f, 1.955f)
                curveToRelative(0.183f, 0.053f, 0.369f, 0.071f, 0.556f, 0.072f)
                curveToRelative(0.769f, -0.024f, 1.542f, -0.433f, 1.875f, -1.277f)
                horizontalLineToRelative(-0.328f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.54f, 0.0f, 1.038f, 0.203f, 1.404f, 0.57f)
                close()
            }
        }
        .build()
        return _circleG!!
    }

private var _circleG: ImageVector? = null
