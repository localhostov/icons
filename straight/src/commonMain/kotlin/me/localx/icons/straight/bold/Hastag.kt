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

public val Icons.Bold.Hastag: ImageVector
    get() {
        if (_hastag != null) {
            return _hastag!!
        }
        _hastag = Builder(name = "Hastag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.317f, 9.0f)
                horizontalLineToRelative(5.33f)
                lineTo(24.0f, 6.0f)
                horizontalLineTo(18.677f)
                lineTo(19.4f, 0.0f)
                horizontalLineTo(16.379f)
                lineToRelative(-0.72f, 6.0f)
                horizontalLineTo(9.783f)
                lineToRelative(0.72f, -6.0f)
                horizontalLineTo(7.485f)
                lineTo(6.764f, 6.0f)
                horizontalLineTo(0.353f)
                lineTo(0.0f, 9.0f)
                horizontalLineTo(6.4f)
                lineToRelative(-0.721f, 6.0f)
                horizontalLineTo(0.353f)
                lineTo(0.0f, 18.0f)
                horizontalLineTo(5.323f)
                lineTo(4.6f, 24.0f)
                horizontalLineTo(7.621f)
                lineToRelative(0.72f, -6.0f)
                horizontalLineToRelative(5.876f)
                lineToRelative(-0.72f, 6.0f)
                horizontalLineToRelative(3.018f)
                lineToRelative(0.721f, -6.0f)
                horizontalLineToRelative(6.411f)
                lineTo(24.0f, 15.0f)
                horizontalLineTo(17.6f)
                close()
                moveTo(8.7f, 15.0f)
                lineToRelative(0.72f, -6.0f)
                horizontalLineTo(15.3f)
                lineToRelative(-0.72f, 6.0f)
                close()
            }
        }
        .build()
        return _hastag!!
    }

private var _hastag: ImageVector? = null
