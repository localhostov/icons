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

public val Icons.Outline.SquareDashedCirclePlus: ImageVector
    get() {
        if (_squareDashedCirclePlus != null) {
            return _squareDashedCirclePlus!!
        }
        _squareDashedCirclePlus = Builder(name = "SquareDashedCirclePlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.685f)
                verticalLineToRelative(-3.685f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.08f)
                curveToRelative(-0.328f, -0.047f, -0.66f, -0.08f, -1.0f, -0.08f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                curveToRelative(0.0f, 0.34f, 0.033f, 0.672f, 0.08f, 1.0f)
                horizontalLineToRelative(-3.08f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.685f)
                curveToRelative(1.126f, 2.361f, 3.53f, 4.0f, 6.315f, 4.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                curveToRelative(0.0f, -2.785f, -1.639f, -5.188f, -4.0f, -6.315f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                close()
                moveTo(2.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(2.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(13.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                lineTo(13.0f, 2.0f)
                close()
            }
        }
        .build()
        return _squareDashedCirclePlus!!
    }

private var _squareDashedCirclePlus: ImageVector? = null
