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

public val Icons.Bold.MapMarkerQuestion: ImageVector
    get() {
        if (_mapMarkerQuestion != null) {
            return _mapMarkerQuestion!!
        }
        _mapMarkerQuestion = Builder(name = "MapMarkerQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.271f, 0.74f, -2.438f, 1.98f, -3.123f)
                curveToRelative(0.291f, -0.16f, 0.596f, -0.537f, 0.502f, -1.071f)
                curveToRelative(-0.067f, -0.383f, -0.406f, -0.722f, -0.789f, -0.789f)
                curveToRelative(-0.419f, -0.077f, -0.704f, 0.104f, -0.836f, 0.216f)
                curveToRelative(-0.227f, 0.191f, -0.357f, 0.47f, -0.357f, 0.767f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.185f, 0.521f, -2.302f, 1.428f, -3.064f)
                curveToRelative(0.907f, -0.762f, 2.101f, -1.082f, 3.284f, -0.874f)
                curveToRelative(1.615f, 0.283f, 2.942f, 1.61f, 3.225f, 3.225f)
                curveToRelative(0.298f, 1.696f, -0.509f, 3.391f, -2.008f, 4.217f)
                curveToRelative(-0.213f, 0.118f, -0.429f, 0.317f, -0.429f, 0.496f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.5f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(19.071f, 17.071f)
                curveToRelative(3.899f, -3.899f, 3.899f, -10.243f, 0.0f, -14.142f)
                curveToRelative(-1.889f, -1.889f, -4.4f, -2.929f, -7.071f, -2.929f)
                reflectiveCurveTo(6.817f, 1.04f, 4.929f, 2.929f)
                curveToRelative(-3.899f, 3.899f, -3.899f, 10.243f, 0.012f, 14.153f)
                lineToRelative(7.059f, 6.904f)
                lineToRelative(7.071f, -6.916f)
                close()
                moveTo(16.95f, 5.05f)
                curveToRelative(1.322f, 1.322f, 2.05f, 3.08f, 2.05f, 4.95f)
                reflectiveCurveToRelative(-0.729f, 3.627f, -2.039f, 4.938f)
                lineToRelative(-4.962f, 4.853f)
                lineToRelative(-4.95f, -4.841f)
                curveToRelative(-2.729f, -2.729f, -2.729f, -7.17f, 0.0f, -9.899f)
                curveToRelative(1.322f, -1.322f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.627f, 0.728f, 4.95f, 2.05f)
                close()
            }
        }
        .build()
        return _mapMarkerQuestion!!
    }

private var _mapMarkerQuestion: ImageVector? = null
