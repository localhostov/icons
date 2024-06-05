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

public val Icons.Outline.PostalAddress: ImageVector
    get() {
        if (_postalAddress != null) {
            return _postalAddress!!
        }
        _postalAddress = Builder(name = "PostalAddress", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 10.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(21.5f, 14.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20.414f, 16.0f)
                lineToRelative(-1.707f, 1.707f)
                curveToRelative(-0.377f, 0.379f, -1.036f, 0.379f, -1.414f, 0.0f)
                lineToRelative(-1.707f, -1.707f)
                horizontalLineToRelative(4.828f)
                close()
                moveTo(14.0f, 22.0f)
                verticalLineToRelative(-4.758f)
                lineToRelative(1.878f, 1.879f)
                curveToRelative(0.566f, 0.566f, 1.32f, 0.879f, 2.122f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                lineToRelative(1.879f, -1.879f)
                verticalLineToRelative(4.758f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(10.0f, 21.189f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 2.796f, 0.0f, 2.796f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-7.063f, -6.907f, -7.063f, -6.907f)
                curveToRelative(-0.003f, -0.003f, -0.004f, -0.007f, -0.006f, -0.009f)
                horizontalLineToRelative(-0.001f)
                curveTo(-0.971f, 13.172f, -0.971f, 6.828f, 2.929f, 2.929f)
                curveTo(4.818f, 1.04f, 7.329f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveToRelative(5.182f, 1.04f, 7.071f, 2.929f)
                curveToRelative(1.889f, 1.889f, 2.929f, 4.4f, 2.929f, 7.071f)
                curveToRelative(0.0f, 0.68f, -0.069f, 1.349f, -0.201f, 2.0f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(0.166f, -0.646f, 0.26f, -1.315f, 0.26f, -2.0f)
                curveToRelative(0.0f, -2.137f, -0.832f, -4.146f, -2.343f, -5.657f)
                curveToRelative(-1.511f, -1.511f, -3.52f, -2.343f, -5.657f, -2.343f)
                reflectiveCurveToRelative(-4.146f, 0.832f, -5.657f, 2.343f)
                curveToRelative(-3.119f, 3.119f, -3.119f, 8.194f, -0.001f, 11.313f)
                lineToRelative(5.658f, 5.534f)
                close()
            }
        }
        .build()
        return _postalAddress!!
    }

private var _postalAddress: ImageVector? = null
