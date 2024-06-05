package me.localx.icons.rounded.filled

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

public val Icons.Filled.PuzzleAlt: ImageVector
    get() {
        if (_puzzleAlt != null) {
            return _puzzleAlt!!
        }
        _puzzleAlt = Builder(name = "PuzzleAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.785f)
                curveToRelative(0.178f, 0.587f, 0.285f, 1.172f, 0.285f, 1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.328f, 0.106f, -0.913f, 0.285f, -1.5f)
                horizontalLineToRelative(-1.785f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.785f)
                curveToRelative(0.587f, 0.178f, 1.172f, 0.285f, 1.5f, 0.285f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.328f, 0.0f, -0.913f, 0.106f, -1.5f, 0.285f)
                lineTo(15.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(3.285f, 13.0f)
                curveToRelative(-0.178f, -0.587f, -0.285f, -1.172f, -0.285f, -1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.328f, -0.106f, 0.913f, -0.285f, 1.5f)
                horizontalLineToRelative(3.285f)
                lineTo(9.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.5f)
                curveTo(1.791f, 4.0f, 0.0f, 5.791f, 0.0f, 8.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.285f, 13.0f)
                close()
                moveTo(18.5f, 15.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(11.0f, 15.0f)
                horizontalLineToRelative(3.285f)
                curveToRelative(-0.178f, 0.587f, -0.285f, 1.172f, -0.285f, 1.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.328f, -0.106f, -0.913f, -0.285f, -1.5f)
                horizontalLineToRelative(1.785f)
                close()
                moveTo(9.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(3.285f)
                curveToRelative(-0.587f, -0.178f, -1.172f, -0.285f, -1.5f, -0.285f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.328f, 0.0f, 0.913f, -0.106f, 1.5f, -0.285f)
                verticalLineToRelative(3.285f)
                close()
            }
        }
        .build()
        return _puzzleAlt!!
    }

private var _puzzleAlt: ImageVector? = null
