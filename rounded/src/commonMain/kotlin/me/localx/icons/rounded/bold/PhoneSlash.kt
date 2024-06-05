package me.localx.icons.rounded.bold

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

public val Icons.Bold.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.934f, 16.1f)
                arcToRelative(3.515f, 3.515f, 0.0f, false, true, 0.082f, 4.946f)
                reflectiveCurveToRelative(-0.93f, 1.066f, -0.954f, 1.091f)
                curveToRelative(-3.44f, 3.2f, -7.766f, 1.85f, -11.86f, -0.611f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.6f, -2.539f)
                curveToRelative(2.935f, 1.645f, 5.681f, 3.043f, 8.107f, 1.063f)
                curveToRelative(0.0f, 0.0f, 0.924f, -1.059f, 0.949f, -1.083f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.707f)
                lineToRelative(-2.238f, -2.074f)
                curveToRelative(-0.3f, -0.25f, -0.469f, -0.253f, -0.747f, -0.04f)
                lineToRelative(-1.136f, 1.118f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.588f, 0.331f)
                quadToRelative(-0.27f, -0.1f, -0.532f, -0.214f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.651f, -2.88f)
                lineToRelative(0.492f, -0.484f)
                arcToRelative(3.59f, 3.59f, 0.0f, false, true, 4.941f, 0.008f)
                close()
                moveTo(23.561f, 2.561f)
                lineTo(2.561f, 23.561f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.439f, 21.439f)
                lineTo(4.88f, 17.0f)
                curveToRelative(-4.0f, -4.7f, -7.018f, -10.6f, -3.018f, -15.061f)
                curveTo(1.887f, 1.914f, 2.954f, 0.984f, 2.954f, 0.984f)
                arcToRelative(3.583f, 3.583f, 0.0f, false, true, 4.908f, 0.041f)
                lineToRelative(2.152f, 2.318f)
                arcToRelative(3.493f, 3.493f, 0.0f, false, true, -0.039f, 4.91f)
                lineToRelative(-0.388f, 0.393f)
                arcToRelative(13.1f, 13.1f, 0.0f, false, false, 1.381f, 2.265f)
                lineTo(21.439f, 0.439f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 23.561f, 2.561f)
                close()
                moveTo(7.0f, 14.88f)
                lineToRelative(1.827f, -1.827f)
                arcTo(16.434f, 16.434f, 0.0f, false, true, 6.414f, 8.877f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.323f, -1.61f)
                lineTo(7.845f, 6.141f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, false, 0.009f, -0.717f)
                lineTo(5.7f, 3.106f)
                arcToRelative(0.487f, 0.487f, 0.0f, false, false, -0.667f, 0.04f)
                curveTo(5.009f, 3.171f, 3.95f, 4.1f, 3.95f, 4.1f)
                curveTo(1.5f, 7.0f, 4.224f, 11.591f, 7.0f, 14.88f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
