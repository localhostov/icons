package me.localx.icons.rounded.filled

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

public val Icons.Filled.FloppyDiskPen: ImageVector
    get() {
        if (_floppyDiskPen != null) {
            return _floppyDiskPen!!
        }
        _floppyDiskPen = Builder(name = "FloppyDiskPen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.327f, 12.673f)
                curveToRelative(0.897f, 0.897f, 0.897f, 2.353f, 0.0f, 3.25f)
                lineToRelative(-6.807f, 6.807f)
                curveToRelative(-0.813f, 0.813f, -1.915f, 1.27f, -3.065f, 1.27f)
                horizontalLineToRelative(-1.455f)
                verticalLineToRelative(-1.455f)
                curveToRelative(0.0f, -1.15f, 0.457f, -2.252f, 1.27f, -3.065f)
                lineToRelative(6.807f, -6.807f)
                curveToRelative(0.897f, -0.897f, 2.353f, -0.897f, 3.25f, 0.0f)
                close()
                moveTo(10.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.0f, 0.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                lineTo(14.0f, 0.0f)
                close()
                moveTo(18.663f, 11.259f)
                lineToRelative(-6.808f, 6.807f)
                curveToRelative(-0.823f, 0.823f, -1.392f, 1.833f, -1.667f, 2.934f)
                horizontalLineToRelative(-5.189f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(-0.001f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(16.0f, 0.277f)
                curveToRelative(0.33f, 0.15f, 0.637f, 0.352f, 0.894f, 0.611f)
                lineToRelative(3.236f, 3.265f)
                curveToRelative(0.561f, 0.564f, 0.87f, 1.315f, 0.87f, 2.112f)
                verticalLineToRelative(3.792f)
                curveToRelative(-0.881f, 0.144f, -1.693f, 0.557f, -2.337f, 1.201f)
                close()
                moveTo(14.0f, 13.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _floppyDiskPen!!
    }

private var _floppyDiskPen: ImageVector? = null
