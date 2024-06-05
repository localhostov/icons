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
                moveToRelative(21.5f, 14.0f)
                lineTo(2.5f, 14.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 7.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.75f, -0.75f, 1.0f, -1.5f, 1.0f, -3.0f)
                curveToRelative(1.686f, 0.0f, 3.368f, 1.132f, 3.855f, 3.0f)
                horizontalLineToRelative(3.145f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(2.809f, 16.0f)
                lineToRelative(0.881f, 5.477f)
                curveToRelative(0.235f, 1.462f, 1.481f, 2.523f, 2.962f, 2.523f)
                horizontalLineToRelative(10.695f)
                curveToRelative(1.48f, 0.0f, 2.727f, -1.061f, 2.962f, -2.523f)
                lineToRelative(0.881f, -5.477f)
                lineTo(2.809f, 16.0f)
                close()
            }
        }
        .build()
        return _cupcakeAlt!!
    }

private var _cupcakeAlt: ImageVector? = null
