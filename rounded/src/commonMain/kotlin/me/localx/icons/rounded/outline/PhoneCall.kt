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

public val Icons.Outline.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 24.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, -8.0f, -8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 1.0f)
                close()
                moveTo(14.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(23.093f, 16.739f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 0.0f, 4.378f)
                lineToRelative(-0.91f, 1.049f)
                curveToRelative(-8.19f, 7.841f, -28.12f, -12.084f, -20.4f, -20.3f)
                lineToRelative(1.15f, -1.0f)
                arcTo(3.081f, 3.081f, 0.0f, false, true, 7.26f, 0.906f)
                curveToRelative(0.031f, 0.031f, 1.884f, 2.438f, 1.884f, 2.438f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -0.007f, 4.282f)
                lineTo(7.979f, 9.082f)
                arcToRelative(12.781f, 12.781f, 0.0f, false, false, 6.931f, 6.945f)
                lineToRelative(1.465f, -1.165f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 4.281f, -0.006f)
                reflectiveCurveTo(23.062f, 16.708f, 23.093f, 16.739f)
                close()
                moveTo(21.717f, 18.193f)
                reflectiveCurveToRelative(-2.393f, -1.841f, -2.424f, -1.872f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.549f, 0.0f)
                curveToRelative(-0.027f, 0.028f, -2.044f, 1.635f, -2.044f, 1.635f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.979f, 0.152f)
                arcTo(15.009f, 15.009f, 0.0f, false, true, 5.9f, 9.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.145f, -1.0f)
                reflectiveCurveTo(7.652f, 6.282f, 7.679f, 6.256f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.0f, -1.549f)
                curveToRelative(-0.031f, -0.03f, -1.872f, -2.425f, -1.872f, -2.425f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.51f, 0.039f)
                lineToRelative(-1.15f, 1.0f)
                curveTo(-2.495f, 10.105f, 14.776f, 26.418f, 20.721f, 20.8f)
                lineToRelative(0.911f, -1.05f)
                arcTo(1.121f, 1.121f, 0.0f, false, false, 21.717f, 18.193f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
