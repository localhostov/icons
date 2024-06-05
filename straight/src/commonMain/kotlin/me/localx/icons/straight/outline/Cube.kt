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

public val Icons.Outline.Cube: ImageVector
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
                moveTo(19.635f, 6.6f)
                lineTo(12.012f, 10.852f)
                lineTo(4.673f, 6.56f)
                lineTo(12.122f, 2.3f)
                close()
                moveTo(3.622f, 8.262f)
                lineTo(11.0f, 12.574f)
                verticalLineToRelative(8.482f)
                lineTo(3.622f, 16.839f)
                close()
                moveTo(13.0f, 21.194f)
                lineTo(13.0f, 12.587f)
                lineToRelative(7.622f, -4.251f)
                verticalLineToRelative(8.5f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
