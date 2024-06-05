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

public val Icons.Outline.HatCowboy: ImageVector
    get() {
        if (_hatCowboy != null) {
            return _hatCowboy!!
        }
        _hatCowboy = Builder(name = "HatCowboy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, -0.003f)
                reflectiveCurveToRelative(-0.009f, 3.069f, -0.009f, 4.603f)
                curveToRelative(0.0f, 1.473f, -0.13f, 2.86f, -0.392f, 4.166f)
                curveTo(17.049f, 5.172f, 10.155f, 0.412f, 7.966f, 2.601f)
                curveToRelative(-0.979f, 0.979f, -0.979f, 2.305f, -0.978f, 3.274f)
                curveToRelative(0.0f, 0.346f, 0.0f, 0.925f, -0.069f, 1.044f)
                curveToRelative(-0.136f, 0.086f, -0.702f, 0.082f, -1.041f, 0.081f)
                curveToRelative(-0.96f, -0.004f, -2.276f, -0.015f, -3.258f, 0.967f)
                curveToRelative(-2.189f, 2.188f, 2.561f, 9.083f, 6.148f, 13.633f)
                curveToRelative(-1.306f, 0.262f, -2.694f, 0.392f, -4.168f, 0.392f)
                curveToRelative(-1.534f, 0.0f, -4.603f, 0.009f, -4.603f, 0.009f)
                lineToRelative(0.006f, 2.0f)
                reflectiveCurveToRelative(3.065f, -0.009f, 4.597f, -0.009f)
                curveToRelative(5.635f, 0.0f, 10.326f, -1.833f, 13.942f, -5.449f)
                reflectiveCurveToRelative(5.449f, -8.307f, 5.449f, -13.942f)
                curveToRelative(0.0f, -1.532f, 0.009f, -4.597f, 0.009f, -4.597f)
                lineToRelative(-2.0f, -0.006f)
                close()
                moveTo(17.128f, 17.128f)
                curveToRelative(-1.816f, 1.816f, -3.887f, 3.114f, -6.251f, 3.909f)
                curveToRelative(-0.467f, -0.584f, -0.922f, -1.169f, -1.36f, -1.75f)
                curveToRelative(2.338f, -0.69f, 4.387f, -1.908f, 6.124f, -3.645f)
                curveToRelative(1.236f, -1.235f, 2.208f, -2.628f, 2.915f, -4.171f)
                curveToRelative(-0.562f, -0.432f, -1.109f, -0.839f, -1.638f, -1.223f)
                curveToRelative(-0.617f, 1.479f, -1.512f, 2.8f, -2.692f, 3.979f)
                curveToRelative(-1.686f, 1.686f, -3.659f, 2.789f, -5.973f, 3.333f)
                curveToRelative(-2.807f, -3.958f, -4.631f, -7.397f, -4.22f, -8.182f)
                curveToRelative(0.364f, -0.363f, 0.966f, -0.386f, 1.831f, -0.381f)
                curveToRelative(0.837f, 0.006f, 1.789f, 0.012f, 2.458f, -0.657f)
                curveToRelative(0.667f, -0.667f, 0.666f, -1.624f, 0.666f, -2.469f)
                curveToRelative(0.0f, -0.753f, 0.0f, -1.465f, 0.375f, -1.845f)
                curveToRelative(1.022f, -0.531f, 6.428f, 2.638f, 11.675f, 6.849f)
                curveToRelative(-0.796f, 2.364f, -2.094f, 4.435f, -3.909f, 6.25f)
                close()
            }
        }
        .build()
        return _hatCowboy!!
    }

private var _hatCowboy: ImageVector? = null
