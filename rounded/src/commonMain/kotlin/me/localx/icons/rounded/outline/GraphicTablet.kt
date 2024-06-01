package me.localx.icons.rounded.outline

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
                    moveTo(19.0f, 4.0002f)
                    horizontalLineTo(7.0f)
                    curveTo(5.6744f, 4.0018f, 4.4036f, 4.5291f, 3.4662f, 5.4665f)
                    curveTo(2.5289f, 6.4038f, 2.0016f, 7.6747f, 2.0f, 9.0002f)
                    verticalLineTo(11.0002f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 11.0002f, 0.4804f, 11.1056f, 0.2929f, 11.2931f)
                    curveTo(0.1054f, 11.4807f, 0.0f, 11.735f, 0.0f, 12.0002f)
                    curveTo(0.0f, 12.2655f, 0.1054f, 12.5198f, 0.2929f, 12.7074f)
                    curveTo(0.4804f, 12.8949f, 0.7348f, 13.0002f, 1.0f, 13.0002f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(15.0002f)
                    curveTo(2.0016f, 16.3258f, 2.5289f, 17.5967f, 3.4662f, 18.534f)
                    curveTo(4.4036f, 19.4714f, 5.6744f, 19.9987f, 7.0f, 20.0002f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 19.9987f, 21.5964f, 19.4714f, 22.5338f, 18.534f)
                    curveTo(23.4711f, 17.5967f, 23.9984f, 16.3258f, 24.0f, 15.0002f)
                    verticalLineTo(9.0002f)
                    curveTo(23.9984f, 7.6747f, 23.4711f, 6.4038f, 22.5338f, 5.4665f)
                    curveTo(21.5964f, 4.5291f, 20.3256f, 4.0018f, 19.0f, 4.0002f)
                    close()
                    moveTo(4.0f, 15.0002f)
                    verticalLineTo(13.0002f)
                    curveTo(4.2652f, 13.0002f, 4.5196f, 12.8949f, 4.7071f, 12.7074f)
                    curveTo(4.8946f, 12.5198f, 5.0f, 12.2655f, 5.0f, 12.0002f)
                    curveTo(5.0f, 11.735f, 4.8946f, 11.4807f, 4.7071f, 11.2931f)
                    curveTo(4.5196f, 11.1056f, 4.2652f, 11.0002f, 4.0f, 11.0002f)
                    verticalLineTo(9.0002f)
                    curveTo(4.0f, 8.2046f, 4.3161f, 7.4415f, 4.8787f, 6.8789f)
                    curveTo(5.4413f, 6.3163f, 6.2043f, 6.0002f, 7.0f, 6.0002f)
                    verticalLineTo(18.0002f)
                    curveTo(6.2043f, 18.0002f, 5.4413f, 17.6842f, 4.8787f, 17.1216f)
                    curveTo(4.3161f, 16.559f, 4.0f, 15.7959f, 4.0f, 15.0002f)
                    close()
                    moveTo(22.0f, 15.0002f)
                    curveTo(22.0f, 15.7959f, 21.6839f, 16.559f, 21.1213f, 17.1216f)
                    curveTo(20.5587f, 17.6842f, 19.7956f, 18.0002f, 19.0f, 18.0002f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(6.0002f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 6.0002f, 20.5587f, 6.3163f, 21.1213f, 6.8789f)
                    curveTo(21.6839f, 7.4415f, 22.0f, 8.2046f, 22.0f, 9.0002f)
                    verticalLineTo(15.0002f)
                    close()
                }
            }
        }
        .build()
        return _graphicTablet!!
    }

private var _graphicTablet: ImageVector? = null
