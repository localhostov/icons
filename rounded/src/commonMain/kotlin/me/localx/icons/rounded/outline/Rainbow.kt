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

public val Icons.Outline.Rainbow: ImageVector
    get() {
        if (_rainbow != null) {
            return _rainbow!!
        }
        _rainbow = Builder(name = "Rainbow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(22.0f, 15.0f)
                curveTo(21.449f, 1.73f, 2.546f, 1.741f, 2.0f, 15.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(0.0f, 15.0f)
                curveTo(0.661f, -0.924f, 23.345f, -0.911f, 24.0f, 15.0f)
                verticalLineToRelative(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 21.0f)
                close()
                moveTo(20.0f, 20.0f)
                lineTo(20.0f, 15.0f)
                curveTo(19.6f, 4.4f, 4.4f, 4.407f, 4.0f, 15.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(6.0f, 15.0f)
                curveToRelative(0.253f, -7.932f, 11.75f, -7.926f, 12.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(16.0f, 20.0f)
                lineTo(16.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(10.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
