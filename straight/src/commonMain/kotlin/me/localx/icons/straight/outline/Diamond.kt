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

public val Icons.Outline.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.3593f, 9.8f)
                    curveTo(23.7583f, 9.2886f, 23.9818f, 8.6621f, 23.9966f, 8.0136f)
                    curveTo(24.0113f, 7.3651f, 23.8166f, 6.7291f, 23.4413f, 6.2f)
                    lineTo(19.9103f, 1.257f)
                    curveTo(19.6329f, 0.8683f, 19.2666f, 0.5515f, 18.8421f, 0.3329f)
                    curveTo(18.4175f, 0.1142f, 17.9469f, 1.0E-4f, 17.4693f, 0.0f)
                    lineTo(6.5313f, 0.0f)
                    curveTo(6.0538f, 1.0E-4f, 5.5832f, 0.1142f, 5.1586f, 0.3329f)
                    curveTo(4.734f, 0.5515f, 4.3678f, 0.8683f, 4.0903f, 1.257f)
                    lineTo(0.5593f, 6.2f)
                    curveTo(0.1848f, 6.7295f, -0.0092f, 7.3656f, 0.0061f, 8.0141f)
                    curveTo(0.0214f, 8.6625f, 0.2452f, 9.2887f, 0.6443f, 9.8f)
                    lineTo(12.0003f, 24.108f)
                    lineTo(23.3593f, 9.8f)
                    close()
                    moveTo(7.2533f, 9.0f)
                    lineTo(10.0533f, 18.432f)
                    lineTo(2.5623f, 9.0f)
                    horizontalLineTo(7.2533f)
                    close()
                    moveTo(21.4383f, 9.0f)
                    lineTo(13.9523f, 18.432f)
                    lineTo(16.7473f, 9.0f)
                    horizontalLineTo(21.4383f)
                    close()
                    moveTo(14.6613f, 9.0f)
                    lineTo(12.0003f, 17.979f)
                    lineTo(9.3393f, 9.0f)
                    horizontalLineTo(14.6613f)
                    close()
                    moveTo(9.3263f, 7.0f)
                    lineTo(10.7543f, 2.0f)
                    horizontalLineTo(13.2463f)
                    lineTo(14.6743f, 7.0f)
                    horizontalLineTo(9.3263f)
                    close()
                    moveTo(18.2833f, 2.419f)
                    lineTo(21.5553f, 7.0f)
                    horizontalLineTo(16.7553f)
                    lineTo(15.3263f, 2.0f)
                    horizontalLineTo(17.4693f)
                    curveTo(17.6286f, 2.0f, 17.7855f, 2.038f, 17.9271f, 2.1109f)
                    curveTo(18.0687f, 2.1838f, 18.1908f, 2.2894f, 18.2833f, 2.419f)
                    close()
                    moveTo(5.7173f, 2.419f)
                    curveTo(5.8099f, 2.2894f, 5.932f, 2.1838f, 6.0736f, 2.1109f)
                    curveTo(6.2151f, 2.038f, 6.3721f, 2.0f, 6.5313f, 2.0f)
                    horizontalLineTo(8.6743f)
                    lineTo(7.2463f, 7.0f)
                    horizontalLineTo(2.4463f)
                    lineTo(5.7173f, 2.419f)
                    close()
                }
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
