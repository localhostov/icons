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

public val Icons.Filled.ShishKebab: ImageVector
    get() {
        if (_shishKebab != null) {
            return _shishKebab!!
        }
        _shishKebab = Builder(name = "ShishKebab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                curveToRelative(0.0f, 0.952f, -0.423f, 1.838f, -1.293f, 2.708f)
                curveToRelative(-0.391f, 0.39f, -1.023f, 0.39f, -1.414f, 0.0f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.415f)
                curveToRelative(0.634f, -0.633f, 0.707f, -1.041f, 0.707f, -1.292f)
                curveToRelative(0.0f, -0.662f, -0.317f, -1.265f, -0.871f, -1.654f)
                curveToRelative(-0.654f, -0.458f, -1.604f, -0.458f, -2.258f, 0.0f)
                curveToRelative(-0.73f, 0.512f, -1.043f, 1.42f, -0.777f, 2.259f)
                curveToRelative(0.402f, 1.272f, 0.058f, 2.657f, -0.899f, 3.614f)
                lineToRelative(-1.201f, 1.201f)
                lineToRelative(1.059f, 1.052f)
                curveToRelative(1.264f, 1.264f, 1.264f, 3.314f, 0.0f, 4.579f)
                curveToRelative(-1.264f, 1.264f, -3.314f, 1.264f, -4.579f, 0.0f)
                lineToRelative(-1.059f, -1.052f)
                lineToRelative(-1.408f, 1.408f)
                lineToRelative(1.072f, 1.065f)
                curveToRelative(1.264f, 1.264f, 1.264f, 3.314f, 0.0f, 4.579f)
                reflectiveCurveToRelative(-3.314f, 1.264f, -4.579f, 0.0f)
                lineToRelative(-1.072f, -1.065f)
                lineToRelative(-3.721f, 3.721f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(3.716f, -3.716f)
                lineToRelative(-1.061f, -1.054f)
                curveToRelative(-1.264f, -1.264f, -1.264f, -3.314f, 0.0f, -4.579f)
                reflectiveCurveToRelative(3.32f, -1.259f, 4.579f, 0.0f)
                lineToRelative(1.061f, 1.054f)
                lineToRelative(1.408f, -1.408f)
                lineToRelative(-1.074f, -1.067f)
                curveToRelative(-1.264f, -1.264f, -1.264f, -3.314f, 0.0f, -4.579f)
                curveToRelative(1.259f, -1.259f, 3.32f, -1.259f, 4.579f, 0.0f)
                lineToRelative(1.074f, 1.067f)
                lineToRelative(1.206f, -1.206f)
                curveToRelative(0.428f, -0.427f, 0.583f, -1.039f, 0.407f, -1.596f)
                curveToRelative(-0.531f, -1.675f, 0.086f, -3.483f, 1.535f, -4.5f)
                curveToRelative(1.34f, -0.94f, 3.213f, -0.94f, 4.555f, 0.0f)
                curveToRelative(1.095f, 0.769f, 1.723f, 1.968f, 1.723f, 3.291f)
                close()
            }
        }
        .build()
        return _shishKebab!!
    }

private var _shishKebab: ImageVector? = null
