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

public val Icons.Bold.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.852f, 23.438f)
                arcToRelative(3.612f, 3.612f, 0.0f, false, true, -2.121f, -0.7f)
                arcTo(3.57f, 3.57f, 0.0f, false, true, 3.4f, 18.684f)
                lineTo(4.57f, 15.065f)
                lineTo(1.49f, 12.813f)
                arcTo(3.625f, 3.625f, 0.0f, false, true, 3.63f, 6.261f)
                horizontalLineTo(7.4f)
                lineToRelative(1.145f, -3.57f)
                arcToRelative(3.627f, 3.627f, 0.0f, false, true, 6.906f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(16.6f, 6.261f)
                horizontalLineTo(20.37f)
                arcToRelative(3.625f, 3.625f, 0.0f, false, true, 2.139f, 6.552f)
                lineTo(19.43f, 15.065f)
                lineTo(20.6f, 18.684f)
                arcTo(3.626f, 3.626f, 0.0f, false, true, 15.0f, 22.719f)
                lineToRelative(-3.0f, -2.206f)
                lineTo(9.0f, 22.72f)
                arcTo(3.619f, 3.619f, 0.0f, false, true, 6.852f, 23.438f)
                close()
                moveTo(3.63f, 9.261f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, -0.37f, 1.131f)
                lineToRelative(3.956f, 2.891f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.542f, 1.672f)
                lineToRelative(-1.5f, 4.65f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, 0.966f, 0.7f)
                lineToRelative(3.889f, -2.861f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.778f, 0.0f)
                lineToRelative(3.889f, 2.86f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 0.966f, -0.7f)
                lineToRelative(-1.5f, -4.65f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.542f, -1.672f)
                lineToRelative(3.955f, -2.891f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, -0.369f, -1.131f)
                horizontalLineTo(15.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.428f, -1.042f)
                lineTo(12.6f, 3.607f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, -1.192f, 0.0f)
                lineTo(9.925f, 8.219f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 9.261f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
