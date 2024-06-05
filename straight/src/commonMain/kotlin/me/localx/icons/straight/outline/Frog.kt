package me.localx.icons.straight.outline

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

public val Icons.Outline.Frog: ImageVector
    get() {
        if (_frog != null) {
            return _frog!!
        }
        _frog = Builder(name = "Frog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.27f, 4.875f)
                curveToRelative(-1.114f, -1.002f, -2.68f, -1.816f, -4.395f, -2.301f)
                curveToRelative(-0.407f, -1.482f, -1.766f, -2.574f, -3.375f, -2.574f)
                curveToRelative(-1.493f, 0.0f, -2.771f, 0.94f, -3.273f, 2.26f)
                curveTo(2.514f, 6.921f, 0.229f, 13.83f, 0.034f, 18.833f)
                curveToRelative(-0.053f, 1.354f, 0.438f, 2.641f, 1.384f, 3.624f)
                curveToRelative(0.943f, 0.98f, 2.263f, 1.542f, 3.622f, 1.542f)
                horizontalLineToRelative(9.96f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.987f)
                lineToRelative(0.035f, -2.714f)
                curveToRelative(0.0f, -0.245f, -0.015f, -0.486f, -0.042f, -0.724f)
                curveToRelative(0.033f, -1.314f, 0.203f, -2.791f, 0.392f, -4.074f)
                lineToRelative(6.054f, 9.513f)
                horizontalLineToRelative(3.549f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.451f)
                lineToRelative(-6.392f, -10.044f)
                curveToRelative(3.059f, -0.227f, 6.949f, -1.359f, 9.275f, -3.993f)
                curveToRelative(0.798f, -0.903f, 0.725f, -2.288f, -0.163f, -3.087f)
                close()
                moveTo(15.5f, 2.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21.934f, 6.638f)
                curveToRelative(-2.192f, 2.481f, -6.182f, 3.362f, -8.934f, 3.362f)
                horizontalLineToRelative(-0.807f)
                lineToRelative(-0.17f, 0.789f)
                curveToRelative(-0.026f, 0.121f, -0.42f, 1.961f, -0.711f, 4.163f)
                curveToRelative(-1.146f, -1.202f, -2.761f, -1.952f, -4.549f, -1.952f)
                horizontalLineToRelative(-1.207f)
                curveToRelative(-0.359f, 0.64f, -0.655f, 1.307f, -0.89f, 2.0f)
                horizontalLineToRelative(1.836f)
                curveToRelative(2.485f, 0.0f, 4.5f, 2.015f, 4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-5.96f)
                curveToRelative(-0.83f, 0.0f, -1.604f, -0.33f, -2.181f, -0.929f)
                curveToRelative(-0.564f, -0.587f, -0.858f, -1.354f, -0.827f, -2.159f)
                curveToRelative(0.238f, -6.074f, 3.73f, -11.021f, 10.124f, -14.379f)
                curveToRelative(0.442f, 1.427f, 1.774f, 2.467f, 3.344f, 2.467f)
                curveToRelative(1.529f, 0.0f, 2.833f, -0.987f, 3.308f, -2.356f)
                curveToRelative(1.232f, 0.406f, 2.331f, 1.005f, 3.124f, 1.718f)
                curveToRelative(0.076f, 0.068f, 0.076f, 0.192f, 0.001f, 0.276f)
                close()
            }
        }
        .build()
        return _frog!!
    }

private var _frog: ImageVector? = null
