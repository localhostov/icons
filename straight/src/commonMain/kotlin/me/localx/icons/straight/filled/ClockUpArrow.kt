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

public val Icons.Filled.ClockUpArrow: ImageVector
    get() {
        if (_clockUpArrow != null) {
            return _clockUpArrow!!
        }
        _clockUpArrow = Builder(name = "ClockUpArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 17.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(7.934f)
                curveToRelative(-0.147f, -1.759f, -0.657f, -3.473f, -1.541f, -5.001f)
                curveTo(19.455f, 0.92f, 13.047f, -1.519f, 7.186f, 1.004f)
                curveTo(3.731f, 2.491f, 1.131f, 5.595f, 0.306f, 9.266f)
                curveToRelative(-0.906f, 4.033f, 0.236f, 8.08f, 2.968f, 10.971f)
                curveToRelative(0.449f, 0.475f, 0.937f, 0.896f, 1.444f, 1.286f)
                lineToRelative(6.492f, -6.492f)
                curveToRelative(0.782f, -0.782f, 2.05f, -0.781f, 2.831f, 0.002f)
                lineToRelative(1.961f, 1.967f)
                close()
                moveTo(7.07f, 13.719f)
                lineToRelative(3.93f, -2.403f)
                verticalLineToRelative(-5.315f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.437f)
                lineToRelative(-4.887f, 2.989f)
                lineToRelative(-1.043f, -1.707f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.604f)
                lineToRelative(-6.125f, 6.124f)
                lineToRelative(-3.25f, -3.25f)
                lineToRelative(-4.648f, 4.648f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(6.063f, -6.062f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(4.693f, -4.692f)
                horizontalLineToRelative(-2.568f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _clockUpArrow!!
    }

private var _clockUpArrow: ImageVector? = null
