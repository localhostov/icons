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

public val Icons.Bold.LacrosseStick: ImageVector
    get() {
        if (_lacrosseStick != null) {
            return _lacrosseStick!!
        }
        _lacrosseStick = Builder(name = "LacrosseStick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.437f, 2.563f)
                curveToRelative(-3.022f, -3.022f, -7.542f, -3.418f, -10.076f, -0.884f)
                curveToRelative(-0.951f, 0.951f, -1.521f, 2.204f, -1.649f, 3.622f)
                curveToRelative(-0.06f, 0.667f, -0.495f, 1.334f, -1.194f, 1.831f)
                curveToRelative(-2.031f, 1.442f, -2.942f, 3.959f, -2.322f, 6.411f)
                curveToRelative(0.136f, 0.536f, 0.349f, 1.045f, 0.626f, 1.514f)
                lineTo(0.042f, 21.837f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(6.779f, -6.779f)
                curveToRelative(0.47f, 0.277f, 0.979f, 0.491f, 1.515f, 0.626f)
                curveToRelative(0.51f, 0.129f, 1.023f, 0.191f, 1.529f, 0.191f)
                curveToRelative(1.923f, 0.0f, 3.739f, -0.906f, 4.881f, -2.514f)
                curveToRelative(0.497f, -0.699f, 1.165f, -1.135f, 1.831f, -1.195f)
                curveToRelative(1.418f, -0.127f, 2.671f, -0.697f, 3.622f, -1.648f)
                curveToRelative(2.534f, -2.534f, 2.138f, -7.054f, -0.884f, -10.076f)
                close()
                moveTo(20.2f, 10.518f)
                curveToRelative(-0.566f, 0.565f, -1.274f, 0.737f, -1.77f, 0.782f)
                curveToRelative(-1.542f, 0.139f, -3.002f, 1.03f, -4.008f, 2.445f)
                curveToRelative(-0.573f, 0.808f, -1.723f, 1.532f, -3.229f, 1.152f)
                curveToRelative(-1.013f, -0.256f, -1.833f, -1.076f, -2.09f, -2.089f)
                curveToRelative(-0.381f, -1.507f, 0.345f, -2.657f, 1.151f, -3.23f)
                curveToRelative(1.415f, -1.005f, 2.306f, -2.466f, 2.445f, -4.008f)
                curveToRelative(0.044f, -0.495f, 0.216f, -1.204f, 0.782f, -1.77f)
                curveToRelative(0.536f, -0.536f, 1.283f, -0.792f, 2.104f, -0.792f)
                curveToRelative(1.235f, 0.0f, 2.637f, 0.583f, 3.73f, 1.676f)
                curveToRelative(1.82f, 1.821f, 2.225f, 4.493f, 0.884f, 5.834f)
                close()
            }
        }
        .build()
        return _lacrosseStick!!
    }

private var _lacrosseStick: ImageVector? = null
