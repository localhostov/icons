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

public val Icons.Filled.PlugConnection: ImageVector
    get() {
        if (_plugConnection != null) {
            return _plugConnection!!
        }
        _plugConnection = Builder(name = "PlugConnection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.707f, 12.707f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.879f, -1.879f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(0.352f, 0.352f)
                lineToRelative(-1.134f, 1.135f)
                curveToRelative(-1.77f, 1.769f, -1.982f, 4.515f, -0.638f, 6.519f)
                lineToRelative(-2.58f, 2.58f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(2.58f, -2.58f)
                curveToRelative(0.865f, 0.58f, 1.868f, 0.871f, 2.871f, 0.871f)
                curveToRelative(1.321f, 0.0f, 2.642f, -0.503f, 3.647f, -1.509f)
                lineToRelative(1.135f, -1.134f)
                lineToRelative(0.352f, 0.352f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-1.879f, -1.879f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                close()
                moveTo(23.707f, 0.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-2.58f, 2.58f)
                curveToRelative(-2.004f, -1.344f, -4.749f, -1.132f, -6.519f, 0.638f)
                lineToRelative(-1.135f, 1.135f)
                lineToRelative(-0.353f, -0.353f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(8.0f, 8.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(1.135f, -1.135f)
                curveToRelative(1.77f, -1.769f, 1.982f, -4.515f, 0.638f, -6.519f)
                lineToRelative(2.58f, -2.58f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _plugConnection!!
    }

private var _plugConnection: ImageVector? = null
