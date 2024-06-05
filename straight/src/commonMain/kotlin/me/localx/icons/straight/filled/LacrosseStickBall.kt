package me.localx.icons.straight.filled

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

public val Icons.Filled.LacrosseStickBall: ImageVector
    get() {
        if (_lacrosseStickBall != null) {
            return _lacrosseStickBall!!
        }
        _lacrosseStickBall = Builder(name = "LacrosseStickBall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.384f, 12.458f)
                curveToRelative(1.227f, -1.226f, 1.785f, -2.954f, 1.573f, -4.864f)
                curveToRelative(-0.203f, -1.828f, -1.097f, -3.616f, -2.516f, -5.035f)
                curveToRelative(-2.988f, -2.989f, -7.429f, -3.412f, -9.899f, -0.943f)
                curveToRelative(-0.914f, 0.914f, -1.462f, 2.121f, -1.585f, 3.493f)
                curveToRelative(-0.08f, 0.886f, -0.635f, 1.757f, -1.524f, 2.388f)
                curveToRelative(-1.962f, 1.394f, -2.843f, 3.829f, -2.243f, 6.202f)
                curveToRelative(0.169f, 0.667f, 0.462f, 1.291f, 0.852f, 1.846f)
                lineTo(0.062f, 22.523f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(6.979f, -6.979f)
                curveToRelative(0.555f, 0.39f, 1.179f, 0.683f, 1.846f, 0.852f)
                curveToRelative(0.495f, 0.125f, 0.993f, 0.186f, 1.483f, 0.186f)
                curveToRelative(1.86f, 0.0f, 3.615f, -0.875f, 4.718f, -2.429f)
                curveToRelative(0.631f, -0.889f, 1.502f, -1.444f, 2.389f, -1.523f)
                curveToRelative(1.373f, -0.124f, 2.58f, -0.673f, 3.492f, -1.586f)
                close()
                moveTo(24.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _lacrosseStickBall!!
    }

private var _lacrosseStickBall: ImageVector? = null
