package me.localx.icons.rounded.outline

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

public val Icons.Outline.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(name = "Walking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(20.895f, 13.744f)
                curveToRelative(-0.176f, 0.351f, -0.528f, 0.553f, -0.896f, 0.553f)
                curveToRelative(-0.15f, 0.0f, -0.303f, -0.034f, -0.446f, -0.105f)
                lineToRelative(-2.842f, -1.421f)
                curveToRelative(-0.654f, -0.327f, -1.207f, -0.827f, -1.597f, -1.447f)
                lineToRelative(-0.494f, -0.784f)
                lineToRelative(-1.408f, 5.296f)
                lineToRelative(1.27f, 0.721f)
                curveToRelative(0.937f, 0.533f, 1.518f, 1.532f, 1.518f, 2.609f)
                verticalLineToRelative(3.836f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.836f)
                curveToRelative(0.0f, -0.359f, -0.194f, -0.692f, -0.506f, -0.87f)
                lineToRelative(-3.977f, -2.258f)
                curveToRelative(-1.148f, -0.652f, -1.74f, -2.006f, -1.439f, -3.292f)
                lineToRelative(1.026f, -4.385f)
                curveToRelative(-0.207f, 0.076f, -0.41f, 0.162f, -0.607f, 0.26f)
                lineToRelative(-2.097f, 1.049f)
                curveToRelative(-0.257f, 0.128f, -0.446f, 0.36f, -0.519f, 0.638f)
                lineToRelative(-0.783f, 2.951f)
                curveToRelative(-0.142f, 0.534f, -0.689f, 0.85f, -1.223f, 0.71f)
                curveToRelative(-0.534f, -0.142f, -0.852f, -0.689f, -0.71f, -1.223f)
                lineToRelative(0.783f, -2.951f)
                curveToRelative(0.221f, -0.832f, 0.789f, -1.53f, 1.559f, -1.914f)
                lineToRelative(2.096f, -1.049f)
                curveToRelative(1.087f, -0.543f, 2.303f, -0.83f, 3.518f, -0.83f)
                horizontalLineToRelative(0.879f)
                curveToRelative(2.006f, 0.0f, 3.273f, 1.829f, 3.327f, 1.907f)
                lineToRelative(1.48f, 2.351f)
                curveToRelative(0.194f, 0.31f, 0.47f, 0.56f, 0.797f, 0.723f)
                lineToRelative(2.843f, 1.422f)
                curveToRelative(0.494f, 0.247f, 0.694f, 0.848f, 0.447f, 1.342f)
                close()
                moveTo(11.457f, 14.837f)
                lineToRelative(1.667f, -6.369f)
                curveToRelative(-0.295f, -0.238f, -0.688f, -0.467f, -1.124f, -0.467f)
                horizontalLineToRelative(-0.758f)
                lineToRelative(-1.217f, 5.2f)
                curveToRelative(-0.1f, 0.428f, 0.097f, 0.879f, 0.48f, 1.097f)
                lineToRelative(0.951f, 0.54f)
                close()
                moveTo(9.191f, 17.866f)
                curveToRelative(-0.008f, -0.005f, -0.016f, -0.01f, -0.024f, -0.014f)
                curveToRelative(-0.568f, -0.34f, -1.304f, -0.029f, -1.454f, 0.616f)
                lineToRelative(-0.153f, 0.661f)
                lineToRelative(-1.61f, 3.452f)
                curveToRelative(-0.308f, 0.661f, 0.174f, 1.419f, 0.904f, 1.419f)
                curveToRelative(0.386f, 0.0f, 0.738f, -0.223f, 0.903f, -0.573f)
                lineToRelative(1.654f, -3.514f)
                lineToRelative(0.228f, -0.993f)
                curveToRelative(0.095f, -0.412f, -0.086f, -0.838f, -0.449f, -1.055f)
                close()
            }
        }
        .build()
        return _walking!!
    }

private var _walking: ImageVector? = null
