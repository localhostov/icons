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

public val Icons.Filled.Fog: ImageVector
    get() {
        if (_fog != null) {
            return _fog!!
        }
        _fog = Builder(name = "Fog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 24.0f)
                close()
                moveTo(19.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(17.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 23.0f)
                close()
                moveTo(19.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(11.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 19.0f)
                close()
                moveTo(8.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(6.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(7.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 19.0f)
                close()
                moveTo(14.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(6.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 15.0f)
                close()
                moveTo(19.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(17.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 15.0f)
                close()
                moveTo(17.918f, 5.133f)
                arcToRelative(1.033f, 1.033f, 0.0f, false, true, -0.687f, -0.557f)
                arcTo(8.049f, 8.049f, 0.0f, false, false, 8.5f, 0.138f)
                arcToRelative(7.945f, 7.945f, 0.0f, false, false, -6.383f, 6.5f)
                arcToRelative(8.134f, 8.134f, 0.0f, false, false, 0.033f, 2.887f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, true, -0.315f, 0.874f)
                arcToRelative(5.549f, 5.549f, 0.0f, false, false, 1.211f, 9.012f)
                curveToRelative(-0.354f, -1.133f, 0.843f, -1.993f, 0.344f, -2.959f)
                arcTo(3.027f, 3.027f, 0.0f, false, true, 6.117f, 12.0f)
                lineTo(13.0f, 12.0f)
                arcToRelative(2.928f, 2.928f, 0.0f, false, true, 1.415f, 0.364f)
                curveToRelative(0.891f, 0.494f, 1.644f, -0.472f, 2.585f, -0.364f)
                curveToRelative(1.686f, -0.18f, 3.521f, 0.521f, 3.919f, 2.3f)
                arcToRelative(2.95f, 2.95f, 0.0f, false, true, -0.309f, 2.156f)
                curveToRelative(-0.451f, 0.718f, 0.279f, 1.338f, 0.342f, 2.061f)
                curveTo(25.917f, 15.046f, 24.66f, 6.371f, 17.918f, 5.133f)
                close()
            }
        }
        .build()
        return _fog!!
    }

private var _fog: ImageVector? = null
