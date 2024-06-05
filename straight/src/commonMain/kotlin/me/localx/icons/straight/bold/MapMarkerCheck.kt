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

public val Icons.Bold.MapMarkerCheck: ImageVector
    get() {
        if (_mapMarkerCheck != null) {
            return _mapMarkerCheck!!
        }
        _mapMarkerCheck = Builder(name = "MapMarkerCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.504f, 14.0f)
                curveToRelative(-0.641f, 0.0f, -1.283f, -0.244f, -1.771f, -0.732f)
                lineToRelative(-2.272f, -2.187f)
                lineToRelative(2.08f, -2.161f)
                lineToRelative(1.957f, 1.883f)
                lineToRelative(4.452f, -4.373f)
                lineToRelative(2.102f, 2.141f)
                lineToRelative(-4.793f, 4.707f)
                curveToRelative(-0.481f, 0.481f, -1.117f, 0.723f, -1.754f, 0.723f)
                close()
                moveTo(12.0f, 23.987f)
                lineToRelative(-7.06f, -6.904f)
                curveToRelative(-3.911f, -3.911f, -3.911f, -10.254f, -0.012f, -14.153f)
                curveTo(6.817f, 1.04f, 9.329f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.182f, 1.04f, 7.07f, 2.929f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.89f, 1.889f, 2.93f, 4.4f, 2.93f, 7.071f)
                reflectiveCurveToRelative(-1.04f, 5.182f, -2.93f, 7.071f)
                lineToRelative(-7.07f, 6.916f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-1.87f, 0.0f, -3.628f, 0.728f, -4.95f, 2.05f)
                curveToRelative(-2.729f, 2.729f, -2.729f, 7.17f, 0.0f, 9.899f)
                lineToRelative(4.95f, 4.841f)
                lineToRelative(4.961f, -4.853f)
                curveToRelative(1.311f, -1.311f, 2.039f, -3.068f, 2.039f, -4.938f)
                reflectiveCurveToRelative(-0.729f, -3.627f, -2.051f, -4.949f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.322f, -1.323f, -3.079f, -2.051f, -4.949f, -2.051f)
                close()
            }
        }
        .build()
        return _mapMarkerCheck!!
    }

private var _mapMarkerCheck: ImageVector? = null
