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

public val Icons.Filled.ChartLineUpDown: ImageVector
    get() {
        if (_chartLineUpDown != null) {
            return _chartLineUpDown!!
        }
        _chartLineUpDown = Builder(name = "ChartLineUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.586f)
                lineToRelative(-7.0f, 7.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-5.293f, 5.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(6.707f, -6.707f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(5.586f, -5.586f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(2.0f, 21.0f)
                lineTo(2.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(22.0f, 15.586f)
                lineToRelative(-3.793f, -3.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.793f, 3.793f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _chartLineUpDown!!
    }

private var _chartLineUpDown: ImageVector? = null
