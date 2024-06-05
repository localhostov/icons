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

public val Icons.Filled.LaptopArrowDown: ImageVector
    get() {
        if (_laptopArrowDown != null) {
            return _laptopArrowDown!!
        }
        _laptopArrowDown = Builder(name = "LaptopArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.013f, 18.0f)
                lineToRelative(0.846f, -1.0f)
                horizontalLineToRelative(8.14f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.145f)
                lineToRelative(0.846f, 1.0f)
                horizontalLineToRelative(6.023f)
                close()
                moveTo(13.0f, 3.0f)
                verticalLineToRelative(6.086f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.293f, 3.293f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                reflectiveCurveToRelative(-1.024f, -0.195f, -1.414f, -0.585f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.293f, 2.293f)
                lineTo(11.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(7.082f)
                lineToRelative(0.846f, 1.0f)
                horizontalLineToRelative(4.157f)
                lineToRelative(0.846f, -1.0f)
                horizontalLineToRelative(7.068f)
                lineTo(21.999f, 3.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _laptopArrowDown!!
    }

private var _laptopArrowDown: ImageVector? = null
