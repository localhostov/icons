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

public val Icons.Filled.Fireplace: ImageVector
    get() {
        if (_fireplace != null) {
            return _fireplace!!
        }
        _fireplace = Builder(name = "Fireplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.052f, 2.114f)
                curveTo(-0.217f, 1.04f, 0.595f, 0.0f, 1.702f, 0.0f)
                horizontalLineToRelative(20.595f)
                curveToRelative(1.107f, 0.0f, 1.919f, 1.04f, 1.651f, 2.114f)
                lineToRelative(-0.948f, 1.886f)
                lineTo(1.0f, 4.0f)
                lineTo(0.052f, 2.114f)
                close()
                moveTo(16.0f, 19.983f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 2.139f, -1.671f, 3.887f, -3.779f, 4.011f)
                curveToRelative(-1.761f, 0.103f, -3.293f, -1.047f, -3.971f, -2.676f)
                curveToRelative(-0.633f, -1.522f, 0.054f, -3.081f, 0.77f, -3.965f)
                curveToRelative(0.187f, -0.23f, 0.551f, -0.188f, 0.671f, 0.082f)
                curveToRelative(0.169f, 0.383f, 0.113f, 1.004f, 0.472f, 1.004f)
                curveToRelative(0.758f, 0.0f, 0.564f, -2.049f, 1.41f, -3.481f)
                curveToRelative(0.15f, -0.254f, 0.499f, -0.303f, 0.719f, -0.108f)
                curveToRelative(1.366f, 1.219f, 3.708f, 3.021f, 3.708f, 5.132f)
                close()
                moveTo(13.008f, 20.28f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.682f, -0.682f)
                curveToRelative(-0.19f, -0.19f, -0.497f, -0.19f, -0.687f, 0.0f)
                lineToRelative(-0.682f, 0.682f)
                curveToRelative(-0.582f, 0.582f, -0.686f, 1.537f, -0.15f, 2.162f)
                curveToRelative(0.62f, 0.723f, 1.732f, 0.723f, 2.351f, 0.0f)
                curveToRelative(0.536f, -0.625f, 0.432f, -1.58f, -0.15f, -2.162f)
                close()
                moveTo(23.0f, 22.0f)
                lineTo(23.0f, 6.0f)
                lineTo(1.0f, 6.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-8.921f)
                curveToRelative(0.0f, -1.495f, 0.927f, -2.847f, 2.307f, -3.364f)
                curveToRelative(2.535f, -0.95f, 4.85f, -0.95f, 7.385f, 0.0f)
                curveToRelative(1.38f, 0.517f, 2.307f, 1.869f, 2.307f, 3.364f)
                verticalLineToRelative(8.921f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _fireplace!!
    }

private var _fireplace: ImageVector? = null
