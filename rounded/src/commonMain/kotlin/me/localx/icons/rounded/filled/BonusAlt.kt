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

public val Icons.Filled.BonusAlt: ImageVector
    get() {
        if (_bonusAlt != null) {
            return _bonusAlt!!
        }
        _bonusAlt = Builder(name = "BonusAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.286f, 9.703f)
                curveToRelative(-0.176f, 0.0f, -0.352f, -0.056f, -0.5f, -0.166f)
                curveToRelative(-0.283f, -0.212f, -0.401f, -0.58f, -0.295f, -0.917f)
                lineToRelative(0.784f, -2.513f)
                lineToRelative(-1.981f, -1.612f)
                curveToRelative(-0.267f, -0.226f, -0.364f, -0.594f, -0.243f, -0.922f)
                curveToRelative(0.12f, -0.328f, 0.433f, -0.546f, 0.782f, -0.546f)
                horizontalLineToRelative(2.501f)
                lineToRelative(0.885f, -2.483f)
                curveToRelative(0.121f, -0.326f, 0.433f, -0.542f, 0.781f, -0.542f)
                reflectiveCurveToRelative(0.66f, 0.216f, 0.781f, 0.542f)
                lineToRelative(0.885f, 2.483f)
                horizontalLineToRelative(2.501f)
                curveToRelative(0.35f, 0.0f, 0.663f, 0.219f, 0.783f, 0.548f)
                reflectiveCurveToRelative(0.022f, 0.698f, -0.246f, 0.923f)
                lineToRelative(-1.971f, 1.606f)
                lineToRelative(0.815f, 2.484f)
                curveToRelative(0.111f, 0.336f, -0.002f, 0.706f, -0.282f, 0.922f)
                curveToRelative(-0.281f, 0.216f, -0.667f, 0.231f, -0.964f, 0.038f)
                lineToRelative(-2.295f, -1.495f)
                lineToRelative(-2.257f, 1.51f)
                curveToRelative(-0.14f, 0.094f, -0.302f, 0.141f, -0.463f, 0.141f)
                close()
                moveTo(23.337f, 12.345f)
                lineToRelative(-7.702f, 8.409f)
                curveToRelative(-1.894f, 2.068f, -4.57f, 3.246f, -7.374f, 3.246f)
                horizontalLineToRelative(-4.262f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(7.787f)
                curveToRelative(1.374f, 0.0f, 2.46f, 1.26f, 2.164f, 2.685f)
                curveToRelative(-0.193f, 0.926f, -1.004f, 1.598f, -1.94f, 1.732f)
                lineToRelative(-4.162f, 0.583f)
                curveToRelative(-0.547f, 0.078f, -0.927f, 0.585f, -0.848f, 1.131f)
                curveToRelative(0.078f, 0.547f, 0.585f, 0.926f, 1.131f, 0.848f)
                lineToRelative(4.252f, -0.596f)
                curveToRelative(2.062f, -0.294f, 3.617f, -2.087f, 3.617f, -4.17f)
                curveToRelative(0.0f, -0.219f, -0.032f, -0.429f, -0.065f, -0.638f)
                lineToRelative(3.541f, -3.737f)
                curveToRelative(0.455f, -0.5f, 1.097f, -0.803f, 1.794f, -0.835f)
                curveToRelative(0.692f, -0.034f, 1.363f, 0.209f, 1.878f, 0.678f)
                curveToRelative(1.052f, 0.958f, 1.138f, 2.602f, 0.189f, 3.665f)
                close()
            }
        }
        .build()
        return _bonusAlt!!
    }

private var _bonusAlt: ImageVector? = null
