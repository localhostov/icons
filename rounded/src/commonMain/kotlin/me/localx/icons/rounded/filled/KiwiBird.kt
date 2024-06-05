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

public val Icons.Filled.KiwiBird: ImageVector
    get() {
        if (_kiwiBird != null) {
            return _kiwiBird!!
        }
        _kiwiBird = Builder(name = "KiwiBird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.62f, 5.902f)
                curveToRelative(0.453f, -1.148f, 0.478f, -2.472f, -0.169f, -3.736f)
                curveToRelative(-0.339f, -0.663f, -0.878f, -1.224f, -1.531f, -1.583f)
                curveToRelative(-1.623f, -0.892f, -3.512f, -0.676f, -4.817f, 0.434f)
                curveToRelative(-1.169f, 0.995f, -2.822f, 1.955f, -5.131f, 1.955f)
                curveTo(4.446f, 2.973f, 0.328f, 6.617f, 0.021f, 10.982f)
                curveToRelative(-0.172f, 2.441f, 0.717f, 4.829f, 2.439f, 6.55f)
                curveToRelative(0.848f, 0.848f, 1.861f, 1.485f, 2.958f, 1.899f)
                lineToRelative(0.451f, 3.608f)
                curveToRelative(0.066f, 0.532f, 0.519f, 0.931f, 1.055f, 0.931f)
                horizontalLineToRelative(0.044f)
                curveToRelative(0.639f, 0.0f, 1.134f, -0.56f, 1.055f, -1.194f)
                lineToRelative(-0.35f, -2.832f)
                curveToRelative(0.234f, 0.02f, 0.469f, 0.035f, 0.705f, 0.035f)
                curveToRelative(0.198f, 0.0f, 0.396f, -0.007f, 0.595f, -0.021f)
                curveToRelative(0.486f, -0.034f, 0.958f, -0.116f, 1.418f, -0.227f)
                lineToRelative(0.413f, 3.307f)
                curveToRelative(0.066f, 0.532f, 0.519f, 0.931f, 1.055f, 0.931f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.646f, 0.0f, 1.143f, -0.572f, 1.053f, -1.212f)
                lineToRelative(-0.534f, -3.776f)
                curveToRelative(2.726f, -1.433f, 4.609f, -4.288f, 4.609f, -7.494f)
                lineToRelative(0.005f, -1.248f)
                curveToRelative(0.003f, -0.914f, 0.592f, -1.689f, 1.436f, -2.039f)
                lineToRelative(0.013f, -0.005f)
                curveToRelative(3.37f, 2.647f, 4.246f, 6.947f, 4.448f, 8.34f)
                curveToRelative(0.037f, 0.259f, 0.258f, 0.451f, 0.52f, 0.451f)
                curveToRelative(0.295f, 0.0f, 0.533f, -0.243f, 0.525f, -0.538f)
                curveToRelative(-0.135f, -5.256f, -2.217f, -8.952f, -3.315f, -10.548f)
                close()
                moveTo(17.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _kiwiBird!!
    }

private var _kiwiBird: ImageVector? = null
