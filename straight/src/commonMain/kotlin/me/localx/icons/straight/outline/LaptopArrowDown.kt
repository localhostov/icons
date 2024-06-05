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

public val Icons.Outline.LaptopArrowDown: ImageVector
    get() {
        if (_laptopArrowDown != null) {
            return _laptopArrowDown!!
        }
        _laptopArrowDown = Builder(name = "LaptopArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 15.0f)
                lineTo(22.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-4.914f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-4.914f)
                lineTo(4.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 18.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 19.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.086f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(5.828f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(6.086f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(11.0f, 9.086f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.086f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.293f, 3.293f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                reflectiveCurveToRelative(-1.024f, -0.195f, -1.414f, -0.585f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.293f, 2.293f)
                close()
            }
        }
        .build()
        return _laptopArrowDown!!
    }

private var _laptopArrowDown: ImageVector? = null
