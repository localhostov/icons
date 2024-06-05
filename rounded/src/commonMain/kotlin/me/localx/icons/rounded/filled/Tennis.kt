package me.localx.icons.rounded.filled

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

public val Icons.Filled.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.118f, 0.059f)
                arcToRelative(11.972f, 11.972f, 0.0f, false, true, 10.823f, 10.823f)
                arcToRelative(9.536f, 9.536f, 0.0f, false, true, -8.141f, -2.682f)
                arcToRelative(9.532f, 9.532f, 0.0f, false, true, -2.682f, -8.141f)
                close()
                moveTo(22.552f, 13.0f)
                arcToRelative(11.529f, 11.529f, 0.0f, false, true, -11.446f, -12.952f)
                arcToRelative(11.941f, 11.941f, 0.0f, false, false, -11.059f, 11.076f)
                arcToRelative(11.373f, 11.373f, 0.0f, false, true, 12.829f, 12.828f)
                arcToRelative(11.938f, 11.938f, 0.0f, false, false, 11.075f, -11.046f)
                arcToRelative(11.563f, 11.563f, 0.0f, false, true, -1.399f, 0.094f)
                close()
                moveTo(8.239f, 15.761f)
                arcToRelative(9.413f, 9.413f, 0.0f, false, false, -8.179f, -2.625f)
                arcToRelative(11.975f, 11.975f, 0.0f, false, false, 10.8f, 10.8f)
                arcToRelative(9.408f, 9.408f, 0.0f, false, false, -2.621f, -8.175f)
                close()
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
