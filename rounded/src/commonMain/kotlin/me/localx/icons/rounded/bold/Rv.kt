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

public val Icons.Bold.Rv: ImageVector
    get() {
        if (_rv != null) {
            return _rv!!
        }
        _rv = Builder(name = "Rv", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(-1.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 1.0f)
                lineTo(5.5f, 0.985f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 6.485f)
                verticalLineToRelative(6.53f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, false, 2.2f, 5.3f)
                lineToRelative(0.8f, 0.8f)
                lineTo(3.0f, 20.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                lineTo(8.0f, 20.0f)
                lineToRelative(8.0f, 0.006f)
                lineTo(16.0f, 20.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineToRelative(-0.487f)
                lineToRelative(1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(24.0f, 14.593f)
                arcToRelative(7.509f, 7.509f, 0.0f, false, false, -0.988f, -3.72f)
                lineTo(21.921f, 8.964f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 6.5f)
                close()
                moveTo(13.0f, 10.5f)
                verticalLineToRelative(6.507f)
                lineTo(5.122f, 17.0f)
                lineToRelative(-0.8f, -0.8f)
                arcTo(4.47f, 4.47f, 0.0f, false, true, 3.0f, 13.015f)
                lineTo(3.0f, 6.485f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                lineTo(19.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 5.5f)
                lineTo(21.0f, 6.0f)
                lineTo(17.5f, 6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 13.0f, 10.5f)
                close()
                moveTo(16.0f, 14.0f)
                lineTo(16.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 9.0f)
                horizontalLineToRelative(0.986f)
                lineToRelative(1.921f, 3.361f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 20.96f, 14.0f)
                close()
                moveTo(11.0f, 8.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 8.0f)
                close()
            }
        }
        .build()
        return _rv!!
    }

private var _rv: ImageVector? = null
