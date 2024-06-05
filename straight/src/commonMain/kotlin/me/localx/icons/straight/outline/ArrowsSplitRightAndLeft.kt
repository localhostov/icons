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

public val Icons.Outline.ArrowsSplitRightAndLeft: ImageVector
    get() {
        if (_arrowsSplitRightAndLeft != null) {
            return _arrowsSplitRightAndLeft!!
        }
        _arrowsSplitRightAndLeft = Builder(name = "ArrowsSplitRightAndLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.414f, 7.414f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.5f, -3.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(3.0f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.586f, 7.414f)
                curveToRelative(-0.78f, -0.779f, -0.78f, -2.049f, 0.0f, -2.828f)
                lineTo(5.086f, 0.086f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.5f, 3.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.641f, 0.0f, 3.088f, 0.806f, 4.0f, 2.031f)
                curveToRelative(0.912f, -1.225f, 2.359f, -2.031f, 4.0f, -2.031f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(18.914f, 0.086f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.78f, 0.779f, 0.78f, 2.049f, 0.0f, 2.828f)
                close()
            }
        }
        .build()
        return _arrowsSplitRightAndLeft!!
    }

private var _arrowsSplitRightAndLeft: ImageVector? = null
