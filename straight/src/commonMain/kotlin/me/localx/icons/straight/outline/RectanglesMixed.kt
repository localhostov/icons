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

public val Icons.Outline.RectanglesMixed: ImageVector
    get() {
        if (_rectanglesMixed != null) {
            return _rectanglesMixed!!
        }
        _rectanglesMixed = Builder(name = "RectanglesMixed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(13.0f)
                lineTo(13.0f, 1.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                close()
                moveTo(11.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(2.0f, 20.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-10.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _rectanglesMixed!!
    }

private var _rectanglesMixed: ImageVector? = null
