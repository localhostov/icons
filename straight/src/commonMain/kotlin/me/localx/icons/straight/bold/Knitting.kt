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

public val Icons.Bold.Knitting: ImageVector
    get() {
        if (_knitting != null) {
            return _knitting!!
        }
        _knitting = Builder(name = "Knitting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 4.5f)
                curveToRelative(-1.317f, 0.0f, -2.385f, 1.022f, -2.481f, 2.314f)
                lineToRelative(-2.22f, 1.614f)
                curveToRelative(-0.55f, -0.66f, -1.188f, -1.241f, -1.895f, -1.732f)
                lineToRelative(0.953f, -1.732f)
                curveToRelative(1.21f, -0.175f, 2.143f, -1.206f, 2.143f, -2.464f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.366f, 0.083f, 0.712f, 0.225f, 1.025f)
                lineToRelative(-1.029f, 1.87f)
                curveToRelative(-0.856f, -0.254f, -1.759f, -0.395f, -2.696f, -0.395f)
                curveTo(4.262f, 5.0f, 0.0f, 9.262f, 0.0f, 14.5f)
                reflectiveCurveToRelative(4.262f, 9.5f, 9.5f, 9.5f)
                reflectiveCurveToRelative(9.5f, -4.262f, 9.5f, -9.5f)
                curveToRelative(0.0f, -1.228f, -0.242f, -2.399f, -0.668f, -3.478f)
                lineToRelative(2.313f, -1.682f)
                curveToRelative(0.268f, 0.098f, 0.553f, 0.16f, 0.855f, 0.16f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(14.618f, 18.494f)
                curveToRelative(-0.04f, 0.0f, -0.078f, 0.006f, -0.117f, 0.006f)
                curveToRelative(-1.181f, 0.0f, -2.295f, -0.282f, -3.29f, -0.771f)
                curveToRelative(1.792f, -0.401f, 3.428f, -1.27f, 4.749f, -2.517f)
                curveToRelative(-0.135f, 1.23f, -0.617f, 2.354f, -1.341f, 3.281f)
                close()
                moveTo(13.934f, 9.76f)
                curveToRelative(0.503f, 0.47f, 0.935f, 1.015f, 1.268f, 1.624f)
                curveToRelative(-1.265f, 2.213f, -3.619f, 3.617f, -6.202f, 3.617f)
                curveToRelative(-0.291f, 0.0f, -0.581f, -0.024f, -0.869f, -0.059f)
                curveToRelative(-0.375f, -0.604f, -0.666f, -1.264f, -0.859f, -1.966f)
                curveToRelative(2.591f, -0.105f, 4.991f, -1.285f, 6.661f, -3.215f)
                close()
                moveTo(11.252f, 8.247f)
                curveToRelative(-1.118f, 1.064f, -2.599f, 1.698f, -4.178f, 1.742f)
                curveToRelative(0.077f, -0.574f, 0.219f, -1.131f, 0.427f, -1.67f)
                curveToRelative(0.631f, -0.205f, 1.302f, -0.318f, 2.0f, -0.318f)
                curveToRelative(0.607f, 0.0f, 1.193f, 0.09f, 1.751f, 0.246f)
                close()
                moveTo(3.0f, 14.5f)
                curveToRelative(0.0f, -1.269f, 0.371f, -2.45f, 1.002f, -3.452f)
                curveToRelative(0.02f, 4.499f, 2.888f, 8.328f, 6.887f, 9.799f)
                curveToRelative(-0.448f, 0.098f, -0.912f, 0.153f, -1.389f, 0.153f)
                curveToRelative(-3.584f, 0.0f, -6.5f, -2.916f, -6.5f, -6.5f)
                close()
            }
        }
        .build()
        return _knitting!!
    }

private var _knitting: ImageVector? = null
