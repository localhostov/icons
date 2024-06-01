package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.Doctor: ImageVector
    get() {
        if (_doctor != null) {
            return _doctor!!
        }
        _doctor = Builder(name = "Doctor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 4.9999f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(0.9999f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(4.9999f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 4.9999f, 1.4413f, 5.3159f, 0.8787f, 5.8786f)
                    curveTo(0.3161f, 6.4412f, 0.0f, 7.2042f, 0.0f, 7.9999f)
                    lineTo(0.0f, 22.9999f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.9999f)
                    curveTo(24.0f, 7.2042f, 23.6839f, 6.4412f, 23.1213f, 5.8786f)
                    curveTo(22.5587f, 5.3159f, 21.7956f, 4.9999f, 21.0f, 4.9999f)
                    close()
                    moveTo(10.0f, 2.9999f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(4.9999f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(2.9999f)
                    close()
                    moveTo(22.0f, 20.9999f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(7.9999f)
                    curveTo(2.0f, 7.7347f, 2.1054f, 7.4803f, 2.2929f, 7.2928f)
                    curveTo(2.4804f, 7.1052f, 2.7348f, 6.9999f, 3.0f, 6.9999f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 6.9999f, 21.5196f, 7.1052f, 21.7071f, 7.2928f)
                    curveTo(21.8946f, 7.4803f, 22.0f, 7.7347f, 22.0f, 7.9999f)
                    verticalLineTo(20.9999f)
                    close()
                    moveTo(13.0f, 12.9999f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(14.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(17.9999f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(14.9999f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(12.9999f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(9.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(12.9999f)
                    close()
                }
            }
        }
        .build()
        return _doctor!!
    }

private var _doctor: ImageVector? = null
