package me.localx.icons.rounded.bold

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

public val Icons.Bold.ToolCrop: ImageVector
    get() {
        if (_toolCrop != null) {
            return _toolCrop!!
        }
        _toolCrop = Builder(name = "ToolCrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.5f, 17.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(8.5f)
                    curveTo(20.0f, 7.909f, 19.8836f, 7.3239f, 19.6575f, 6.7779f)
                    curveTo(19.4313f, 6.232f, 19.0998f, 5.7359f, 18.682f, 5.318f)
                    curveTo(18.2641f, 4.9002f, 17.768f, 4.5687f, 17.2221f, 4.3425f)
                    curveTo(16.6761f, 4.1164f, 16.0909f, 4.0f, 15.5f, 4.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(1.5f)
                    curveTo(7.0f, 1.1022f, 6.842f, 0.7206f, 6.5607f, 0.4393f)
                    curveTo(6.2794f, 0.158f, 5.8978f, 0.0f, 5.5f, 0.0f)
                    verticalLineTo(0.0f)
                    curveTo(5.1022f, 0.0f, 4.7206f, 0.158f, 4.4393f, 0.4393f)
                    curveTo(4.158f, 0.7206f, 4.0f, 1.1022f, 4.0f, 1.5f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(1.5f)
                    curveTo(1.1022f, 4.0f, 0.7206f, 4.158f, 0.4393f, 4.4393f)
                    curveTo(0.158f, 4.7206f, 0.0f, 5.1022f, 0.0f, 5.5f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 5.8978f, 0.158f, 6.2794f, 0.4393f, 6.5607f)
                    curveTo(0.7206f, 6.842f, 1.1022f, 7.0f, 1.5f, 7.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(15.5f)
                    curveTo(4.0f, 16.0909f, 4.1164f, 16.6761f, 4.3425f, 17.2221f)
                    curveTo(4.5687f, 17.768f, 4.9002f, 18.2641f, 5.318f, 18.682f)
                    curveTo(6.1619f, 19.5259f, 7.3065f, 20.0f, 8.5f, 20.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(22.5f)
                    curveTo(17.0f, 22.8978f, 17.158f, 23.2794f, 17.4393f, 23.5607f)
                    curveTo(17.7206f, 23.842f, 18.1022f, 24.0f, 18.5f, 24.0f)
                    curveTo(18.8978f, 24.0f, 19.2794f, 23.842f, 19.5607f, 23.5607f)
                    curveTo(19.842f, 23.2794f, 20.0f, 22.8978f, 20.0f, 22.5f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(22.5f)
                    curveTo(22.8978f, 20.0f, 23.2794f, 19.842f, 23.5607f, 19.5607f)
                    curveTo(23.842f, 19.2794f, 24.0f, 18.8978f, 24.0f, 18.5f)
                    curveTo(24.0f, 18.1022f, 23.842f, 17.7206f, 23.5607f, 17.4393f)
                    curveTo(23.2794f, 17.158f, 22.8978f, 17.0f, 22.5f, 17.0f)
                    close()
                    moveTo(8.5f, 17.0f)
                    curveTo(8.1022f, 17.0f, 7.7206f, 16.842f, 7.4393f, 16.5607f)
                    curveTo(7.158f, 16.2794f, 7.0f, 15.8978f, 7.0f, 15.5f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(15.5f)
                    curveTo(15.8978f, 7.0f, 16.2794f, 7.158f, 16.5607f, 7.4393f)
                    curveTo(16.842f, 7.7206f, 17.0f, 8.1022f, 17.0f, 8.5f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(8.5f)
                    close()
                }
            }
        }
        .build()
        return _toolCrop!!
    }

private var _toolCrop: ImageVector? = null
