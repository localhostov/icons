package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.ScrewAlt: ImageVector
    get() {
        if (_screwAlt != null) {
            return _screwAlt!!
        }
        _screwAlt = Builder(name = "ScrewAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 2.121f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.172f, -0.95f, -2.121f, -2.121f, -2.121f)
                lineTo(2.121f, 0.0f)
                curveTo(0.95f, 0.0f, 0.0f, 0.95f, 0.0f, 2.121f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.563f, 0.223f, 1.102f, 0.621f, 1.5f)
                lineToRelative(2.379f, 2.379f)
                horizontalLineToRelative(6.0f)
                lineToRelative(2.379f, -2.379f)
                curveToRelative(0.398f, -0.398f, 0.621f, -0.937f, 0.621f, -1.5f)
                close()
                moveTo(6.216f, 8.0f)
                lineToRelative(-3.216f, 2.954f)
                verticalLineToRelative(-2.954f)
                horizontalLineToRelative(3.216f)
                close()
                moveTo(9.0f, 18.14f)
                verticalLineToRelative(1.204f)
                curveToRelative(0.0f, 1.326f, -0.527f, 2.597f, -1.464f, 3.535f)
                lineToRelative(-0.829f, 0.829f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-0.829f, -0.829f)
                curveToRelative(-0.101f, -0.101f, -0.178f, -0.22f, -0.269f, -0.328f)
                lineToRelative(4.805f, -4.41f)
                close()
                moveTo(3.0f, 18.786f)
                lineToRelative(6.0f, -5.512f)
                verticalLineToRelative(2.351f)
                lineToRelative(-5.731f, 5.265f)
                curveToRelative(-0.162f, -0.497f, -0.269f, -1.013f, -0.269f, -1.546f)
                verticalLineToRelative(-0.558f)
                close()
                moveTo(3.0f, 13.671f)
                lineToRelative(6.0f, -5.512f)
                verticalLineToRelative(2.4f)
                lineToRelative(-6.0f, 5.512f)
                verticalLineToRelative(-2.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.477f, 17.0f)
                lineToRelative(-1.443f, -2.5f)
                curveToRelative(-0.535f, -0.925f, -1.53f, -1.5f, -2.598f, -1.5f)
                horizontalLineToRelative(-2.887f)
                curveToRelative(-1.068f, 0.0f, -2.063f, 0.575f, -2.599f, 1.5f)
                lineToRelative(-1.443f, 2.5f)
                curveToRelative(-0.535f, 0.926f, -0.535f, 2.075f, 0.0f, 3.0f)
                lineToRelative(1.443f, 2.5f)
                curveToRelative(0.535f, 0.925f, 1.53f, 1.5f, 2.599f, 1.5f)
                horizontalLineToRelative(2.887f)
                curveToRelative(1.067f, 0.0f, 2.062f, -0.575f, 2.598f, -1.5f)
                lineToRelative(1.443f, -2.5f)
                curveToRelative(0.534f, -0.926f, 0.534f, -2.075f, 0.0f, -3.0f)
                close()
                moveTo(18.0f, 20.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _screwAlt!!
    }

private var _screwAlt: ImageVector? = null
