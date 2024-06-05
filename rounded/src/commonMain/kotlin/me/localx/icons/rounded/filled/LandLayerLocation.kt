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

public val Icons.Filled.LandLayerLocation: ImageVector
    get() {
        if (_landLayerLocation != null) {
            return _landLayerLocation!!
        }
        _landLayerLocation = Builder(name = "LandLayerLocation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.949f, 2.05f)
                curveToRelative(-1.321f, -1.322f, -3.079f, -2.05f, -4.949f, -2.05f)
                reflectiveCurveToRelative(-3.628f, 0.728f, -4.95f, 2.05f)
                curveToRelative(-2.729f, 2.729f, -2.729f, 7.17f, 0.008f, 9.907f)
                lineToRelative(2.495f, 2.44f)
                curveToRelative(0.675f, 0.66f, 1.561f, 0.99f, 2.447f, 0.99f)
                reflectiveCurveToRelative(1.772f, -0.33f, 2.447f, -0.99f)
                lineToRelative(2.502f, -2.448f)
                curveToRelative(1.322f, -1.322f, 2.051f, -3.08f, 2.051f, -4.95f)
                reflectiveCurveToRelative(-0.729f, -3.627f, -2.051f, -4.95f)
                close()
                moveTo(12.0f, 9.99f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(24.0f, 16.762f)
                curveToRelative(0.002f, 0.354f, -0.183f, 0.682f, -0.485f, 0.863f)
                lineToRelative(-9.861f, 5.917f)
                curveToRelative(-0.51f, 0.306f, -1.082f, 0.459f, -1.653f, 0.459f)
                reflectiveCurveToRelative(-1.144f, -0.153f, -1.653f, -0.459f)
                lineTo(0.485f, 17.625f)
                curveToRelative(-0.303f, -0.182f, -0.487f, -0.51f, -0.485f, -0.863f)
                curveToRelative(0.002f, -0.353f, 0.19f, -0.679f, 0.495f, -0.857f)
                lineToRelative(4.855f, -2.842f)
                curveToRelative(0.1f, 0.11f, 0.203f, 0.219f, 0.309f, 0.325f)
                lineToRelative(2.495f, 2.439f)
                curveToRelative(1.028f, 1.006f, 2.395f, 1.561f, 3.846f, 1.561f)
                reflectiveCurveToRelative(2.817f, -0.555f, 3.846f, -1.561f)
                lineToRelative(2.518f, -2.463f)
                curveToRelative(0.098f, -0.098f, 0.194f, -0.199f, 0.287f, -0.301f)
                lineToRelative(4.854f, 2.841f)
                curveToRelative(0.305f, 0.179f, 0.493f, 0.505f, 0.495f, 0.857f)
                close()
            }
        }
        .build()
        return _landLayerLocation!!
    }

private var _landLayerLocation: ImageVector? = null
