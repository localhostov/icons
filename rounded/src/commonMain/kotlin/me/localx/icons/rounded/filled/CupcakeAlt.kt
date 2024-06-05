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

public val Icons.Filled.CupcakeAlt: ImageVector
    get() {
        if (_cupcakeAlt != null) {
            return _cupcakeAlt!!
        }
        _cupcakeAlt = Builder(name = "CupcakeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.809f, 16.0f)
                horizontalLineToRelative(18.382f)
                lineToRelative(-0.611f, 3.794f)
                curveToRelative(-0.39f, 2.424f, -2.482f, 4.206f, -4.936f, 4.206f)
                horizontalLineToRelative(-7.288f)
                curveToRelative(-2.455f, 0.0f, -4.546f, -1.782f, -4.937f, -4.206f)
                lineToRelative(-0.611f, -3.794f)
                close()
                moveTo(21.5f, 9.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.996f, 0.0f, 1.92f, -0.681f, 2.08f, -1.664f)
                curveToRelative(0.204f, -1.253f, -0.758f, -2.336f, -1.973f, -2.336f)
                horizontalLineToRelative(-3.084f)
                curveToRelative(-0.522f, -1.499f, -1.218f, -2.112f, -2.369f, -2.844f)
                curveToRelative(-0.584f, -0.372f, -1.379f, -0.04f, -1.485f, 0.644f)
                curveToRelative(-0.234f, 1.512f, -1.169f, 2.2f, -1.169f, 2.2f)
                horizontalLineToRelative(-5.893f)
                curveToRelative(-0.996f, 0.0f, -1.92f, 0.681f, -2.08f, 1.664f)
                curveToRelative(-0.204f, 1.253f, 0.758f, 2.336f, 1.973f, 2.336f)
                horizontalLineToRelative(7.154f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(2.643f, 9.0f)
                curveTo(1.335f, 9.0f, 0.143f, 9.941f, 0.013f, 11.242f)
                curveToRelative(-0.15f, 1.496f, 1.021f, 2.758f, 2.487f, 2.758f)
                horizontalLineToRelative(18.857f)
                curveToRelative(1.308f, 0.0f, 2.499f, -0.941f, 2.63f, -2.242f)
                curveToRelative(0.15f, -1.496f, -1.021f, -2.758f, -2.487f, -2.758f)
                close()
            }
        }
        .build()
        return _cupcakeAlt!!
    }

private var _cupcakeAlt: ImageVector? = null
