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

public val Icons.Filled.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.105f, 18.002f)
                curveToRelative(-0.364f, -0.078f, -2.105f, -0.527f, -2.105f, -2.002f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.996f)
                lineToRelative(-2.033f, -12.482f)
                curveToRelative(-0.237f, -1.458f, -1.482f, -2.518f, -2.961f, -2.518f)
                horizontalLineTo(4.998f)
                curveToRelative(-1.479f, 0.0f, -2.724f, 1.059f, -2.961f, 2.518f)
                lineTo(0.004f, 15.0f)
                horizontalLineToRelative(10.996f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.827f, -1.536f, 1.993f, -2.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.619f, -1.289f, -2.942f, -2.895f, -2.998f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
