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

public val Icons.Filled.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.799f, 14.201f)
                curveToRelative(2.439f, 2.439f, 2.851f, 6.138f, 1.236f, 9.003f)
                curveToRelative(-0.519f, 0.921f, -1.796f, 1.065f, -2.544f, 0.318f)
                lineToRelative(-3.299f, -3.299f)
                lineToRelative(-0.985f, 0.985f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(0.985f, -0.985f)
                lineTo(0.479f, 15.509f)
                curveToRelative(-0.747f, -0.747f, -0.603f, -2.025f, 0.318f, -2.544f)
                curveToRelative(2.865f, -1.615f, 6.563f, -1.203f, 9.003f, 1.236f)
                close()
                moveTo(22.911f, 1.09f)
                curveToRelative(-1.453f, -1.453f, -3.808f, -1.453f, -5.26f, 0.0f)
                lineToRelative(-9.519f, 9.496f)
                curveToRelative(1.206f, 0.424f, 2.315f, 1.107f, 3.245f, 2.037f)
                curveToRelative(0.922f, 0.922f, 1.601f, 2.019f, 2.026f, 3.213f)
                lineToRelative(9.508f, -9.486f)
                curveToRelative(1.452f, -1.453f, 1.452f, -3.807f, 0.0f, -5.26f)
                close()
                moveTo(5.658f, 10.236f)
                lineToRelative(6.629f, -6.613f)
                lineToRelative(-1.744f, -1.744f)
                curveToRelative(-1.134f, -1.135f, -3.112f, -1.132f, -4.242f, 0.0f)
                lineToRelative(-2.379f, 2.378f)
                curveToRelative(-1.17f, 1.169f, -1.17f, 3.073f, 0.0f, 4.243f)
                lineToRelative(1.736f, 1.736f)
                close()
                moveTo(20.349f, 11.737f)
                lineToRelative(-6.629f, 6.613f)
                lineToRelative(1.802f, 1.802f)
                curveToRelative(0.566f, 0.566f, 1.32f, 0.878f, 2.121f, 0.878f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.878f)
                lineToRelative(2.379f, -2.378f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.312f, -1.555f, -0.879f, -2.121f)
                lineToRelative(-1.794f, -1.794f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
