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

public val Icons.Outline.EmptySet: ImageVector
    get() {
        if (_emptySet != null) {
            return _emptySet!!
        }
        _emptySet = Builder(name = "EmptySet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 0.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-3.259f, 3.259f)
                curveToRelative(-1.908f, -1.592f, -4.36f, -2.552f, -7.034f, -2.552f)
                curveTo(5.935f, 1.0f, 1.0f, 5.935f, 1.0f, 12.0f)
                curveToRelative(0.0f, 2.673f, 0.961f, 5.125f, 2.552f, 7.034f)
                lineToRelative(-3.259f, 3.259f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(3.259f, -3.259f)
                curveToRelative(1.908f, 1.592f, 4.36f, 2.552f, 7.034f, 2.552f)
                curveToRelative(6.065f, 0.0f, 11.0f, -4.935f, 11.0f, -11.0f)
                curveToRelative(0.0f, -2.673f, -0.961f, -5.125f, -2.552f, -7.034f)
                lineToRelative(3.259f, -3.259f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.038f, 7.038f, 3.0f, 12.0f, 3.0f)
                curveToRelative(2.122f, 0.0f, 4.071f, 0.742f, 5.611f, 1.975f)
                lineToRelative(-12.636f, 12.636f)
                curveToRelative(-1.233f, -1.54f, -1.975f, -3.489f, -1.975f, -5.611f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                curveToRelative(-2.122f, 0.0f, -4.071f, -0.742f, -5.611f, -1.975f)
                lineToRelative(12.636f, -12.636f)
                curveToRelative(1.233f, 1.54f, 1.975f, 3.489f, 1.975f, 5.611f)
                close()
            }
        }
        .build()
        return _emptySet!!
    }

private var _emptySet: ImageVector? = null
