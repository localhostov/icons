package me.localx.icons.straight.outline

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

public val Icons.Outline.PuzzleAlt: ImageVector
    get() {
        if (_puzzleAlt != null) {
            return _puzzleAlt!!
        }
        _puzzleAlt = Builder(name = "PuzzleAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 4.0f)
                close()
                moveTo(2.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.285f)
                curveToRelative(0.178f, -0.587f, 0.285f, -1.172f, 0.285f, -1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.328f, 0.106f, 0.913f, 0.285f, 1.5f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(9.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.285f)
                curveToRelative(-0.587f, -0.178f, -1.172f, -0.285f, -1.5f, -0.285f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.328f, 0.0f, 0.913f, -0.106f, 1.5f, -0.285f)
                verticalLineToRelative(2.285f)
                close()
                moveTo(13.285f, 15.0f)
                curveToRelative(-0.178f, 0.587f, -0.285f, 1.172f, -0.285f, 1.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.328f, -0.106f, -0.913f, -0.285f, -1.5f)
                horizontalLineToRelative(2.285f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.285f)
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
