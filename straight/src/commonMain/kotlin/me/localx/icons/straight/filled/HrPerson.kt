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

public val Icons.Filled.HrPerson: ImageVector
    get() {
        if (_hrPerson != null) {
            return _hrPerson!!
        }
        _hrPerson = Builder(name = "HrPerson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(8.7f, 11.567f)
                curveToRelative(-1.017f, -0.923f, -2.668f, -0.721f, -3.407f, 0.533f)
                curveToRelative(-0.48f, 0.815f, -0.331f, 1.858f, 0.272f, 2.586f)
                lineToRelative(3.243f, 3.275f)
                lineToRelative(-1.404f, 1.404f)
                lineToRelative(-3.437f, -3.472f)
                curveToRelative(-1.329f, -1.604f, -1.275f, -3.977f, 0.125f, -5.519f)
                curveToRelative(0.147f, -0.162f, 0.907f, -0.778f, 0.907f, -0.778f)
                verticalLineToRelative(-3.954f)
                curveToRelative(0.0f, -1.308f, -0.941f, -2.499f, -2.242f, -2.63f)
                curveToRelative(-1.496f, -0.15f, -2.758f, 1.021f, -2.758f, 2.487f)
                verticalLineToRelative(12.39f)
                curveToRelative(0.0f, 0.998f, 0.373f, 1.961f, 1.047f, 2.698f)
                lineToRelative(3.117f, 3.412f)
                horizontalLineToRelative(9.836f)
                verticalLineToRelative(-6.292f)
                curveToRelative(0.0f, -0.846f, -0.357f, -1.652f, -0.983f, -2.221f)
                lineToRelative(-4.317f, -3.92f)
                close()
                moveTo(18.435f, 14.687f)
                lineToRelative(-2.487f, 2.532f)
                curveToRelative(-0.122f, -1.225f, -0.669f, -2.378f, -1.587f, -3.212f)
                lineToRelative(-0.874f, -0.794f)
                lineToRelative(1.813f, -1.646f)
                curveToRelative(1.017f, -0.923f, 2.668f, -0.721f, 3.407f, 0.533f)
                curveToRelative(0.48f, 0.815f, 0.331f, 1.858f, -0.272f, 2.586f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(12.39f)
                curveToRelative(0.0f, 0.998f, -0.373f, 1.961f, -1.047f, 2.698f)
                lineToRelative(-3.117f, 3.412f)
                horizontalLineToRelative(-3.836f)
                verticalLineToRelative(-4.019f)
                lineToRelative(4.033f, -4.088f)
                curveToRelative(1.329f, -1.604f, 1.275f, -3.977f, -0.125f, -5.519f)
                curveToRelative(-0.147f, -0.162f, -0.907f, -0.778f, -0.907f, -0.778f)
                verticalLineToRelative(-4.096f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(10.044f, 10.087f)
                lineToRelative(1.956f, 1.775f)
                lineToRelative(1.957f, -1.776f)
                curveToRelative(0.583f, -0.53f, 1.29f, -0.879f, 2.043f, -1.021f)
                verticalLineToRelative(-0.565f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(0.566f)
                curveToRelative(0.753f, 0.143f, 1.461f, 0.492f, 2.044f, 1.022f)
                close()
            }
        }
        .build()
        return _hrPerson!!
    }

private var _hrPerson: ImageVector? = null
