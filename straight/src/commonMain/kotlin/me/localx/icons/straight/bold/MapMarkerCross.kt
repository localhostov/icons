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

public val Icons.Bold.MapMarkerCross: ImageVector
    get() {
        if (_mapMarkerCross != null) {
            return _mapMarkerCross!!
        }
        _mapMarkerCross = Builder(name = "MapMarkerCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.298f, 254.423f)
                lineToRelative(41.296f, -41.275f)
                lineToRelative(-41.296f, -41.275f)
                lineToRelative(45.17f, -45.17f)
                lineTo(259.743f, 168.0f)
                lineToRelative(41.275f, -41.296f)
                lineToRelative(45.17f, 45.17f)
                lineToRelative(-41.296f, 41.275f)
                lineToRelative(41.296f, 41.275f)
                lineToRelative(-45.17f, 45.17f)
                lineToRelative(-41.275f, -41.296f)
                lineToRelative(-41.275f, 41.296f)
                lineTo(173.298f, 254.423f)
                close()
                moveTo(106.82f, 365.369f)
                curveToRelative(-84.444f, -81.794f, -86.592f, -216.556f, -4.798f, -301.0f)
                reflectiveCurveToRelative(216.556f, -86.592f, 301.0f, -4.798f)
                curveToRelative(1.549f, 1.5f, 3.075f, 3.024f, 4.578f, 4.571f)
                curveToRelative(83.128f, 83.129f, 83.128f, 217.906f, 0.0f, 301.035f)
                lineTo(257.082f, 512.396f)
                lineTo(106.82f, 365.369f)
                close()
                moveTo(108.076f, 214.617f)
                curveToRelative(-0.102f, 39.54f, 15.61f, 77.479f, 43.638f, 105.369f)
                lineToRelative(105.369f, 103.048f)
                lineToRelative(105.603f, -103.304f)
                curveToRelative(58.058f, -58.323f, 57.843f, -152.668f, -0.48f, -210.726f)
                reflectiveCurveToRelative(-152.668f, -57.843f, -210.726f, 0.48f)
                curveTo(123.679f, 137.411f, 108.073f, 175.213f, 108.076f, 214.617f)
                lineTo(108.076f, 214.617f)
                close()
            }
        }
        .build()
        return _mapMarkerCross!!
    }

private var _mapMarkerCross: ImageVector? = null
