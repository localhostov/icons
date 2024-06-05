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

public val Icons.Bold.SquareW: ImageVector
    get() {
        if (_squareW != null) {
            return _squareW!!
        }
        _squareW = Builder(name = "SquareW", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(18.982f, 6.729f)
                lineToRelative(-1.604f, 10.421f)
                curveToRelative(-0.152f, 0.997f, -0.93f, 1.741f, -1.934f, 1.852f)
                curveToRelative(-1.009f, 0.107f, -1.924f, -0.449f, -2.289f, -1.39f)
                lineToRelative(-1.156f, -2.974f)
                lineToRelative(-1.156f, 2.975f)
                curveToRelative(-0.335f, 0.861f, -1.136f, 1.402f, -2.039f, 1.402f)
                curveToRelative(-1.143f, 0.0f, -2.031f, -0.868f, -2.184f, -1.866f)
                lineToRelative(-1.604f, -10.42f)
                curveToRelative(-0.126f, -0.819f, 0.436f, -1.585f, 1.254f, -1.711f)
                curveToRelative(0.822f, -0.125f, 1.585f, 0.435f, 1.711f, 1.254f)
                lineToRelative(1.148f, 7.466f)
                lineToRelative(1.471f, -3.781f)
                curveToRelative(0.225f, -0.576f, 0.78f, -0.956f, 1.398f, -0.956f)
                reflectiveCurveToRelative(1.174f, 0.38f, 1.398f, 0.956f)
                lineToRelative(1.471f, 3.781f)
                lineToRelative(1.148f, -7.466f)
                curveToRelative(0.126f, -0.819f, 0.886f, -1.38f, 1.711f, -1.254f)
                curveToRelative(0.818f, 0.126f, 1.38f, 0.892f, 1.254f, 1.711f)
                close()
            }
        }
        .build()
        return _squareW!!
    }

private var _squareW: ImageVector? = null
