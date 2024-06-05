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

public val Icons.Filled.BellSchoolSlash: ImageVector
    get() {
        if (_bellSchoolSlash != null) {
            return _bellSchoolSlash!!
        }
        _bellSchoolSlash = Builder(name = "BellSchoolSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.214f, 0.0f, 0.422f, -0.024f, 0.624f, -0.067f)
                curveToRelative(-0.454f, 1.796f, -1.316f, 3.428f, -2.476f, 4.801f)
                lineToRelative(-1.424f, -1.424f)
                curveToRelative(0.455f, -0.547f, 0.854f, -1.142f, 1.182f, -1.783f)
                curveToRelative(-1.711f, -0.794f, -2.905f, -2.516f, -2.905f, -4.526f)
                reflectiveCurveToRelative(1.194f, -3.733f, 2.905f, -4.526f)
                curveTo(17.25f, 2.231f, 13.884f, 0.0f, 10.0f, 0.0f)
                curveToRelative(-2.398f, 0.0f, -4.595f, 0.854f, -6.319f, 2.267f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.401f, -3.401f)
                curveToRelative(2.133f, -2.455f, 3.443f, -5.642f, 3.443f, -9.142f)
                close()
                moveTo(10.0f, 7.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.463f, -0.108f, 0.899f, -0.296f, 1.289f)
                lineToRelative(-3.993f, -3.993f)
                curveToRelative(0.39f, -0.188f, 0.826f, -0.296f, 1.289f, -0.296f)
                close()
                moveTo(16.082f, 20.329f)
                lineToRelative(1.452f, 1.452f)
                curveToRelative(-2.178f, 1.398f, -4.759f, 2.219f, -7.534f, 2.219f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.051f)
                curveTo(3.954f, 19.446f, 0.0f, 15.177f, 0.0f, 10.0f)
                curveToRelative(0.0f, -1.665f, 0.415f, -3.233f, 1.137f, -4.615f)
                lineToRelative(13.469f, 13.469f)
                curveToRelative(-1.099f, 0.571f, -2.316f, 0.945f, -3.606f, 1.075f)
                verticalLineToRelative(2.03f)
                curveToRelative(1.846f, -0.153f, 3.569f, -0.732f, 5.082f, -1.629f)
                close()
            }
        }
        .build()
        return _bellSchoolSlash!!
    }

private var _bellSchoolSlash: ImageVector? = null
