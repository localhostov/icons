package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(name = "Walking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.447f, 12.402f)
                lineToRelative(-2.843f, -1.422f)
                curveToRelative(-0.327f, -0.163f, -0.603f, -0.413f, -0.797f, -0.723f)
                lineToRelative(-1.48f, -2.351f)
                curveToRelative(-0.054f, -0.078f, -1.321f, -1.907f, -3.327f, -1.907f)
                horizontalLineToRelative(-0.879f)
                curveToRelative(-1.214f, 0.0f, -2.431f, 0.287f, -3.518f, 0.83f)
                lineToRelative(-2.096f, 1.049f)
                curveToRelative(-0.77f, 0.384f, -1.338f, 1.082f, -1.559f, 1.914f)
                lineToRelative(-0.783f, 2.951f)
                curveToRelative(-0.142f, 0.534f, 0.177f, 1.082f, 0.71f, 1.223f)
                curveToRelative(0.534f, 0.139f, 1.082f, -0.177f, 1.223f, -0.71f)
                lineToRelative(0.783f, -2.951f)
                curveToRelative(0.073f, -0.277f, 0.262f, -0.51f, 0.519f, -0.638f)
                lineToRelative(2.097f, -1.049f)
                curveToRelative(0.197f, -0.099f, 0.4f, -0.185f, 0.607f, -0.26f)
                lineToRelative(-1.026f, 4.385f)
                curveToRelative(-0.301f, 1.286f, 0.291f, 2.64f, 1.439f, 3.292f)
                lineToRelative(3.977f, 2.258f)
                curveToRelative(0.312f, 0.178f, 0.506f, 0.511f, 0.506f, 0.87f)
                verticalLineToRelative(3.836f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.836f)
                curveToRelative(0.0f, -1.077f, -0.581f, -2.076f, -1.518f, -2.609f)
                lineToRelative(-1.95f, -1.108f)
                lineToRelative(1.538f, -5.784f)
                lineToRelative(1.044f, 1.659f)
                curveToRelative(0.39f, 0.62f, 0.942f, 1.121f, 1.597f, 1.447f)
                lineToRelative(2.842f, 1.421f)
                curveToRelative(0.144f, 0.072f, 0.296f, 0.105f, 0.446f, 0.105f)
                curveToRelative(0.367f, 0.0f, 0.72f, -0.202f, 0.896f, -0.553f)
                curveToRelative(0.247f, -0.494f, 0.047f, -1.095f, -0.447f, -1.342f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.19f, 17.865f)
                curveToRelative(-0.008f, -0.005f, -0.016f, -0.01f, -0.024f, -0.014f)
                curveToRelative(-0.568f, -0.34f, -1.304f, -0.029f, -1.454f, 0.616f)
                lineToRelative(-0.153f, 0.661f)
                lineToRelative(-1.61f, 3.452f)
                curveToRelative(-0.308f, 0.661f, 0.174f, 1.419f, 0.904f, 1.419f)
                curveToRelative(0.386f, 0.0f, 0.738f, -0.223f, 0.903f, -0.573f)
                lineToRelative(1.654f, -3.514f)
                lineToRelative(0.228f, -0.993f)
                curveToRelative(0.095f, -0.412f, -0.086f, -0.838f, -0.449f, -1.055f)
                close()
            }
        }
        .build()
        return _walking!!
    }

private var _walking: ImageVector? = null
