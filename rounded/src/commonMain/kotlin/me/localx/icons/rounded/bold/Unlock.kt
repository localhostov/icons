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

public val Icons.Bold.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.4998f, 8.001f)
                    horizontalLineTo(8.0003f)
                    verticalLineTo(7.228f)
                    curveTo(8.0007f, 4.8931f, 9.8939f, 3.0006f, 12.2288f, 3.001f)
                    curveTo(13.7662f, 3.0013f, 15.1822f, 3.8361f, 15.9268f, 5.1811f)
                    curveTo(16.3288f, 5.9054f, 17.2419f, 6.1666f, 17.9661f, 5.7646f)
                    curveTo(18.6904f, 5.3625f, 18.9516f, 4.4495f, 18.5496f, 3.7252f)
                    curveTo(16.6147f, 0.2339f, 12.2158f, -1.0278f, 8.7245f, 0.9072f)
                    curveTo(6.4267f, 2.1807f, 5.0008f, 4.6008f, 5.0005f, 7.228f)
                    verticalLineTo(8.6079f)
                    curveTo(3.1614f, 9.5464f, 2.0029f, 11.4359f, 2.0007f, 13.5006f)
                    verticalLineTo(18.5003f)
                    curveTo(2.004f, 21.5363f, 4.4643f, 23.9966f, 7.5003f, 23.9999f)
                    horizontalLineTo(16.4998f)
                    curveTo(19.5357f, 23.9966f, 21.9961f, 21.5363f, 21.9994f, 18.5003f)
                    verticalLineTo(13.5006f)
                    curveTo(21.9961f, 10.4646f, 19.5358f, 8.0043f, 16.4998f, 8.001f)
                    close()
                    moveTo(18.9996f, 18.5003f)
                    curveTo(18.9996f, 19.8809f, 17.8804f, 21.0001f, 16.4998f, 21.0001f)
                    horizontalLineTo(7.5004f)
                    curveTo(6.1198f, 21.0001f, 5.0006f, 19.8809f, 5.0006f, 18.5003f)
                    verticalLineTo(13.5006f)
                    curveTo(5.0006f, 12.12f, 6.1198f, 11.0008f, 7.5004f, 11.0008f)
                    horizontalLineTo(16.4998f)
                    curveTo(17.8804f, 11.0008f, 18.9996f, 12.12f, 18.9996f, 13.5006f)
                    verticalLineTo(18.5003f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.5001f, 13.9998f)
                    horizontalLineTo(12.5f)
                    curveTo(13.3284f, 13.9998f, 13.9999f, 14.6714f, 13.9999f, 15.4997f)
                    curveTo(13.9999f, 16.3281f, 13.3284f, 16.9996f, 12.5f, 16.9996f)
                    horizontalLineTo(11.5001f)
                    curveTo(10.6717f, 16.9996f, 10.0002f, 16.3281f, 10.0002f, 15.4997f)
                    curveTo(10.0002f, 14.6714f, 10.6717f, 13.9998f, 11.5001f, 13.9998f)
                    close()
                }
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null
