package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.SignIn: ImageVector
    get() {
        if (_signIn != null) {
            return _signIn!!
        }
        _signIn = Builder(name = "SignIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.0013f, 21.0f)
                    horizontalLineTo(3.4103f)
                    curveTo(3.1846f, 20.9994f, 3.0018f, 20.8167f, 3.0013f, 20.591f)
                    verticalLineTo(3.409f)
                    curveTo(3.0018f, 3.1833f, 3.1846f, 3.0005f, 3.4103f, 3.0f)
                    horizontalLineTo(8.0013f)
                    curveTo(8.8297f, 3.0f, 9.5013f, 2.3284f, 9.5013f, 1.5f)
                    curveTo(9.5013f, 0.6716f, 8.8297f, 0.0f, 8.0013f, 0.0f)
                    horizontalLineTo(3.4103f)
                    curveTo(1.5285f, 0.0022f, 0.0035f, 1.5272f, 0.0013f, 3.409f)
                    verticalLineTo(20.591f)
                    curveTo(0.0035f, 22.4728f, 1.5285f, 23.9978f, 3.4103f, 24.0f)
                    horizontalLineTo(8.0013f)
                    curveTo(8.8297f, 24.0f, 9.5013f, 23.3284f, 9.5013f, 22.5f)
                    curveTo(9.5013f, 21.6716f, 8.8297f, 21.0f, 8.0013f, 21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.5014f, 10.5009f)
                    lineTo(8.8614f, 10.5279f)
                    lineTo(12.3274f, 7.0619f)
                    curveTo(12.9134f, 6.4762f, 12.9136f, 5.5264f, 12.3279f, 4.9404f)
                    curveTo(11.7422f, 4.3544f, 10.7924f, 4.3541f, 10.2064f, 4.9399f)
                    lineTo(6.3274f, 8.8189f)
                    curveTo(4.57f, 10.5762f, 4.57f, 13.4255f, 6.3274f, 15.1828f)
                    lineTo(6.3274f, 15.1828f)
                    lineTo(10.2064f, 19.0618f)
                    curveTo(10.7924f, 19.6475f, 11.7422f, 19.6473f, 12.3279f, 19.0613f)
                    curveTo(12.9136f, 18.4753f, 12.9134f, 17.5255f, 12.3274f, 16.9398f)
                    lineTo(8.9144f, 13.5278f)
                    lineTo(22.5014f, 13.5009f)
                    curveTo(23.3299f, 13.4992f, 24.0001f, 12.8263f, 23.9984f, 11.9979f)
                    curveTo(23.9968f, 11.1695f, 23.3239f, 10.4992f, 22.4954f, 10.5009f)
                    horizontalLineTo(22.5014f)
                    close()
                }
            }
        }
        .build()
        return _signIn!!
    }

private var _signIn: ImageVector? = null
