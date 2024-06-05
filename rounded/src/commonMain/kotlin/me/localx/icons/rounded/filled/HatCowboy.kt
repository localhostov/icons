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

public val Icons.Filled.HatCowboy: ImageVector
    get() {
        if (_hatCowboy != null) {
            return _hatCowboy!!
        }
        _hatCowboy = Builder(name = "HatCowboy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-0.997f, 0.445f, -0.999f, 0.996f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-0.009f, 2.069f, -0.009f, 3.604f)
                curveToRelative(0.0f, 1.473f, -0.145f, 2.85f, -0.407f, 4.155f)
                curveTo(17.034f, 5.162f, 10.153f, 0.413f, 7.966f, 2.601f)
                curveToRelative(-0.979f, 0.979f, -0.979f, 2.305f, -0.978f, 3.274f)
                curveToRelative(0.0f, 0.346f, 0.0f, 0.925f, -0.069f, 1.044f)
                curveToRelative(-0.136f, 0.086f, -0.702f, 0.082f, -1.041f, 0.081f)
                curveToRelative(-0.96f, -0.004f, -2.276f, -0.015f, -3.258f, 0.967f)
                curveToRelative(-1.649f, 1.649f, 0.639f, 5.965f, 3.401f, 9.939f)
                curveToRelative(3.306f, -0.264f, 6.002f, -1.473f, 8.206f, -3.677f)
                curveToRelative(0.966f, -0.966f, 1.754f, -2.051f, 2.344f, -3.227f)
                curveToRelative(0.247f, -0.493f, 0.849f, -0.693f, 1.342f, -0.446f)
                curveToRelative(0.494f, 0.248f, 0.693f, 0.849f, 0.445f, 1.342f)
                curveToRelative(-0.686f, 1.367f, -1.6f, 2.627f, -2.717f, 3.744f)
                curveToRelative(-2.254f, 2.254f, -5.039f, 3.62f, -8.292f, 4.107f)
                curveToRelative(0.477f, 0.64f, 0.951f, 1.257f, 1.407f, 1.835f)
                curveToRelative(-1.306f, 0.262f, -2.684f, 0.407f, -4.157f, 0.407f)
                curveToRelative(-1.535f, 0.0f, -3.604f, 0.009f, -3.604f, 0.009f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.003f, -0.996f, 0.449f, -0.996f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.002f, 0.0f, 0.003f, 0.0f, 0.004f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(2.064f, -0.008f, 3.596f, -0.008f)
                curveToRelative(5.635f, 0.0f, 10.326f, -1.833f, 13.942f, -5.449f)
                reflectiveCurveToRelative(5.449f, -8.307f, 5.449f, -13.942f)
                curveToRelative(0.0f, -1.531f, 0.009f, -3.595f, 0.009f, -3.596f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, -0.003f, 0.0f, -0.004f)
                close()
            }
        }
        .build()
        return _hatCowboy!!
    }

private var _hatCowboy: ImageVector? = null
