package me.localx.icons.straight.outline

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

public val Icons.Outline.GlassChampagne: ImageVector
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
                curveToRelative(3.387f, -0.488f, 6.0f, -3.409f, 5.996f, -7.011f)
                lineToRelative(-1.083f, -11.89f)
                lineTo(6.087f, -0.0f)
                lineToRelative(-1.087f, 11.981f)
                curveToRelative(0.0f, 3.519f, 2.613f, 6.432f, 6.0f, 6.92f)
                verticalLineToRelative(3.099f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.099f)
                close()
                moveTo(16.087f, 2.0f)
                lineToRelative(0.274f, 3.0f)
                lineTo(7.64f, 5.0f)
                lineToRelative(0.273f, -3.0f)
                horizontalLineToRelative(8.174f)
                close()
                moveTo(6.996f, 12.072f)
                lineToRelative(0.462f, -5.072f)
                horizontalLineToRelative(9.087f)
                lineToRelative(0.455f, 4.981f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.004f, -4.909f)
                close()
            }
        }
        .build()
        return _glassChampagne!!
    }

private var _glassChampagne: ImageVector? = null
