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

public val Icons.Bold.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 4.0f)
                lineTo(16.29f, 4.0f)
                arcToRelative(2.779f, 2.779f, 0.0f, false, false, -1.3f, -1.6f)
                arcTo(3.136f, 3.136f, 0.0f, false, false, 13.2f, 2.013f)
                arcTo(1.592f, 1.592f, 0.0f, false, true, 11.76f, 1.4f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, false, -5.947f, 0.622f)
                arcTo(2.955f, 2.955f, 0.0f, false, false, 2.685f, 4.0f)
                lineTo(1.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.287f, -4.0f)
                lineTo(20.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(24.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 9.0f)
                close()
                moveTo(16.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 21.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 8.5f)
                lineTo(5.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(9.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 7.0f)
                lineTo(16.0f, 7.0f)
                close()
                moveTo(21.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
