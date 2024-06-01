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

public val Icons.Bold.Italic: ImageVector
    get() {
        if (_italic != null) {
            return _italic!!
        }
        _italic = Builder(name = "Italic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.6022f, 0.0f, 5.2206f, 0.158f, 4.9393f, 0.4393f)
                    curveTo(4.658f, 0.7206f, 4.5f, 1.1022f, 4.5f, 1.5f)
                    curveTo(4.5f, 1.8978f, 4.658f, 2.2794f, 4.9393f, 2.5607f)
                    curveTo(5.2206f, 2.842f, 5.6022f, 3.0f, 6.0f, 3.0f)
                    horizontalLineTo(11.713f)
                    lineTo(9.259f, 21.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.6022f, 21.0f, 2.2206f, 21.158f, 1.9393f, 21.4393f)
                    curveTo(1.658f, 21.7206f, 1.5f, 22.1022f, 1.5f, 22.5f)
                    curveTo(1.5f, 22.8978f, 1.658f, 23.2794f, 1.9393f, 23.5607f)
                    curveTo(2.2206f, 23.842f, 2.6022f, 24.0f, 3.0f, 24.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.3978f, 24.0f, 18.7794f, 23.842f, 19.0607f, 23.5607f)
                    curveTo(19.342f, 23.2794f, 19.5f, 22.8978f, 19.5f, 22.5f)
                    curveTo(19.5f, 22.1022f, 19.342f, 21.7206f, 19.0607f, 21.4393f)
                    curveTo(18.7794f, 21.158f, 18.3978f, 21.0f, 18.0f, 21.0f)
                    horizontalLineTo(12.287f)
                    lineTo(14.741f, 3.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.3978f, 3.0f, 21.7794f, 2.842f, 22.0607f, 2.5607f)
                    curveTo(22.342f, 2.2794f, 22.5f, 1.8978f, 22.5f, 1.5f)
                    curveTo(22.5f, 1.1022f, 22.342f, 0.7206f, 22.0607f, 0.4393f)
                    curveTo(21.7794f, 0.158f, 21.3978f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _italic!!
    }

private var _italic: ImageVector? = null
