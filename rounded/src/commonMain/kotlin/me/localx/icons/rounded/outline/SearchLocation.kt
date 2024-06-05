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
                moveTo(23.707f, 22.293f)
                lineToRelative(-5.946f, -5.946f)
                curveToRelative(1.412f, -1.725f, 2.261f, -3.928f, 2.261f, -6.325f)
                curveTo(20.021f, 4.508f, 15.535f, 0.021f, 10.021f, 0.021f)
                reflectiveCurveTo(0.021f, 4.508f, 0.021f, 10.021f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.398f, 0.0f, 4.601f, -0.849f, 6.325f, -2.261f)
                lineToRelative(5.946f, 5.946f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(2.021f, 10.021f)
                curveTo(2.021f, 5.61f, 5.61f, 2.021f, 10.021f, 2.021f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveTo(2.021f, 14.433f, 2.021f, 10.021f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(-1.336f, 0.0f, -2.592f, 0.521f, -3.535f, 1.465f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.473f, 3.543f)
                lineToRelative(1.812f, 1.773f)
                curveToRelative(0.474f, 0.463f, 1.094f, 0.693f, 1.715f, 0.693f)
                reflectiveCurveToRelative(1.241f, -0.23f, 1.714f, -0.693f)
                lineToRelative(1.821f, -1.781f)
                curveToRelative(0.944f, -0.943f, 1.465f, -2.199f, 1.465f, -3.535f)
                reflectiveCurveToRelative(-0.521f, -2.591f, -1.465f, -3.535f)
                reflectiveCurveToRelative(-2.2f, -1.465f, -3.535f, -1.465f)
                close()
                moveTo(12.129f, 11.113f)
                lineToRelative(-1.813f, 1.773f)
                curveToRelative(-0.174f, 0.17f, -0.458f, 0.17f, -0.632f, 0.0f)
                lineToRelative(-1.805f, -1.766f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.319f, -0.879f, -2.121f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.88f, -2.121f)
                curveToRelative(0.565f, -0.567f, 1.318f, -0.879f, 2.12f, -0.879f)
                reflectiveCurveToRelative(1.555f, 0.312f, 2.121f, 0.879f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.319f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.871f, 2.113f)
                close()
                moveTo(11.0f, 8.993f)
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
