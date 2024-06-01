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

public val Icons.Outline.Presentation: ImageVector
    get() {
        if (_presentation != null) {
            return _presentation!!
        }
        _presentation = Builder(name = "Presentation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 16.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(3.0f)
                    curveTo(22.0f, 2.2043f, 21.6839f, 1.4413f, 21.1213f, 0.8787f)
                    curveTo(20.5587f, 0.3161f, 19.7956f, 0.0f, 19.0f, 0.0f)
                    lineTo(5.0f, 0.0f)
                    curveTo(4.2043f, 0.0f, 3.4413f, 0.3161f, 2.8787f, 0.8787f)
                    curveTo(2.3161f, 1.4413f, 2.0f, 2.2043f, 2.0f, 3.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(9.0f)
                    curveTo(8.2044f, 20.0f, 7.4413f, 20.3161f, 6.8787f, 20.8787f)
                    curveTo(6.3161f, 21.4413f, 6.0f, 22.2044f, 6.0f, 23.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(23.0f)
                    curveTo(8.0f, 22.7348f, 8.1054f, 22.4804f, 8.2929f, 22.2929f)
                    curveTo(8.4804f, 22.1054f, 8.7348f, 22.0f, 9.0f, 22.0f)
                    horizontalLineTo(15.0f)
                    curveTo(15.2652f, 22.0f, 15.5196f, 22.1054f, 15.7071f, 22.2929f)
                    curveTo(15.8946f, 22.4804f, 16.0f, 22.7348f, 16.0f, 23.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(23.0f)
                    curveTo(18.0f, 22.2044f, 17.6839f, 21.4413f, 17.1213f, 20.8787f)
                    curveTo(16.5587f, 20.3161f, 15.7956f, 20.0f, 15.0f, 20.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(4.0f, 3.0f)
                    curveTo(4.0f, 2.7348f, 4.1054f, 2.4804f, 4.2929f, 2.2929f)
                    curveTo(4.4804f, 2.1054f, 4.7348f, 2.0f, 5.0f, 2.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.2652f, 2.0f, 19.5196f, 2.1054f, 19.7071f, 2.2929f)
                    curveTo(19.8946f, 2.4804f, 20.0f, 2.7348f, 20.0f, 3.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _presentation!!
    }

private var _presentation: ImageVector? = null
