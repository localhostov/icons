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

public val Icons.Filled.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) {
            return _cloudSnow!!
        }
        _cloudSnow = Builder(name = "CloudSnow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.914f, 5.132f)
                arcToRelative(1.033f, 1.033f, 0.0f, false, true, -0.683f, -0.555f)
                curveTo(13.1f, -3.756f, 0.516f, 0.231f, 2.146f, 9.528f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.345f, 0.9f)
                arcTo(5.54f, 5.54f, 0.0f, false, false, 2.214f, 18.9f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, 1.524f, -0.486f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 10.554f, 0.08f)
                arcTo(2.063f, 2.063f, 0.0f, false, false, 16.5f, 20.0f)
                curveTo(25.123f, 20.017f, 27.132f, 7.12f, 17.914f, 5.132f)
                close()
                moveTo(17.0f, 11.0f)
                lineTo(15.726f, 11.0f)
                lineToRelative(0.633f, 1.105f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.734f, 0.995f)
                lineTo(14.0f, 12.01f)
                lineToRelative(-0.625f, 1.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.734f, -0.995f)
                lineTo(12.274f, 11.0f)
                lineTo(11.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.274f)
                lineTo(11.641f, 7.9f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 13.375f, 6.9f)
                lineTo(14.0f, 7.99f)
                lineToRelative(0.625f, -1.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.734f, 0.995f)
                lineTo(15.726f, 9.0f)
                lineTo(17.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 11.0f)
                close()
                moveTo(13.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(10.726f, 21.0f)
                lineToRelative(0.633f, 1.105f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.734f, 1.0f)
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
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 20.0f)
                close()
            }
        }
        .build()
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
