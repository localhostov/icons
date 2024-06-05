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

public val Icons.Outline.LayerPlus: ImageVector
    get() {
        if (_layerPlus != null) {
            return _layerPlus!!
        }
        _layerPlus = Builder(name = "LayerPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.485f, 8.088f)
                lineToRelative(9.862f, 5.917f)
                curveToRelative(0.51f, 0.306f, 1.081f, 0.459f, 1.653f, 0.459f)
                curveToRelative(0.571f, 0.0f, 1.143f, -0.153f, 1.653f, -0.459f)
                lineToRelative(9.861f, -5.917f)
                curveToRelative(0.301f, -0.181f, 0.485f, -0.506f, 0.485f, -0.857f)
                reflectiveCurveToRelative(-0.184f, -0.677f, -0.485f, -0.857f)
                lineTo(13.654f, 0.456f)
                curveToRelative(-1.021f, -0.613f, -2.287f, -0.613f, -3.307f, 0.0f)
                lineTo(0.485f, 6.373f)
                curveToRelative(-0.301f, 0.181f, -0.485f, 0.506f, -0.485f, 0.857f)
                reflectiveCurveToRelative(0.184f, 0.677f, 0.485f, 0.857f)
                close()
                moveTo(11.376f, 2.171f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.384f, -0.23f, 0.863f, -0.23f, 1.248f, 0.0f)
                lineToRelative(8.432f, 5.06f)
                lineToRelative(-8.432f, 5.06f)
                curveToRelative(-0.385f, 0.23f, -0.864f, 0.23f, -1.249f, 0.0f)
                lineTo(2.944f, 7.23f)
                lineTo(11.376f, 2.171f)
                close()
                moveTo(24.0f, 20.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(12.857f, 23.286f)
                curveToRelative(-0.188f, 0.312f, -0.519f, 0.485f, -0.858f, 0.485f)
                curveToRelative(-0.175f, 0.0f, -0.353f, -0.046f, -0.514f, -0.143f)
                lineTo(0.485f, 17.029f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.898f, -0.343f, -1.372f)
                curveToRelative(0.283f, -0.474f, 0.897f, -0.628f, 1.372f, -0.343f)
                lineToRelative(11.0f, 6.6f)
                curveToRelative(0.474f, 0.284f, 0.627f, 0.898f, 0.343f, 1.372f)
                close()
                moveTo(23.857f, 11.09f)
                curveToRelative(0.284f, 0.474f, 0.131f, 1.088f, -0.343f, 1.372f)
                lineToRelative(-11.0f, 6.6f)
                curveToRelative(-0.159f, 0.095f, -0.336f, 0.143f, -0.515f, 0.143f)
                reflectiveCurveToRelative(-0.356f, -0.048f, -0.515f, -0.143f)
                lineTo(0.485f, 12.462f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.898f, -0.343f, -1.372f)
                curveToRelative(0.283f, -0.475f, 0.897f, -0.628f, 1.372f, -0.343f)
                lineToRelative(10.485f, 6.291f)
                lineToRelative(10.485f, -6.291f)
                curveToRelative(0.474f, -0.284f, 1.088f, -0.131f, 1.372f, 0.343f)
                close()
            }
        }
        .build()
        return _layerPlus!!
    }

private var _layerPlus: ImageVector? = null
