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

public val Icons.Outline.SearchLocation: ImageVector
    get() {
        if (_searchLocation != null) {
            return _searchLocation!!
        }
        _searchLocation = Builder(name = "SearchLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.979f, 22.564f)
                lineToRelative(-6.219f, -6.219f)
                curveToRelative(1.412f, -1.725f, 2.262f, -3.927f, 2.262f, -6.324f)
                curveTo(20.021f, 4.508f, 15.535f, 0.021f, 10.021f, 0.021f)
                reflectiveCurveTo(0.021f, 4.508f, 0.021f, 10.021f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.397f, 0.0f, 4.599f, -0.85f, 6.324f, -2.262f)
                lineToRelative(6.219f, 6.219f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(10.022f, 18.021f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(5.61f, 2.021f, 10.021f, 2.021f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                close()
                moveTo(10.001f, 4.0f)
                curveToRelative(-1.336f, 0.0f, -2.592f, 0.521f, -3.535f, 1.465f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.473f, 3.543f)
                lineToRelative(3.527f, 3.45f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.944f, -0.943f, 1.465f, -2.199f, 1.465f, -3.535f)
                reflectiveCurveToRelative(-0.521f, -2.591f, -1.465f, -3.535f)
                reflectiveCurveToRelative(-2.2f, -1.465f, -3.535f, -1.465f)
                close()
                moveTo(12.13f, 11.113f)
                lineToRelative(-2.129f, 2.083f)
                lineToRelative(-2.121f, -2.075f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.319f, -0.879f, -2.121f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.88f, -2.121f)
                curveToRelative(0.565f, -0.567f, 1.318f, -0.879f, 2.12f, -0.879f)
                reflectiveCurveToRelative(1.555f, 0.312f, 2.121f, 0.879f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.319f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.871f, 2.113f)
                close()
                moveTo(11.001f, 8.993f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _searchLocation!!
    }

private var _searchLocation: ImageVector? = null
