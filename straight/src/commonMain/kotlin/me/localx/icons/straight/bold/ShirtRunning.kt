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

public val Icons.Bold.ShirtRunning: ImageVector
    get() {
        if (_shirtRunning != null) {
            return _shirtRunning!!
        }
        _shirtRunning = Builder(name = "ShirtRunning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 7.83f)
                curveToRelative(-1.196f, -0.423f, -2.0f, -1.561f, -2.0f, -2.83f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.27f, -0.804f, 2.407f, -2.0f, 2.83f)
                lineToRelative(-1.0f, 0.354f)
                verticalLineToRelative(15.816f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-15.816f)
                lineToRelative(-1.0f, -0.354f)
                close()
                moveTo(7.935f, 8.409f)
                curveToRelative(1.07f, 0.987f, 2.498f, 1.591f, 4.065f, 1.591f)
                reflectiveCurveToRelative(2.995f, -0.604f, 4.065f, -1.591f)
                curveToRelative(0.431f, 0.624f, 0.979f, 1.167f, 1.62f, 1.592f)
                lineToRelative(-11.685f, 8.958f)
                verticalLineToRelative(-8.762f)
                curveToRelative(0.777f, -0.449f, 1.435f, -1.064f, 1.935f, -1.788f)
                close()
                moveTo(8.27f, 21.0f)
                lineToRelative(9.73f, -7.46f)
                verticalLineToRelative(7.46f)
                horizontalLineToRelative(-9.73f)
                close()
            }
        }
        .build()
        return _shirtRunning!!
    }

private var _shirtRunning: ImageVector? = null
