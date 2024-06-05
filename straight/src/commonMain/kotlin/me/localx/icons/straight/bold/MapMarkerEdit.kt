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

public val Icons.Bold.MapMarkerEdit: ImageVector
    get() {
        if (_mapMarkerEdit != null) {
            return _mapMarkerEdit!!
        }
        _mapMarkerEdit = Builder(name = "MapMarkerEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.828f, 14.0f)
                horizontalLineToRelative(-2.828f)
                verticalLineToRelative(-2.828f)
                lineToRelative(4.586f, -4.586f)
                curveToRelative(0.781f, -0.781f, 2.047f, -0.781f, 2.828f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.781f, 0.781f, 0.781f, 2.047f, 0.0f, 2.828f)
                lineToRelative(-4.586f, 4.586f)
                close()
                moveTo(19.07f, 17.071f)
                curveToRelative(1.89f, -1.889f, 2.93f, -4.4f, 2.93f, -7.071f)
                reflectiveCurveToRelative(-1.04f, -5.182f, -2.93f, -7.071f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.889f, -1.889f, -4.399f, -2.929f, -7.07f, -2.929f)
                reflectiveCurveTo(6.817f, 1.04f, 4.929f, 2.929f)
                curveToRelative(-3.899f, 3.899f, -3.899f, 10.243f, 0.012f, 14.153f)
                lineToRelative(7.06f, 6.904f)
                lineToRelative(7.07f, -6.916f)
                close()
                moveTo(16.949f, 5.05f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.322f, 1.322f, 2.051f, 3.08f, 2.051f, 4.95f)
                reflectiveCurveToRelative(-0.729f, 3.627f, -2.039f, 4.938f)
                lineToRelative(-4.961f, 4.853f)
                lineToRelative(-4.95f, -4.841f)
                curveToRelative(-2.729f, -2.729f, -2.729f, -7.17f, 0.0f, -9.899f)
                curveToRelative(1.322f, -1.322f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.627f, 0.728f, 4.949f, 2.05f)
                close()
            }
        }
        .build()
        return _mapMarkerEdit!!
    }

private var _mapMarkerEdit: ImageVector? = null
