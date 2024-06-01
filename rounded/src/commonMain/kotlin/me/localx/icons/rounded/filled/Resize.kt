package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Resize: ImageVector
    get() {
        if (_resize != null) {
            return _resize!!
        }
        _resize = Builder(name = "Resize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0f, 18.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(19.0f)
                    curveTo(12.9984f, 20.3256f, 12.4711f, 21.5964f, 11.5338f, 22.5338f)
                    curveTo(10.5964f, 23.4711f, 9.3256f, 23.9984f, 8.0f, 24.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 23.9984f, 2.4036f, 23.4711f, 1.4662f, 22.5338f)
                    curveTo(0.5289f, 21.5964f, 0.0016f, 20.3256f, 0.0f, 19.0f)
                    lineTo(0.0f, 16.0f)
                    curveTo(0.0016f, 14.6744f, 0.5289f, 13.4036f, 1.4662f, 12.4662f)
                    curveTo(2.4036f, 11.5289f, 3.6744f, 11.0016f, 5.0f, 11.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(13.0f)
                    curveTo(6.0016f, 14.3256f, 6.5289f, 15.5964f, 7.4662f, 16.5338f)
                    curveTo(8.4036f, 17.4711f, 9.6744f, 17.9984f, 11.0f, 18.0f)
                    close()
                    moveTo(8.0f, 13.0f)
                    curveTo(8.0f, 13.7956f, 8.3161f, 14.5587f, 8.8787f, 15.1213f)
                    curveTo(9.4413f, 15.6839f, 10.2044f, 16.0f, 11.0f, 16.0f)
                    curveTo(11.0f, 15.2044f, 10.6839f, 14.4413f, 10.1213f, 13.8787f)
                    curveTo(9.5587f, 13.3161f, 8.7956f, 13.0f, 8.0f, 13.0f)
                    close()
                    moveTo(19.0f, 0.0f)
                    horizontalLineTo(11.0f)
                    curveTo(9.6744f, 0.0016f, 8.4036f, 0.5289f, 7.4662f, 1.4662f)
                    curveTo(6.5289f, 2.4036f, 6.0016f, 3.6744f, 6.0f, 5.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(8.0f)
                    curveTo(8.9797f, 11.0002f, 9.9375f, 11.29f, 10.753f, 11.833f)
                    lineTo(16.586f, 6.0f)
                    horizontalLineTo(14.0f)
                    curveTo(13.7348f, 6.0f, 13.4804f, 5.8946f, 13.2929f, 5.7071f)
                    curveTo(13.1054f, 5.5196f, 13.0f, 5.2652f, 13.0f, 5.0f)
                    curveTo(13.0f, 4.7348f, 13.1054f, 4.4804f, 13.2929f, 4.2929f)
                    curveTo(13.4804f, 4.1054f, 13.7348f, 4.0f, 14.0f, 4.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.7956f, 4.0f, 18.5587f, 4.3161f, 19.1213f, 4.8787f)
                    curveTo(19.6839f, 5.4413f, 20.0f, 6.2043f, 20.0f, 7.0f)
                    verticalLineTo(10.0f)
                    curveTo(20.0f, 10.2652f, 19.8946f, 10.5196f, 19.7071f, 10.7071f)
                    curveTo(19.5196f, 10.8946f, 19.2652f, 11.0f, 19.0f, 11.0f)
                    curveTo(18.7348f, 11.0f, 18.4804f, 10.8946f, 18.2929f, 10.7071f)
                    curveTo(18.1054f, 10.5196f, 18.0f, 10.2652f, 18.0f, 10.0f)
                    verticalLineTo(7.414f)
                    lineTo(12.167f, 13.247f)
                    curveTo(12.71f, 14.0625f, 12.9998f, 15.0203f, 13.0f, 16.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 17.9984f, 21.5964f, 17.4711f, 22.5338f, 16.5338f)
                    curveTo(23.4711f, 15.5964f, 23.9984f, 14.3256f, 24.0f, 13.0f)
                    verticalLineTo(5.0f)
                    curveTo(23.9984f, 3.6744f, 23.4711f, 2.4036f, 22.5338f, 1.4662f)
                    curveTo(21.5964f, 0.5289f, 20.3256f, 0.0016f, 19.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _resize!!
    }

private var _resize: ImageVector? = null
