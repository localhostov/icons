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

public val Icons.Filled.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) {
            return _chartLineUp!!
        }
        _chartLineUp = Builder(name = "ChartLineUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(17.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-5.586f, 5.586f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-6.707f, 6.707f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.293f, -5.293f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(7.0f, -7.0f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
