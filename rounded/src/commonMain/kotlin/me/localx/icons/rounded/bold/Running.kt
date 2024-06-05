package me.localx.icons.rounded.bold

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

public val Icons.Bold.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(name = "Running", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.5f, 14.0f)
                horizontalLineTo(18.63f)
                arcToRelative(3.516f, 3.516f, 0.0f, false, true, -3.0f, -1.7f)
                lineToRelative(-1.225f, -2.034f)
                lineToRelative(-1.79f, 4.363f)
                lineToRelative(2.614f, 1.487f)
                arcTo(3.507f, 3.507f, 0.0f, false, true, 17.0f, 19.163f)
                verticalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineTo(19.163f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.252f, -0.434f)
                lineTo(9.666f, 16.406f)
                arcToRelative(3.511f, 3.511f, 0.0f, false, true, -1.427f, -4.322f)
                lineTo(9.5f, 9.0f)
                horizontalLineTo(7.736f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.447f, 0.277f)
                lineTo(5.842f, 12.171f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.684f, -1.342f)
                lineTo(4.605f, 7.935f)
                arcTo(3.483f, 3.483f, 0.0f, false, true, 7.736f, 6.0f)
                horizontalLineTo(13.36f)
                arcToRelative(3.516f, 3.516f, 0.0f, false, true, 3.0f, 1.7f)
                lineTo(18.2f, 10.758f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 18.63f, 11.0f)
                horizontalLineTo(21.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 23.0f, 12.5f)
                close()
                moveTo(8.057f, 16.85f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.95f, 0.836f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.643f, 18.0f)
                horizontalLineTo(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(5.643f)
                arcToRelative(3.484f, 3.484f, 0.0f, false, false, 3.25f, -2.2f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.057f, 16.85f)
                close()
                moveTo(14.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 12.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 5.0f)
                close()
            }
        }
        .build()
        return _running!!
    }

private var _running: ImageVector? = null
