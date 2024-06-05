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

public val Icons.Filled.GrinHearts: ImageVector
    get() {
        if (_grinHearts != null) {
            return _grinHearts!!
        }
        _grinHearts = Builder(name = "GrinHearts", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(6.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 8.5f)
                curveToRelative(0.446f, -3.382f, 6.459f, -0.619f, 0.0f, 3.75f)
                curveToRelative(0.0f, 0.0f, -3.0f, -2.0f, -3.0f, -3.75f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 7.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.336f, 0.0f, -5.392f, -2.72f, -6.007f, -5.0f)
                arcToRelative(21.841f, 21.841f, 0.0f, false, false, 6.0f, 1.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, false, 18.0f, 14.0f)
                curveTo(17.385f, 16.28f, 15.336f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(16.0f, 12.25f)
                curveToRelative(-6.452f, -4.357f, -0.457f, -7.139f, 0.0f, -3.75f)
                curveTo(16.446f, 5.118f, 22.459f, 7.881f, 16.0f, 12.25f)
                close()
            }
        }
        .build()
        return _grinHearts!!
    }

private var _grinHearts: ImageVector? = null
