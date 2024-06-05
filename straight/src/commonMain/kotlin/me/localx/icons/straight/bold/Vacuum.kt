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

public val Icons.Bold.Vacuum: ImageVector
    get() {
        if (_vacuum != null) {
            return _vacuum!!
        }
        _vacuum = Builder(name = "Vacuum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(20.0f, 7.501f)
                verticalLineToRelative(-3.001f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-4.398f)
                curveToRelative(-2.226f, 0.0f, -4.141f, 1.661f, -4.455f, 3.864f)
                lineToRelative(-2.448f, 17.141f)
                lineToRelative(-4.204f, 0.018f)
                lineToRelative(0.012f, 3.0f)
                lineToRelative(6.796f, -0.027f)
                lineToRelative(2.815f, -19.707f)
                curveToRelative(0.104f, -0.734f, 0.743f, -1.288f, 1.484f, -1.288f)
                horizontalLineToRelative(4.398f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(4.023f)
                curveToRelative(-0.633f, -0.838f, -1.023f, -1.869f, -1.023f, -3.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(1.131f, 0.0f, 2.162f, 0.39f, 3.0f, 1.023f)
                verticalLineToRelative(-3.523f)
                curveToRelative(0.0f, -2.698f, -1.654f, -5.017f, -4.0f, -5.999f)
                close()
            }
        }
        .build()
        return _vacuum!!
    }

private var _vacuum: ImageVector? = null
