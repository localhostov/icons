package me.localx.icons.rounded.bold

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

public val Icons.Bold.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.212f, 2.715f)
                curveToRelative(1.149f, -3.574f, 6.428f, -3.572f, 7.577f, 0.0f)
                curveToRelative(0.215f, 0.633f, -0.294f, 1.285f, -0.962f, 1.285f)
                horizontalLineToRelative(-5.653f)
                curveToRelative(-0.668f, 0.0f, -1.177f, -0.652f, -0.962f, -1.285f)
                close()
                moveTo(24.0f, 12.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.084f)
                curveToRelative(-0.673f, 1.657f, -1.885f, 3.039f, -3.418f, 3.927f)
                curveToRelative(0.08f, 3.391f, -4.722f, 4.23f, -5.826f, 1.073f)
                horizontalLineToRelative(-2.344f)
                curveToRelative(-1.106f, 3.158f, -5.906f, 2.317f, -5.826f, -1.073f)
                curveTo(1.467f, 19.035f, -0.11f, 14.002f, 1.866f, 10.382f)
                curveTo(-1.477f, 8.332f, 0.021f, 2.968f, 4.0f, 3.0f)
                curveToRelative(1.971f, 0.034f, 1.972f, 2.966f, 0.0f, 3.0f)
                curveToRelative(-1.16f, -0.01f, -1.361f, 1.696f, -0.25f, 1.969f)
                curveToRelative(1.406f, -1.225f, 3.243f, -1.969f, 5.25f, -1.969f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.096f, 0.0f, 0.191f, 0.002f, 0.287f, 0.006f)
                curveToRelative(0.658f, -1.963f, 2.336f, -2.702f, 3.501f, -2.979f)
                curveToRelative(0.621f, -0.148f, 1.212f, 0.34f, 1.212f, 0.978f)
                verticalLineToRelative(3.756f)
                curveToRelative(1.059f, 0.85f, 1.897f, 1.963f, 2.416f, 3.24f)
                horizontalLineToRelative(0.084f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(4.0f, 14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(6.609f, -0.211f, 6.605f, -9.791f, 0.0f, -10.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.967f, 0.0f, -3.0f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.967f, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
