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

public val Icons.Filled.DisplayChartUp: ImageVector
    get() {
        if (_displayChartUp != null) {
            return _displayChartUp!!
        }
        _displayChartUp = Builder(name = "DisplayChartUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 1.0f)
                curveTo(1.122f, 1.0f, 0.0f, 2.122f, 0.0f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(12.846f, 13.568f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-4.274f, 4.274f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(5.688f, -5.688f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.74f, -3.74f)
                horizontalLineToRelative(-2.563f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.478f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(4.478f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.563f)
                lineToRelative(-5.154f, 5.154f)
                close()
            }
        }
        .build()
        return _displayChartUp!!
    }

private var _displayChartUp: ImageVector? = null
