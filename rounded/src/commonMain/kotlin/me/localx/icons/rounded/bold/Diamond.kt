package me.localx.icons.rounded.bold

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

public val Icons.Bold.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.148f, 5.7f)
                lineToRelative(-2.868f, -3.873f)
                arcToRelative(4.374f, 4.374f, 0.0f, false, false, -3.551f, -1.827f)
                horizontalLineToRelative(-9.458f)
                arcToRelative(4.355f, 4.355f, 0.0f, false, false, -3.531f, 1.8f)
                lineToRelative(-2.94f, 3.921f)
                arcToRelative(4.346f, 4.346f, 0.0f, false, false, 0.118f, 5.2f)
                lineToRelative(8.411f, 11.789f)
                arcToRelative(3.391f, 3.391f, 0.0f, false, false, 2.671f, 1.29f)
                arcToRelative(3.423f, 3.423f, 0.0f, false, false, 2.715f, -1.35f)
                lineToRelative(8.3f, -11.609f)
                arcToRelative(4.365f, 4.365f, 0.0f, false, false, 0.133f, -5.341f)
                close()
                moveTo(3.227f, 7.487f)
                lineTo(6.161f, 3.571f)
                arcToRelative(1.367f, 1.367f, 0.0f, false, true, 1.11f, -0.571f)
                horizontalLineToRelative(2.391f)
                lineToRelative(-1.48f, 5.182f)
                lineToRelative(0.085f, 0.318f)
                horizontalLineToRelative(7.466f)
                lineToRelative(0.085f, -0.318f)
                lineToRelative(-1.48f, -5.182f)
                horizontalLineToRelative(2.391f)
                arcToRelative(1.381f, 1.381f, 0.0f, false, true, 1.125f, 0.592f)
                lineToRelative(2.879f, 3.89f)
                arcToRelative(1.318f, 1.318f, 0.0f, false, true, 0.22f, 1.018f)
                horizontalLineToRelative(-5.22f)
                lineToRelative(-3.22f, 12.075f)
                lineToRelative(-0.193f, 0.271f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.32f, 0.154f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, -0.274f, -0.094f)
                lineToRelative(-0.241f, -0.337f)
                lineToRelative(-3.218f, -12.069f)
                horizontalLineToRelative(-5.226f)
                arcToRelative(1.306f, 1.306f, 0.0f, false, true, 0.186f, -1.013f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
