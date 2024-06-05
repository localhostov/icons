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

public val Icons.Filled.PersonPraying: ImageVector
    get() {
        if (_personPraying != null) {
            return _personPraying!!
        }
        _personPraying = Builder(name = "PersonPraying", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 2.468f)
                curveTo(13.0f, 1.087f, 14.119f, -0.032f, 15.5f, -0.032f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(21.663f, 9.748f)
                lineToRelative(-3.207f, 2.843f)
                curveToRelative(-0.035f, 0.032f, -0.072f, 0.061f, -0.112f, 0.086f)
                curveToRelative(-0.879f, 0.583f, -2.048f, 0.364f, -2.66f, -0.5f)
                lineToRelative(-1.261f, -1.813f)
                lineToRelative(-3.385f, 7.673f)
                lineToRelative(4.355f, 3.272f)
                curveToRelative(0.52f, 0.383f, 0.732f, 1.053f, 0.53f, 1.666f)
                curveToRelative(-0.201f, 0.613f, -0.771f, 1.024f, -1.415f, 1.024f)
                lineTo(4.983f, 23.999f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.976f)
                lineToRelative(-5.51f, -4.062f)
                curveToRelative(-1.458f, -1.187f, -1.791f, -2.477f, -1.057f, -3.974f)
                lineToRelative(2.649f, -6.169f)
                curveToRelative(0.418f, -0.855f, 1.146f, -1.455f, 2.019f, -1.69f)
                curveToRelative(0.685f, -0.185f, 1.402f, -0.122f, 2.074f, 0.184f)
                curveToRelative(0.928f, 0.34f, 1.736f, 1.055f, 2.223f, 1.992f)
                lineToRelative(1.918f, 2.685f)
                lineToRelative(3.062f, -2.714f)
                curveToRelative(0.411f, -0.366f, 1.045f, -0.33f, 1.411f, 0.084f)
                curveToRelative(0.366f, 0.414f, 0.328f, 1.045f, -0.085f, 1.412f)
                close()
            }
        }
        .build()
        return _personPraying!!
    }

private var _personPraying: ImageVector? = null
