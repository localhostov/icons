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

public val Icons.Bold.Grill: ImageVector
    get() {
        if (_grill != null) {
            return _grill!!
        }
        _grill = Builder(name = "Grill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(7.5f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, 5.691f, 9.764f)
                lineTo(2.323f, 24.0f)
                horizontalLineTo(5.677f)
                lineToRelative(2.759f, -5.518f)
                arcTo(12.293f, 12.293f, 0.0f, false, false, 10.5f, 18.9f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(18.9f)
                arcToRelative(12.293f, 12.293f, 0.0f, false, false, 2.064f, -0.418f)
                lineTo(18.323f, 24.0f)
                horizontalLineToRelative(3.354f)
                lineToRelative(-3.368f, -6.736f)
                arcTo(11.4f, 11.4f, 0.0f, false, false, 24.0f, 7.5f)
                close()
                moveTo(12.0f, 16.0f)
                arcTo(8.886f, 8.886f, 0.0f, false, true, 3.141f, 9.0f)
                horizontalLineTo(20.859f)
                arcTo(8.886f, 8.886f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(13.5f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _grill!!
    }

private var _grill: ImageVector? = null
