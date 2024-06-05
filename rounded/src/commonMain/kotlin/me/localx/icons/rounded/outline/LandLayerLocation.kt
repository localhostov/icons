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

public val Icons.Outline.LandLayerLocation: ImageVector
    get() {
        if (_landLayerLocation != null) {
            return _landLayerLocation!!
        }
        _landLayerLocation = Builder(name = "LandLayerLocation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.553f, 14.397f)
                curveToRelative(0.675f, 0.66f, 1.561f, 0.99f, 2.447f, 0.99f)
                reflectiveCurveToRelative(1.772f, -0.33f, 2.447f, -0.99f)
                lineToRelative(2.502f, -2.448f)
                curveToRelative(1.322f, -1.322f, 2.051f, -3.08f, 2.051f, -4.95f)
                reflectiveCurveToRelative(-0.729f, -3.627f, -2.051f, -4.95f)
                curveToRelative(-1.321f, -1.322f, -3.079f, -2.05f, -4.949f, -2.05f)
                reflectiveCurveToRelative(-3.628f, 0.728f, -4.95f, 2.05f)
                curveToRelative(-2.729f, 2.729f, -2.729f, 7.17f, 0.008f, 9.907f)
                lineToRelative(2.495f, 2.44f)
                close()
                moveTo(8.464f, 3.464f)
                curveToRelative(0.944f, -0.944f, 2.2f, -1.464f, 3.536f, -1.464f)
                reflectiveCurveToRelative(2.591f, 0.52f, 3.535f, 1.464f)
                reflectiveCurveToRelative(1.465f, 2.2f, 1.465f, 3.536f)
                reflectiveCurveToRelative(-0.521f, 2.591f, -1.457f, 3.528f)
                lineToRelative(-2.494f, 2.44f)
                curveToRelative(-0.578f, 0.564f, -1.52f, 0.564f, -2.098f, 0.0f)
                lineToRelative(-2.487f, -2.432f)
                curveToRelative(-1.949f, -1.95f, -1.949f, -5.122f, 0.0f, -7.071f)
                close()
                moveTo(9.0f, 6.99f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(24.0f, 16.767f)
                curveToRelative(0.0f, 0.352f, -0.185f, 0.677f, -0.485f, 0.857f)
                lineToRelative(-9.861f, 5.917f)
                curveToRelative(-0.51f, 0.306f, -1.082f, 0.459f, -1.653f, 0.459f)
                reflectiveCurveToRelative(-1.144f, -0.153f, -1.653f, -0.459f)
                lineTo(0.485f, 17.625f)
                curveToRelative(-0.301f, -0.181f, -0.485f, -0.506f, -0.485f, -0.857f)
                reflectiveCurveToRelative(0.185f, -0.677f, 0.485f, -0.857f)
                lineToRelative(4.229f, -2.537f)
                curveToRelative(0.475f, -0.285f, 1.089f, -0.131f, 1.372f, 0.343f)
                curveToRelative(0.284f, 0.474f, 0.131f, 1.088f, -0.343f, 1.372f)
                lineToRelative(-2.8f, 1.68f)
                lineToRelative(8.433f, 5.06f)
                curveToRelative(0.385f, 0.23f, 0.863f, 0.23f, 1.248f, 0.0f)
                lineToRelative(8.433f, -5.06f)
                lineToRelative(-2.8f, -1.68f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.898f, -0.343f, -1.372f)
                reflectiveCurveToRelative(0.897f, -0.628f, 1.372f, -0.343f)
                lineToRelative(4.229f, 2.537f)
                curveToRelative(0.301f, 0.181f, 0.485f, 0.506f, 0.485f, 0.857f)
                close()
            }
        }
        .build()
        return _landLayerLocation!!
    }

private var _landLayerLocation: ImageVector? = null
