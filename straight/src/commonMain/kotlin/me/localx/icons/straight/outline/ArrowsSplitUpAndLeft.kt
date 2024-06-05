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

public val Icons.Outline.ArrowsSplitUpAndLeft: ImageVector
    get() {
        if (_arrowsSplitUpAndLeft != null) {
            return _arrowsSplitUpAndLeft!!
        }
        _arrowsSplitUpAndLeft = Builder(name = "ArrowsSplitUpAndLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(2.949f)
                lineToRelative(3.761f, 3.796f)
                lineToRelative(-1.421f, 1.407f)
                lineTo(0.612f, 14.483f)
                curveToRelative(-0.816f, -0.816f, -0.816f, -2.15f, 0.003f, -2.969f)
                lineTo(5.29f, 6.796f)
                lineToRelative(1.421f, 1.407f)
                lineToRelative(-3.761f, 3.796f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.949f)
                lineToRelative(-3.796f, 3.761f)
                lineToRelative(-1.407f, -1.421f)
                lineTo(11.517f, 0.612f)
                curveToRelative(0.816f, -0.816f, 2.149f, -0.816f, 2.969f, 0.003f)
                lineToRelative(4.717f, 4.674f)
                lineToRelative(-1.407f, 1.421f)
                lineToRelative(-3.796f, -3.761f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _arrowsSplitUpAndLeft!!
    }

private var _arrowsSplitUpAndLeft: ImageVector? = null
