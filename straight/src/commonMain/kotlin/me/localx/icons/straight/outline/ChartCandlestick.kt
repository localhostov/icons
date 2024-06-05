package me.localx.icons.straight.outline

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

public val Icons.Outline.ChartCandlestick: ImageVector
    get() {
        if (_chartCandlestick != null) {
            return _chartCandlestick!!
        }
        _chartCandlestick = Builder(name = "ChartCandlestick", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(0.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                lineTo(2.0f, 21.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                lineTo(24.0f, 22.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 14.0f)
                close()
            }
        }
        .build()
        return _chartCandlestick!!
    }

private var _chartCandlestick: ImageVector? = null
