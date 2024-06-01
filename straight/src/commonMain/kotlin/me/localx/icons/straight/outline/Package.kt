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

public val Icons.Outline.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(name = "Package", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 15.9998f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(11.9998f)
                    curveTo(11.9994f, 10.9263f, 11.7108f, 9.8727f, 11.1643f, 8.9487f)
                    curveTo(10.6178f, 8.0248f, 9.8334f, 7.2644f, 8.893f, 6.7468f)
                    curveTo(9.4339f, 6.1803f, 9.7966f, 5.4675f, 9.9361f, 4.6967f)
                    curveTo(10.0755f, 3.926f, 9.9857f, 3.1312f, 9.6776f, 2.4111f)
                    curveTo(9.3695f, 1.691f, 8.8568f, 1.0772f, 8.203f, 0.6458f)
                    curveTo(7.5493f, 0.2144f, 6.7833f, -0.0156f, 6.0f, -0.0156f)
                    curveTo(5.2167f, -0.0156f, 4.4507f, 0.2144f, 3.797f, 0.6458f)
                    curveTo(3.1432f, 1.0772f, 2.6305f, 1.691f, 2.3224f, 2.4111f)
                    curveTo(2.0143f, 3.1312f, 1.9245f, 3.926f, 2.0639f, 4.6967f)
                    curveTo(2.2034f, 5.4675f, 2.5661f, 6.1803f, 3.107f, 6.7468f)
                    curveTo(2.1666f, 7.2644f, 1.3822f, 8.0248f, 0.8357f, 8.9487f)
                    curveTo(0.2892f, 9.8727f, 6.0E-4f, 10.9263f, 0.0f, 11.9998f)
                    lineTo(0.0f, 23.9998f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(17.9998f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(23.9998f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.9998f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(15.9998f)
                    close()
                    moveTo(4.0f, 3.9998f)
                    curveTo(4.0f, 3.6042f, 4.1173f, 3.2175f, 4.3371f, 2.8886f)
                    curveTo(4.5568f, 2.5597f, 4.8692f, 2.3034f, 5.2346f, 2.152f)
                    curveTo(5.6001f, 2.0006f, 6.0022f, 1.961f, 6.3902f, 2.0382f)
                    curveTo(6.7781f, 2.1154f, 7.1345f, 2.3059f, 7.4142f, 2.5856f)
                    curveTo(7.6939f, 2.8653f, 7.8844f, 3.2216f, 7.9616f, 3.6096f)
                    curveTo(8.0387f, 3.9976f, 7.9991f, 4.3997f, 7.8478f, 4.7652f)
                    curveTo(7.6964f, 5.1306f, 7.44f, 5.443f, 7.1111f, 5.6627f)
                    curveTo(6.7822f, 5.8825f, 6.3956f, 5.9998f, 6.0f, 5.9998f)
                    curveTo(5.4696f, 5.9998f, 4.9609f, 5.7891f, 4.5858f, 5.414f)
                    curveTo(4.2107f, 5.0389f, 4.0f, 4.5302f, 4.0f, 3.9998f)
                    close()
                    moveTo(2.0f, 11.9998f)
                    curveTo(2.0f, 10.9389f, 2.4214f, 9.9215f, 3.1716f, 9.1714f)
                    curveTo(3.9217f, 8.4212f, 4.9391f, 7.9998f, 6.0f, 7.9998f)
                    curveTo(7.0609f, 7.9998f, 8.0783f, 8.4212f, 8.8284f, 9.1714f)
                    curveTo(9.5786f, 9.9215f, 10.0f, 10.9389f, 10.0f, 11.9998f)
                    verticalLineTo(15.9998f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(11.9998f)
                    close()
                    moveTo(18.0f, 9.9998f)
                    verticalLineTo(11.9998f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(9.9998f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(15.9998f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(9.9998f)
                    horizontalLineTo(18.0f)
                    close()
                }
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
