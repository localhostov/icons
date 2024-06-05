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

public val Icons.Filled.GlassChampagne: ImageVector
    get() {
        if (_glassChampagne != null) {
            return _glassChampagne!!
        }
        _glassChampagne = Builder(name = "GlassChampagne", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.633f, 5.0f)
                lineToRelative(0.206f, -2.272f)
                curveToRelative(0.142f, -1.555f, 1.426f, -2.728f, 2.988f, -2.728f)
                horizontalLineToRelative(6.348f)
                curveToRelative(1.562f, 0.0f, 2.846f, 1.173f, 2.988f, 2.728f)
                lineToRelative(0.207f, 2.272f)
                lineTo(5.633f, 5.0f)
                close()
                moveTo(18.997f, 11.89f)
                lineToRelative(-0.445f, -4.89f)
                lineTo(5.451f, 7.0f)
                lineToRelative(-0.451f, 4.981f)
                curveToRelative(0.0f, 3.52f, 2.612f, 6.442f, 6.0f, 6.928f)
                verticalLineToRelative(3.091f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.091f)
                curveToRelative(3.388f, -0.487f, 6.0f, -3.416f, 5.996f, -7.019f)
                close()
            }
        }
        .build()
        return _glassChampagne!!
    }

private var _glassChampagne: ImageVector? = null
