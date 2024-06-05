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

public val Icons.Filled.PaintbrushPencil: ImageVector
    get() {
        if (_paintbrushPencil != null) {
            return _paintbrushPencil!!
        }
        _paintbrushPencil = Builder(name = "PaintbrushPencil", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.073f, 13.363f)
                lineToRelative(6.927f, 6.927f)
                verticalLineToRelative(3.71f)
                reflectiveCurveToRelative(-3.71f, 0.0f, -3.71f, 0.0f)
                lineToRelative(-6.927f, -6.927f)
                lineToRelative(3.71f, -3.71f)
                close()
                moveTo(0.768f, 4.478f)
                lineToRelative(6.108f, 6.108f)
                lineToRelative(3.71f, -3.71f)
                lineTo(4.478f, 0.768f)
                curveToRelative(-1.024f, -1.024f, -2.685f, -1.024f, -3.71f, 0.0f)
                curveToRelative(-1.024f, 1.024f, -1.024f, 2.685f, 0.0f, 3.71f)
                close()
                moveTo(9.534f, 14.466f)
                curveToRelative(-1.955f, -1.955f, -5.124f, -1.955f, -7.079f, 0.0f)
                curveToRelative(-1.955f, 1.955f, -2.455f, 9.534f, -2.455f, 9.534f)
                curveToRelative(0.0f, 0.0f, 7.579f, -0.5f, 9.534f, -2.455f)
                curveToRelative(1.955f, -1.955f, 1.955f, -5.124f, 0.0f, -7.079f)
                close()
                moveTo(23.232f, 0.768f)
                curveToRelative(-1.024f, -1.024f, -2.685f, -1.024f, -3.71f, 0.0f)
                lineToRelative(-10.793f, 10.793f)
                curveToRelative(0.806f, 0.341f, 1.563f, 0.834f, 2.219f, 1.49f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.656f, 0.657f, 1.149f, 1.413f, 1.49f, 2.22f)
                lineToRelative(10.792f, -10.792f)
                curveToRelative(1.024f, -1.024f, 1.024f, -2.685f, 0.0f, -3.71f)
                close()
            }
        }
        .build()
        return _paintbrushPencil!!
    }

private var _paintbrushPencil: ImageVector? = null
