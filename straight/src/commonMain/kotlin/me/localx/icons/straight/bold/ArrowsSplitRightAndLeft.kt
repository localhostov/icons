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

public val Icons.Bold.ArrowsSplitRightAndLeft: ImageVector
    get() {
        if (_arrowsSplitRightAndLeft != null) {
            return _arrowsSplitRightAndLeft!!
        }
        _arrowsSplitRightAndLeft = Builder(name = "ArrowsSplitRightAndLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.642f, 6.364f)
                lineToRelative(-4.642f, 4.636f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(9.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.358f, 6.364f)
                curveToRelative(-0.477f, -0.477f, -0.477f, -1.251f, 0.0f, -1.728f)
                lineTo(5.0f, 0.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.577f, 0.0f, 2.996f, 0.671f, 4.0f, 1.737f)
                curveToRelative(1.004f, -1.066f, 2.423f, -1.737f, 4.0f, -1.737f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                lineToRelative(4.642f, 4.636f)
                curveToRelative(0.477f, 0.477f, 0.477f, 1.251f, 0.0f, 1.728f)
                close()
            }
        }
        .build()
        return _arrowsSplitRightAndLeft!!
    }

private var _arrowsSplitRightAndLeft: ImageVector? = null
