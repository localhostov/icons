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

public val Icons.Bold.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.77f, 6.2154f)
                    curveTo(1.2511f, 6.3622f, 0.7958f, 6.6772f, 0.4754f, 7.1109f)
                    curveTo(0.155f, 7.5446f, -0.0122f, 8.0724f, -1.0E-4f, 8.6114f)
                    curveTo(0.0225f, 9.2605f, 0.2994f, 9.8747f, 0.7709f, 10.3214f)
                    lineTo(3.9999f, 13.5484f)
                    verticalLineTo(20.0004f)
                    horizontalLineTo(10.4479f)
                    lineTo(13.713f, 23.2674f)
                    curveTo(13.936f, 23.4932f, 14.2017f, 23.6724f, 14.4945f, 23.7948f)
                    curveTo(14.7874f, 23.9172f, 15.1016f, 23.9803f, 15.419f, 23.9804f)
                    curveTo(15.6275f, 23.9803f, 15.8352f, 23.9534f, 16.037f, 23.9004f)
                    curveTo(16.4482f, 23.7966f, 16.8247f, 23.5855f, 17.1279f, 23.2888f)
                    curveTo(17.4311f, 22.9921f, 17.6502f, 22.6204f, 17.763f, 22.2114f)
                    lineTo(24.0f, -0.0156f)
                    lineTo(1.77f, 6.2154f)
                    close()
                    moveTo(3.5329f, 8.8564f)
                    lineTo(16.742f, 5.1564f)
                    lineTo(6.9999f, 14.9004f)
                    verticalLineTo(12.3264f)
                    lineTo(3.5329f, 8.8564f)
                    close()
                    moveTo(15.133f, 20.4564f)
                    lineTo(11.6749f, 17.0004f)
                    horizontalLineTo(9.0999f)
                    lineTo(18.834f, 7.2594f)
                    lineTo(15.133f, 20.4564f)
                    close()
                }
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
