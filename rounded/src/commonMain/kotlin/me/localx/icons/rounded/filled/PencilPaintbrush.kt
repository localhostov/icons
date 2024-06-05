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

public val Icons.Filled.PencilPaintbrush: ImageVector
    get() {
        if (_pencilPaintbrush != null) {
            return _pencilPaintbrush!!
        }
        _pencilPaintbrush = Builder(name = "PencilPaintbrush", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.31f, 15.0f)
                curveToRelative(3.845f, 0.0f, 5.76f, 4.029f, 6.607f, 6.695f)
                curveToRelative(0.364f, 1.147f, -0.521f, 2.305f, -1.748f, 2.305f)
                horizontalLineToRelative(-4.264f)
                curveToRelative(-2.38f, 0.0f, -4.905f, -2.015f, -4.905f, -4.5f)
                curveToRelative(0.0f, -2.485f, 1.93f, -4.5f, 4.31f, -4.5f)
                close()
                moveTo(1.172f, 19.119f)
                curveToRelative(-0.75f, 0.75f, -1.172f, 1.768f, -1.172f, 2.828f)
                verticalLineToRelative(2.053f)
                horizontalLineToRelative(2.053f)
                curveToRelative(1.061f, 0.0f, 2.078f, -0.421f, 2.828f, -1.172f)
                lineToRelative(13.43f, -13.43f)
                lineToRelative(-3.71f, -3.71f)
                lineTo(1.172f, 19.119f)
                close()
                moveTo(23.232f, 0.768f)
                curveToRelative(-1.024f, -1.024f, -2.685f, -1.024f, -3.71f, 0.0f)
                lineToRelative(-3.507f, 3.507f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.507f, -3.507f)
                curveToRelative(1.024f, -1.024f, 1.024f, -2.685f, 0.0f, -3.71f)
                close()
                moveTo(0.768f, 4.478f)
                curveTo(-0.256f, 3.454f, -0.256f, 1.793f, 0.768f, 0.768f)
                curveTo(1.793f, -0.256f, 3.454f, -0.256f, 4.478f, 0.768f)
                lineToRelative(5.899f, 6.317f)
                lineToRelative(-3.71f, 3.71f)
                lineTo(0.768f, 4.478f)
                close()
            }
        }
        .build()
        return _pencilPaintbrush!!
    }

private var _pencilPaintbrush: ImageVector? = null
