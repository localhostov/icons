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

public val Icons.Bold.SmartHome: ImageVector
    get() {
        if (_smartHome != null) {
            return _smartHome!!
        }
        _smartHome = Builder(name = "SmartHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 23.987f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(0.013f)
                horizontalLineToRelative(-2.556f)
                curveToRelative(0.65f, -0.635f, 1.056f, -1.519f, 1.056f, -2.5f)
                curveToRelative(0.0f, -0.171f, -0.027f, -0.335f, -0.05f, -0.5f)
                horizontalLineToRelative(0.55f)
                verticalLineToRelative(-0.013f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-10.823f)
                curveToRelative(0.0f, -0.155f, -0.07f, -0.299f, -0.192f, -0.394f)
                lineTo(12.308f, 3.119f)
                curveToRelative(-0.182f, -0.143f, -0.435f, -0.143f, -0.616f, 0.0f)
                lineTo(3.192f, 9.771f)
                curveToRelative(-0.122f, 0.095f, -0.192f, 0.238f, -0.192f, 0.394f)
                verticalLineToRelative(10.823f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(0.013f)
                horizontalLineToRelative(0.55f)
                curveToRelative(-0.024f, 0.165f, -0.05f, 0.329f, -0.05f, 0.5f)
                curveToRelative(0.0f, 0.981f, 0.406f, 1.865f, 1.056f, 2.5f)
                horizontalLineToRelative(-2.556f)
                verticalLineToRelative(-0.013f)
                lineTo(0.0f, 23.988f)
                verticalLineToRelative(-13.823f)
                curveToRelative(0.0f, -1.084f, 0.49f, -2.089f, 1.343f, -2.757f)
                lineTo(9.843f, 0.756f)
                curveToRelative(1.27f, -0.992f, 3.043f, -0.992f, 4.313f, 0.0f)
                lineToRelative(8.5f, 6.651f)
                curveToRelative(0.854f, 0.668f, 1.343f, 1.673f, 1.343f, 2.757f)
                verticalLineToRelative(13.823f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.475f, 19.025f)
                lineToRelative(2.122f, -2.121f)
                curveToRelative(-1.228f, -1.228f, -2.86f, -1.904f, -4.597f, -1.904f)
                reflectiveCurveToRelative(-3.369f, 0.677f, -4.597f, 1.904f)
                lineToRelative(2.122f, 2.121f)
                curveToRelative(1.321f, -1.322f, 3.628f, -1.322f, 4.949f, 0.0f)
                close()
                moveTo(18.011f, 15.489f)
                lineToRelative(2.121f, -2.121f)
                curveToRelative(-4.483f, -4.484f, -11.78f, -4.484f, -16.264f, 0.0f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(3.314f, -3.314f, 8.707f, -3.314f, 12.021f, 0.0f)
                close()
            }
        }
        .build()
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
