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

public val Icons.Bold.DisplayChartUp: ImageVector
    get() {
        if (_displayChartUp != null) {
            return _displayChartUp!!
        }
        _displayChartUp = Builder(name = "DisplayChartUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.977f, 6.958f)
                verticalLineToRelative(5.065f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(-3.779f, 3.779f)
                lineToRelative(-3.741f, -3.741f)
                lineToRelative(-2.762f, 2.762f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(4.883f, -4.883f)
                lineToRelative(3.741f, 3.741f)
                lineToRelative(1.658f, -1.658f)
                lineToRelative(-1.939f, -1.939f)
                horizontalLineToRelative(5.065f)
                curveToRelative(0.516f, 0.0f, 0.935f, 0.419f, 0.935f, 0.935f)
                close()
                moveTo(13.5f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.5f, 23.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 2.346f, 1.346f, 1.0f, 3.0f, 1.0f)
                lineTo(21.0f, 1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                lineTo(13.5f, 18.0f)
                close()
                moveTo(21.0f, 15.0f)
                lineTo(21.0f, 4.0f)
                lineTo(2.998f, 4.0f)
                lineToRelative(0.002f, 11.0f)
                lineTo(21.0f, 15.0f)
                close()
            }
        }
        .build()
        return _displayChartUp!!
    }

private var _displayChartUp: ImageVector? = null
