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

public val Icons.Filled.ChartTree: ImageVector
    get() {
        if (_chartTree != null) {
            return _chartTree!!
        }
        _chartTree = Builder(name = "ChartTree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.184f)
                verticalLineTo(16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.9f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(2.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chartTree!!
    }

private var _chartTree: ImageVector? = null
