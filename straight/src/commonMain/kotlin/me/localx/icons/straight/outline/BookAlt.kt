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

public val Icons.Outline.BookAlt: ImageVector
    get() {
        if (_bookAlt != null) {
            return _bookAlt!!
        }
        _bookAlt = Builder(name = "BookAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.922f, 1.7f)
                    curveTo(22.5852f, 1.4177f, 22.1903f, 1.2133f, 21.7654f, 1.1013f)
                    curveTo(21.3405f, 0.9893f, 20.8961f, 0.9724f, 20.464f, 1.052f)
                    lineTo(14.284f, 2.175f)
                    curveTo(13.3997f, 2.3345f, 12.5949f, 2.7875f, 12.0f, 3.461f)
                    curveTo(11.4055f, 2.7864f, 10.6007f, 2.3323f, 9.716f, 2.172f)
                    lineTo(3.536f, 1.049f)
                    curveTo(3.1038f, 0.9705f, 2.6596f, 0.9879f, 2.2348f, 1.1f)
                    curveTo(1.81f, 1.212f, 1.4151f, 1.416f, 1.0778f, 1.6975f)
                    curveTo(0.7405f, 1.9789f, 0.4692f, 2.331f, 0.2829f, 2.7289f)
                    curveTo(0.0967f, 3.1268f, 1.0E-4f, 3.5607f, 0.0f, 4.0f)
                    lineTo(0.0f, 20.834f)
                    lineTo(12.0f, 23.017f)
                    lineTo(24.0f, 20.834f)
                    verticalLineTo(4.0f)
                    curveTo(24.0f, 3.561f, 23.9035f, 3.1274f, 23.7172f, 2.7299f)
                    curveTo(23.5309f, 2.3324f, 23.2594f, 1.9808f, 22.922f, 1.7f)
                    close()
                    moveTo(11.0f, 20.8f)
                    lineTo(2.0f, 19.166f)
                    verticalLineTo(4.0f)
                    curveTo(2.0001f, 3.8536f, 2.0324f, 3.709f, 2.0945f, 3.5764f)
                    curveTo(2.1567f, 3.4439f, 2.2472f, 3.3266f, 2.3596f, 3.2328f)
                    curveTo(2.4721f, 3.139f, 2.6037f, 3.0711f, 2.7453f, 3.0338f)
                    curveTo(2.8869f, 2.9965f, 3.035f, 2.9908f, 3.179f, 3.017f)
                    lineTo(9.358f, 4.14f)
                    curveTo(9.8188f, 4.2238f, 10.2356f, 4.4668f, 10.5357f, 4.8264f)
                    curveTo(10.8357f, 5.1861f, 11.0001f, 5.6396f, 11.0f, 6.108f)
                    verticalLineTo(20.8f)
                    close()
                    moveTo(22.0f, 19.164f)
                    lineTo(13.0f, 20.8f)
                    verticalLineTo(6.108f)
                    curveTo(12.9999f, 5.6396f, 13.1643f, 5.1861f, 13.4643f, 4.8264f)
                    curveTo(13.7644f, 4.4668f, 14.1812f, 4.2238f, 14.642f, 4.14f)
                    lineTo(20.821f, 3.017f)
                    curveTo(20.965f, 2.9908f, 21.1131f, 2.9965f, 21.2547f, 3.0338f)
                    curveTo(21.3963f, 3.0711f, 21.5279f, 3.139f, 21.6404f, 3.2328f)
                    curveTo(21.7528f, 3.3266f, 21.8433f, 3.4439f, 21.9055f, 3.5764f)
                    curveTo(21.9676f, 3.709f, 21.9999f, 3.8536f, 22.0f, 4.0f)
                    verticalLineTo(19.164f)
                    close()
                }
            }
        }
        .build()
        return _bookAlt!!
    }

private var _bookAlt: ImageVector? = null
