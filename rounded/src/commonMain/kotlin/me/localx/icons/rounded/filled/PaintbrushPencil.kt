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
                moveToRelative(9.549f, 21.457f)
                curveToRelative(-1.331f, 1.331f, -5.575f, 2.236f, -7.92f, 2.512f)
                curveToRelative(-0.939f, 0.11f, -1.729f, -0.68f, -1.619f, -1.619f)
                curveToRelative(0.276f, -2.345f, 1.201f, -6.568f, 2.532f, -7.899f)
                curveToRelative(1.935f, -1.935f, 5.072f, -1.935f, 7.006f, 0.0f)
                curveToRelative(1.935f, 1.935f, 1.935f, 5.072f, 0.0f, 7.006f)
                close()
                moveTo(19.119f, 22.828f)
                curveToRelative(0.75f, 0.75f, 1.768f, 1.172f, 2.828f, 1.172f)
                horizontalLineToRelative(2.053f)
                reflectiveCurveToRelative(0.0f, -2.053f, 0.0f, -2.053f)
                curveToRelative(0.0f, -1.061f, -0.421f, -2.078f, -1.172f, -2.828f)
                lineToRelative(-5.031f, -5.031f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(5.031f, 5.031f)
                close()
                moveTo(0.855f, 0.855f)
                curveToRelative(-1.024f, 1.024f, -1.024f, 2.685f, 0.0f, 3.71f)
                lineToRelative(5.255f, 5.255f)
                lineToRelative(3.71f, -3.71f)
                lineTo(4.565f, 0.855f)
                curveToRelative(-1.024f, -1.024f, -2.685f, -1.024f, -3.71f, 0.0f)
                close()
                moveTo(23.232f, 0.768f)
                curveToRelative(-1.024f, -1.024f, -2.685f, -1.024f, -3.71f, 0.0f)
                lineToRelative(-10.777f, 10.777f)
                curveToRelative(0.807f, 0.339f, 1.562f, 0.835f, 2.218f, 1.492f)
                curveToRelative(0.656f, 0.656f, 1.153f, 1.411f, 1.492f, 2.218f)
                lineToRelative(10.777f, -10.777f)
                curveToRelative(1.024f, -1.024f, 1.024f, -2.685f, 0.0f, -3.71f)
                close()
            }
        }
        .build()
        return _paintbrushPencil!!
    }

private var _paintbrushPencil: ImageVector? = null
