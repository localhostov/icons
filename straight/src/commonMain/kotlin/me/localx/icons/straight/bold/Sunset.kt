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

public val Icons.Bold.Sunset: ImageVector
    get() {
        if (_sunset != null) {
            return _sunset!!
        }
        _sunset = Builder(name = "Sunset", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.211f, 7.673f)
                lineTo(7.538f, 4.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.962f)
                lineTo(12.789f, 7.673f)
                arcTo(1.115f, 1.115f, 0.0f, false, true, 11.211f, 7.673f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.062f)
                arcToRelative(7.949f, 7.949f, 0.0f, false, true, 1.126f, -3.191f)
                lineTo(2.241f, 14.862f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.852f, 2.852f)
                arcTo(7.967f, 7.967f, 0.0f, false, true, 10.5f, 14.142f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.142f)
                arcToRelative(7.957f, 7.957f, 0.0f, false, true, 3.285f, 1.451f)
                lineToRelative(2.853f, -2.852f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.947f, 2.947f)
                arcTo(7.964f, 7.964f, 0.0f, false, true, 19.938f, 21.0f)
                close()
                moveTo(7.1f, 21.0f)
                horizontalLineToRelative(9.8f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -9.8f, 0.0f)
                close()
            }
        }
        .build()
        return _sunset!!
    }

private var _sunset: ImageVector? = null
