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
                moveToRelative(16.655f, 13.551f)
                lineToRelative(5.604f, -3.736f)
                lineToRelative(-1.109f, -1.664f)
                lineToRelative(-3.995f, 2.664f)
                lineToRelative(-1.816f, -2.534f)
                curveToRelative(-0.486f, -0.937f, -1.295f, -1.651f, -2.223f, -1.992f)
                curveToRelative(-0.683f, -0.31f, -1.379f, -0.372f, -2.074f, -0.184f)
                curveToRelative(-0.873f, 0.235f, -1.601f, 0.835f, -2.023f, 1.701f)
                lineToRelative(-2.646f, 6.35f)
                curveToRelative(-0.734f, 1.497f, -0.4f, 2.787f, 1.041f, 3.961f)
                lineToRelative(5.047f, 3.883f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.801f)
                lineToRelative(-4.521f, -3.478f)
                lineToRelative(3.245f, -7.88f)
                lineToRelative(1.932f, 2.71f)
                close()
                moveTo(13.0f, 2.468f)
                curveTo(13.0f, 1.087f, 14.119f, -0.032f, 15.5f, -0.032f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _personPraying!!
    }

private var _personPraying: ImageVector? = null
