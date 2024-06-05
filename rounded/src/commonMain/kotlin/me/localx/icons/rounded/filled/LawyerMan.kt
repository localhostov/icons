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

public val Icons.Filled.LawyerMan: ImageVector
    get() {
        if (_lawyerMan != null) {
            return _lawyerMan!!
        }
        _lawyerMan = Builder(name = "LawyerMan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.664f)
                verticalLineToRelative(0.336f)
                curveToRelative(0.0f, 1.214f, -1.082f, 2.176f, -2.335f, 1.973f)
                curveToRelative(-0.984f, -0.16f, -1.665f, -1.083f, -1.665f, -2.079f)
                verticalLineToRelative(-0.23f)
                lineToRelative(0.854f, -2.42f)
                lineToRelative(-1.854f, -0.348f)
                verticalLineToRelative(6.105f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.48f)
                lineToRelative(-1.752f, -0.328f)
                lineToRelative(0.861f, 2.406f)
                verticalLineToRelative(0.575f)
                horizontalLineToRelative(-0.013f)
                curveToRelative(-0.129f, 1.162f, -1.226f, 2.032f, -2.466f, 1.783f)
                curveToRelative(-0.97f, -0.194f, -1.63f, -1.112f, -1.63f, -2.101f)
                verticalLineToRelative(-0.244f)
                lineToRelative(1.06f, -3.379f)
                curveToRelative(0.251f, -0.801f, 1.061f, -1.288f, 1.886f, -1.135f)
                lineToRelative(2.054f, 0.381f)
                verticalLineToRelative(-0.48f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(0.851f)
                lineToRelative(2.41f, 0.447f)
                curveToRelative(0.675f, 0.125f, 1.233f, 0.599f, 1.465f, 1.245f)
                lineToRelative(1.124f, 3.121f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(10.0f, 17.855f)
                verticalLineToRelative(-0.55f)
                lineToRelative(0.964f, -3.073f)
                curveToRelative(-0.634f, -0.143f, -1.288f, -0.232f, -1.964f, -0.232f)
                curveTo(4.043f, 14.0f, 0.009f, 18.028f, 0.0f, 22.983f)
                curveToRelative(-0.001f, 0.557f, 0.443f, 1.017f, 1.0f, 1.017f)
                horizontalLineToRelative(11.184f)
                curveToRelative(-0.112f, -0.314f, -0.184f, -0.648f, -0.184f, -1.0f)
                curveToRelative(0.0f, -0.503f, 0.136f, -0.97f, 0.356f, -1.387f)
                curveToRelative(-1.402f, -0.658f, -2.356f, -2.108f, -2.356f, -3.758f)
                close()
            }
        }
        .build()
        return _lawyerMan!!
    }

private var _lawyerMan: ImageVector? = null
