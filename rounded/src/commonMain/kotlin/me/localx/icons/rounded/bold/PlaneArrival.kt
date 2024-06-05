package me.localx.icons.rounded.bold

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

public val Icons.Bold.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) {
            return _planeArrival!!
        }
        _planeArrival = Builder(name = "PlaneArrival", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.506f, 24.0f)
                horizontalLineTo(1.506f)
                curveTo(0.678f, 24.0f, 0.006f, 23.329f, 0.006f, 22.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(22.506f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.248f, 13.659f)
                curveToRelative(-0.36f, -1.11f, -1.136f, -2.003f, -2.185f, -2.515f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-4.945f, -2.414f)
                lineToRelative(-0.562f, -6.154f)
                curveToRelative(-0.074f, -0.932f, -0.651f, -1.748f, -1.505f, -2.129f)
                lineToRelative(-1.139f, -0.346f)
                curveToRelative(-1.459f, -0.443f, -2.933f, 0.642f, -2.944f, 2.167f)
                lineToRelative(-0.025f, 3.448f)
                lineToRelative(-0.973f, -0.475f)
                lineToRelative(-0.703f, -2.875f)
                curveToRelative(-0.186f, -0.752f, -0.652f, -1.388f, -1.314f, -1.791f)
                curveTo(5.058f, 0.031f, 3.974f, 0.007f, 3.057f, 0.509f)
                curveToRelative(-0.92f, 0.501f, -1.484f, 1.426f, -1.513f, 2.512f)
                verticalLineToRelative(6.222f)
                curveToRelative(0.0f, 1.333f, 0.74f, 2.533f, 1.933f, 3.13f)
                lineToRelative(12.804f, 6.408f)
                curveToRelative(0.604f, 0.305f, 1.252f, 0.449f, 1.893f, 0.449f)
                curveToRelative(1.532f, 0.0f, 3.023f, -0.825f, 3.783f, -2.254f)
                curveToRelative(0.548f, -1.029f, 0.651f, -2.207f, 0.292f, -3.316f)
                close()
                moveTo(19.308f, 15.567f)
                curveToRelative(-0.318f, 0.601f, -1.072f, 0.84f, -1.682f, 0.533f)
                lineTo(4.82f, 9.69f)
                curveToRelative(-0.171f, -0.085f, -0.276f, -0.257f, -0.276f, -0.447f)
                lineTo(4.544f, 3.858f)
                lineToRelative(0.68f, 2.778f)
                curveToRelative(0.105f, 0.433f, 0.398f, 0.796f, 0.799f, 0.992f)
                lineToRelative(12.725f, 6.211f)
                curveToRelative(0.311f, 0.152f, 0.54f, 0.417f, 0.646f, 0.745f)
                reflectiveCurveToRelative(0.076f, 0.677f, -0.086f, 0.982f)
                close()
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
