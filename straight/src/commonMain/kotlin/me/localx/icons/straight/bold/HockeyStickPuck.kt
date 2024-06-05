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

public val Icons.Bold.HockeyStickPuck: ImageVector
    get() {
        if (_hockeyStickPuck != null) {
            return _hockeyStickPuck!!
        }
        _hockeyStickPuck = Builder(name = "HockeyStickPuck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.319f, 0.072f)
                lineToRelative(-8.171f, 15.928f)
                lineTo(4.0f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(5.667f)
                curveToRelative(1.695f, 0.0f, 3.23f, -0.938f, 4.005f, -2.446f)
                lineTo(23.989f, 1.441f)
                lineTo(21.319f, 0.072f)
                close()
                moveTo(11.002f, 20.185f)
                curveToRelative(-0.258f, 0.503f, -0.77f, 0.815f, -1.335f, 0.815f)
                horizontalLineToRelative(-5.667f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.61f)
                lineToRelative(-0.608f, 1.185f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _hockeyStickPuck!!
    }

private var _hockeyStickPuck: ImageVector? = null
