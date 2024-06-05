package me.localx.icons.rounded.outline

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

public val Icons.Outline.SquareW: ImageVector
    get() {
        if (_squareW != null) {
            return _squareW!!
        }
        _squareW = Builder(name = "SquareW", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(18.988f, 6.152f)
                lineToRelative(-1.749f, 11.354f)
                curveToRelative(-0.122f, 0.798f, -0.739f, 1.494f, -1.751f, 1.494f)
                curveToRelative(-0.724f, 0.0f, -1.364f, -0.433f, -1.634f, -1.122f)
                lineToRelative(-1.854f, -4.764f)
                lineToRelative(-1.854f, 4.764f)
                curveToRelative(-0.294f, 0.754f, -1.046f, 1.188f, -1.836f, 1.111f)
                curveToRelative(-0.804f, -0.089f, -1.427f, -0.686f, -1.549f, -1.484f)
                lineToRelative(-1.749f, -11.353f)
                curveToRelative(-0.084f, -0.546f, 0.29f, -1.057f, 0.836f, -1.141f)
                curveToRelative(0.55f, -0.08f, 1.057f, 0.29f, 1.141f, 0.836f)
                lineToRelative(1.614f, 10.48f)
                lineToRelative(2.466f, -6.333f)
                curveToRelative(0.149f, -0.384f, 0.52f, -0.637f, 0.932f, -0.637f)
                reflectiveCurveToRelative(0.782f, 0.253f, 0.932f, 0.637f)
                lineToRelative(2.466f, 6.333f)
                lineToRelative(1.614f, -10.48f)
                curveToRelative(0.084f, -0.546f, 0.598f, -0.917f, 1.141f, -0.836f)
                curveToRelative(0.546f, 0.084f, 0.92f, 0.595f, 0.836f, 1.141f)
                close()
            }
        }
        .build()
        return _squareW!!
    }

private var _squareW: ImageVector? = null
