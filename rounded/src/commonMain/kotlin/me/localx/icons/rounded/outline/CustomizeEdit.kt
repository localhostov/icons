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

public val Icons.Outline.CustomizeEdit: ImageVector
    get() {
        if (_customizeEdit != null) {
            return _customizeEdit!!
        }
        _customizeEdit = Builder(name = "CustomizeEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.288f, 11.067f)
                curveToRelative(1.755f, -0.338f, 3.542f, 0.879f, 3.7f, 2.659f)
                curveToRelative(0.158f, 1.78f, -1.24f, 3.274f, -2.988f, 3.274f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.681f, 0.0f, -1.163f, -0.656f, -0.961f, -1.307f)
                curveToRelative(0.499f, -1.608f, 1.936f, -4.181f, 4.249f, -4.626f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(2.243f, 3.0f, 0.0f, 5.243f, 0.0f, 8.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(23.139f, 0.863f)
                curveToRelative(-1.149f, -1.15f, -3.012f, -1.151f, -4.162f, -0.002f)
                curveToRelative(-0.039f, 0.039f, -6.728f, 7.28f, -6.728f, 7.28f)
                curveToRelative(-0.452f, 0.506f, -0.263f, 1.29f, 0.357f, 1.565f)
                curveToRelative(0.007f, 0.003f, 0.014f, 0.006f, 0.021f, 0.009f)
                curveToRelative(0.386f, 0.173f, 0.838f, 0.068f, 1.119f, -0.248f)
                lineToRelative(6.611f, -7.157f)
                curveToRelative(0.348f, -0.389f, 0.946f, -0.422f, 1.334f, -0.074f)
                curveToRelative(0.013f, 0.012f, 0.025f, 0.023f, 0.038f, 0.036f)
                curveToRelative(0.369f, 0.368f, 0.369f, 0.965f, 0.001f, 1.334f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, -0.001f, 0.001f)
                lineToRelative(-6.879f, 6.686f)
                curveToRelative(-0.331f, 0.331f, -0.378f, 0.844f, -0.123f, 1.237f)
                curveToRelative(0.004f, 0.006f, 0.008f, 0.012f, 0.011f, 0.017f)
                curveToRelative(0.339f, 0.529f, 1.078f, 0.606f, 1.522f, 0.162f)
                lineToRelative(6.878f, -6.685f)
                curveToRelative(1.148f, -1.15f, 1.148f, -3.013f, 0.0f, -4.163f)
                close()
            }
        }
        .build()
        return _customizeEdit!!
    }

private var _customizeEdit: ImageVector? = null
