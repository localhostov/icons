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

public val Icons.Filled.BoltAuto: ImageVector
    get() {
        if (_boltAuto != null) {
            return _boltAuto!!
        }
        _boltAuto = Builder(name = "BoltAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.447f, 22.74f)
                lineToRelative(-2.43f, -7.17f)
                curveToRelative(-0.316f, -0.917f, -1.107f, -1.509f, -2.018f, -1.509f)
                reflectiveCurveToRelative(-1.702f, 0.593f, -2.018f, 1.513f)
                lineToRelative(-2.429f, 7.166f)
                curveToRelative(-0.177f, 0.523f, 0.103f, 1.091f, 0.626f, 1.269f)
                curveToRelative(0.524f, 0.178f, 1.09f, -0.104f, 1.268f, -0.626f)
                lineToRelative(0.469f, -1.383f)
                horizontalLineToRelative(4.168f)
                lineToRelative(0.469f, 1.383f)
                curveToRelative(0.142f, 0.416f, 0.53f, 0.679f, 0.947f, 0.679f)
                curveToRelative(0.106f, 0.0f, 0.215f, -0.017f, 0.321f, -0.053f)
                curveToRelative(0.523f, -0.178f, 0.804f, -0.745f, 0.626f, -1.269f)
                close()
                moveTo(17.593f, 20.0f)
                lineToRelative(1.281f, -3.779f)
                curveToRelative(0.075f, -0.221f, 0.177f, -0.217f, 0.25f, -0.004f)
                lineToRelative(1.282f, 3.783f)
                horizontalLineToRelative(-2.813f)
                close()
                moveTo(15.495f, 12.546f)
                lineToRelative(-6.42f, 10.457f)
                curveToRelative(-0.432f, 0.65f, -1.057f, 1.0f, -1.699f, 1.0f)
                curveToRelative(-0.259f, 0.0f, -0.521f, -0.057f, -0.773f, -0.174f)
                curveToRelative(-0.925f, -0.428f, -1.373f, -1.521f, -1.064f, -2.6f)
                lineToRelative(1.204f, -5.226f)
                horizontalLineToRelative(-3.83f)
                curveToRelative(-1.08f, 0.0f, -2.064f, -0.593f, -2.57f, -1.547f)
                curveToRelative(-0.506f, -0.954f, -0.443f, -2.103f, 0.163f, -2.996f)
                lineTo(6.924f, 1.001f)
                curveToRelative(0.607f, -0.912f, 1.593f, -1.233f, 2.473f, -0.826f)
                curveToRelative(0.925f, 0.428f, 1.373f, 1.521f, 1.064f, 2.6f)
                lineToRelative(-1.205f, 5.227f)
                lineToRelative(3.833f, 0.003f)
                curveToRelative(1.079f, 0.0f, 2.063f, 0.593f, 2.569f, 1.547f)
                curveToRelative(0.505f, 0.953f, 0.443f, 2.102f, -0.163f, 2.995f)
                close()
            }
        }
        .build()
        return _boltAuto!!
    }

private var _boltAuto: ImageVector? = null
