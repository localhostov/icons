package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 513.806f, viewportHeight = 513.806f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(66.074f, 228.731f)
                curveTo(81.577f, 123.379f, 179.549f, 50.542f, 284.901f, 66.045f)
                curveToRelative(35.944f, 5.289f, 69.662f, 20.626f, 97.27f, 44.244f)
                lineToRelative(-24.853f, 24.853f)
                curveToRelative(-8.33f, 8.332f, -8.328f, 21.84f, 0.005f, 30.17f)
                curveToRelative(3.999f, 3.998f, 9.423f, 6.245f, 15.078f, 6.246f)
                horizontalLineToRelative(97.835f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                verticalLineTo(52.39f)
                curveToRelative(-0.003f, -11.782f, -9.556f, -21.331f, -21.338f, -21.329f)
                curveToRelative(-5.655f, 0.001f, -11.079f, 2.248f, -15.078f, 6.246f)
                lineTo(427.418f, 65.04f)
                curveTo(321.658f, -29.235f, 159.497f, -19.925f, 65.222f, 85.835f)
                curveToRelative(-33.399f, 37.467f, -55.073f, 83.909f, -62.337f, 133.573f)
                curveToRelative(-2.864f, 17.607f, 9.087f, 34.202f, 26.693f, 37.066f)
                curveToRelative(1.586f, 0.258f, 3.188f, 0.397f, 4.795f, 0.417f)
                curveTo(50.481f, 256.717f, 64.002f, 244.706f, 66.074f, 228.731f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.429f, 256.891f)
                curveToRelative(-16.108f, 0.174f, -29.629f, 12.185f, -31.701f, 28.16f)
                curveTo(432.225f, 390.403f, 334.253f, 463.24f, 228.901f, 447.738f)
                curveToRelative(-35.944f, -5.289f, -69.662f, -20.626f, -97.27f, -44.244f)
                lineToRelative(24.853f, -24.853f)
                curveToRelative(8.33f, -8.332f, 8.328f, -21.84f, -0.005f, -30.17f)
                curveToRelative(-3.999f, -3.998f, -9.423f, -6.245f, -15.078f, -6.246f)
                horizontalLineTo(43.568f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                verticalLineToRelative(97.835f)
                curveToRelative(0.003f, 11.782f, 9.556f, 21.331f, 21.338f, 21.329f)
                curveToRelative(5.655f, -0.001f, 11.079f, -2.248f, 15.078f, -6.246f)
                lineToRelative(27.733f, -27.733f)
                curveToRelative(105.735f, 94.285f, 267.884f, 85.004f, 362.17f, -20.732f)
                curveToRelative(33.417f, -37.475f, 55.101f, -83.933f, 62.363f, -133.615f)
                curveToRelative(2.876f, -17.605f, -9.064f, -34.208f, -26.668f, -37.084f)
                curveTo(482.655f, 257.051f, 481.044f, 256.91f, 479.429f, 256.891f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
