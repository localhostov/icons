package me.localx.icons.rounded.outline

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

public val Icons.Outline.BoltAuto: ImageVector
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
                moveTo(15.658f, 9.551f)
                curveToRelative(-0.506f, -0.954f, -1.49f, -1.547f, -2.569f, -1.547f)
                lineToRelative(-3.833f, -0.003f)
                lineToRelative(1.205f, -5.227f)
                curveToRelative(0.309f, -1.078f, -0.139f, -2.172f, -1.064f, -2.6f)
                curveToRelative(-0.88f, -0.407f, -1.865f, -0.086f, -2.473f, 0.826f)
                lineTo(0.505f, 11.461f)
                curveToRelative(-0.606f, 0.894f, -0.668f, 2.042f, -0.163f, 2.996f)
                curveToRelative(0.505f, 0.954f, 1.49f, 1.547f, 2.57f, 1.547f)
                horizontalLineToRelative(3.83f)
                lineToRelative(-1.204f, 5.226f)
                curveToRelative(-0.309f, 1.079f, 0.139f, 2.172f, 1.064f, 2.6f)
                curveToRelative(0.253f, 0.117f, 0.515f, 0.174f, 0.773f, 0.174f)
                curveToRelative(0.642f, 0.0f, 1.267f, -0.35f, 1.699f, -1.0f)
                lineToRelative(6.42f, -10.457f)
                curveToRelative(0.606f, -0.894f, 0.668f, -2.042f, 0.163f, -2.995f)
                close()
                moveTo(13.815f, 11.461f)
                lineToRelative(-6.364f, 10.365f)
                curveToRelative(0.005f, -0.029f, 1.522f, -6.598f, 1.522f, -6.598f)
                curveToRelative(0.068f, -0.297f, -0.002f, -0.608f, -0.192f, -0.848f)
                curveToRelative(-0.19f, -0.238f, -0.478f, -0.377f, -0.783f, -0.377f)
                lineTo(2.912f, 14.003f)
                curveToRelative(-0.494f, 0.0f, -0.726f, -0.338f, -0.803f, -0.483f)
                curveToRelative(-0.077f, -0.146f, -0.227f, -0.528f, 0.075f, -0.975f)
                lineTo(8.548f, 2.177f)
                curveToRelative(-0.005f, 0.029f, -1.522f, 6.599f, -1.522f, 6.599f)
                curveToRelative(-0.068f, 0.297f, 0.002f, 0.608f, 0.192f, 0.847f)
                reflectiveCurveToRelative(0.478f, 0.378f, 0.782f, 0.378f)
                lineToRelative(5.088f, 0.004f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.494f, 0.0f, 0.726f, 0.338f, 0.803f, 0.483f)
                curveToRelative(0.077f, 0.145f, 0.226f, 0.527f, -0.076f, 0.974f)
                close()
            }
        }
        .build()
        return _boltAuto!!
    }

private var _boltAuto: ImageVector? = null
