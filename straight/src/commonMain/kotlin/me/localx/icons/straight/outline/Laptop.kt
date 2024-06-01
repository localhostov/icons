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

public val Icons.Outline.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 15.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(18.0f)
                    curveTo(0.0f, 18.7956f, 0.3161f, 19.5587f, 0.8787f, 20.1213f)
                    curveTo(1.4413f, 20.6839f, 2.2043f, 21.0f, 3.0f, 21.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 21.0f, 22.5587f, 20.6839f, 23.1213f, 20.1213f)
                    curveTo(23.6839f, 19.5587f, 24.0f, 18.7956f, 24.0f, 18.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(22.0f)
                    close()
                    moveTo(4.0f, 5.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(14.921f)
                    lineTo(14.074f, 16.0f)
                    horizontalLineTo(9.925f)
                    lineTo(9.079f, 15.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(22.0f, 18.0f)
                    curveTo(22.0f, 18.2652f, 21.8946f, 18.5196f, 21.7071f, 18.7071f)
                    curveTo(21.5196f, 18.8946f, 21.2652f, 19.0f, 21.0f, 19.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 19.0f, 2.4804f, 18.8946f, 2.2929f, 18.7071f)
                    curveTo(2.1054f, 18.5196f, 2.0f, 18.2652f, 2.0f, 18.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(8.151f)
                    lineTo(9.0f, 18.0f)
                    horizontalLineTo(15.0f)
                    lineTo(15.847f, 17.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(18.0f)
                    close()
                }
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
