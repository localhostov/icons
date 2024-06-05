package me.localx.icons.rounded.outline

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

public val Icons.Outline.BreadSlice: ImageVector
    get() {
        if (_breadSlice != null) {
            return _breadSlice!!
        }
        _breadSlice = Builder(name = "BreadSlice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 23.0f)
                lineTo(7.0f, 23.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(2.0f, 10.446f)
                arcToRelative(1.119f, 1.119f, 0.0f, false, false, -0.391f, -0.792f)
                arcTo(4.989f, 4.989f, 0.0f, false, true, 0.066f, 5.179f)
                curveTo(0.482f, 2.6f, 2.85f, 1.0f, 6.242f, 1.0f)
                lineTo(18.848f, 1.0f)
                arcToRelative(5.122f, 5.122f, 0.0f, false, true, 5.086f, 4.179f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, true, -1.546f, 4.478f)
                arcToRelative(1.115f, 1.115f, 0.0f, false, false, -0.388f, 0.789f)
                lineTo(22.0f, 18.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 17.0f, 23.0f)
                close()
                moveTo(6.242f, 3.0f)
                curveToRelative(-2.414f, 0.0f, -3.945f, 0.911f, -4.2f, 2.5f)
                arcToRelative(2.951f, 2.951f, 0.0f, false, false, 0.924f, 2.685f)
                arcTo(3.072f, 3.072f, 0.0f, false, true, 4.0f, 10.446f)
                lineTo(4.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(17.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(20.0f, 10.446f)
                arcToRelative(3.061f, 3.061f, 0.0f, false, true, 1.034f, -2.261f)
                arcTo(2.952f, 2.952f, 0.0f, false, false, 21.959f, 5.5f)
                horizontalLineToRelative(0.0f)
                arcTo(3.106f, 3.106f, 0.0f, false, false, 18.848f, 3.0f)
                close()
                moveTo(8.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 12.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 16.0f)
                close()
                moveTo(8.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _breadSlice!!
    }

private var _breadSlice: ImageVector? = null
