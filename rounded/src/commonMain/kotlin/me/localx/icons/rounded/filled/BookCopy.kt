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

public val Icons.Filled.BookCopy: ImageVector
    get() {
        if (_bookCopy != null) {
            return _bookCopy!!
        }
        _bookCopy = Builder(name = "BookCopy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.643f, 14.0f)
                horizontalLineToRelative(13.357f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-1.466f, 0.0f, -2.637f, -1.261f, -2.487f, -2.758f)
                curveToRelative(0.13f, -1.301f, 1.322f, -2.242f, 2.63f, -2.242f)
                close()
                moveTo(10.643f, 12.0f)
                horizontalLineToRelative(13.357f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                verticalLineToRelative(8.811f)
                curveToRelative(0.757f, -0.511f, 1.671f, -0.811f, 2.643f, -0.811f)
                close()
                moveTo(6.03f, 17.0f)
                curveToRelative(-0.016f, -0.141f, -0.025f, -0.284f, -0.028f, -0.427f)
                horizontalLineToRelative(-0.002f)
                reflectiveCurveToRelative(0.0f, -11.573f, 0.0f, -11.573f)
                horizontalLineToRelative(-2.0f)
                curveTo(1.791f, 5.0f, 0.0f, 6.791f, 0.0f, 9.0f)
                verticalLineToRelative(8.811f)
                curveToRelative(0.757f, -0.511f, 1.671f, -0.811f, 2.643f, -0.811f)
                horizontalLineToRelative(3.387f)
                close()
                moveTo(10.5f, 21.0f)
                curveToRelative(-1.269f, 0.0f, -2.485f, -0.54f, -3.337f, -1.481f)
                curveToRelative(-0.148f, -0.164f, -0.283f, -0.337f, -0.404f, -0.519f)
                lineTo(2.643f, 19.0f)
                curveToRelative(-1.308f, 0.0f, -2.499f, 0.941f, -2.63f, 2.242f)
                curveToRelative(-0.15f, 1.496f, 1.021f, 2.758f, 2.487f, 2.758f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.864f, 0.0f, 3.43f, -1.275f, 3.874f, -3.0f)
                horizontalLineToRelative(-5.374f)
                close()
            }
        }
        .build()
        return _bookCopy!!
    }

private var _bookCopy: ImageVector? = null
