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

public val Icons.Outline.Curling: ImageVector
    get() {
        if (_curling != null) {
            return _curling!!
        }
        _curling = Builder(name = "Curling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.855f, 10.3f)
                lineTo(18.781f, 6.0f)
                horizontalLineTo(7.136f)
                lineToRelative(0.493f, -2.217f)
                arcTo(0.992f, 0.992f, 0.0f, false, true, 8.6f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.6f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 5.676f, 3.349f)
                lineTo(4.13f, 10.3f)
                arcTo(6.008f, 6.008f, 0.0f, false, false, 0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineTo(18.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(16.0f)
                arcTo(6.007f, 6.007f, 0.0f, false, false, 19.855f, 10.3f)
                close()
                moveTo(17.219f, 8.0f)
                lineToRelative(0.5f, 2.0f)
                horizontalLineTo(6.247f)
                lineToRelative(0.445f, -2.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineTo(18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineTo(2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 12.0f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                horizontalLineTo(22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 22.0f)
                close()
            }
        }
        .build()
        return _curling!!
    }

private var _curling: ImageVector? = null
