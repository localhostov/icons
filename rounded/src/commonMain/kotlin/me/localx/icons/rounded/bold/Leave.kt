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

public val Icons.Bold.Leave: ImageVector
    get() {
        if (_leave != null) {
            return _leave!!
        }
        _leave = Builder(name = "Leave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(18.0f, 19.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(0.0f, 5.711f)
                curveTo(0.0f, 3.336f, 1.69f, 1.274f, 4.02f, 0.809f)
                lineTo(7.617f, 0.089f)
                curveToRelative(1.326f, -0.268f, 2.689f, 0.074f, 3.736f, 0.933f)
                curveToRelative(0.344f, 0.282f, 0.619f, 0.62f, 0.861f, 0.979f)
                horizontalLineToRelative(1.285f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(10.0f, 4.501f)
                curveToRelative(0.0f, -0.451f, -0.2f, -0.874f, -0.549f, -1.159f)
                curveToRelative(-0.349f, -0.286f, -0.802f, -0.398f, -1.246f, -0.312f)
                lineToRelative(-3.598f, 0.72f)
                curveToRelative(-0.932f, 0.187f, -1.608f, 1.011f, -1.608f, 1.961f)
                verticalLineToRelative(15.289f)
                horizontalLineToRelative(7.0f)
                lineTo(9.999f, 4.501f)
                close()
                moveTo(23.773f, 13.906f)
                lineToRelative(-2.45f, -2.658f)
                curveToRelative(-0.488f, -0.529f, -1.322f, -0.154f, -1.322f, 0.594f)
                verticalLineToRelative(1.158f)
                horizontalLineToRelative(-3.501f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.501f)
                verticalLineToRelative(1.158f)
                curveToRelative(0.0f, 0.749f, 0.834f, 1.123f, 1.322f, 0.594f)
                lineToRelative(2.45f, -2.658f)
                curveToRelative(0.302f, -0.328f, 0.302f, -0.86f, 0.0f, -1.188f)
                close()
            }
        }
        .build()
        return _leave!!
    }

private var _leave: ImageVector? = null
