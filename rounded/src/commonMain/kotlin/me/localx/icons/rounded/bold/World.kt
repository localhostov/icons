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

public val Icons.Bold.World: ImageVector
    get() {
        if (_world != null) {
            return _world!!
        }
        _world = Builder(name = "World", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.5f, 20.975f)
                lineTo(12.5f, 19.69f)
                arcTo(4.19f, 4.19f, 0.0f, false, false, 8.31f, 15.5f)
                lineTo(8.3f, 15.5f)
                arcToRelative(3.143f, 3.143f, 0.0f, false, true, -2.223f, -0.921f)
                lineTo(3.024f, 11.524f)
                arcTo(8.985f, 8.985f, 0.0f, false, true, 17.016f, 4.532f)
                arcToRelative(1.548f, 1.548f, 0.0f, false, true, -0.913f, 0.3f)
                lineTo(14.669f, 4.832f)
                arcTo(1.555f, 1.555f, 0.0f, false, false, 13.114f, 6.39f)
                lineTo(13.114f, 7.432f)
                arcToRelative(1.555f, 1.555f, 0.0f, false, true, -1.555f, 1.555f)
                horizontalLineToRelative(0.0f)
                arcTo(1.555f, 1.555f, 0.0f, false, false, 10.0f, 10.542f)
                verticalLineToRelative(1.042f)
                arcToRelative(1.555f, 1.555f, 0.0f, false, false, 1.555f, 1.555f)
                horizontalLineToRelative(4.156f)
                arcToRelative(1.555f, 1.555f, 0.0f, false, true, 1.555f, 1.555f)
                verticalLineToRelative(1.52f)
                arcToRelative(1.555f, 1.555f, 0.0f, false, false, 0.456f, 1.1f)
                lineToRelative(0.833f, 0.833f)
                arcTo(8.964f, 8.964f, 0.0f, false, true, 12.5f, 20.975f)
                close()
            }
        }
        .build()
        return _world!!
    }

private var _world: ImageVector? = null
