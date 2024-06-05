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

public val Icons.Bold.BookArrowUp: ImageVector
    get() {
        if (_bookArrowUp != null) {
            return _bookArrowUp!!
        }
        _bookArrowUp = Builder(name = "BookArrowUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.663f, 15.0f)
                horizontalLineToRelative(-1.663f)
                verticalLineToRelative(5.5f)
                curveToRelative(-0.034f, 1.972f, -2.966f, 1.971f, -3.0f, 0.0f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1.663f)
                curveToRelative(-0.891f, 0.0f, -1.337f, -1.077f, -0.707f, -1.707f)
                lineToRelative(3.163f, -3.163f)
                curveToRelative(0.391f, -0.391f, 1.024f, -0.391f, 1.414f, 0.0f)
                lineToRelative(3.163f, 3.163f)
                curveToRelative(0.63f, 0.63f, 0.184f, 1.707f, -0.707f, 1.707f)
                close()
                moveTo(16.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-2.378f, 0.0f, -4.341f, -1.859f, -4.5f, -4.197f)
                lineTo(1.0f, 5.5f)
                curveTo(1.0f, 2.462f, 3.462f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.034f, 1.972f, -2.967f, 1.971f, -3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.5f)
                lineTo(10.0f, 15.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-1.972f, 0.035f, -1.97f, 2.965f, 0.0f, 3.0f)
                lineTo(14.5f, 21.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(4.0f, 15.276f)
                curveToRelative(0.471f, -0.168f, 0.971f, -0.276f, 1.5f, -0.276f)
                horizontalLineToRelative(1.5f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                lineTo(4.0f, 15.276f)
                close()
            }
        }
        .build()
        return _bookArrowUp!!
    }

private var _bookArrowUp: ImageVector? = null
