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

public val Icons.Bold.ChartCandlestick: ImageVector
    get() {
        if (_chartCandlestick != null) {
            return _chartCandlestick!!
        }
        _chartCandlestick = Builder(name = "ChartCandlestick", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 23.96f)
                lineToRelative(-20.5f, 0.04f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineToRelative(20.5f, -0.04f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _chartCandlestick!!
    }

private var _chartCandlestick: ImageVector? = null
