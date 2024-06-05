package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.PepperHot: ImageVector
    get() {
        if (_pepperHot != null) {
            return _pepperHot!!
        }
        _pepperHot = Builder(name = "PepperHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.439f, 6.061f)
                arcTo(4.886f, 4.886f, 0.0f, false, true, 2.0f, 2.586f)
                lineTo(2.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                lineTo(5.0f, 2.586f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.561f, 1.353f)
                arcTo(4.886f, 4.886f, 0.0f, false, true, 7.0f, 7.414f)
                lineTo(7.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 7.414f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 3.439f, 6.061f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(4.886f, 4.886f, 0.0f, false, false, -1.439f, -3.475f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 10.0f, 1.171f)
                lineTo(10.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 1.171f)
                arcTo(4.886f, 4.886f, 0.0f, false, false, 8.439f, 4.647f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 9.0f, 6.0f)
                close()
                moveTo(24.0f, 11.045f)
                lineTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(5.271f, 24.0f, 0.0f, 18.949f, 0.0f, 12.5f)
                arcTo(8.382f, 8.382f, 0.0f, false, true, 0.437f, 10.0f)
                lineTo(0.791f, 9.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(0.194f, 1.274f)
                curveTo(3.958f, 13.39f, 5.315f, 14.0f, 7.5f, 14.0f)
                curveToRelative(1.9f, 0.0f, 3.954f, -0.925f, 3.954f, -2.955f)
                arcTo(6.278f, 6.278f, 0.0f, false, true, 16.084f, 5.0f)
                curveTo(15.575f, 3.647f, 14.7f, 3.0f, 14.0f, 3.0f)
                lineTo(14.0f, 0.0f)
                curveToRelative(2.216f, 0.0f, 4.454f, 1.694f, 5.221f, 4.96f)
                arcTo(6.278f, 6.278f, 0.0f, false, true, 24.0f, 11.045f)
                close()
                moveTo(21.0f, 11.045f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, false, -0.189f, -1.053f)
                arcTo(4.423f, 4.423f, 0.0f, false, true, 18.0f, 11.0f)
                arcToRelative(4.469f, 4.469f, 0.0f, false, true, -3.212f, -1.367f)
                arcToRelative(3.229f, 3.229f, 0.0f, false, false, -0.334f, 1.412f)
                curveTo(14.454f, 14.5f, 11.529f, 17.0f, 7.5f, 17.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -3.656f, -0.782f)
                arcTo(8.848f, 8.848f, 0.0f, false, false, 12.0f, 21.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _pepperHot!!
    }

private var _pepperHot: ImageVector? = null
