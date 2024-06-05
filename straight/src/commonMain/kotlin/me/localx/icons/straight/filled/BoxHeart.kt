package me.localx.icons.straight.filled

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

public val Icons.Filled.BoxHeart: ImageVector
    get() {
        if (_boxHeart != null) {
            return _boxHeart!!
        }
        _boxHeart = Builder(name = "BoxHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 24.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-14.0f)
                lineTo(1.0f, 10.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(0.782f, 0.0f, 1.477f, 0.27f, 2.0f, 0.727f)
                curveToRelative(0.523f, -0.457f, 1.218f, -0.727f, 2.0f, -0.727f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.417f, 3.0f, 3.16f)
                curveToRelative(0.0f, 2.729f, -4.002f, 5.386f, -4.458f, 5.681f)
                lineToRelative(-0.542f, 0.349f)
                lineToRelative(-0.542f, -0.349f)
                curveToRelative(-0.457f, -0.294f, -4.458f, -2.952f, -4.458f, -5.681f)
                curveToRelative(0.0f, -1.743f, 1.346f, -3.16f, 3.0f, -3.16f)
                close()
                moveTo(9.0f, 16.16f)
                curveToRelative(0.0f, -0.64f, 0.449f, -1.16f, 1.0f, -1.16f)
                curveToRelative(0.498f, 0.0f, 1.0f, 0.309f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.691f, 0.502f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.521f, 1.0f, 1.16f)
                curveToRelative(0.0f, 1.04f, -1.611f, 2.617f, -3.0f, 3.626f)
                curveToRelative(-1.389f, -1.01f, -3.0f, -2.586f, -3.0f, -3.626f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _boxHeart!!
    }

private var _boxHeart: ImageVector? = null
