package me.localx.icons.rounded.outline

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.BookArrowUp: ImageVector
    get() {
        if (_bookArrowUp != null) {
            return _bookArrowUp!!
        }
        _bookArrowUp = Builder(name = "BookArrowUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.293f, 15.895f)
                lineToRelative(-1.293f, -1.293f)
                verticalLineToRelative(8.398f)
                curveToRelative(-0.006f, 1.308f, -1.995f, 1.307f, -2.0f, 0.0f)
                verticalLineTo(14.602f)
                lineToRelative(-1.293f, 1.293f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-0.391f, -0.39f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.613f, -1.614f)
                curveToRelative(1.153f, -1.153f, 3.031f, -1.155f, 4.187f, 0.0f)
                lineToRelative(1.614f, 1.614f)
                curveToRelative(0.921f, 0.928f, -0.486f, 2.335f, -1.414f, 1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                horizontalLineTo(7.0f)
                curveTo(4.239f, 0.0f, 2.0f, 2.239f, 2.0f, 5.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.213f, 0.0f, -2.178f, -1.086f, -1.972f, -2.338f)
                curveToRelative(0.162f, -0.984f, 1.088f, -1.662f, 2.085f, -1.662f)
                horizontalLineToRelative(7.888f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.307f, 2.0f, 0.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(6.0f, 16.0f)
                curveToRelative(-0.732f, 0.0f, -1.409f, 0.212f, -2.0f, 0.556f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                verticalLineToRelative(13.816f)
                close()
            }
        }
        .build()
        return _bookArrowUp!!
    }

private var _bookArrowUp: ImageVector? = null
