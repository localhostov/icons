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

public val Icons.Outline.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = Builder(name = "Function", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.895f, 13.0f)
                horizontalLineToRelative(-2.522f)
                lineToRelative(-1.028f, 7.54f)
                curveToRelative(-0.27f, 1.973f, -1.973f, 3.46f, -3.963f, 3.46f)
                horizontalLineToRelative(-2.381f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.381f)
                curveToRelative(0.995f, 0.0f, 1.847f, -0.744f, 1.982f, -1.73f)
                lineToRelative(0.991f, -7.27f)
                horizontalLineToRelative(-3.031f)
                lineToRelative(0.286f, -2.0f)
                horizontalLineToRelative(3.018f)
                lineToRelative(1.028f, -7.54f)
                curveToRelative(0.27f, -1.973f, 1.973f, -3.46f, 3.963f, -3.46f)
                horizontalLineToRelative(2.381f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.381f)
                curveToRelative(-0.995f, 0.0f, -1.847f, 0.744f, -1.982f, 1.73f)
                lineToRelative(-0.991f, 7.27f)
                horizontalLineToRelative(2.535f)
                lineToRelative(-0.286f, 2.0f)
                close()
                moveTo(20.885f, 15.0f)
                horizontalLineToRelative(-2.331f)
                lineToRelative(-1.554f, 2.58f)
                lineToRelative(-1.619f, -2.58f)
                horizontalLineToRelative(-2.331f)
                lineToRelative(2.778f, 4.497f)
                lineToRelative(-2.778f, 4.503f)
                horizontalLineToRelative(2.327f)
                lineToRelative(1.623f, -2.587f)
                lineToRelative(1.558f, 2.587f)
                horizontalLineToRelative(2.327f)
                lineToRelative(-2.713f, -4.503f)
                lineToRelative(2.713f, -4.497f)
                close()
            }
        }
        .build()
        return _function!!
    }

private var _function: ImageVector? = null
