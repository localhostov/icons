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

public val Icons.Outline.LawyerMan: ImageVector
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
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 2.691f, 5.691f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(5.0f, 6.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(9.0f, 14.0f)
                curveTo(4.038f, 14.0f, 0.0f, 18.037f, 0.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -3.859f, 3.14f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _lawyerMan!!
    }

private var _lawyerMan: ImageVector? = null
