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

public val Icons.Filled.SearchLocation: ImageVector
    get() {
        if (_searchLocation != null) {
            return _searchLocation!!
        }
        _searchLocation = Builder(name = "SearchLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                curveTo(20.0f, 4.486f, 15.514f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.486f, 0.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.397f, 0.0f, 4.599f, -0.85f, 6.324f, -2.262f)
                lineToRelative(6.24f, 6.24f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-6.24f, -6.24f)
                curveToRelative(1.412f, -1.725f, 2.262f, -3.927f, 2.262f, -6.324f)
                close()
                moveTo(13.535f, 12.535f)
                lineToRelative(-3.535f, 3.458f)
                lineToRelative(-3.527f, -3.45f)
                curveToRelative(-0.952f, -0.951f, -1.473f, -2.207f, -1.473f, -3.543f)
                reflectiveCurveToRelative(0.521f, -2.592f, 1.465f, -3.535f)
                curveToRelative(0.943f, -0.944f, 2.199f, -1.465f, 3.535f, -1.465f)
                reflectiveCurveToRelative(2.591f, 0.521f, 3.535f, 1.465f)
                reflectiveCurveToRelative(1.465f, 2.199f, 1.465f, 3.535f)
                reflectiveCurveToRelative(-0.521f, 2.592f, -1.465f, 3.535f)
                close()
                moveTo(10.0f, 6.0f)
                curveToRelative(-0.802f, 0.0f, -1.555f, 0.312f, -2.12f, 0.879f)
                curveToRelative(-0.567f, 0.566f, -0.88f, 1.319f, -0.88f, 2.121f)
                reflectiveCurveToRelative(0.312f, 1.555f, 0.879f, 2.121f)
                lineToRelative(2.121f, 2.075f)
                lineToRelative(2.129f, -2.083f)
                curveToRelative(0.559f, -0.559f, 0.871f, -1.312f, 0.871f, -2.113f)
                reflectiveCurveToRelative(-0.313f, -1.555f, -0.879f, -2.121f)
                curveToRelative(-0.566f, -0.566f, -1.32f, -0.879f, -2.121f, -0.879f)
                close()
                moveTo(10.0f, 9.993f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _searchLocation!!
    }

private var _searchLocation: ImageVector? = null
