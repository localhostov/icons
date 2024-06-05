package me.localx.icons.rounded.bold

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
                moveToRelative(15.5f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.166f)
                curveToRelative(3.141f, -0.689f, 5.5f, -3.49f, 5.5f, -6.834f)
                curveToRelative(0.0f, -0.047f, -0.834f, -8.832f, -0.834f, -8.832f)
                curveToRelative(-0.172f, -1.806f, -1.669f, -3.168f, -3.484f, -3.168f)
                horizontalLineToRelative(-5.363f)
                curveToRelative(-1.814f, 0.0f, -3.312f, 1.362f, -3.484f, 3.168f)
                curveToRelative(0.0f, 0.0f, -0.834f, 8.784f, -0.834f, 8.832f)
                curveToRelative(0.0f, 3.345f, 2.359f, 6.145f, 5.5f, 6.834f)
                verticalLineToRelative(2.166f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.318f, 3.0f)
                horizontalLineToRelative(5.363f)
                curveToRelative(0.259f, 0.0f, 0.473f, 0.194f, 0.498f, 0.453f)
                lineToRelative(0.147f, 1.547f)
                horizontalLineToRelative(-6.653f)
                lineToRelative(0.147f, -1.547f)
                curveToRelative(0.024f, -0.258f, 0.238f, -0.453f, 0.498f, -0.453f)
                close()
                moveTo(8.0f, 12.066f)
                lineToRelative(0.387f, -4.066f)
                horizontalLineToRelative(7.225f)
                lineToRelative(0.387f, 4.066f)
                curveToRelative(-0.035f, 2.175f, -1.816f, 3.934f, -4.0f, 3.934f)
                reflectiveCurveToRelative(-3.964f, -1.759f, -4.0f, -3.934f)
                close()
            }
        }
        .build()
        return _glassChampagne!!
    }

private var _glassChampagne: ImageVector? = null
