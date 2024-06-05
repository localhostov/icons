package me.localx.icons.rounded.outline

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

public val Icons.Outline.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) {
            return _cloudSnow!!
        }
        _cloudSnow = Builder(name = "CloudSnow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.493f, 23.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.868f, -0.5f)
                lineTo(9.0f, 22.01f)
                lineTo(8.375f, 23.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.734f, -1.0f)
                lineTo(7.274f, 21.0f)
                lineTo(6.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(7.274f, 19.0f)
                lineTo(6.641f, 17.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.734f, -1.0f)
                lineTo(9.0f, 17.99f)
                lineToRelative(0.625f, -1.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.734f, 1.0f)
                lineTo(10.726f, 19.0f)
                lineTo(12.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(10.726f, 21.0f)
                lineToRelative(0.633f, 1.105f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.866f, 1.5f)
                close()
                moveTo(16.5f, 20.0f)
                lineTo(16.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(6.59f, -0.1f, 7.509f, -9.506f, 1.083f, -10.894f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, -2.158f, -1.672f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.086f, 6.967f)
                arcToRelative(6.159f, 6.159f, 0.0f, false, false, 0.023f, 2.18f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.962f, 2.762f)
                arcTo(3.522f, 3.522f, 0.0f, false, false, 3.3f, 17.223f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.258f, 1.554f)
                arcTo(5.533f, 5.533f, 0.0f, false, true, 1.8f, 10.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.345f, -0.9f)
                arcToRelative(8.146f, 8.146f, 0.0f, false, true, -0.033f, -2.889f)
                arcTo(7.946f, 7.946f, 0.0f, false, true, 8.5f, 0.137f)
                arcToRelative(8.056f, 8.056f, 0.0f, false, true, 8.734f, 4.44f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 0.743f, 0.569f)
                curveTo(26.759f, 7.092f, 25.505f, 19.818f, 16.5f, 20.0f)
                close()
                moveTo(15.493f, 15.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.868f, -0.5f)
                lineTo(14.0f, 14.01f)
                lineToRelative(-0.625f, 1.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.734f, -0.995f)
                lineTo(12.274f, 13.0f)
                lineTo(11.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.274f)
                lineTo(11.641f, 9.9f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 13.375f, 8.9f)
                lineTo(14.0f, 9.99f)
                lineToRelative(0.625f, -1.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.734f, 0.995f)
                lineTo(15.726f, 11.0f)
                lineTo(17.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(15.726f, 13.0f)
                lineToRelative(0.633f, 1.105f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.866f, 1.5f)
                close()
            }
        }
        .build()
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
