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

public val Icons.Bold.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.555f)
                lineTo(21.0f, 9.994f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -18.0f, 0.0f)
                verticalLineToRelative(1.561f)
                arcToRelative(5.307f, 5.307f, 0.0f, false, false, -3.0f, 4.763f)
                verticalLineToRelative(0.364f)
                arcTo(5.324f, 5.324f, 0.0f, false, false, 5.318f, 22.0f)
                lineTo(5.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 19.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.0f, -2.449f)
                lineTo(6.0f, 9.994f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(1.057f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.0f, 13.5f)
                lineTo(16.0f, 19.0f)
                lineTo(14.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(4.182f)
                arcTo(5.324f, 5.324f, 0.0f, false, false, 24.0f, 16.682f)
                verticalLineToRelative(-0.364f)
                arcTo(5.307f, 5.307f, 0.0f, false, false, 21.0f, 11.555f)
                close()
                moveTo(5.0f, 18.978f)
                arcToRelative(2.321f, 2.321f, 0.0f, false, true, -2.0f, -2.3f)
                verticalLineToRelative(-0.364f)
                arcToRelative(2.321f, 2.321f, 0.0f, false, true, 2.0f, -2.3f)
                close()
                moveTo(21.0f, 16.678f)
                arcToRelative(2.321f, 2.321f, 0.0f, false, true, -2.0f, 2.3f)
                lineTo(19.0f, 14.022f)
                arcToRelative(2.321f, 2.321f, 0.0f, false, true, 2.0f, 2.3f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
