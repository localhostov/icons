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

public val Icons.Filled.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.609f, 19.2f)
                lineToRelative(-0.6f, 3.974f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.98f, 0.8f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -0.2f, -0.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.781f, -1.179f)
                lineToRelative(0.6f, -3.974f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.961f, 0.4f)
                close()
                moveTo(10.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 12.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.0f, 2.5f)
                close()
                moveTo(20.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(16.618f)
                lineTo(15.447f, 7.658f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.764f, 6.0f)
                horizontalLineTo(10.418f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.942f, 7.231f)
                lineToRelative(-1.049f, 5.76f)
                arcTo(2.988f, 2.988f, 0.0f, false, false, 9.2f, 16.08f)
                lineTo(13.0f, 18.543f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.456f, -0.839f)
                lineToRelative(-1.206f, -0.783f)
                lineToRelative(1.13f, -6.206f)
                lineToRelative(0.637f, 1.275f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 7.0f)
                close()
                moveTo(6.4f, 15.893f)
                arcTo(2.7f, 2.7f, 0.0f, false, true, 5.67f, 16.0f)
                arcTo(2.765f, 2.765f, 0.0f, false, true, 3.0f, 12.971f)
                arcTo(7.68f, 7.68f, 0.0f, false, true, 7.065f, 6.676f)
                lineTo(5.91f, 12.61f)
                arcTo(4.974f, 4.974f, 0.0f, false, false, 6.4f, 15.893f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
