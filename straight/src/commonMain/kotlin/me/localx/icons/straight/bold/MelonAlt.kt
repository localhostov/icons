package me.localx.icons.straight.bold

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
                moveToRelative(20.994f, 3.005f)
                curveTo(18.956f, 0.967f, 16.269f, 0.011f, 13.5f, 0.01f)
                curveToRelative(-3.299f, -0.001f, -6.755f, 1.368f, -9.438f, 4.051f)
                curveTo(1.385f, 6.738f, 0.015f, 10.182f, 0.01f, 13.474f)
                curveToRelative(-0.005f, 2.783f, 0.919f, 5.443f, 2.996f, 7.52f)
                reflectiveCurveToRelative(4.721f, 2.997f, 7.498f, 2.997f)
                curveToRelative(3.298f, 0.0f, 6.752f, -1.371f, 9.435f, -4.053f)
                curveToRelative(2.375f, -2.375f, 3.807f, -5.421f, 4.031f, -8.579f)
                curveToRelative(0.02f, -0.276f, 0.03f, -0.55f, 0.031f, -0.821f)
                curveToRelative(0.011f, -2.884f, -0.968f, -5.495f, -3.007f, -7.533f)
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
                curveToRelative(2.56f, -2.559f, 5.988f, -3.605f, 8.932f, -3.027f)
                curveToRelative(-0.015f, 0.008f, -0.03f, 0.015f, -0.045f, 0.022f)
                curveToRelative(-4.445f, 2.223f, -9.668f, 7.445f, -11.891f, 11.891f)
                curveToRelative(-0.008f, 0.016f, -0.015f, 0.031f, -0.023f, 0.047f)
                curveToRelative(-0.579f, -2.944f, 0.467f, -6.373f, 3.027f, -8.933f)
                close()
                moveTo(20.978f, 11.147f)
                curveToRelative(-0.174f, 2.438f, -1.296f, 4.807f, -3.16f, 6.671f)
                curveToRelative(-2.56f, 2.56f, -5.988f, 3.607f, -8.933f, 3.027f)
                curveToRelative(0.016f, -0.008f, 0.031f, -0.015f, 0.046f, -0.023f)
                curveToRelative(4.445f, -2.223f, 9.667f, -7.445f, 11.89f, -11.891f)
                curveToRelative(0.008f, -0.017f, 0.016f, -0.033f, 0.024f, -0.05f)
                curveToRelative(0.142f, 0.721f, 0.188f, 1.481f, 0.132f, 2.265f)
                close()
            }
        }
        .build()
        return _melonAlt!!
    }

private var _melonAlt: ImageVector? = null
