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

public val Icons.Filled.LandLocation: ImageVector
    get() {
        if (_landLocation != null) {
            return _landLocation!!
        }
        _landLocation = Builder(name = "LandLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.949f, 2.05f)
                curveToRelative(-1.321f, -1.322f, -3.079f, -2.05f, -4.949f, -2.05f)
                reflectiveCurveToRelative(-3.627f, 0.728f, -4.95f, 2.05f)
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
                moveTo(7.433f, 15.121f)
                lineToRelative(-0.122f, 0.879f)
                lineTo(0.628f, 16.0f)
                lineToRelative(0.459f, -2.676f)
                curveToRelative(0.246f, -1.435f, 1.23f, -2.577f, 2.524f, -3.066f)
                curveToRelative(0.449f, 1.156f, 1.14f, 2.219f, 2.049f, 3.129f)
                lineToRelative(1.773f, 1.734f)
                close()
                moveTo(0.285f, 18.0f)
                horizontalLineToRelative(6.747f)
                lineToRelative(-0.834f, 6.0f)
                horizontalLineToRelative(-2.198f)
                curveToRelative(-1.178f, 0.0f, -2.291f, -0.516f, -3.052f, -1.415f)
                curveToRelative(-0.762f, -0.899f, -1.087f, -2.081f, -0.893f, -3.243f)
                lineToRelative(0.23f, -1.342f)
                close()
                moveTo(15.147f, 18.0f)
                lineToRelative(0.835f, 6.0f)
                horizontalLineToRelative(-7.765f)
                lineToRelative(0.834f, -6.0f)
                horizontalLineToRelative(6.096f)
                close()
                moveTo(23.372f, 16.0f)
                horizontalLineToRelative(-6.485f)
                lineToRelative(-0.146f, -1.049f)
                lineToRelative(1.622f, -1.587f)
                curveToRelative(0.899f, -0.899f, 1.584f, -1.954f, 2.03f, -3.104f)
                curveToRelative(1.292f, 0.49f, 2.274f, 1.63f, 2.52f, 3.064f)
                lineToRelative(0.459f, 2.676f)
                close()
                moveTo(23.052f, 22.586f)
                curveToRelative(-0.762f, 0.898f, -1.874f, 1.414f, -3.052f, 1.414f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.835f, -6.0f)
                horizontalLineToRelative(6.55f)
                lineToRelative(0.229f, 1.338f)
                curveToRelative(0.194f, 1.167f, -0.131f, 2.349f, -0.893f, 3.248f)
                close()
            }
        }
        .build()
        return _landLocation!!
    }

private var _landLocation: ImageVector? = null
