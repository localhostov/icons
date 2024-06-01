package me.localx.icons.straight.filled

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

public val Icons.Filled.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 5.0f)
                    horizontalLineTo(20.414f)
                    lineTo(23.707f, 1.707f)
                    lineTo(22.293f, 0.293f)
                    lineTo(19.0f, 3.586f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(5.456f)
                    curveTo(16.1815f, 4.5846f, 15.2152f, 3.8649f, 14.146f, 3.33f)
                    curveTo(13.4033f, 3.0021f, 12.5744f, 2.9237f, 11.7834f, 3.1067f)
                    curveTo(10.9925f, 3.2897f, 10.2822f, 3.7242f, 9.759f, 4.345f)
                    lineTo(13.399f, 7.985f)
                    lineTo(11.985f, 9.4f)
                    lineTo(8.55f, 5.964f)
                    curveTo(7.791f, 7.172f, 6.915f, 8.827f, 6.032f, 10.618f)
                    lineTo(9.284f, 13.87f)
                    lineTo(7.87f, 15.284f)
                    lineTo(5.112f, 12.526f)
                    curveTo(3.177f, 16.616f, 1.412f, 20.806f, 1.077f, 21.615f)
                    lineTo(0.139f, 23.861f)
                    lineTo(2.386f, 22.923f)
                    curveTo(3.469f, 22.47f, 10.634f, 19.456f, 15.486f, 16.899f)
                    lineTo(12.7f, 14.111f)
                    lineTo(14.111f, 12.7f)
                    lineTo(17.311f, 15.9f)
                    curveTo(18.1415f, 15.4508f, 18.9184f, 14.909f, 19.627f, 14.285f)
                    curveTo(20.2596f, 13.7628f, 20.7044f, 13.0482f, 20.8937f, 12.2501f)
                    curveTo(21.0831f, 11.4519f, 21.0066f, 10.6137f, 20.676f, 9.863f)
                    curveTo(20.1397f, 8.7904f, 19.418f, 7.8211f, 18.544f, 7.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.0f)
                    close()
                }
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
