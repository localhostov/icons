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

public val Icons.Bold.ChartTree: ImageVector
    get() {
        if (_chartTree != null) {
            return _chartTree!!
        }
        _chartTree = Builder(name = "ChartTree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 18.4f)
                verticalLineTo(16.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.0f, 13.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.792f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -3.0f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(1.9f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 0.0f)
                verticalLineTo(16.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 16.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2.4f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.9f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 0.0f)
                close()
                moveTo(9.5f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 12.0f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 5.5f)
                close()
            }
        }
        .build()
        return _chartTree!!
    }

private var _chartTree: ImageVector? = null
