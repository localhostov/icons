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

public val Icons.Outline.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 1.0002f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 1.0002f, 1.4413f, 1.3163f, 0.8787f, 1.8789f)
                    curveTo(0.3161f, 2.4415f, 0.0f, 3.2046f, 0.0f, 4.0002f)
                    lineTo(0.0f, 23.0002f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.0002f)
                    curveTo(24.0f, 3.2046f, 23.6839f, 2.4415f, 23.1213f, 1.8789f)
                    curveTo(22.5587f, 1.3163f, 21.7956f, 1.0002f, 21.0f, 1.0002f)
                    close()
                    moveTo(3.0f, 3.0002f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 3.0002f, 21.5196f, 3.1056f, 21.7071f, 3.2931f)
                    curveTo(21.8946f, 3.4807f, 22.0f, 3.735f, 22.0f, 4.0002f)
                    verticalLineTo(4.6672f)
                    lineTo(14.122f, 12.5462f)
                    curveTo(13.5584f, 13.1076f, 12.7954f, 13.4227f, 12.0f, 13.4227f)
                    curveTo(11.2046f, 13.4227f, 10.4416f, 13.1076f, 9.878f, 12.5462f)
                    lineTo(2.0f, 4.6672f)
                    verticalLineTo(4.0002f)
                    curveTo(2.0f, 3.735f, 2.1054f, 3.4807f, 2.2929f, 3.2931f)
                    curveTo(2.4804f, 3.1056f, 2.7348f, 3.0002f, 3.0f, 3.0002f)
                    close()
                    moveTo(2.0f, 21.0002f)
                    verticalLineTo(7.5002f)
                    lineTo(8.464f, 13.9602f)
                    curveTo(9.4026f, 14.8965f, 10.6743f, 15.4223f, 12.0f, 15.4223f)
                    curveTo(13.3257f, 15.4223f, 14.5974f, 14.8965f, 15.536f, 13.9602f)
                    lineTo(22.0f, 7.5002f)
                    verticalLineTo(21.0002f)
                    horizontalLineTo(2.0f)
                    close()
                }
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
