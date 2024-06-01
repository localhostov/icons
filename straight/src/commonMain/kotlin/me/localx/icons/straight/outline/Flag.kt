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

public val Icons.Outline.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 3.0f)
                    curveTo(15.0f, 2.2043f, 14.6839f, 1.4413f, 14.1213f, 0.8787f)
                    curveTo(13.5587f, 0.3161f, 12.7956f, 0.0f, 12.0f, 0.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(14.0f)
                    curveTo(10.0f, 14.7956f, 10.3161f, 15.5587f, 10.8787f, 16.1213f)
                    curveTo(11.4413f, 16.6839f, 12.2044f, 17.0f, 13.0f, 17.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(2.0f, 2.0f)
                    horizontalLineTo(12.0f)
                    curveTo(12.2652f, 2.0f, 12.5196f, 2.1054f, 12.7071f, 2.2929f)
                    curveTo(12.8946f, 2.4804f, 13.0f, 2.7348f, 13.0f, 3.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(2.0f)
                    close()
                    moveTo(22.0f, 6.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(13.0f)
                    curveTo(12.7348f, 15.0f, 12.4804f, 14.8946f, 12.2929f, 14.7071f)
                    curveTo(12.1054f, 14.5196f, 12.0f, 14.2652f, 12.0f, 14.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
