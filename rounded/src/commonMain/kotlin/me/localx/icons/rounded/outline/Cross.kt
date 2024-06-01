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

public val Icons.Outline.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.7072f, 0.2932f)
                    curveTo(23.5196f, 0.1057f, 23.2653f, 4.0E-4f, 23.0002f, 4.0E-4f)
                    curveTo(22.735f, 4.0E-4f, 22.4807f, 0.1057f, 22.2932f, 0.2932f)
                    lineTo(12.0002f, 10.5862f)
                    lineTo(1.7071f, 0.2932f)
                    curveTo(1.5196f, 0.1057f, 1.2653f, 4.0E-4f, 1.0001f, 4.0E-4f)
                    curveTo(0.735f, 4.0E-4f, 0.4807f, 0.1057f, 0.2932f, 0.2932f)
                    curveTo(0.1057f, 0.4807f, 4.0E-4f, 0.735f, 4.0E-4f, 1.0001f)
                    curveTo(4.0E-4f, 1.2653f, 0.1057f, 1.5196f, 0.2932f, 1.7071f)
                    lineTo(10.5862f, 12.0002f)
                    lineTo(0.2932f, 22.2932f)
                    curveTo(0.1057f, 22.4807f, 4.0E-4f, 22.735f, 4.0E-4f, 23.0002f)
                    curveTo(4.0E-4f, 23.2653f, 0.1057f, 23.5196f, 0.2932f, 23.7072f)
                    curveTo(0.4807f, 23.8946f, 0.735f, 23.9999f, 1.0001f, 23.9999f)
                    curveTo(1.2653f, 23.9999f, 1.5196f, 23.8946f, 1.7071f, 23.7072f)
                    lineTo(12.0002f, 13.4142f)
                    lineTo(22.2932f, 23.7072f)
                    curveTo(22.4807f, 23.8946f, 22.735f, 23.9999f, 23.0002f, 23.9999f)
                    curveTo(23.2653f, 23.9999f, 23.5196f, 23.8946f, 23.7072f, 23.7072f)
                    curveTo(23.8946f, 23.5196f, 23.9999f, 23.2653f, 23.9999f, 23.0002f)
                    curveTo(23.9999f, 22.735f, 23.8946f, 22.4807f, 23.7072f, 22.2932f)
                    lineTo(13.4142f, 12.0002f)
                    lineTo(23.7072f, 1.7071f)
                    curveTo(23.8946f, 1.5196f, 23.9999f, 1.2653f, 23.9999f, 1.0001f)
                    curveTo(23.9999f, 0.735f, 23.8946f, 0.4807f, 23.7072f, 0.2932f)
                    close()
                }
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
