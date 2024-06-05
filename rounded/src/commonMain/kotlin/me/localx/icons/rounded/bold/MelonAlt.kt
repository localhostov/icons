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

public val Icons.Bold.MelonAlt: ImageVector
    get() {
        if (_melonAlt != null) {
            return _melonAlt!!
        }
        _melonAlt = Builder(name = "MelonAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.002f, 3.014f)
                reflectiveCurveToRelative(-0.005f, -0.006f, -0.008f, -0.009f)
                curveToRelative(-0.003f, -0.003f, -0.007f, -0.006f, -0.011f, -0.009f)
                curveTo(16.607f, -1.368f, 9.019f, -0.894f, 4.062f, 4.062f)
                curveTo(-0.898f, 9.021f, -1.371f, 16.617f, 3.006f, 20.994f)
                curveToRelative(2.01f, 2.01f, 4.697f, 2.997f, 7.498f, 2.997f)
                curveToRelative(3.298f, 0.0f, 6.752f, -1.371f, 9.435f, -4.053f)
                curveToRelative(2.375f, -2.375f, 3.807f, -5.421f, 4.031f, -8.579f)
                curveToRelative(0.23f, -3.234f, -0.824f, -6.197f, -2.968f, -8.345f)
                close()
                moveTo(5.145f, 18.855f)
                curveToRelative(-0.045f, -0.255f, 0.012f, -1.035f, 0.717f, -2.444f)
                curveToRelative(1.906f, -3.812f, 6.737f, -8.643f, 10.549f, -10.549f)
                curveToRelative(1.408f, -0.704f, 2.186f, -0.761f, 2.443f, -0.717f)
                curveToRelative(0.045f, 0.255f, -0.013f, 1.036f, -0.717f, 2.444f)
                curveToRelative(-1.906f, 3.812f, -6.736f, 8.643f, -10.548f, 10.549f)
                curveToRelative(-1.41f, 0.705f, -2.188f, 0.762f, -2.444f, 0.717f)
                close()
                moveTo(6.183f, 6.183f)
                curveToRelative(2.559f, -2.557f, 5.983f, -3.598f, 8.925f, -3.022f)
                curveToRelative(-0.014f, 0.007f, -0.025f, 0.01f, -0.039f, 0.017f)
                curveToRelative(-4.445f, 2.223f, -9.668f, 7.445f, -11.891f, 11.891f)
                curveToRelative(-0.007f, 0.014f, -0.011f, 0.026f, -0.018f, 0.04f)
                curveToRelative(-0.577f, -2.943f, 0.464f, -6.367f, 3.022f, -8.926f)
                close()
                moveTo(20.978f, 11.147f)
                curveToRelative(-0.174f, 2.438f, -1.296f, 4.807f, -3.16f, 6.671f)
                curveToRelative(-2.558f, 2.559f, -5.983f, 3.599f, -8.926f, 3.022f)
                curveToRelative(0.014f, -0.007f, 0.026f, -0.011f, 0.04f, -0.018f)
                curveToRelative(4.445f, -2.223f, 9.667f, -7.445f, 11.89f, -11.891f)
                curveToRelative(0.007f, -0.014f, 0.01f, -0.025f, 0.017f, -0.039f)
                curveToRelative(0.141f, 0.719f, 0.195f, 1.473f, 0.139f, 2.254f)
                close()
            }
        }
        .build()
        return _melonAlt!!
    }

private var _melonAlt: ImageVector? = null
