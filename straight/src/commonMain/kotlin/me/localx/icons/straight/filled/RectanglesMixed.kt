package me.localx.icons.straight.filled

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

public val Icons.Filled.RectanglesMixed: ImageVector
    get() {
        if (_rectanglesMixed != null) {
            return _rectanglesMixed!!
        }
        _rectanglesMixed = Builder(name = "RectanglesMixed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(-7.0f)
                curveTo(0.0f, 2.346f, 1.346f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(21.0f, 20.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(13.0f, 23.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _rectanglesMixed!!
    }

private var _rectanglesMixed: ImageVector? = null
