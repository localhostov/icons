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

public val Icons.Filled.LacrosseStick: ImageVector
    get() {
        if (_lacrosseStick != null) {
            return _lacrosseStick!!
        }
        _lacrosseStick = Builder(name = "LacrosseStick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.957f, 7.593f)
                curveToRelative(-0.203f, -1.827f, -1.096f, -3.615f, -2.516f, -5.034f)
                curveTo(20.022f, 1.14f, 18.234f, 0.247f, 16.407f, 0.043f)
                curveToRelative(-1.908f, -0.213f, -3.638f, 0.347f, -4.865f, 1.572f)
                curveToRelative(-0.914f, 0.913f, -1.462f, 2.121f, -1.585f, 3.493f)
                curveToRelative(-0.08f, 0.887f, -0.635f, 1.757f, -1.524f, 2.389f)
                curveToRelative(-1.962f, 1.394f, -2.843f, 3.829f, -2.243f, 6.202f)
                curveToRelative(0.168f, 0.666f, 0.47f, 1.284f, 0.859f, 1.838f)
                lineTo(0.293f, 22.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(6.756f, -6.756f)
                curveToRelative(0.554f, 0.389f, 1.172f, 0.691f, 1.839f, 0.859f)
                curveToRelative(0.495f, 0.125f, 0.993f, 0.186f, 1.483f, 0.186f)
                curveToRelative(1.86f, 0.0f, 3.615f, -0.875f, 4.718f, -2.429f)
                curveToRelative(0.631f, -0.889f, 1.501f, -1.444f, 2.389f, -1.523f)
                curveToRelative(1.372f, -0.124f, 2.579f, -0.673f, 3.492f, -1.586f)
                curveToRelative(1.227f, -1.226f, 1.785f, -2.954f, 1.573f, -4.865f)
                close()
            }
        }
        .build()
        return _lacrosseStick!!
    }

private var _lacrosseStick: ImageVector? = null
