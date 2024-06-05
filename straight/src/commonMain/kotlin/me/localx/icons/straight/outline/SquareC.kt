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

public val Icons.Outline.SquareC: ImageVector
    get() {
        if (_squareC != null) {
            return _squareC!!
        }
        _squareC = Builder(name = "SquareC", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                close()
                moveTo(8.0f, 10.909f)
                verticalLineToRelative(2.182f)
                curveToRelative(0.0f, 2.156f, 1.73f, 3.909f, 3.858f, 3.909f)
                horizontalLineToRelative(0.545f)
                curveToRelative(1.469f, 0.0f, 2.801f, -0.812f, 3.476f, -2.117f)
                lineToRelative(1.776f, 0.918f)
                curveToRelative(-1.02f, 1.973f, -3.032f, 3.199f, -5.252f, 3.199f)
                horizontalLineToRelative(-0.545f)
                curveToRelative(-3.23f, 0.0f, -5.858f, -2.651f, -5.858f, -5.909f)
                verticalLineToRelative(-2.182f)
                curveToRelative(0.0f, -3.258f, 2.628f, -5.909f, 5.858f, -5.909f)
                horizontalLineToRelative(0.545f)
                curveToRelative(2.26f, 0.0f, 4.289f, 1.258f, 5.294f, 3.282f)
                lineToRelative(-1.791f, 0.89f)
                curveToRelative(-0.666f, -1.339f, -2.008f, -2.172f, -3.503f, -2.172f)
                horizontalLineToRelative(-0.545f)
                curveToRelative(-2.127f, 0.0f, -3.858f, 1.753f, -3.858f, 3.909f)
                close()
            }
        }
        .build()
        return _squareC!!
    }

private var _squareC: ImageVector? = null
