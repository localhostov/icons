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

public val Icons.Bold.SearchLocation: ImageVector
    get() {
        if (_searchLocation != null) {
            return _searchLocation!!
        }
        _searchLocation = Builder(name = "SearchLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.009f, 21.888f)
                lineToRelative(-5.939f, -5.939f)
                curveToRelative(1.226f, -1.66f, 1.952f, -3.71f, 1.952f, -5.927f)
                curveTo(20.021f, 4.508f, 15.535f, 0.021f, 10.021f, 0.021f)
                reflectiveCurveTo(0.021f, 4.508f, 0.021f, 10.021f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.217f, 0.0f, 4.267f, -0.726f, 5.927f, -1.952f)
                lineToRelative(5.939f, 5.939f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(10.022f, 17.022f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveTo(6.162f, 3.021f, 10.021f, 3.021f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(10.001f, 5.001f)
                curveToRelative(-1.024f, 0.0f, -2.047f, 0.391f, -2.829f, 1.172f)
                curveToRelative(-1.562f, 1.562f, -1.562f, 4.095f, 0.0f, 5.657f)
                lineToRelative(2.828f, 2.766f)
                lineToRelative(2.828f, -2.766f)
                curveToRelative(1.562f, -1.562f, 1.562f, -4.095f, 0.0f, -5.657f)
                curveToRelative(-0.781f, -0.781f, -1.805f, -1.172f, -2.828f, -1.172f)
                close()
                moveTo(10.001f, 10.501f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _searchLocation!!
    }

private var _searchLocation: ImageVector? = null
