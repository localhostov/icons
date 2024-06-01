package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.GraphicTablet: ImageVector
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
                    horizontalLineTo(9.0f)
                    verticalLineTo(20.0002f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 19.9987f, 21.5964f, 19.4714f, 22.5338f, 18.534f)
                    curveTo(23.4711f, 17.5967f, 23.9984f, 16.3258f, 24.0f, 15.0002f)
                    verticalLineTo(9.0002f)
                    curveTo(23.9984f, 7.6747f, 23.4711f, 6.4038f, 22.5338f, 5.4665f)
                    curveTo(21.5964f, 4.5291f, 20.3256f, 4.0018f, 19.0f, 4.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 9.0002f)
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
                    verticalLineTo(4.0002f)
                    curveTo(5.6744f, 4.0018f, 4.4036f, 4.5291f, 3.4662f, 5.4665f)
                    curveTo(2.5289f, 6.4038f, 2.0016f, 7.6747f, 2.0f, 9.0002f)
                    close()
                }
            }
        }
        .build()
        return _graphicTablet!!
    }

private var _graphicTablet: ImageVector? = null
