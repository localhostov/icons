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

public val Icons.Bold.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) {
            return _chartLineUp!!
        }
        _chartLineUp = Builder(name = "ChartLineUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 21.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(0.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(16.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.879f)
                lineToRelative(-4.379f, 4.379f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-5.561f, 5.561f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(3.439f, -3.439f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(6.5f, -6.5f)
                verticalLineToRelative(2.879f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
