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

public val Icons.Filled.PhoneGuide: ImageVector
    get() {
        if (_phoneGuide != null) {
            return _phoneGuide!!
        }
        _phoneGuide = Builder(name = "PhoneGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.364f, 19.763f)
                lineToRelative(1.302f, 1.208f)
                curveToRelative(0.446f, 0.446f, 0.446f, 1.17f, 0.0f, 1.616f)
                lineToRelative(-0.522f, 0.6f)
                curveToRelative(-0.551f, 0.552f, -1.277f, 0.813f, -2.0f, 0.813f)
                curveToRelative(-3.714f, 0.0f, -9.143f, -5.143f, -9.143f, -9.143f)
                curveToRelative(0.0f, -0.723f, 0.261f, -1.449f, 0.813f, -2.0f)
                lineToRelative(0.6f, -0.522f)
                curveToRelative(0.446f, -0.446f, 1.17f, -0.446f, 1.616f, 0.0f)
                lineToRelative(1.208f, 1.302f)
                curveToRelative(0.446f, 0.446f, 0.446f, 1.17f, 0.0f, 1.616f)
                lineToRelative(-1.025f, 1.036f)
                curveToRelative(0.901f, 2.244f, 2.429f, 3.71f, 4.5f, 4.5f)
                lineToRelative(1.036f, -1.025f)
                curveToRelative(0.446f, -0.446f, 1.17f, -0.446f, 1.616f, 0.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 0.1f)
                curveTo(1.672f, 0.575f, 0.0f, 2.624f, 0.0f, 5.0f)
                verticalLineToRelative(12.025f)
                curveToRelative(0.699f, -0.527f, 1.525f, -0.86f, 2.395f, -0.964f)
                curveToRelative(0.199f, -0.041f, 0.402f, -0.061f, 0.605f, -0.061f)
                close()
                moveTo(10.717f, 18.0f)
                lineTo(3.0f, 18.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.216f, 0.0f, 0.422f, -0.037f, 0.631f, -0.064f)
                curveToRelative(-2.122f, -1.516f, -3.954f, -3.69f, -4.914f, -5.936f)
                close()
                moveTo(10.0f, 14.857f)
                curveToRelative(0.0f, -1.3f, 0.497f, -2.513f, 1.398f, -3.414f)
                lineToRelative(0.662f, -0.582f)
                curveToRelative(1.192f, -1.131f, 3.217f, -1.107f, 4.384f, 0.061f)
                lineToRelative(1.259f, 1.354f)
                curveToRelative(0.979f, 0.978f, 1.129f, 2.525f, 0.441f, 3.724f)
                horizontalLineToRelative(1.855f)
                lineTo(19.999f, 5.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(4.111f)
                curveToRelative(-0.066f, -0.385f, -0.111f, -0.768f, -0.111f, -1.143f)
                close()
            }
        }
        .build()
        return _phoneGuide!!
    }

private var _phoneGuide: ImageVector? = null
