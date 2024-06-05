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

public val Icons.Filled.MapMarkerCross: ImageVector
    get() {
        if (_mapMarkerCross != null) {
            return _mapMarkerCross!!
        }
        _mapMarkerCross = Builder(name = "MapMarkerCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.194f, 69.944f)
                curveToRelative(-90.614f, -92.173f, -238.793f, -93.437f, -330.966f, -2.823f)
                reflectiveCurveToRelative(-93.437f, 238.793f, -2.823f, 330.966f)
                curveToRelative(1.126f, 1.146f, 2.264f, 2.28f, 3.414f, 3.402f)
                lineToRelative(83.892f, 77.509f)
                curveToRelative(44.849f, 43.874f, 116.481f, 44.054f, 161.549f, 0.404f)
                lineToRelative(84.934f, -78.487f)
                curveTo(513.586f, 309.518f, 513.586f, 161.34f, 422.194f, 69.944f)
                close()
                moveTo(335.579f, 284.215f)
                curveToRelative(8.452f, 8.163f, 8.686f, 21.633f, 0.522f, 30.084f)
                reflectiveCurveToRelative(-21.633f, 8.686f, -30.084f, 0.522f)
                curveToRelative(-0.177f, -0.171f, -0.351f, -0.345f, -0.522f, -0.522f)
                lineToRelative(-48.786f, -48.786f)
                lineTo(207.922f, 314.3f)
                curveToRelative(-8.452f, 8.163f, -21.921f, 7.93f, -30.084f, -0.522f)
                curveToRelative(-7.964f, -8.245f, -7.964f, -21.317f, 0.0f, -29.562f)
                lineToRelative(48.786f, -48.786f)
                lineToRelative(-48.786f, -48.786f)
                curveToRelative(-8.452f, -8.163f, -8.686f, -21.632f, -0.523f, -30.084f)
                reflectiveCurveToRelative(21.632f, -8.686f, 30.084f, -0.523f)
                curveToRelative(0.177f, 0.171f, 0.352f, 0.346f, 0.523f, 0.523f)
                lineToRelative(48.786f, 48.786f)
                lineToRelative(48.786f, -48.786f)
                curveToRelative(8.163f, -8.452f, 21.633f, -8.686f, 30.084f, -0.522f)
                reflectiveCurveToRelative(8.686f, 21.633f, 0.522f, 30.084f)
                curveToRelative(-0.171f, 0.177f, -0.345f, 0.351f, -0.522f, 0.522f)
                lineToRelative(-48.786f, 48.786f)
                lineTo(335.579f, 284.215f)
                close()
            }
        }
        .build()
        return _mapMarkerCross!!
    }

private var _mapMarkerCross: ImageVector? = null
