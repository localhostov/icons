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

public val Icons.Outline.BookCircleArrowUp: ImageVector
    get() {
        if (_bookCircleArrowUp != null) {
            return _bookCircleArrowUp!!
        }
        _bookCircleArrowUp = Builder(name = "BookCircleArrowUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.518f, 22.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.523f)
                curveToRelative(-0.226f, -0.638f, -0.388f, -1.305f, -0.464f, -2.0f)
                horizontalLineToRelative(-2.059f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(6.059f)
                curveToRelative(0.695f, 0.077f, 1.362f, 0.239f, 2.0f, 0.464f)
                lineTo(20.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.349f)
                curveToRelative(-0.706f, -0.571f, -1.325f, -1.244f, -1.831f, -2.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.351f, 0.0f, -0.687f, 0.061f, -1.0f, 0.172f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(20.431f, 17.0f)
                horizontalLineToRelative(-2.431f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.454f)
                lineToRelative(2.687f, -2.687f)
                curveToRelative(0.417f, -0.417f, 1.093f, -0.417f, 1.51f, 0.0f)
                lineToRelative(2.688f, 2.687f)
                close()
            }
        }
        .build()
        return _bookCircleArrowUp!!
    }

private var _bookCircleArrowUp: ImageVector? = null
