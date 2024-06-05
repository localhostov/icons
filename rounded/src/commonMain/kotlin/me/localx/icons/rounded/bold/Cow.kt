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

public val Icons.Bold.Cow: ImageVector
    get() {
        if (_cow != null) {
            return _cow!!
        }
        _cow = Builder(name = "Cow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.868f, 5.312f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.5f, 2.0f)
                lineTo(18.949f, 2.0f)
                arcTo(1.512f, 1.512f, 0.0f, true, false, 16.0f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 1.5f)
                arcTo(1.512f, 1.512f, 0.0f, true, false, 5.051f, 2.0f)
                lineTo(2.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.132f, 5.312f)
                arcToRelative(8.654f, 8.654f, 0.0f, false, false, 1.66f, 3.077f)
                lineTo(5.031f, 21.806f)
                arcTo(2.492f, 2.492f, 0.0f, false, false, 7.5f, 24.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.492f, 2.492f, 0.0f, false, false, 2.469f, -2.194f)
                lineTo(22.208f, 8.389f)
                arcTo(8.654f, 8.654f, 0.0f, false, false, 23.868f, 5.312f)
                close()
                moveTo(16.559f, 19.006f)
                lineTo(13.5f, 19.0f)
                lineTo(13.5f, 14.5f)
                arcToRelative(4.454f, 4.454f, 0.0f, false, true, 1.047f, -2.85f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.4f, -1.514f)
                arcTo(4.48f, 4.48f, 0.0f, false, true, 18.0f, 10.0f)
                reflectiveCurveToRelative(0.656f, -0.01f, 0.736f, -0.013f)
                close()
                moveTo(7.441f, 19.006f)
                lineTo(5.264f, 9.987f)
                curveTo(5.344f, 9.99f, 6.0f, 10.0f, 6.0f, 10.0f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, 1.049f, 0.136f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.4f, 1.514f)
                arcTo(4.454f, 4.454f, 0.0f, false, true, 10.5f, 14.5f)
                lineTo(10.5f, 19.0f)
                close()
                moveTo(16.534f, 5.0f)
                arcToRelative(18.727f, 18.727f, 0.0f, false, true, 2.421f, 1.956f)
                curveTo(18.808f, 6.983f, 18.0f, 7.0f, 18.0f, 7.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -6.0f, 3.005f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 6.0f, 7.0f)
                reflectiveCurveToRelative(-0.808f, -0.017f, -0.955f, -0.044f)
                arcTo(18.769f, 18.769f, 0.0f, false, true, 7.466f, 5.0f)
                close()
            }
        }
        .build()
        return _cow!!
    }

private var _cow: ImageVector? = null
