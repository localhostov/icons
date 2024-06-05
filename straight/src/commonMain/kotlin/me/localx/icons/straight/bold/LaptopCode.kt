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

public val Icons.Bold.LaptopCode: ImageVector
    get() {
        if (_laptopCode != null) {
            return _laptopCode!!
        }
        _laptopCode = Builder(name = "LaptopCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.212f, 11.043f)
                lineToRelative(1.896f, 1.896f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.257f, -2.257f)
                curveToRelative(-0.47f, -0.469f, -0.729f, -1.094f, -0.729f, -1.759f)
                reflectiveCurveToRelative(0.259f, -1.29f, 0.729f, -1.76f)
                lineToRelative(2.255f, -2.255f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.893f, 1.893f)
                close()
                moveTo(17.271f, 9.284f)
                lineToRelative(-2.255f, -2.255f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(1.893f, 1.893f)
                lineToRelative(-1.896f, 1.896f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.257f, -2.256f)
                curveToRelative(0.471f, -0.47f, 0.729f, -1.095f, 0.729f, -1.76f)
                reflectiveCurveToRelative(-0.259f, -1.29f, -0.729f, -1.76f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 3.0f)
                lineTo(22.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(15.692f, 16.0f)
                horizontalLineToRelative(3.308f)
                lineTo(19.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.308f)
                lineToRelative(0.923f, 1.0f)
                horizontalLineToRelative(5.538f)
                lineToRelative(0.923f, -1.0f)
                close()
            }
        }
        .build()
        return _laptopCode!!
    }

private var _laptopCode: ImageVector? = null
