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

public val Icons.Bold.EarthAmericas: ImageVector
    get() {
        if (_earthAmericas != null) {
            return _earthAmericas!!
        }
        _earthAmericas = Builder(name = "EarthAmericas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                curveToRelative(0.0f, -1.203f, 0.238f, -2.351f, 0.668f, -3.401f)
                lineToRelative(0.918f, 0.965f)
                curveToRelative(0.265f, 0.278f, 0.632f, 0.436f, 1.016f, 0.436f)
                horizontalLineToRelative(1.949f)
                curveToRelative(0.288f, 0.0f, 0.564f, 0.114f, 0.768f, 0.318f)
                lineToRelative(0.373f, 0.373f)
                curveToRelative(0.198f, 0.198f, 0.309f, 0.466f, 0.309f, 0.745f)
                verticalLineToRelative(0.963f)
                curveToRelative(0.0f, 0.385f, 0.153f, 0.753f, 0.425f, 1.025f)
                lineToRelative(1.19f, 1.19f)
                curveToRelative(0.247f, 0.247f, 0.386f, 0.582f, 0.386f, 0.931f)
                verticalLineToRelative(2.365f)
                curveToRelative(0.0f, 0.602f, 0.488f, 1.09f, 1.09f, 1.09f)
                horizontalLineToRelative(0.213f)
                curveToRelative(0.425f, 0.0f, 0.811f, -0.247f, 0.989f, -0.633f)
                lineToRelative(2.241f, -4.856f)
                curveToRelative(0.267f, -0.578f, 0.062f, -1.263f, -0.477f, -1.601f)
                lineToRelative(-2.562f, -1.601f)
                curveToRelative(-0.323f, -0.202f, -0.696f, -0.309f, -1.077f, -0.309f)
                horizontalLineToRelative(-1.431f)
                curveToRelative(-0.311f, 0.0f, -0.61f, -0.124f, -0.83f, -0.344f)
                lineToRelative(-0.592f, -0.592f)
                curveToRelative(-0.312f, -0.312f, -0.312f, -0.817f, 0.0f, -1.128f)
                lineToRelative(0.529f, -0.529f)
                curveToRelative(0.243f, -0.243f, 0.614f, -0.303f, 0.921f, -0.149f)
                lineToRelative(0.88f, 0.44f)
                curveToRelative(0.361f, 0.181f, 0.798f, 0.11f, 1.084f, -0.176f)
                lineToRelative(0.003f, -0.003f)
                curveToRelative(0.305f, -0.305f, 0.363f, -0.778f, 0.141f, -1.147f)
                lineToRelative(-0.837f, -1.396f)
                curveToRelative(-0.175f, -0.292f, -0.171f, -0.654f, 0.014f, -0.94f)
                curveToRelative(0.17f, -0.263f, 0.404f, -0.622f, 0.673f, -1.035f)
                curveToRelative(0.009f, 0.0f, 0.018f, 0.0f, 0.027f, 0.0f)
                curveToRelative(3.159f, 0.0f, 5.943f, 1.637f, 7.549f, 4.106f)
                lineToRelative(-0.722f, 0.417f)
                curveToRelative(-0.49f, 0.282f, -0.733f, 0.855f, -0.595f, 1.403f)
                lineToRelative(0.627f, 2.507f)
                curveToRelative(0.09f, 0.36f, 0.333f, 0.662f, 0.665f, 0.827f)
                lineToRelative(1.424f, 0.707f)
                curveToRelative(-0.484f, 4.509f, -4.312f, 8.033f, -8.948f, 8.033f)
                close()
            }
        }
        .build()
        return _earthAmericas!!
    }

private var _earthAmericas: ImageVector? = null
