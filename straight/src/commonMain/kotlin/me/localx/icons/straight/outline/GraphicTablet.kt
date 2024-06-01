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

public val Icons.Outline.GraphicTablet: ImageVector
    get() {
        if (_graphicTablet != null) {
            return _graphicTablet!!
        }
        _graphicTablet = Builder(name = "GraphicTablet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 4.0002f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(11.0002f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.0002f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(20.0002f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 20.0002f, 22.5587f, 19.6842f, 23.1213f, 19.1216f)
                    curveTo(23.6839f, 18.559f, 24.0f, 17.7959f, 24.0f, 17.0002f)
                    verticalLineTo(7.0002f)
                    curveTo(24.0f, 6.2046f, 23.6839f, 5.4415f, 23.1213f, 4.8789f)
                    curveTo(22.5587f, 4.3163f, 21.7956f, 4.0002f, 21.0f, 4.0002f)
                    close()
                    moveTo(4.0f, 13.0002f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(11.0002f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(6.0002f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(18.0002f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(13.0002f)
                    close()
                    moveTo(22.0f, 17.0002f)
                    curveTo(22.0f, 17.2655f, 21.8946f, 17.5198f, 21.7071f, 17.7074f)
                    curveTo(21.5196f, 17.8949f, 21.2652f, 18.0002f, 21.0f, 18.0002f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(6.0002f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 6.0002f, 21.5196f, 6.1056f, 21.7071f, 6.2931f)
                    curveTo(21.8946f, 6.4807f, 22.0f, 6.735f, 22.0f, 7.0002f)
                    verticalLineTo(17.0002f)
                    close()
                }
            }
        }
        .build()
        return _graphicTablet!!
    }

private var _graphicTablet: ImageVector? = null
