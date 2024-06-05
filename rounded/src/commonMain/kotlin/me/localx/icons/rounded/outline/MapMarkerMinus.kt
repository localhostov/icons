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

public val Icons.Outline.MapMarkerMinus: ImageVector
    get() {
        if (_mapMarkerMinus != null) {
            return _mapMarkerMinus!!
        }
        _mapMarkerMinus = Builder(name = "MapMarkerMinus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.376f, 479.018f)
                curveToRelative(44.884f, 43.908f, 116.571f, 44.088f, 161.674f, 0.405f)
                lineToRelative(85.0f, -78.548f)
                curveToRelative(92.079f, -90.853f, 93.072f, -239.148f, 2.22f, -331.227f)
                reflectiveCurveToRelative(-239.148f, -93.073f, -331.227f, -2.22f)
                curveToRelative(-0.745f, 0.735f, -1.485f, 1.475f, -2.22f, 2.22f)
                curveToRelative(-91.46f, 91.475f, -91.448f, 239.774f, 0.027f, 331.234f)
                curveToRelative(0.19f, 0.19f, 0.379f, 0.379f, 0.57f, 0.567f)
                lineTo(174.376f, 479.018f)
                close()
                moveTo(119.931f, 99.755f)
                curveToRelative(74.673f, -75.008f, 196.014f, -75.28f, 271.022f, -0.607f)
                reflectiveCurveToRelative(75.28f, 196.014f, 0.607f, 271.022f)
                lineToRelative(-84.851f, 78.399f)
                curveToRelative(-28.975f, 27.269f, -74.221f, 27.101f, -102.992f, -0.383f)
                lineToRelative(-83.786f, -77.42f)
                curveToRelative(-74.838f, -74.837f, -74.838f, -196.172f, -0.002f, -271.01f)
                curveTo(119.93f, 99.756f, 119.93f, 99.756f, 119.931f, 99.755f)
                lineTo(119.931f, 99.755f)
                close()
                moveTo(148.974f, 235.261f)
                curveToRelative(0.0f, -11.76f, 9.533f, -21.293f, 21.293f, -21.293f)
                horizontalLineToRelative(170.34f)
                curveToRelative(11.76f, 0.0f, 21.293f, 9.533f, 21.293f, 21.293f)
                reflectiveCurveToRelative(-9.533f, 21.293f, -21.293f, 21.293f)
                horizontalLineToRelative(-170.34f)
                curveTo(158.507f, 256.553f, 148.974f, 247.02f, 148.974f, 235.261f)
                close()
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
