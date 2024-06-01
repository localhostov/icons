package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(name = "Volume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 5.99f)
                    curveTo(1.4696f, 5.99f, 0.9609f, 6.2007f, 0.5858f, 6.5758f)
                    curveTo(0.2107f, 6.9509f, 0.0f, 7.4596f, 0.0f, 7.99f)
                    lineTo(0.0f, 16.004f)
                    curveTo(0.0f, 16.5344f, 0.2107f, 17.0431f, 0.5858f, 17.4182f)
                    curveTo(0.9609f, 17.7933f, 1.4696f, 18.004f, 2.0f, 18.004f)
                    horizontalLineTo(4.8f)
                    lineTo(12.0f, 24.0f)
                    verticalLineTo(0.0f)
                    lineTo(4.8f, 5.99f)
                    horizontalLineTo(2.0f)
                    close()
                    moveTo(10.0f, 4.268f)
                    verticalLineTo(19.729f)
                    lineTo(5.525f, 16.007f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(7.993f)
                    horizontalLineTo(5.525f)
                    lineTo(10.0f, 4.268f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9997f, 12.0005f)
                    curveTo(19.9994f, 10.6738f, 19.4728f, 9.4013f, 18.5354f, 8.4625f)
                    curveTo(17.598f, 7.5236f, 16.3264f, 6.9949f, 14.9997f, 6.9925f)
                    horizontalLineTo(13.9997f)
                    verticalLineTo(8.9925f)
                    horizontalLineTo(14.9997f)
                    curveTo(15.7967f, 8.9925f, 16.561f, 9.3091f, 17.1245f, 9.8727f)
                    curveTo(17.6881f, 10.4362f, 18.0047f, 11.2005f, 18.0047f, 11.9975f)
                    curveTo(18.0047f, 12.7945f, 17.6881f, 13.5588f, 17.1245f, 14.1224f)
                    curveTo(16.561f, 14.6859f, 15.7967f, 15.0025f, 14.9997f, 15.0025f)
                    horizontalLineTo(13.9997f)
                    verticalLineTo(17.0025f)
                    horizontalLineTo(14.9997f)
                    curveTo(16.3253f, 16.9999f, 17.5958f, 16.472f, 18.533f, 15.5344f)
                    curveTo(19.4702f, 14.5969f, 19.9976f, 13.3261f, 19.9997f, 12.0005f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9997f, 2.9843f)
                    horizontalLineTo(13.9997f)
                    verticalLineTo(4.9843f)
                    horizontalLineTo(14.9997f)
                    curveTo(16.8594f, 4.9843f, 18.6429f, 5.7231f, 19.9579f, 7.0381f)
                    curveTo(21.2729f, 8.3531f, 22.0117f, 10.1366f, 22.0117f, 11.9963f)
                    curveTo(22.0117f, 13.856f, 21.2729f, 15.6395f, 19.9579f, 16.9545f)
                    curveTo(18.6429f, 18.2695f, 16.8594f, 19.0083f, 14.9997f, 19.0083f)
                    horizontalLineTo(13.9997f)
                    verticalLineTo(21.0083f)
                    horizontalLineTo(14.9997f)
                    curveTo(17.3906f, 21.0083f, 19.6836f, 20.0585f, 21.3743f, 18.3679f)
                    curveTo(23.0649f, 16.6772f, 24.0147f, 14.3842f, 24.0147f, 11.9933f)
                    curveTo(24.0147f, 9.6024f, 23.0649f, 7.3094f, 21.3743f, 5.6187f)
                    curveTo(19.6836f, 3.9281f, 17.3906f, 2.9783f, 14.9997f, 2.9783f)
                    verticalLineTo(2.9843f)
                    close()
                }
            }
        }
        .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
