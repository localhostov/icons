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

public val Icons.Filled.MapMarkerCheck: ImageVector
    get() {
        if (_mapMarkerCheck != null) {
            return _mapMarkerCheck!!
        }
        _mapMarkerCheck = Builder(name = "MapMarkerCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.778f, 3.222f)
                curveTo(17.7f, 1.144f, 14.937f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(6.3f, 1.145f, 4.222f, 3.222f)
                curveToRelative(-2.078f, 2.077f, -3.222f, 4.839f, -3.222f, 7.778f)
                reflectiveCurveToRelative(1.144f, 5.7f, 3.25f, 7.805f)
                lineToRelative(3.943f, 3.643f)
                curveToRelative(1.022f, 1.001f, 2.375f, 1.552f, 3.807f, 1.552f)
                reflectiveCurveToRelative(2.784f, -0.551f, 3.786f, -1.533f)
                lineToRelative(3.992f, -3.689f)
                curveToRelative(2.078f, -2.078f, 3.222f, -4.84f, 3.222f, -7.778f)
                reflectiveCurveToRelative(-1.144f, -5.701f, -3.222f, -7.778f)
                close()
                moveTo(17.699f, 8.712f)
                lineToRelative(-5.793f, 5.707f)
                curveToRelative(-0.387f, 0.387f, -0.896f, 0.58f, -1.407f, 0.58f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.585f)
                lineToRelative(-2.782f, -2.696f)
                curveToRelative(-0.396f, -0.385f, -0.406f, -1.018f, -0.021f, -1.414f)
                curveToRelative(0.385f, -0.398f, 1.018f, -0.406f, 1.414f, -0.022f)
                lineToRelative(2.793f, 2.707f)
                lineToRelative(5.809f, -5.701f)
                curveToRelative(0.395f, -0.387f, 1.027f, -0.382f, 1.414f, 0.011f)
                curveToRelative(0.388f, 0.393f, 0.384f, 1.026f, -0.01f, 1.414f)
                close()
            }
        }
        .build()
        return _mapMarkerCheck!!
    }

private var _mapMarkerCheck: ImageVector? = null
