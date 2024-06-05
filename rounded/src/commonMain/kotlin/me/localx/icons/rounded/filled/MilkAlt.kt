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

public val Icons.Filled.MilkAlt: ImageVector
    get() {
        if (_milkAlt != null) {
            return _milkAlt!!
        }
        _milkAlt = Builder(name = "MilkAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 17.0f)
                lineTo(4.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.111f, 9.227f)
                lineToRelative(-1.633f, -4.188f)
                curveToRelative(-0.317f, -0.814f, -0.479f, -1.67f, -0.479f, -2.544f)
                verticalLineToRelative(-0.495f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(0.495f)
                curveToRelative(0.0f, 0.874f, -0.161f, 1.729f, -0.479f, 2.544f)
                lineToRelative(-1.633f, 4.188f)
                curveToRelative(-0.351f, 0.9f, -0.586f, 1.829f, -0.729f, 2.773f)
                horizontalLineToRelative(9.84f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(4.0f, 19.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-5.051f)
                curveToRelative(0.0f, -1.622f, -0.299f, -3.211f, -0.889f, -4.723f)
                close()
            }
        }
        .build()
        return _milkAlt!!
    }

private var _milkAlt: ImageVector? = null
