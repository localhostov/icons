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

public val Icons.Filled.CatalogAlt: ImageVector
    get() {
        if (_catalogAlt != null) {
            return _catalogAlt!!
        }
        _catalogAlt = Builder(name = "CatalogAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 21.927f)
                lineToRelative(-3.0f, 2.073f)
                lineTo(0.043f, 24.0f)
                lineToRelative(-0.043f, -21.647f)
                lineTo(3.202f, 0.266f)
                curveToRelative(0.257f, -0.127f, 0.525f, -0.217f, 0.798f, -0.285f)
                verticalLineToRelative(21.946f)
                close()
                moveTo(6.0f, 22.0f)
                lineToRelative(4.0f, 1.898f)
                lineTo(10.0f, 1.469f)
                lineTo(6.744f, 0.266f)
                curveToRelative(-0.24f, -0.118f, -0.491f, -0.199f, -0.744f, -0.266f)
                verticalLineToRelative(22.0f)
                close()
                moveTo(24.0f, 2.909f)
                verticalLineToRelative(19.017f)
                lineToRelative(-12.0f, 2.074f)
                lineTo(12.0f, 1.544f)
                lineTo(20.57f, 0.047f)
                curveToRelative(0.85f, -0.151f, 1.721f, 0.075f, 2.385f, 0.63f)
                curveToRelative(0.664f, 0.554f, 1.045f, 1.368f, 1.045f, 2.232f)
                close()
                moveTo(20.0f, 16.431f)
                lineToRelative(-6.0f, 1.095f)
                verticalLineToRelative(2.037f)
                lineToRelative(6.0f, -1.095f)
                verticalLineToRelative(-2.037f)
                close()
                moveTo(22.0f, 12.048f)
                lineToRelative(-8.0f, 1.478f)
                verticalLineToRelative(2.037f)
                lineToRelative(8.0f, -1.478f)
                verticalLineToRelative(-2.037f)
                close()
                moveTo(22.0f, 8.048f)
                lineToRelative(-8.0f, 1.478f)
                verticalLineToRelative(2.037f)
                lineToRelative(8.0f, -1.478f)
                verticalLineToRelative(-2.037f)
                close()
                moveTo(22.0f, 4.0f)
                lineToRelative(-8.0f, 1.478f)
                verticalLineToRelative(2.037f)
                lineToRelative(8.0f, -1.478f)
                verticalLineToRelative(-2.037f)
                close()
            }
        }
        .build()
        return _catalogAlt!!
    }

private var _catalogAlt: ImageVector? = null
