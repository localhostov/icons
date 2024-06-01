package me.localx.icons.straight.bold

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

public val Icons.Bold.SignOutAlt: ImageVector
    get() {
        if (_signOutAlt != null) {
            return _signOutAlt!!
        }
        _signOutAlt = Builder(name = "SignOutAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.1171f, 9.8786f)
                    lineTo(18.1671f, 4.9286f)
                    lineTo(16.0461f, 7.0497f)
                    lineTo(19.5001f, 10.4996f)
                    horizontalLineTo(6.6171f)
                    verticalLineTo(13.4996f)
                    horizontalLineTo(19.5001f)
                    lineTo(16.0501f, 16.9496f)
                    lineTo(18.1711f, 19.0706f)
                    lineTo(23.1211f, 14.1206f)
                    curveTo(23.683f, 13.5575f, 23.9982f, 12.7943f, 23.9974f, 11.9988f)
                    curveTo(23.9967f, 11.2033f, 23.68f, 10.4407f, 23.1171f, 9.8786f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.994f, 20.4993f)
                    curveTo(9.994f, 20.6319f, 9.9414f, 20.7591f, 9.8476f, 20.8528f)
                    curveTo(9.7538f, 20.9466f, 9.6266f, 20.9993f, 9.494f, 20.9993f)
                    horizontalLineTo(3.506f)
                    curveTo(3.3734f, 20.9993f, 3.2463f, 20.9466f, 3.1525f, 20.8528f)
                    curveTo(3.0587f, 20.7591f, 3.006f, 20.6319f, 3.006f, 20.4993f)
                    verticalLineTo(3.5303f)
                    curveTo(3.006f, 3.3977f, 3.0587f, 3.2705f, 3.1525f, 3.1767f)
                    curveTo(3.2463f, 3.083f, 3.3734f, 3.0303f, 3.506f, 3.0303f)
                    horizontalLineTo(9.494f)
                    curveTo(9.6266f, 3.0303f, 9.7538f, 3.083f, 9.8476f, 3.1767f)
                    curveTo(9.9414f, 3.2705f, 9.994f, 3.3977f, 9.994f, 3.5303f)
                    verticalLineTo(8.3443f)
                    horizontalLineTo(12.994f)
                    verticalLineTo(3.5303f)
                    curveTo(12.9927f, 2.6024f, 12.6235f, 1.7129f, 11.9675f, 1.0569f)
                    curveTo(11.3114f, 0.4008f, 10.4219f, 0.0316f, 9.494f, 0.0303f)
                    horizontalLineTo(3.506f)
                    curveTo(2.5782f, 0.0316f, 1.6887f, 0.4008f, 1.0326f, 1.0569f)
                    curveTo(0.3765f, 1.7129f, 0.0074f, 2.6024f, 0.006f, 3.5303f)
                    verticalLineTo(20.4993f)
                    curveTo(0.006f, 21.4275f, 0.3748f, 22.3178f, 1.0312f, 22.9741f)
                    curveTo(1.6875f, 23.6305f, 2.5778f, 23.9993f, 3.506f, 23.9993f)
                    horizontalLineTo(9.494f)
                    curveTo(10.4223f, 23.9993f, 11.3125f, 23.6305f, 11.9689f, 22.9741f)
                    curveTo(12.6253f, 22.3178f, 12.994f, 21.4275f, 12.994f, 20.4993f)
                    verticalLineTo(15.6823f)
                    horizontalLineTo(9.994f)
                    verticalLineTo(20.4993f)
                    close()
                }
            }
        }
        .build()
        return _signOutAlt!!
    }

private var _signOutAlt: ImageVector? = null
