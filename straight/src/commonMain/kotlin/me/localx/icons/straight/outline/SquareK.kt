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

public val Icons.Outline.SquareK: ImageVector
    get() {
        if (_squareK != null) {
            return _squareK!!
        }
        _squareK = Builder(name = "SquareK", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.548f, 11.096f)
                lineToRelative(4.952f, 7.904f)
                horizontalLineToRelative(-2.333f)
                lineToRelative(-4.389f, -7.0f)
                horizontalLineToRelative(-3.778f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.892f)
                lineToRelative(3.658f, -5.0f)
                horizontalLineToRelative(2.45f)
                lineToRelative(-4.452f, 6.096f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(21.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 3.0f)
                close()
            }
        }
        .build()
        return _squareK!!
    }

private var _squareK: ImageVector? = null
