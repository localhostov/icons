package me.localx.icons.straight.bold

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

public val Icons.Bold.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.122f, 0.0f)
                lineTo(1.622f, 6.0f)
                lineTo(1.622f, 18.0f)
                lineToRelative(10.5f, 6.0f)
                lineToRelative(10.5f, -6.0f)
                lineTo(22.622f, 6.0f)
                close()
                moveTo(18.108f, 6.876f)
                lineTo(12.018f, 10.276f)
                lineTo(6.171f, 6.856f)
                lineToRelative(5.951f, -3.4f)
                close()
                moveTo(4.622f, 9.425f)
                lineTo(10.5f, 12.861f)
                verticalLineToRelative(6.757f)
                lineTo(4.622f, 16.259f)
                close()
                moveTo(13.5f, 19.757f)
                lineTo(13.5f, 12.881f)
                lineToRelative(6.122f, -3.415f)
                verticalLineToRelative(6.793f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
