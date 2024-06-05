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
                moveTo(21.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(3.293f, -3.293f)
                curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0.0f)
                lineToRelative(3.293f, 3.293f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(23.0f, 2.5f)
                lineTo(23.0f, 10.672f)
                lineToRelative(-1.379f, -1.379f)
                curveToRelative(-0.457f, -0.457f, -1.027f, -0.73f, -1.621f, -0.83f)
                lineTo(20.0f, 3.0f)
                lineTo(10.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                lineTo(1.0f, 4.0f)
                curveTo(1.0f, 1.791f, 2.791f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(7.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(12.142f)
                curveToRelative(0.322f, -0.084f, 0.653f, -0.142f, 1.0f, -0.142f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bookArrowUp!!
    }

private var _bookArrowUp: ImageVector? = null
