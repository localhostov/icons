package me.localx.icons.straight.bold

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

public val Icons.Bold.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9529f, 4.563f)
                    lineTo(19.4359f, 0.045f)
                    lineTo(5.1999f, 12.132f)
                    lineTo(0.0329f, 14.8f)
                    verticalLineTo(16.79f)
                    curveTo(0.035f, 18.6937f, 0.7921f, 20.5189f, 2.1381f, 21.8651f)
                    curveTo(3.4842f, 23.2113f, 5.3092f, 23.9687f, 7.2129f, 23.971f)
                    horizontalLineTo(9.2179f)
                    lineTo(11.8069f, 18.924f)
                    lineTo(23.9529f, 4.563f)
                    close()
                    moveTo(19.8809f, 4.732f)
                    lineTo(14.6139f, 10.958f)
                    lineTo(13.0549f, 9.4f)
                    lineTo(19.2699f, 4.121f)
                    lineTo(19.8809f, 4.732f)
                    close()
                    moveTo(7.3849f, 20.968f)
                    horizontalLineTo(7.2129f)
                    curveTo(6.1045f, 20.9667f, 5.0419f, 20.5258f, 4.2583f, 19.7419f)
                    curveTo(3.4747f, 18.9581f, 3.034f, 17.8954f, 3.0329f, 16.787f)
                    verticalLineTo(16.625f)
                    lineTo(6.5059f, 14.835f)
                    lineTo(9.1669f, 17.5f)
                    lineTo(7.3849f, 20.968f)
                    close()
                }
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
