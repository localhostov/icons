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

public val Icons.Outline.SquareX: ImageVector
    get() {
        if (_squareX != null) {
            return _squareX!!
        }
        _squareX = Builder(name = "SquareX", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(17.769f, 6.641f)
                lineToRelative(-4.466f, 5.359f)
                lineToRelative(4.466f, 5.359f)
                curveToRelative(0.354f, 0.425f, 0.296f, 1.056f, -0.128f, 1.409f)
                curveToRelative(-0.188f, 0.155f, -0.414f, 0.231f, -0.64f, 0.231f)
                curveToRelative(-0.287f, 0.0f, -0.571f, -0.122f, -0.77f, -0.359f)
                lineToRelative(-4.231f, -5.078f)
                lineToRelative(-4.231f, 5.078f)
                curveToRelative(-0.198f, 0.237f, -0.482f, 0.359f, -0.77f, 0.359f)
                curveToRelative(-0.226f, 0.0f, -0.452f, -0.076f, -0.64f, -0.231f)
                curveToRelative(-0.424f, -0.354f, -0.481f, -0.984f, -0.128f, -1.409f)
                lineToRelative(4.466f, -5.359f)
                lineToRelative(-4.466f, -5.359f)
                curveToRelative(-0.354f, -0.425f, -0.296f, -1.056f, 0.128f, -1.409f)
                curveToRelative(0.426f, -0.353f, 1.056f, -0.296f, 1.409f, 0.128f)
                lineToRelative(4.231f, 5.078f)
                lineToRelative(4.231f, -5.078f)
                curveToRelative(0.354f, -0.424f, 0.983f, -0.48f, 1.409f, -0.128f)
                curveToRelative(0.424f, 0.354f, 0.481f, 0.984f, 0.128f, 1.409f)
                close()
            }
        }
        .build()
        return _squareX!!
    }

private var _squareX: ImageVector? = null
