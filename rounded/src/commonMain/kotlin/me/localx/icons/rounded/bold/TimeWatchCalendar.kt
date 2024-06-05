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

public val Icons.Bold.TimeWatchCalendar: ImageVector
    get() {
        if (_timeWatchCalendar != null) {
            return _timeWatchCalendar!!
        }
        _timeWatchCalendar = Builder(name = "TimeWatchCalendar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 14.351f)
                verticalLineToRelative(-0.851f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.851f)
                curveToRelative(-1.178f, 0.564f, -2.0f, 1.758f, -2.0f, 3.149f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.391f, -0.822f, -2.585f, -2.0f, -3.149f)
                close()
                moveTo(20.5f, 21.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(0.0f, 0.568f, -0.321f, 1.087f, -0.829f, 1.342f)
                lineToRelative(-3.0f, 1.5f)
                curveToRelative(-0.216f, 0.107f, -0.444f, 0.159f, -0.67f, 0.159f)
                curveToRelative(-0.55f, 0.0f, -1.08f, -0.304f, -1.343f, -0.83f)
                curveToRelative(-0.37f, -0.741f, -0.07f, -1.642f, 0.671f, -2.013f)
                lineToRelative(2.171f, -1.085f)
                verticalLineToRelative(-3.073f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.963f, 19.609f)
                curveToRelative(-0.158f, 0.696f, -0.776f, 1.168f, -1.462f, 1.168f)
                curveToRelative(-0.109f, 0.0f, -0.221f, -0.012f, -0.333f, -0.038f)
                curveTo(3.358f, 19.649f, 0.0f, 15.438f, 0.0f, 10.5f)
                curveTo(0.0f, 4.71f, 4.71f, 0.0f, 10.5f, 0.0f)
                curveToRelative(4.937f, 0.0f, 9.148f, 3.359f, 10.24f, 8.168f)
                curveToRelative(0.184f, 0.808f, -0.323f, 1.611f, -1.131f, 1.795f)
                curveToRelative(-0.81f, 0.186f, -1.611f, -0.323f, -1.795f, -1.131f)
                curveToRelative(-0.779f, -3.434f, -3.787f, -5.832f, -7.314f, -5.832f)
                curveToRelative(-4.136f, 0.0f, -7.5f, 3.364f, -7.5f, 7.5f)
                curveToRelative(0.0f, 3.472f, 2.453f, 6.547f, 5.832f, 7.314f)
                curveToRelative(0.808f, 0.183f, 1.314f, 0.987f, 1.131f, 1.795f)
                close()
            }
        }
        .build()
        return _timeWatchCalendar!!
    }

private var _timeWatchCalendar: ImageVector? = null
