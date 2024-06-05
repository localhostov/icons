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

public val Icons.Filled.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) {
            return _pencilRuler!!
        }
        _pencilRuler = Builder(name = "PencilRuler", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.313f, 9.396f)
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
                moveTo(9.735f, 4.829f)
                lineToRelative(-2.828f, 2.828f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.828f, -2.828f)
                lineTo(4.897f, -0.009f)
                lineTo(0.877f, 4.011f)
                curveTo(-0.292f, 5.181f, -0.292f, 7.084f, 0.877f, 8.254f)
                lineToRelative(4.176f, 4.176f)
                lineToRelative(6.141f, -6.141f)
                lineToRelative(-1.46f, -1.46f)
                close()
                moveTo(17.702f, 12.805f)
                lineToRelative(-6.141f, 6.141f)
                lineToRelative(4.176f, 4.176f)
                curveToRelative(1.17f, 1.17f, 3.073f, 1.17f, 4.243f, 0.0f)
                lineToRelative(4.02f, -4.02f)
                lineToRelative(-3.424f, -3.424f)
                lineToRelative(-2.828f, 2.828f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.828f, -2.828f)
                lineToRelative(-1.46f, -1.46f)
                close()
            }
        }
        .build()
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
