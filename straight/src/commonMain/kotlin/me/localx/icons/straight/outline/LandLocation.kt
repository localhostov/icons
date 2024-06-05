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

public val Icons.Outline.LandLocation: ImageVector
    get() {
        if (_landLocation != null) {
            return _landLocation!!
        }
        _landLocation = Builder(name = "LandLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.841f, 10.0f)
                horizontalLineToRelative(-1.351f)
                curveToRelative(-0.131f, 0.372f, -0.288f, 0.734f, -0.467f, 1.086f)
                lineToRelative(0.832f, 4.914f)
                horizontalLineToRelative(-5.186f)
                lineToRelative(-0.929f, 0.909f)
                lineToRelative(0.639f, 5.091f)
                horizontalLineToRelative(-6.756f)
                lineToRelative(0.638f, -5.09f)
                lineToRelative(-0.93f, -0.91f)
                lineTo(3.146f, 16.0f)
                lineToRelative(0.874f, -4.841f)
                curveToRelative(-0.196f, -0.375f, -0.365f, -0.761f, -0.505f, -1.159f)
                horizontalLineToRelative(-1.356f)
                lineTo(0.015f, 22.329f)
                lineToRelative(-0.015f, 1.671f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-2.159f, -12.5f)
                close()
                moveTo(6.609f, 22.0f)
                lineTo(2.102f, 22.0f)
                lineToRelative(0.696f, -4.0f)
                horizontalLineToRelative(4.272f)
                lineToRelative(-0.462f, 4.0f)
                close()
                moveTo(17.391f, 22.0f)
                lineToRelative(-0.462f, -4.0f)
                horizontalLineToRelative(4.273f)
                lineToRelative(0.696f, 4.0f)
                horizontalLineToRelative(-4.507f)
                close()
                moveTo(12.0f, 16.791f)
                lineToRelative(4.949f, -4.841f)
                curveToRelative(1.322f, -1.322f, 2.051f, -3.08f, 2.051f, -4.95f)
                reflectiveCurveToRelative(-0.729f, -3.627f, -2.051f, -4.95f)
                curveToRelative(-1.321f, -1.322f, -3.079f, -2.05f, -4.949f, -2.05f)
                reflectiveCurveToRelative(-3.627f, 0.728f, -4.95f, 2.05f)
                curveToRelative(-2.729f, 2.729f, -2.729f, 7.17f, 0.008f, 9.907f)
                lineToRelative(4.942f, 4.833f)
                close()
                moveTo(8.464f, 3.464f)
                curveToRelative(0.944f, -0.944f, 2.2f, -1.464f, 3.536f, -1.464f)
                reflectiveCurveToRelative(2.591f, 0.52f, 3.535f, 1.464f)
                reflectiveCurveToRelative(1.465f, 2.2f, 1.465f, 3.536f)
                reflectiveCurveToRelative(-0.521f, 2.591f, -1.457f, 3.528f)
                lineToRelative(-3.543f, 3.466f)
                lineToRelative(-3.536f, -3.458f)
                curveToRelative(-1.949f, -1.95f, -1.949f, -5.122f, 0.0f, -7.071f)
                close()
                moveTo(8.999f, 6.99f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _landLocation!!
    }

private var _landLocation: ImageVector? = null
