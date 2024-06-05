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

public val Icons.Outline.LandLayers: ImageVector
    get() {
        if (_landLayers != null) {
            return _landLayers!!
        }
        _landLayers = Builder(name = "LandLayers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.485f, 8.088f)
                lineToRelative(9.862f, 5.917f)
                curveToRelative(0.51f, 0.306f, 1.081f, 0.459f, 1.653f, 0.459f)
                reflectiveCurveToRelative(1.143f, -0.153f, 1.653f, -0.459f)
                lineToRelative(9.861f, -5.917f)
                curveToRelative(0.301f, -0.181f, 0.485f, -0.506f, 0.485f, -0.857f)
                reflectiveCurveToRelative(-0.184f, -0.677f, -0.485f, -0.857f)
                lineTo(13.653f, 0.456f)
                curveToRelative(-1.02f, -0.612f, -2.287f, -0.612f, -3.307f, 0.0f)
                lineTo(0.485f, 6.373f)
                curveToRelative(-0.301f, 0.181f, -0.485f, 0.506f, -0.485f, 0.857f)
                reflectiveCurveToRelative(0.184f, 0.677f, 0.485f, 0.857f)
                close()
                moveTo(12.624f, 12.29f)
                curveToRelative(-0.385f, 0.231f, -0.864f, 0.231f, -1.249f, 0.0f)
                lineToRelative(-3.125f, -1.875f)
                lineToRelative(3.749f, -2.249f)
                lineToRelative(3.748f, 2.249f)
                lineToRelative(-3.124f, 1.874f)
                close()
                moveTo(17.692f, 9.249f)
                lineToRelative(-3.748f, -2.249f)
                lineToRelative(3.364f, -2.018f)
                lineToRelative(3.748f, 2.249f)
                lineToRelative(-3.364f, 2.018f)
                close()
                moveTo(11.376f, 2.171f)
                curveToRelative(0.385f, -0.23f, 0.863f, -0.23f, 1.248f, 0.0f)
                lineToRelative(2.74f, 1.644f)
                lineToRelative(-3.364f, 2.019f)
                lineToRelative(-3.364f, -2.019f)
                lineToRelative(2.74f, -1.644f)
                close()
                moveTo(6.692f, 4.982f)
                lineToRelative(3.364f, 2.018f)
                lineToRelative(-3.748f, 2.249f)
                lineToRelative(-3.364f, -2.018f)
                lineToRelative(3.748f, -2.249f)
                close()
                moveTo(0.143f, 11.09f)
                curveToRelative(0.283f, -0.475f, 0.897f, -0.627f, 1.372f, -0.343f)
                lineToRelative(9.861f, 5.917f)
                curveToRelative(0.385f, 0.23f, 0.864f, 0.23f, 1.249f, 0.0f)
                lineToRelative(9.861f, -5.917f)
                curveToRelative(0.474f, -0.284f, 1.088f, -0.131f, 1.372f, 0.343f)
                reflectiveCurveToRelative(0.131f, 1.088f, -0.343f, 1.372f)
                lineToRelative(-9.861f, 5.917f)
                curveToRelative(-0.51f, 0.306f, -1.082f, 0.459f, -1.653f, 0.459f)
                reflectiveCurveToRelative(-1.143f, -0.153f, -1.653f, -0.459f)
                lineTo(0.485f, 12.462f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.898f, -0.343f, -1.372f)
                close()
                moveTo(23.858f, 15.385f)
                curveToRelative(0.284f, 0.474f, 0.131f, 1.088f, -0.343f, 1.372f)
                lineToRelative(-9.861f, 5.917f)
                curveToRelative(-0.51f, 0.307f, -1.082f, 0.459f, -1.653f, 0.459f)
                reflectiveCurveToRelative(-1.144f, -0.152f, -1.654f, -0.459f)
                lineTo(0.485f, 16.757f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.898f, -0.343f, -1.372f)
                curveToRelative(0.283f, -0.474f, 0.897f, -0.628f, 1.372f, -0.343f)
                lineToRelative(9.861f, 5.917f)
                curveToRelative(0.385f, 0.23f, 0.864f, 0.23f, 1.248f, 0.0f)
                lineToRelative(9.862f, -5.917f)
                curveToRelative(0.474f, -0.284f, 1.088f, -0.131f, 1.372f, 0.343f)
                close()
            }
        }
        .build()
        return _landLayers!!
    }

private var _landLayers: ImageVector? = null
