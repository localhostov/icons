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
                moveToRelative(13.0f, 18.901f)
                verticalLineToRelative(3.099f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.099f)
                curveToRelative(-3.387f, -0.488f, -6.0f, -3.401f, -6.0f, -6.92f)
                lineToRelative(0.452f, -4.981f)
                horizontalLineToRelative(13.099f)
                lineToRelative(0.445f, 4.89f)
                curveToRelative(0.004f, 3.602f, -2.61f, 6.522f, -5.996f, 7.011f)
                close()
                moveTo(18.369f, 5.0f)
                lineToRelative(-0.455f, -5.0f)
                lineTo(6.087f, -0.0f)
                lineToRelative(-0.454f, 5.0f)
                horizontalLineToRelative(12.735f)
                close()
            }
        }
        .build()
        return _glassChampagne!!
    }

private var _glassChampagne: ImageVector? = null
