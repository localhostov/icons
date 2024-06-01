package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.AngleSmallDown: ImageVector
    get() {
        if (_angleSmallDown != null) {
            return _angleSmallDown!!
        }
        _angleSmallDown = Builder(name = "AngleSmallDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0612f, 7.854f)
                curveTo(18.9219f, 7.7146f, 18.7565f, 7.604f, 18.5745f, 7.5286f)
                curveTo(18.3924f, 7.4531f, 18.1973f, 7.4143f, 18.0002f, 7.4143f)
                curveTo(17.8032f, 7.4143f, 17.608f, 7.4531f, 17.426f, 7.5286f)
                curveTo(17.2439f, 7.604f, 17.0785f, 7.7146f, 16.9392f, 7.854f)
                lineTo(12.3532f, 12.439f)
                curveTo(12.2595f, 12.5327f, 12.1323f, 12.5854f, 11.9997f, 12.5854f)
                curveTo(11.8671f, 12.5854f, 11.74f, 12.5327f, 11.6462f, 12.439f)
                lineTo(7.0612f, 7.854f)
                curveTo(6.78f, 7.5726f, 6.3984f, 7.4145f, 6.0006f, 7.4144f)
                curveTo(5.6027f, 7.4143f, 5.2211f, 7.5722f, 4.9397f, 7.8535f)
                curveTo(4.6583f, 8.1348f, 4.5002f, 8.5163f, 4.5001f, 8.9141f)
                curveTo(4.5f, 9.312f, 4.658f, 9.6936f, 4.9392f, 9.975f)
                lineTo(9.5252f, 14.561f)
                curveTo(9.8502f, 14.886f, 10.2361f, 15.1439f, 10.6607f, 15.3198f)
                curveTo(11.0854f, 15.4957f, 11.5406f, 15.5862f, 12.0002f, 15.5862f)
                curveTo(12.4599f, 15.5862f, 12.915f, 15.4957f, 13.3397f, 15.3198f)
                curveTo(13.7644f, 15.1439f, 14.1502f, 14.886f, 14.4752f, 14.561f)
                lineTo(19.0612f, 9.975f)
                curveTo(19.3424f, 9.6937f, 19.5004f, 9.3122f, 19.5004f, 8.9145f)
                curveTo(19.5004f, 8.5167f, 19.3424f, 8.1353f, 19.0612f, 7.854f)
                close()
            }
        }
        .build()
        return _angleSmallDown!!
    }

private var _angleSmallDown: ImageVector? = null
