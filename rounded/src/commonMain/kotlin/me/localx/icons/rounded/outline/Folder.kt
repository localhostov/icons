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

public val Icons.Outline.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 3.0002f)
                    horizontalLineTo(12.472f)
                    curveTo(12.3173f, 3.0013f, 12.1645f, 2.9671f, 12.025f, 2.9002f)
                    lineTo(8.869f, 1.3162f)
                    curveTo(8.4524f, 1.1088f, 7.9934f, 1.0006f, 7.528f, 1.0002f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 1.0018f, 2.4036f, 1.5291f, 1.4662f, 2.4665f)
                    curveTo(0.5289f, 3.4038f, 0.0016f, 4.6747f, 0.0f, 6.0002f)
                    lineTo(0.0f, 18.0002f)
                    curveTo(0.0016f, 19.3258f, 0.5289f, 20.5967f, 1.4662f, 21.534f)
                    curveTo(2.4036f, 22.4714f, 3.6744f, 22.9987f, 5.0f, 23.0002f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 22.9987f, 21.5964f, 22.4714f, 22.5338f, 21.534f)
                    curveTo(23.4711f, 20.5967f, 23.9984f, 19.3258f, 24.0f, 18.0002f)
                    verticalLineTo(8.0002f)
                    curveTo(23.9984f, 6.6747f, 23.4711f, 5.4038f, 22.5338f, 4.4665f)
                    curveTo(21.5964f, 3.5291f, 20.3256f, 3.0018f, 19.0f, 3.0002f)
                    close()
                    moveTo(5.0f, 3.0002f)
                    horizontalLineTo(7.528f)
                    curveTo(7.6827f, 2.9992f, 7.8355f, 3.0334f, 7.975f, 3.1002f)
                    lineTo(11.131f, 4.6792f)
                    curveTo(11.5472f, 4.8884f, 12.0062f, 4.9983f, 12.472f, 5.0002f)
                    horizontalLineTo(19.0f)
                    curveTo(19.598f, 5.0012f, 20.1821f, 5.1809f, 20.6773f, 5.5163f)
                    curveTo(21.1725f, 5.8516f, 21.5561f, 6.3273f, 21.779f, 6.8822f)
                    lineTo(2.0f, 6.9942f)
                    verticalLineTo(6.0002f)
                    curveTo(2.0f, 5.2046f, 2.3161f, 4.4415f, 2.8787f, 3.8789f)
                    curveTo(3.4413f, 3.3163f, 4.2043f, 3.0002f, 5.0f, 3.0002f)
                    close()
                    moveTo(19.0f, 21.0002f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 21.0002f, 3.4413f, 20.6842f, 2.8787f, 20.1216f)
                    curveTo(2.3161f, 19.559f, 2.0f, 18.7959f, 2.0f, 18.0002f)
                    verticalLineTo(8.9942f)
                    lineTo(22.0f, 8.8812f)
                    verticalLineTo(18.0002f)
                    curveTo(22.0f, 18.7959f, 21.6839f, 19.559f, 21.1213f, 20.1216f)
                    curveTo(20.5587f, 20.6842f, 19.7956f, 21.0002f, 19.0f, 21.0002f)
                    close()
                }
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
