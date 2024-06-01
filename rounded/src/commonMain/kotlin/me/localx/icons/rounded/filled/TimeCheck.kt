package me.localx.icons.rounded.filled

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

public val Icons.Filled.TimeCheck: ImageVector
    get() {
        if (_timeCheck != null) {
            return _timeCheck!!
        }
        _timeCheck = Builder(name = "TimeCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9509f, 23.0008f)
                    horizontalLineTo(18.9179f)
                    curveTo(18.4069f, 22.9928f, 17.9209f, 22.7758f, 17.5739f, 22.4008f)
                    lineTo(15.6559f, 20.5198f)
                    curveTo(15.2719f, 20.1228f, 15.2809f, 19.4898f, 15.6779f, 19.1058f)
                    curveTo(15.6789f, 19.1048f, 15.6799f, 19.1038f, 15.6809f, 19.1028f)
                    curveTo(16.0779f, 18.7218f, 16.7079f, 18.7328f, 17.0909f, 19.1268f)
                    lineTo(18.9519f, 20.9498f)
                    lineTo(22.2929f, 17.6088f)
                    curveTo(22.6829f, 17.2188f, 23.3169f, 17.2188f, 23.7069f, 17.6088f)
                    curveTo(24.0969f, 17.9988f, 24.0969f, 18.6328f, 23.7069f, 19.0228f)
                    lineTo(20.2859f, 22.4438f)
                    curveTo(19.9339f, 22.8008f, 19.4529f, 23.0018f, 18.9509f, 23.0008f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0351f, 20.0149f)
                    curveTo(14.0311f, 16.7179f, 16.7001f, 14.0419f, 19.9961f, 14.0369f)
                    curveTo(21.2791f, 14.0349f, 22.5291f, 14.4469f, 23.5591f, 15.2119f)
                    curveTo(25.3321f, 8.8269f, 21.5931f, 2.2139f, 15.2091f, 0.4409f)
                    curveTo(8.8251f, -1.3321f, 2.2131f, 2.4059f, 0.4401f, 8.7909f)
                    curveTo(-1.3329f, 15.1759f, 2.4061f, 21.7899f, 8.7901f, 23.5629f)
                    curveTo(10.8901f, 24.1459f, 13.1091f, 24.1459f, 15.2091f, 23.5629f)
                    curveTo(14.4471f, 22.5369f, 14.0351f, 21.2929f, 14.0351f, 20.0149f)
                    close()
                    moveTo(13.0001f, 12.0219f)
                    curveTo(13.0001f, 12.2879f, 12.8941f, 12.5419f, 12.7061f, 12.7299f)
                    lineTo(9.7011f, 15.7359f)
                    curveTo(9.3031f, 16.1199f, 8.6691f, 16.1089f, 8.2851f, 15.7109f)
                    curveTo(7.9101f, 15.3229f, 7.9101f, 14.7069f, 8.2851f, 14.3189f)
                    lineTo(10.9971f, 11.6069f)
                    verticalLineTo(7.0129f)
                    curveTo(10.9971f, 6.4599f, 11.4451f, 6.0109f, 11.9991f, 6.0109f)
                    curveTo(12.5521f, 6.0109f, 13.0001f, 6.4599f, 13.0001f, 7.0129f)
                    verticalLineTo(12.0219f)
                    close()
                }
            }
        }
        .build()
        return _timeCheck!!
    }

private var _timeCheck: ImageVector? = null
