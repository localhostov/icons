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
                moveToRelative(18.313f, 9.396f)
                lineTo(3.71f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.71f)
                lineTo(14.604f, 5.687f)
                lineToRelative(3.71f, 3.71f)
                close()
                moveTo(23.232f, 0.768f)
                curveToRelative(-1.024f, -1.024f, -2.685f, -1.024f, -3.71f, 0.0f)
                lineToRelative(-3.504f, 3.504f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.504f, -3.504f)
                curveToRelative(1.024f, -1.024f, 1.024f, -2.685f, 0.0f, -3.71f)
                close()
                moveTo(6.667f, 10.795f)
                lineToRelative(3.71f, -3.71f)
                lineTo(4.478f, 0.768f)
                curveTo(3.454f, -0.256f, 1.793f, -0.256f, 0.768f, 0.768f)
                curveTo(-0.256f, 1.793f, -0.256f, 3.454f, 0.768f, 4.478f)
                lineToRelative(5.899f, 6.317f)
                close()
                moveTo(23.644f, 22.593f)
                curveToRelative(-0.717f, -2.836f, -2.519f, -7.592f, -6.54f, -7.592f)
                curveToRelative(-2.263f, 0.0f, -4.104f, 2.019f, -4.104f, 4.5f)
                curveToRelative(0.0f, 2.535f, 2.511f, 4.5f, 4.671f, 4.5f)
                horizontalLineToRelative(6.329f)
                lineToRelative(-0.356f, -1.408f)
                close()
            }
        }
        .build()
        return _pencilPaintbrush!!
    }

private var _pencilPaintbrush: ImageVector? = null
