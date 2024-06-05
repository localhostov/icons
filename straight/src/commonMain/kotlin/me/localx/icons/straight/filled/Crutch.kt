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

public val Icons.Filled.Crutch: ImageVector
    get() {
        if (_crutch != null) {
            return _crutch!!
        }
        _crutch = Builder(name = "Crutch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.964f, 9.037f)
                lineTo(14.964f, 0.037f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(0.964f, 0.964f)
                lineToRelative(-5.5f, 5.501f)
                curveToRelative(-1.943f, 1.943f, -3.014f, 4.526f, -3.014f, 7.275f)
                verticalLineToRelative(1.395f)
                lineTo(0.025f, 22.561f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.975f, -5.975f)
                horizontalLineToRelative(1.396f)
                curveToRelative(2.748f, 0.0f, 5.332f, -1.07f, 7.275f, -3.014f)
                lineToRelative(5.5f, -5.5f)
                lineToRelative(0.965f, 0.965f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(-0.809f)
                curveToRelative(0.0f, -1.877f, 0.625f, -3.655f, 1.768f, -5.108f)
                lineToRelative(4.15f, 4.149f)
                curveToRelative(-1.453f, 1.142f, -3.231f, 1.767f, -5.107f, 1.767f)
                horizontalLineToRelative(-0.81f)
                close()
                moveTo(15.378f, 12.865f)
                lineToRelative(-4.243f, -4.243f)
                lineToRelative(4.793f, -4.794f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-4.793f, 4.793f)
                close()
            }
        }
        .build()
        return _crutch!!
    }

private var _crutch: ImageVector? = null
