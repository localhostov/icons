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

public val Icons.Outline.Computer: ImageVector
    get() {
        if (_computer != null) {
            return _computer!!
        }
        _computer = Builder(name = "Computer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 18.9999f)
                    verticalLineTo(3.9999f)
                    curveTo(24.0f, 3.2042f, 23.6839f, 2.4412f, 23.1213f, 1.8786f)
                    curveTo(22.5587f, 1.316f, 21.7956f, 0.9999f, 21.0f, 0.9999f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.9999f, 1.4413f, 1.316f, 0.8787f, 1.8786f)
                    curveTo(0.3161f, 2.4412f, 0.0f, 3.2042f, 0.0f, 3.9999f)
                    lineTo(0.0f, 18.9999f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(20.9999f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(22.9999f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(20.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(18.9999f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(3.0f, 2.9999f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 2.9999f, 21.5196f, 3.1052f, 21.7071f, 3.2928f)
                    curveTo(21.8946f, 3.4803f, 22.0f, 3.7347f, 22.0f, 3.9999f)
                    verticalLineTo(12.9999f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(3.9999f)
                    curveTo(2.0f, 3.7347f, 2.1054f, 3.4803f, 2.2929f, 3.2928f)
                    curveTo(2.4804f, 3.1052f, 2.7348f, 2.9999f, 3.0f, 2.9999f)
                    close()
                    moveTo(2.0f, 14.9999f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(16.9999f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(14.9999f)
                    close()
                }
            }
        }
        .build()
        return _computer!!
    }

private var _computer: ImageVector? = null
