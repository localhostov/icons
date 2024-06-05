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

public val Icons.Filled.HockeyStickPuck: ImageVector
    get() {
        if (_hockeyStickPuck != null) {
            return _hockeyStickPuck!!
        }
        _hockeyStickPuck = Builder(name = "HockeyStickPuck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.187f, 0.026f)
                lineToRelative(-8.664f, 16.974f)
                lineTo(3.5f, 17.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(6.246f)
                curveToRelative(1.511f, 0.0f, 2.875f, -0.836f, 3.562f, -2.181f)
                lineTo(23.968f, 0.936f)
                lineTo(22.187f, 0.026f)
                close()
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _hockeyStickPuck!!
    }

private var _hockeyStickPuck: ImageVector? = null
