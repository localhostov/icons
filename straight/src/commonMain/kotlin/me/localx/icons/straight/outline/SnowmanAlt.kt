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

public val Icons.Outline.SnowmanAlt: ImageVector
    get() {
        if (_snowmanAlt != null) {
            return _snowmanAlt!!
        }
        _snowmanAlt = Builder(name = "SnowmanAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.546f)
                lineToRelative(-2.197f, 1.923f)
                curveToRelative(-0.231f, -0.879f, -0.659f, -1.694f, -1.258f, -2.386f)
                curveToRelative(0.292f, -0.634f, 0.455f, -1.34f, 0.455f, -2.082f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 0.743f, 0.163f, 1.448f, 0.455f, 2.082f)
                curveToRelative(-0.596f, 0.689f, -1.023f, 1.5f, -1.255f, 2.375f)
                lineToRelative(-2.2f, -1.913f)
                verticalLineToRelative(-2.545f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.626f)
                lineToRelative(3.459f, 3.008f)
                curveToRelative(0.053f, 0.312f, 0.13f, 0.616f, 0.229f, 0.909f)
                curveToRelative(-0.852f, 1.183f, -1.314f, 2.603f, -1.314f, 4.083f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                curveToRelative(0.0f, -1.466f, -0.464f, -2.899f, -1.314f, -4.083f)
                curveToRelative(0.097f, -0.286f, 0.172f, -0.582f, 0.225f, -0.885f)
                lineToRelative(3.465f, -3.032f)
                horizontalLineToRelative(2.624f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(8.694f, 8.747f)
                curveToRelative(0.882f, 0.779f, 2.04f, 1.253f, 3.306f, 1.253f)
                reflectiveCurveToRelative(2.424f, -0.474f, 3.306f, -1.253f)
                curveToRelative(0.448f, 0.656f, 0.694f, 1.436f, 0.694f, 2.253f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -0.816f, 0.246f, -1.597f, 0.694f, -2.253f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.73f, 0.157f, -1.44f, 0.455f, -2.087f)
                curveToRelative(1.101f, 1.277f, 2.73f, 2.087f, 4.545f, 2.087f)
                reflectiveCurveToRelative(3.443f, -0.809f, 4.544f, -2.086f)
                curveToRelative(0.298f, 0.65f, 0.456f, 1.362f, 0.456f, 2.086f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _snowmanAlt!!
    }

private var _snowmanAlt: ImageVector? = null
