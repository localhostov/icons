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

public val Icons.Bold.PuzzleAlt: ImageVector
    get() {
        if (_puzzleAlt != null) {
            return _puzzleAlt!!
        }
        _puzzleAlt = Builder(name = "PuzzleAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                lineTo(3.389f, 5.0f)
                curveToRelative(-1.869f, 0.0f, -3.389f, 1.521f, -3.389f, 3.389f)
                verticalLineToRelative(15.611f)
                lineTo(19.0f, 24.0f)
                lineTo(19.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(3.0f, 8.389f)
                curveToRelative(0.0f, -0.214f, 0.174f, -0.389f, 0.389f, -0.389f)
                horizontalLineToRelative(4.611f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.285f)
                curveToRelative(0.178f, -0.587f, 0.285f, -1.172f, 0.285f, -1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.328f, 0.106f, 0.913f, 0.285f, 1.5f)
                horizontalLineToRelative(-1.285f)
                verticalLineToRelative(-4.611f)
                close()
                moveTo(8.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.285f)
                curveToRelative(-0.587f, -0.178f, -1.172f, -0.285f, -1.5f, -0.285f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.328f, 0.0f, 0.913f, -0.106f, 1.5f, -0.285f)
                verticalLineToRelative(1.285f)
                close()
                moveTo(12.285f, 16.0f)
                curveToRelative(-0.178f, 0.587f, -0.285f, 1.172f, -0.285f, 1.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.328f, -0.106f, -0.913f, -0.285f, -1.5f)
                horizontalLineToRelative(1.285f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.285f)
                close()
                moveTo(24.0f, 9.0f)
                horizontalLineToRelative(-3.285f)
                curveToRelative(0.178f, 0.587f, 0.285f, 1.172f, 0.285f, 1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.328f, 0.106f, -0.913f, 0.285f, -1.5f)
                horizontalLineToRelative(-3.285f)
                verticalLineToRelative(-3.285f)
                curveToRelative(0.587f, 0.178f, 1.172f, 0.285f, 1.5f, 0.285f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.328f, 0.0f, -0.913f, 0.106f, -1.5f, 0.285f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _puzzleAlt!!
    }

private var _puzzleAlt: ImageVector? = null
