package me.localx.icons.rounded.filled

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
                verticalLineTo(18.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.91f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(0.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(0.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chartTree!!
    }

private var _chartTree: ImageVector? = null
