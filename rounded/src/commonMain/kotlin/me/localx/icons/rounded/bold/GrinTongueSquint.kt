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

public val Icons.Bold.GrinTongueSquint: ImageVector
    get() {
        if (_grinTongueSquint != null) {
            return _grinTongueSquint!!
        }
        _grinTongueSquint = Builder(name = "GrinTongueSquint", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(14.977f, 16.0f)
                curveToRelative(-0.48f, 3.97f, -5.476f, 3.966f, -5.954f, 0.0f)
                lineTo(8.0f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 14.5f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.893f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, -9.0f, -9.0f)
                curveTo(0.077f, 3.452f, 0.08f, 20.549f, 12.0f, 21.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 21.0f, 12.0f)
                close()
                moveTo(8.4f, 11.7f)
                lineToRelative(2.0f, -1.5f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, 0.0f, -2.4f)
                lineToRelative(-2.0f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.6f, 8.7f)
                lineTo(7.0f, 9.0f)
                lineToRelative(-0.4f, 0.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.8f, 2.4f)
                close()
                moveTo(17.7f, 6.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.1f, -0.3f)
                lineToRelative(-2.0f, 1.5f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, 0.0f, 2.4f)
                lineToRelative(2.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.8f, -2.4f)
                lineTo(17.0f, 9.0f)
                lineToRelative(0.4f, -0.3f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.7f, 6.6f)
                close()
            }
        }
        .build()
        return _grinTongueSquint!!
    }

private var _grinTongueSquint: ImageVector? = null
