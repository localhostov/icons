package me.localx.icons.straight.outline

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

public val Icons.Outline.Sunrise: ImageVector
    get() {
        if (_sunrise != null) {
            return _sunrise!!
        }
        _sunrise = Builder(name = "Sunrise", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                lineTo(0.009f, 13.0f)
                lineTo(0.009f, 11.0f)
                lineTo(5.077f, 11.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, 0.441f, -1.629f)
                lineTo(1.143f, 6.822f)
                lineTo(2.148f, 5.094f)
                lineToRelative(4.38f, 2.551f)
                arcTo(7.114f, 7.114f, 0.0f, false, true, 7.674f, 6.5f)
                lineTo(5.131f, 2.127f)
                lineTo(6.858f, 1.121f)
                lineTo(9.4f, 5.5f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, 1.6f, -0.43f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 5.071f)
                arcToRelative(6.953f, 6.953f, 0.0f, false, true, 1.611f, 0.435f)
                lineToRelative(2.548f, -4.385f)
                lineToRelative(1.727f, 1.006f)
                lineTo(16.337f, 6.512f)
                arcToRelative(7.065f, 7.065f, 0.0f, false, true, 1.14f, 1.14f)
                lineToRelative(4.391f, -2.558f)
                lineToRelative(1.005f, 1.728f)
                lineTo(18.485f, 9.379f)
                arcTo(6.927f, 6.927f, 0.0f, false, true, 18.923f, 11.0f)
                horizontalLineToRelative(5.068f)
                verticalLineToRelative(2.0f)
                lineTo(17.0f, 13.0f)
                lineTo(17.0f, 12.0f)
                curveTo(16.785f, 5.39f, 7.213f, 5.4f, 7.0f, 12.0f)
                close()
                moveTo(20.989f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(17.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(11.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, true, -3.5f, 1.315f)
                lineTo(0.0f, 22.632f)
                arcToRelative(4.024f, 4.024f, 0.0f, false, false, 6.005f, 0.011f)
                arcToRelative(4.033f, 4.033f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.033f, 4.033f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.023f, 4.023f, 0.0f, false, false, 6.0f, -0.012f)
                lineToRelative(-1.506f, -1.315f)
                arcTo(1.99f, 1.99f, 0.0f, false, true, 20.993f, 22.0f)
                close()
                moveTo(3.007f, 19.0f)
                arcToRelative(3.989f, 3.989f, 0.0f, false, false, 3.0f, -1.357f)
                arcToRelative(4.033f, 4.033f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.033f, 4.033f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.023f, 4.023f, 0.0f, false, false, 6.0f, -0.012f)
                lineToRelative(-1.506f, -1.315f)
                arcTo(2.007f, 2.007f, 0.0f, false, true, 19.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(11.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, true, -3.5f, 1.315f)
                lineTo(0.0f, 17.632f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 3.007f, 19.0f)
                close()
            }
        }
        .build()
        return _sunrise!!
    }

private var _sunrise: ImageVector? = null
