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

public val Icons.Outline.Narwhal: ImageVector
    get() {
        if (_narwhal != null) {
            return _narwhal!!
        }
        _narwhal = Builder(name = "Narwhal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 16.001f)
                curveToRelative(0.0f, 4.411f, -3.588f, 7.999f, -7.999f, 7.999f)
                horizontalLineToRelative(-7.274f)
                curveTo(3.915f, 24.0f, 0.0f, 20.085f, 0.0f, 15.273f)
                curveToRelative(0.0f, -3.367f, 0.987f, -6.628f, 2.855f, -9.431f)
                lineToRelative(0.493f, -0.739f)
                curveTo(1.556f, 4.34f, 0.246f, 2.655f, 0.004f, 0.65f)
                curveTo(-0.038f, 0.3f, 0.235f, -0.023f, 0.586f, 0.002f)
                curveToRelative(3.667f, 0.26f, 4.914f, 2.773f, 4.914f, 2.773f)
                curveTo(5.5f, 2.774f, 6.703f, 0.259f, 10.414f, 0.001f)
                curveToRelative(0.351f, -0.024f, 0.624f, 0.299f, 0.582f, 0.649f)
                curveToRelative(-0.275f, 2.287f, -1.943f, 4.16f, -4.129f, 4.72f)
                lineToRelative(-0.463f, 2.747f)
                curveToRelative(-0.2f, 1.185f, -0.326f, 2.389f, -0.377f, 3.594f)
                curveToRelative(2.872f, -2.379f, 5.879f, -3.711f, 8.474f, -3.711f)
                curveToRelative(0.559f, 0.0f, 1.864f, 0.0f, 1.864f, 0.0f)
                verticalLineToRelative(0.009f)
                curveToRelative(0.621f, 0.028f, 1.223f, 0.127f, 1.8f, 0.29f)
                lineTo(22.877f, 0.297f)
                curveToRelative(0.169f, -0.287f, 0.538f, -0.383f, 0.825f, -0.214f)
                curveToRelative(0.235f, 0.138f, 0.349f, 0.417f, 0.277f, 0.68f)
                lineToRelative(-2.56f, 9.36f)
                curveToRelative(1.586f, 1.463f, 2.581f, 3.557f, 2.581f, 5.878f)
                close()
                moveTo(22.0f, 16.001f)
                curveToRelative(0.0f, -3.305f, -2.688f, -5.996f, -5.993f, -5.999f)
                curveToRelative(-0.314f, -0.006f, -0.752f, -0.002f, -1.507f, -0.002f)
                curveToRelative(-2.559f, 0.0f, -5.845f, 1.76f, -8.793f, 4.707f)
                curveToRelative(-0.287f, 0.286f, -0.716f, 0.372f, -1.09f, 0.217f)
                curveToRelative(-0.374f, -0.154f, -0.617f, -0.52f, -0.617f, -0.924f)
                verticalLineToRelative(-1.059f)
                curveToRelative(0.0f, -1.725f, 0.146f, -3.459f, 0.432f, -5.156f)
                lineToRelative(0.158f, -0.939f)
                curveToRelative(-1.648f, 2.473f, -2.59f, 5.457f, -2.59f, 8.428f)
                curveToRelative(0.0f, 3.709f, 3.018f, 6.727f, 6.727f, 6.727f)
                horizontalLineToRelative(7.274f)
                curveToRelative(3.308f, 0.0f, 5.999f, -2.691f, 5.999f, -5.999f)
                close()
            }
        }
        .build()
        return _narwhal!!
    }

private var _narwhal: ImageVector? = null
