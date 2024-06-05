package me.localx.icons.rounded.outline

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

public val Icons.Outline.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(name = "Running", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(19.13f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, true, -2.569f, -1.452f)
                lineTo(15.193f, 9.277f)
                lineTo(13.706f, 12.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.851f, -0.758f)
                lineTo(13.555f, 8.0f)
                horizontalLineTo(11.616f)
                lineTo(9.552f, 13.032f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.39f, 1.225f)
                lineToRelative(4.592f, 2.9f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 18.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(18.551f)
                lineToRelative(-4.126f, -2.6f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.7f, 12.273f)
                lineTo(9.454f, 8.0f)
                horizontalLineTo(7.236f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -0.894f, 0.552f)
                lineTo(4.895f, 11.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.79f, -0.894f)
                lineToRelative(1.448f, -2.9f)
                arcTo(2.984f, 2.984f, 0.0f, false, true, 7.236f, 6.0f)
                horizontalLineToRelative(6.623f)
                arcTo(3.017f, 3.017f, 0.0f, false, true, 16.43f, 7.453f)
                lineToRelative(1.844f, 3.063f)
                arcTo(1.006f, 1.006f, 0.0f, false, false, 19.13f, 11.0f)
                horizontalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 12.0f)
                close()
                moveTo(7.875f, 16.814f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.3f, 0.557f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 5.646f, 18.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(5.646f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, 2.786f, -1.886f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.875f, 16.814f)
                close()
                moveTo(15.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 5.0f)
                close()
            }
        }
        .build()
        return _running!!
    }

private var _running: ImageVector? = null
