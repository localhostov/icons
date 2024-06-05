package me.localx.icons.straight.filled

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

public val Icons.Filled.Salad: ImageVector
    get() {
        if (_salad != null) {
            return _salad!!
        }
        _salad = Builder(name = "Salad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.414f, 4.622f)
                arcTo(6.071f, 6.071f, 0.0f, false, false, 17.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(6.948f, 6.948f, 0.0f, false, true, -0.943f, 3.484f)
                arcTo(31.656f, 31.656f, 0.0f, false, true, 22.0f, 3.0f)
                arcToRelative(24.507f, 24.507f, 0.0f, false, true, -1.335f, 7.0f)
                lineTo(16.414f, 10.0f)
                lineToRelative(2.293f, -2.293f)
                lineTo(17.293f, 6.293f)
                lineTo(13.586f, 10.0f)
                lineTo(12.244f, 10.0f)
                arcToRelative(4.459f, 4.459f, 0.0f, false, true, 1.062f, -4.611f)
                arcTo(4.468f, 4.468f, 0.0f, false, true, 14.414f, 4.622f)
                close()
                moveTo(23.38f, 13.174f)
                arcTo(3.007f, 3.007f, 0.0f, false, false, 20.988f, 12.0f)
                lineTo(3.0f, 12.0f)
                arcTo(3.01f, 3.01f, 0.0f, false, false, 0.608f, 13.174f)
                arcToRelative(2.907f, 2.907f, 0.0f, false, false, -0.528f, 2.52f)
                curveTo(1.0f, 18.694f, 4.908f, 22.336f, 8.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                curveTo(19.043f, 22.325f, 26.016f, 16.642f, 23.38f, 13.174f)
                close()
                moveTo(2.02f, 10.0f)
                horizontalLineToRelative(8.36f)
                arcTo(4.186f, 4.186f, 0.0f, false, false, 2.02f, 10.0f)
                close()
                moveTo(6.2f, 4.0f)
                arcToRelative(6.153f, 6.153f, 0.0f, false, true, 4.4f, 1.847f)
                arcToRelative(6.044f, 6.044f, 0.0f, false, true, 2.714f, -2.9f)
                arcTo(4.97f, 4.97f, 0.0f, false, false, 14.763f, 1.1f)
                arcTo(3.976f, 3.976f, 0.0f, false, false, 9.5f, 0.905f)
                arcTo(3.969f, 3.969f, 0.0f, false, false, 3.1f, 4.838f)
                arcTo(6.148f, 6.148f, 0.0f, false, true, 6.2f, 4.0f)
                close()
            }
        }
        .build()
        return _salad!!
    }

private var _salad: ImageVector? = null
