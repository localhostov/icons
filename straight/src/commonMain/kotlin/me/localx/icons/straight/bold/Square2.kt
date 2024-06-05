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

public val Icons.Bold.Square2: ImageVector
    get() {
        if (_square2 != null) {
            return _square2!!
        }
        _square2 = Builder(name = "Square2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(20.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(24.0f, 24.0f)
                close()
                moveTo(3.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(17.0f, 16.0f)
                horizontalLineToRelative(-5.28f)
                curveToRelative(0.186f, -0.099f, 0.383f, -0.202f, 0.592f, -0.31f)
                curveToRelative(1.979f, -1.021f, 4.688f, -2.418f, 4.688f, -5.69f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.301f, -0.981f, 1.95f, -3.064f, 3.024f)
                curveToRelative(-1.753f, 0.904f, -3.936f, 2.03f, -3.936f, 4.476f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _square2!!
    }

private var _square2: ImageVector? = null
