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

public val Icons.Bold.MugAlt: ImageVector
    get() {
        if (_mugAlt != null) {
            return _mugAlt!!
        }
        _mugAlt = Builder(name = "MugAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.037f, 479.124f)
                curveToRelative(0.0f, 17.617f, -14.281f, 31.898f, -31.898f, 31.898f)
                horizontalLineTo(31.898f)
                curveTo(14.281f, 511.022f, 0.0f, 496.741f, 0.0f, 479.124f)
                reflectiveCurveToRelative(14.281f, -31.898f, 31.898f, -31.898f)
                horizontalLineToRelative(340.242f)
                curveTo(389.756f, 447.227f, 404.037f, 461.508f, 404.037f, 479.124f)
                close()
                moveTo(512.0f, 181.413f)
                curveToRelative(0.0f, 63.923f, -51.036f, 138.223f, -116.958f, 138.223f)
                horizontalLineToRelative(-31.642f)
                curveToRelative(-11.996f, 50.056f, -56.745f, 85.361f, -108.218f, 85.379f)
                horizontalLineTo(148.856f)
                curveToRelative(-54.821f, 0.118f, -101.617f, -39.586f, -110.43f, -93.694f)
                lineTo(1.34f, 108.665f)
                curveTo(-7.316f, 58.589f, 26.261f, 10.978f, 76.337f, 2.323f)
                curveToRelative(5.157f, -0.891f, 10.38f, -1.341f, 15.613f, -1.345f)
                horizontalLineToRelative(220.136f)
                curveToRelative(48.162f, -0.025f, 88.12f, 37.247f, 91.44f, 85.294f)
                curveTo(471.49f, 89.058f, 512.0f, 123.997f, 512.0f, 181.413f)
                close()
                moveTo(339.923f, 97.16f)
                curveToRelative(2.337f, -15.373f, -8.23f, -29.73f, -23.603f, -32.067f)
                curveToRelative(-1.401f, -0.213f, -2.816f, -0.32f, -4.233f, -0.32f)
                horizontalLineTo(91.95f)
                curveToRelative(-15.549f, 0.06f, -28.106f, 12.713f, -28.047f, 28.263f)
                curveToRelative(0.006f, 1.553f, 0.14f, 3.103f, 0.402f, 4.634f)
                lineToRelative(37.15f, 202.678f)
                curveToRelative(3.606f, 23.423f, 23.702f, 40.75f, 47.4f, 40.872f)
                horizontalLineToRelative(106.326f)
                curveToRelative(23.61f, 0.03f, 43.745f, -17.095f, 47.506f, -40.404f)
                verticalLineToRelative(-0.51f)
                lineTo(339.923f, 97.16f)
                close()
                moveTo(448.205f, 181.413f)
                curveToRelative(0.0f, -9.548f, 0.0f, -31.898f, -53.014f, -31.898f)
                lineToRelative(-19.479f, 106.326f)
                horizontalLineToRelative(19.33f)
                curveTo(419.39f, 255.841f, 448.205f, 215.437f, 448.205f, 181.413f)
                close()
            }
        }
        .build()
        return _mugAlt!!
    }

private var _mugAlt: ImageVector? = null
