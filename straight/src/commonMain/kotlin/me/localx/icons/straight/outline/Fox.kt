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

public val Icons.Outline.Fox: ImageVector
    get() {
        if (_fox != null) {
            return _fox!!
        }
        _fox = Builder(name = "Fox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -5.6f, 3.782f)
                arcTo(21.868f, 21.868f, 0.0f, false, false, 12.0f, 3.0f)
                arcToRelative(21.876f, 21.876f, 0.0f, false, false, -5.4f, 0.782f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 11.929f)
                arcToRelative(5.959f, 5.959f, 0.0f, false, false, 1.757f, 4.242f)
                lineToRelative(6.95f, 6.95f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 10.829f, 24.0f)
                horizontalLineToRelative(2.343f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, 2.121f, -0.879f)
                lineToRelative(6.949f, -6.949f)
                arcTo(5.958f, 5.958f, 0.0f, false, false, 24.0f, 11.929f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(9.0f, 20.586f)
                lineTo(3.171f, 14.757f)
                arcTo(3.974f, 3.974f, 0.0f, false, true, 2.0f, 11.929f)
                lineTo(2.0f, 10.215f)
                arcToRelative(11.361f, 11.361f, 0.0f, false, true, 2.0f, 0.722f)
                arcToRelative(3.808f, 3.808f, 0.0f, false, false, 3.624f, 3.05f)
                arcTo(8.917f, 8.917f, 0.0f, false, true, 9.0f, 19.0f)
                close()
                moveTo(22.0f, 11.929f)
                arcToRelative(3.969f, 3.969f, 0.0f, false, true, -1.172f, 2.828f)
                lineTo(15.0f, 20.586f)
                lineTo(15.0f, 19.0f)
                arcToRelative(8.917f, 8.917f, 0.0f, false, true, 1.376f, -5.013f)
                arcTo(3.808f, 3.808f, 0.0f, false, false, 20.0f, 10.937f)
                arcToRelative(11.361f, 11.361f, 0.0f, false, true, 2.0f, -0.722f)
                close()
                moveTo(22.0f, 8.173f)
                curveToRelative(-2.431f, 0.559f, -9.0f, 2.815f, -9.0f, 10.827f)
                verticalLineToRelative(1.0f)
                lineTo(11.0f, 20.0f)
                lineTo(11.0f, 19.0f)
                curveTo(11.0f, 10.987f, 4.431f, 8.732f, 2.0f, 8.173f)
                lineTo(2.0f, 2.109f)
                arcTo(4.325f, 4.325f, 0.0f, false, true, 5.051f, 5.316f)
                lineToRelative(0.317f, 0.948f)
                lineToRelative(0.947f, -0.315f)
                arcTo(20.924f, 20.924f, 0.0f, false, true, 12.0f, 5.0f)
                arcToRelative(20.934f, 20.934f, 0.0f, false, true, 5.685f, 0.949f)
                lineToRelative(0.948f, 0.315f)
                lineToRelative(0.315f, -0.948f)
                arcTo(4.328f, 4.328f, 0.0f, false, true, 22.0f, 2.109f)
                close()
            }
        }
        .build()
        return _fox!!
    }

private var _fox: ImageVector? = null
