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

public val Icons.Outline.Smog: ImageVector
    get() {
        if (_smog != null) {
            return _smog!!
        }
        _smog = Builder(name = "Smog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 22.0f)
                lineTo(14.0f, 22.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(16.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 20.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 20.0f)
                close()
                moveTo(14.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(14.0f, 16.0f)
                close()
                moveTo(20.0f, 14.0f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(19.274f, 10.779f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 4.0f)
                arcToRelative(3.549f, 3.549f, 0.0f, false, false, -0.474f, 0.032f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, -4.532f, -2.007f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.129f, 0.163f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 1.488f, 8.92f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.767f, 0.29f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.654f, -0.619f)
                close()
                moveTo(13.121f, 9.392f)
                arcToRelative(4.086f, 4.086f, 0.0f, false, true, -4.674f, -0.313f)
                lineTo(7.75f, 8.5f)
                lineToRelative(-0.644f, 0.636f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 6.3f, 4.3f)
                lineToRelative(0.814f, 0.392f)
                lineToRelative(0.472f, -0.771f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.678f, -0.23f)
                lineToRelative(0.39f, 0.549f)
                lineToRelative(0.655f, -0.155f)
                arcToRelative(3.048f, 3.048f, 0.0f, false, true, 3.366f, 1.557f)
                lineToRelative(0.416f, 0.814f)
                lineToRelative(0.848f, -0.342f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 20.5f, 9.0f)
                arcToRelative(1.484f, 1.484f, 0.0f, false, true, -0.853f, -0.267f)
                lineToRelative(-0.753f, -0.522f)
                lineToRelative(-0.586f, 0.705f)
                arcToRelative(3.068f, 3.068f, 0.0f, false, true, -4.068f, 0.513f)
                lineToRelative(-0.547f, -0.4f)
                close()
            }
        }
        .build()
        return _smog!!
    }

private var _smog: ImageVector? = null
