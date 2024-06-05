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

public val Icons.Outline.MeterBolt: ImageVector
    get() {
        if (_meterBolt != null) {
            return _meterBolt!!
        }
        _meterBolt = Builder(name = "MeterBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.932f, 21.886f)
                curveToRelative(0.201f, 0.515f, -0.053f, 1.095f, -0.568f, 1.296f)
                curveToRelative(-1.39f, 0.543f, -2.858f, 0.818f, -4.364f, 0.818f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(4.531f, 0.0f, 8.627f, 2.508f, 10.691f, 6.545f)
                curveToRelative(0.251f, 0.491f, 0.056f, 1.094f, -0.436f, 1.346f)
                curveToRelative(-0.492f, 0.25f, -1.094f, 0.056f, -1.346f, -0.436f)
                curveToRelative(-1.72f, -3.365f, -5.134f, -5.455f, -8.91f, -5.455f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(1.255f, 0.0f, 2.479f, -0.229f, 3.636f, -0.682f)
                curveToRelative(0.515f, -0.201f, 1.095f, 0.054f, 1.295f, 0.567f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                close()
                moveTo(9.0f, 8.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                close()
                moveTo(13.0f, 8.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                close()
                moveTo(23.768f, 16.684f)
                curveToRelative(-0.273f, -0.43f, -0.74f, -0.686f, -1.249f, -0.686f)
                horizontalLineToRelative(-4.154f)
                lineToRelative(2.51f, -4.512f)
                curveToRelative(0.269f, -0.483f, 0.095f, -1.092f, -0.388f, -1.36f)
                curveToRelative(-0.481f, -0.269f, -1.091f, -0.094f, -1.36f, 0.388f)
                lineToRelative(-2.97f, 5.342f)
                curveToRelative(-0.23f, 0.463f, -0.206f, 1.002f, 0.066f, 1.441f)
                curveToRelative(0.272f, 0.438f, 0.743f, 0.701f, 1.259f, 0.701f)
                horizontalLineToRelative(4.153f)
                lineToRelative(-2.509f, 4.517f)
                curveToRelative(-0.269f, 0.482f, -0.094f, 1.091f, 0.388f, 1.359f)
                curveToRelative(0.154f, 0.086f, 0.321f, 0.126f, 0.485f, 0.126f)
                curveToRelative(0.352f, 0.0f, 0.692f, -0.186f, 0.875f, -0.515f)
                lineToRelative(2.987f, -5.381f)
                curveToRelative(0.215f, -0.461f, 0.18f, -0.992f, -0.093f, -1.421f)
                close()
            }
        }
        .build()
        return _meterBolt!!
    }

private var _meterBolt: ImageVector? = null
