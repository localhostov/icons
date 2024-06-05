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

public val Icons.Outline.RoadSignLeft: ImageVector
    get() {
        if (_roadSignLeft != null) {
            return _roadSignLeft!!
        }
        _roadSignLeft = Builder(name = "RoadSignLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.528f, 8.437f)
                lineTo(15.562f, 1.471f)
                curveTo(14.614f, 0.523f, 13.35f, 0.0f, 12.001f, 0.0f)
                reflectiveCurveToRelative(-2.613f, 0.522f, -3.561f, 1.47f)
                lineTo(1.475f, 8.437f)
                curveTo(0.523f, 9.388f, 0.0f, 10.652f, 0.0f, 11.998f)
                curveToRelative(0.0f, 1.345f, 0.523f, 2.61f, 1.475f, 3.561f)
                lineToRelative(6.967f, 6.966f)
                curveToRelative(0.951f, 0.951f, 2.216f, 1.476f, 3.561f, 1.476f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.345f, 0.0f, 2.609f, -0.524f, 3.561f, -1.475f)
                lineToRelative(6.967f, -6.966f)
                curveToRelative(0.951f, -0.951f, 1.476f, -2.216f, 1.475f, -3.562f)
                curveToRelative(0.0f, -1.345f, -0.524f, -2.61f, -1.476f, -3.561f)
                close()
                moveTo(21.115f, 14.145f)
                lineToRelative(-6.967f, 6.966f)
                curveToRelative(-0.573f, 0.573f, -1.336f, 0.889f, -2.146f, 0.889f)
                reflectiveCurveToRelative(-1.574f, -0.316f, -2.147f, -0.89f)
                lineToRelative(-6.967f, -6.966f)
                curveToRelative(-0.573f, -0.574f, -0.889f, -1.336f, -0.889f, -2.147f)
                reflectiveCurveToRelative(0.315f, -1.574f, 0.89f, -2.147f)
                lineToRelative(6.966f, -6.965f)
                curveToRelative(0.57f, -0.57f, 1.333f, -0.884f, 2.146f, -0.884f)
                reflectiveCurveToRelative(1.577f, 0.314f, 2.147f, 0.884f)
                lineToRelative(6.966f, 6.966f)
                curveToRelative(0.574f, 0.573f, 0.89f, 1.336f, 0.89f, 2.147f)
                reflectiveCurveToRelative(-0.315f, 1.573f, -0.889f, 2.147f)
                close()
                moveTo(16.0f, 13.999f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.096f)
                lineToRelative(1.803f, 1.793f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.801f, -2.801f)
                curveToRelative(-0.774f, -0.775f, -0.774f, -2.037f, 0.0f, -2.812f)
                lineToRelative(2.802f, -2.801f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-1.793f, 1.793f)
                horizontalLineToRelative(3.086f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _roadSignLeft!!
    }

private var _roadSignLeft: ImageVector? = null
