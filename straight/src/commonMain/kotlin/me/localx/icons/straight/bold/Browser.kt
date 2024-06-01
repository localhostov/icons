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

public val Icons.Bold.Browser: ImageVector
    get() {
        if (_browser != null) {
            return _browser!!
        }
        _browser = Builder(name = "Browser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 13.0001f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(10.0001f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(13.0001f)
                    close()
                    moveTo(15.0f, 15.0001f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(18.0001f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(15.0001f)
                    close()
                    moveTo(24.0f, 4.5001f)
                    verticalLineTo(23.0001f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(4.5001f)
                    curveTo(0.0f, 3.5719f, 0.3687f, 2.6816f, 1.0251f, 2.0252f)
                    curveTo(1.6815f, 1.3689f, 2.5717f, 1.0001f, 3.5f, 1.0001f)
                    horizontalLineTo(20.5f)
                    curveTo(21.4283f, 1.0001f, 22.3185f, 1.3689f, 22.9749f, 2.0252f)
                    curveTo(23.6313f, 2.6816f, 24.0f, 3.5719f, 24.0f, 4.5001f)
                    close()
                    moveTo(8.0f, 4.5001f)
                    curveTo(8.0f, 4.7968f, 8.088f, 5.0868f, 8.2528f, 5.3335f)
                    curveTo(8.4176f, 5.5802f, 8.6519f, 5.7724f, 8.926f, 5.8859f)
                    curveTo(9.2001f, 5.9995f, 9.5017f, 6.0292f, 9.7926f, 5.9713f)
                    curveTo(10.0836f, 5.9134f, 10.3509f, 5.7706f, 10.5607f, 5.5608f)
                    curveTo(10.7704f, 5.351f, 10.9133f, 5.0837f, 10.9712f, 4.7928f)
                    curveTo(11.0291f, 4.5018f, 10.9994f, 4.2002f, 10.8858f, 3.9261f)
                    curveTo(10.7723f, 3.652f, 10.58f, 3.4177f, 10.3334f, 3.2529f)
                    curveTo(10.0867f, 3.0881f, 9.7967f, 3.0001f, 9.5f, 3.0001f)
                    curveTo(9.1022f, 3.0001f, 8.7206f, 3.1582f, 8.4393f, 3.4395f)
                    curveTo(8.158f, 3.7208f, 8.0f, 4.1023f, 8.0f, 4.5001f)
                    close()
                    moveTo(4.5f, 6.0001f)
                    curveTo(4.7967f, 6.0001f, 5.0867f, 5.9121f, 5.3334f, 5.7473f)
                    curveTo(5.58f, 5.5825f, 5.7723f, 5.3482f, 5.8858f, 5.0742f)
                    curveTo(5.9994f, 4.8001f, 6.0291f, 4.4985f, 5.9712f, 4.2075f)
                    curveTo(5.9133f, 3.9165f, 5.7704f, 3.6492f, 5.5607f, 3.4395f)
                    curveTo(5.3509f, 3.2297f, 5.0836f, 3.0868f, 4.7926f, 3.0289f)
                    curveTo(4.5017f, 2.9711f, 4.2001f, 3.0008f, 3.926f, 3.1143f)
                    curveTo(3.6519f, 3.2278f, 3.4176f, 3.4201f, 3.2528f, 3.6668f)
                    curveTo(3.088f, 3.9134f, 3.0f, 4.2035f, 3.0f, 4.5001f)
                    curveTo(3.0f, 4.898f, 3.158f, 5.2795f, 3.4393f, 5.5608f)
                    curveTo(3.7206f, 5.8421f, 4.1022f, 6.0001f, 4.5f, 6.0001f)
                    close()
                    moveTo(21.0f, 8.0001f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(20.0001f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(8.0001f)
                    close()
                }
            }
        }
        .build()
        return _browser!!
    }

private var _browser: ImageVector? = null
