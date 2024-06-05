package me.localx.icons.rounded.outline

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

public val Icons.Outline.Multiple: ImageVector
    get() {
        if (_multiple != null) {
            return _multiple!!
        }
        _multiple = Builder(name = "Multiple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 10.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-2.446f, 0.0f, -4.479f, -1.768f, -4.908f, -4.092f)
                curveToRelative(-2.324f, -0.429f, -4.092f, -2.462f, -4.092f, -4.908f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.446f, 0.0f, 4.479f, 1.768f, 4.908f, 4.092f)
                curveToRelative(2.324f, 0.429f, 4.092f, 2.462f, 4.092f, 4.908f)
                close()
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(18.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 9.0f)
                curveToRelative(0.0f, -1.302f, -0.839f, -2.402f, -2.0f, -2.816f)
                verticalLineToRelative(8.816f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(6.184f, 20.0f)
                curveToRelative(0.414f, 1.161f, 1.514f, 2.0f, 2.816f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-10.0f)
                close()
            }
        }
        .build()
        return _multiple!!
    }

private var _multiple: ImageVector? = null
