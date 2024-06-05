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

public val Icons.Filled.FishCooked: ImageVector
    get() {
        if (_fishCooked != null) {
            return _fishCooked!!
        }
        _fishCooked = Builder(name = "FishCooked", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.698f, 12.0f)
                horizontalLineToRelative(2.302f)
                curveToRelative(0.0f, 1.0f, -0.135f, 3.393f, -0.253f, 3.997f)
                curveToRelative(-0.227f, 1.161f, -1.259f, 2.003f, -2.455f, 2.003f)
                horizontalLineToRelative(-1.245f)
                curveToRelative(0.8f, -1.689f, 1.345f, -3.678f, 1.651f, -6.0f)
                close()
                moveTo(12.0f, 5.302f)
                verticalLineToRelative(-2.302f)
                curveToRelative(-3.0f, 0.0f, -7.048f, 1.081f, -8.378f, 1.775f)
                curveToRelative(-1.0f, 0.522f, -1.622f, 1.544f, -1.622f, 2.666f)
                verticalLineToRelative(2.473f)
                curveToRelative(2.241f, -2.517f, 5.49f, -4.017f, 10.0f, -4.612f)
                close()
                moveTo(24.0f, 6.857f)
                curveToRelative(0.0f, 0.685f, -0.341f, 1.143f, -1.026f, 1.143f)
                horizontalLineToRelative(-5.99f)
                curveToRelative(-0.165f, 7.694f, -2.268f, 12.197f, -7.148f, 14.369f)
                curveToRelative(0.0f, 0.0f, -0.825f, 0.397f, -1.875f, 0.696f)
                curveToRelative(-2.19f, 0.639f, -4.824f, 0.934f, -7.961f, 0.934f)
                curveToRelative(0.0f, -3.133f, 0.295f, -5.765f, 0.932f, -7.953f)
                curveToRelative(0.237f, -0.649f, 0.477f, -1.458f, 0.696f, -1.877f)
                curveToRelative(2.171f, -4.884f, 6.675f, -6.989f, 14.372f, -7.154f)
                lineTo(16.0f, 1.026f)
                curveToRelative(0.0f, -0.685f, 0.458f, -1.026f, 1.143f, -1.026f)
                curveToRelative(1.143f, 0.0f, 3.429f, 0.888f, 3.429f, 3.429f)
                curveToRelative(2.541f, 0.0f, 3.429f, 2.286f, 3.429f, 3.429f)
                close()
                moveTo(7.624f, 19.21f)
                lineToRelative(-2.834f, -2.835f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.834f, 2.835f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(11.207f, 16.793f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(13.624f, 13.21f)
                lineToRelative(-2.834f, -2.835f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.834f, 2.835f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _fishCooked!!
    }

private var _fishCooked: ImageVector? = null
