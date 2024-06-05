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

public val Icons.Filled.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(name = "Running", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 12.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 5.0f)
                close()
                moveTo(22.0f, 11.0f)
                horizontalLineTo(19.13f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, -0.856f, -0.484f)
                lineTo(16.43f, 7.453f)
                arcTo(3.015f, 3.015f, 0.0f, false, false, 13.86f, 6.0f)
                horizontalLineTo(7.236f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 4.553f, 7.658f)
                lineToRelative(-1.448f, 2.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.79f, 0.894f)
                lineTo(6.342f, 8.553f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 7.236f, 8.0f)
                horizontalLineTo(9.454f)
                lineTo(7.7f, 12.273f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.173f, 3.674f)
                lineToRelative(4.116f, 2.6f)
                verticalLineTo(23.0f)
                arcTo(1.005f, 1.005f, 0.0f, false, false, 15.0f, 23.0f)
                verticalLineTo(18.0f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -0.475f, -0.845f)
                lineTo(12.49f, 15.868f)
                lineToRelative(2.7f, -6.591f)
                lineToRelative(1.367f, 2.27f)
                arcTo(3.016f, 3.016f, 0.0f, false, false, 19.13f, 13.0f)
                horizontalLineTo(22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(8.432f, 18.114f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 5.646f, 20.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(5.646f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, 0.928f, -0.629f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.858f, 0.743f)
                close()
            }
        }
        .build()
        return _running!!
    }

private var _running: ImageVector? = null
