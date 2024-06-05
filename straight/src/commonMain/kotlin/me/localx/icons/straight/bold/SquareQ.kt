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

public val Icons.Bold.SquareQ: ImageVector
    get() {
        if (_squareQ != null) {
            return _squareQ!!
        }
        _squareQ = Builder(name = "SquareQ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.989f, 12.952f)
                verticalLineToRelative(-1.903f)
                curveToRelative(0.0f, -3.335f, -2.687f, -6.048f, -5.989f, -6.048f)
                reflectiveCurveToRelative(-6.011f, 2.713f, -6.011f, 6.048f)
                verticalLineToRelative(1.903f)
                curveToRelative(0.0f, 3.335f, 2.696f, 6.048f, 6.011f, 6.048f)
                curveToRelative(1.109f, 0.0f, 2.148f, -0.306f, 3.04f, -0.839f)
                lineToRelative(1.399f, 1.399f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.408f, -1.408f)
                curveToRelative(0.531f, -0.903f, 0.837f, -1.956f, 0.837f, -3.08f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.66f, 0.0f, -3.011f, -1.367f, -3.011f, -3.048f)
                verticalLineToRelative(-1.903f)
                curveToRelative(0.0f, -1.681f, 1.351f, -3.048f, 3.011f, -3.048f)
                curveToRelative(1.676f, 0.0f, 2.989f, 1.339f, 2.989f, 3.048f)
                verticalLineToRelative(1.903f)
                curveToRelative(0.0f, 0.283f, -0.037f, 0.555f, -0.104f, 0.812f)
                lineToRelative(-1.325f, -1.325f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(1.339f, 1.339f)
                curveToRelative(-0.247f, 0.066f, -0.508f, 0.101f, -0.778f, 0.101f)
                close()
                moveTo(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
            }
        }
        .build()
        return _squareQ!!
    }

private var _squareQ: ImageVector? = null
