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

public val Icons.Filled.GrinSquint: ImageVector
    get() {
        if (_grinSquint != null) {
            return _grinSquint!!
        }
        _grinSquint = Builder(name = "GrinSquint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(16.375f, 6.219f)
                lineTo(17.625f, 7.781f)
                lineTo(16.1f, 9.0f)
                lineToRelative(1.524f, 1.219f)
                lineToRelative(-1.25f, 1.562f)
                lineTo(12.9f, 9.0f)
                close()
                moveTo(6.375f, 7.781f)
                lineTo(7.625f, 6.219f)
                lineTo(11.1f, 9.0f)
                lineTo(7.625f, 11.781f)
                lineToRelative(-1.25f, -1.562f)
                lineTo(7.9f, 9.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.336f, 0.0f, -5.392f, -2.72f, -6.007f, -5.0f)
                arcToRelative(21.841f, 21.841f, 0.0f, false, false, 6.0f, 1.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, false, 18.0f, 14.0f)
                curveTo(17.385f, 16.28f, 15.336f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _grinSquint!!
    }

private var _grinSquint: ImageVector? = null
