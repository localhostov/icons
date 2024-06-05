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

public val Icons.Filled.ThermometerQuarter: ImageVector
    get() {
        if (_thermometerQuarter != null) {
            return _thermometerQuarter!!
        }
        _thermometerQuarter = Builder(name = "ThermometerQuarter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 12.111f)
                verticalLineToRelative(-7.111f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(7.111f)
                curveToRelative(-1.276f, 1.305f, -2.0f, 3.062f, -2.0f, 4.889f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                curveToRelative(0.0f, -1.826f, -0.724f, -3.584f, -2.0f, -4.889f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                verticalLineToRelative(-3.172f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.172f)
                curveToRelative(1.164f, 0.413f, 2.0f, 1.524f, 2.0f, 2.828f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _thermometerQuarter!!
    }

private var _thermometerQuarter: ImageVector? = null
