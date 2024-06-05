package me.localx.icons.straight.bold

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

public val Icons.Bold.GlassChampagne: ImageVector
    get() {
        if (_glassChampagne != null) {
            return _glassChampagne!!
        }
        _glassChampagne = Builder(name = "GlassChampagne", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 18.838f)
                curveToRelative(3.141f, -0.689f, 5.5f, -3.493f, 5.5f, -6.838f)
                lineToRelative(-1.136f, -12.0f)
                lineTo(6.136f, 0.0f)
                lineToRelative(-1.136f, 12.0f)
                curveToRelative(0.0f, 3.345f, 2.359f, 6.149f, 5.5f, 6.838f)
                verticalLineToRelative(2.162f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2.162f)
                close()
                moveTo(15.136f, 3.0f)
                lineToRelative(0.19f, 2.0f)
                horizontalLineToRelative(-6.653f)
                lineToRelative(0.19f, -2.0f)
                horizontalLineToRelative(6.272f)
                close()
                moveTo(8.0f, 12.065f)
                lineToRelative(0.387f, -4.065f)
                horizontalLineToRelative(7.225f)
                lineToRelative(0.387f, 4.065f)
                curveToRelative(-0.035f, 2.176f, -1.816f, 3.935f, -4.0f, 3.935f)
                reflectiveCurveToRelative(-3.964f, -1.759f, -4.0f, -3.935f)
                close()
            }
        }
        .build()
        return _glassChampagne!!
    }

private var _glassChampagne: ImageVector? = null
