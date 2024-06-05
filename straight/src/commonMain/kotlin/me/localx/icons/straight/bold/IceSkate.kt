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

public val Icons.Bold.IceSkate: ImageVector
    get() {
        if (_iceSkate != null) {
            return _iceSkate!!
        }
        _iceSkate = Builder(name = "IceSkate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(13.844f)
                arcToRelative(6.264f, 6.264f, 0.0f, false, false, -5.024f, -6.128f)
                lineTo(13.3f, 6.979f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -1.074f, -1.154f)
                lineToRelative(-0.4f, -2.9f)
                arcTo(3.414f, 3.414f, 0.0f, false, false, 10.394f, 0.6f)
                arcTo(3.457f, 3.457f, 0.0f, false, false, 7.638f, 0.1f)
                lineTo(0.0f, 2.267f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                close()
                moveTo(3.0f, 4.534f)
                lineTo(8.372f, 3.01f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.315f, 0.061f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, 0.167f, 0.263f)
                lineToRelative(0.225f, 1.653f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(9.9f)
                arcToRelative(4.284f, 4.284f, 0.0f, false, false, 0.546f, 0.7f)
                lineToRelative(-1.236f, 2.1f)
                lineToRelative(2.586f, 1.52f)
                lineToRelative(1.35f, -2.3f)
                lineToRelative(3.245f, 0.649f)
                arcTo(3.259f, 3.259f, 0.0f, false, true, 19.0f, 13.844f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _iceSkate!!
    }

private var _iceSkate: ImageVector? = null
