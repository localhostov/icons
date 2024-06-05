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

public val Icons.Bold.Pompebled: ImageVector
    get() {
        if (_pompebled != null) {
            return _pompebled!!
        }
        _pompebled = Builder(name = "Pompebled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.342f, 10.309f)
                curveToRelative(-2.435f, -2.436f, -5.281f, -1.527f, -7.209f, -0.634f)
                curveToRelative(-0.807f, 0.374f, -1.033f, 0.329f, -1.077f, 0.3f)
                curveToRelative(-0.162f, -0.161f, 0.082f, -0.69f, 0.233f, -0.947f)
                curveToRelative(1.663f, -2.831f, 1.462f, -5.311f, -0.598f, -7.37f)
                curveTo(11.485f, -0.549f, 7.894f, -0.549f, 5.688f, 1.658f)
                lineToRelative(-1.272f, 1.272f)
                curveTo(2.207f, 5.138f, 0.609f, 8.488f, 0.142f, 11.891f)
                curveToRelative(-0.528f, 3.84f, 0.395f, 7.167f, 2.598f, 9.37f)
                curveToRelative(1.797f, 1.798f, 4.344f, 2.743f, 7.307f, 2.743f)
                curveToRelative(0.668f, 0.0f, 1.357f, -0.048f, 2.063f, -0.145f)
                curveToRelative(3.403f, -0.468f, 6.753f, -2.065f, 8.961f, -4.273f)
                lineToRelative(1.272f, -1.272f)
                curveToRelative(2.207f, -2.207f, 2.207f, -5.797f, 0.0f, -8.004f)
                close()
                moveTo(20.221f, 16.192f)
                lineToRelative(-1.272f, 1.272f)
                curveToRelative(-1.762f, 1.761f, -4.471f, 3.041f, -7.249f, 3.422f)
                curveToRelative(-2.842f, 0.394f, -5.339f, -0.246f, -6.84f, -1.747f)
                reflectiveCurveToRelative(-2.138f, -3.994f, -1.747f, -6.84f)
                curveToRelative(0.381f, -2.777f, 1.661f, -5.487f, 3.422f, -7.249f)
                lineToRelative(1.272f, -1.272f)
                curveToRelative(0.519f, -0.519f, 1.2f, -0.778f, 1.881f, -0.778f)
                reflectiveCurveToRelative(1.362f, 0.259f, 1.881f, 0.778f)
                curveToRelative(0.903f, 0.903f, 1.24f, 1.842f, 0.132f, 3.729f)
                curveToRelative(-1.01f, 1.719f, -0.923f, 3.434f, 0.232f, 4.589f)
                curveToRelative(1.617f, 1.618f, 3.757f, 0.626f, 4.46f, 0.3f)
                curveToRelative(2.158f, -1.0f, 3.064f, -0.728f, 3.827f, 0.033f)
                curveToRelative(1.037f, 1.037f, 1.037f, 2.725f, 0.0f, 3.762f)
                close()
            }
        }
        .build()
        return _pompebled!!
    }

private var _pompebled: ImageVector? = null
