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

public val Icons.Bold.Marketplace: ImageVector
    get() {
        if (_marketplace != null) {
            return _marketplace!!
        }
        _marketplace = Builder(name = "Marketplace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(9.259f)
                curveToRelative(-0.066f, -0.23f, -0.135f, -0.46f, -0.17f, -0.702f)
                lineToRelative(-0.337f, -2.298f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(4.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.0f, 9.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                horizontalLineToRelative(-1.961f)
                lineToRelative(1.029f, 7.008f)
                curveToRelative(0.25f, 1.706f, 1.739f, 2.992f, 3.462f, 2.992f)
                horizontalLineToRelative(4.944f)
                curveToRelative(1.724f, 0.0f, 3.212f, -1.286f, 3.462f, -2.991f)
                lineToRelative(1.03f, -7.009f)
                horizontalLineToRelative(-1.967f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(19.97f, 20.573f)
                curveToRelative(-0.036f, 0.244f, -0.249f, 0.427f, -0.495f, 0.427f)
                horizontalLineToRelative(-4.944f)
                curveToRelative(-0.246f, 0.0f, -0.458f, -0.184f, -0.495f, -0.427f)
                lineToRelative(-0.524f, -3.573f)
                horizontalLineToRelative(6.983f)
                lineToRelative(-0.525f, 3.573f)
                close()
            }
        }
        .build()
        return _marketplace!!
    }

private var _marketplace: ImageVector? = null
