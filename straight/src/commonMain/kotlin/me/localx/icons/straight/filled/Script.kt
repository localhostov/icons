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

public val Icons.Filled.Script: ImageVector
    get() {
        if (_script != null) {
            return _script!!
        }
        _script = Builder(name = "Script", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 1.5f)
                curveTo(0.0f, 0.672f, 0.672f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 19.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.924f, -0.28f, 1.784f, -0.76f, 2.5f)
                horizontalLineToRelative(9.26f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(24.0f, 2.537f)
                curveToRelative(0.0f, 0.678f, -0.264f, 1.316f, -0.744f, 1.795f)
                lineToRelative(-6.667f, 6.667f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                lineTo(19.666f, 0.742f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0.0f)
                curveToRelative(0.479f, 0.479f, 0.744f, 1.117f, 0.744f, 1.795f)
                close()
                moveTo(17.418f, 12.999f)
                horizontalLineToRelative(-6.419f)
                verticalLineToRelative(-6.418f)
                lineTo(17.335f, 0.245f)
                curveToRelative(-0.419f, -0.149f, -0.864f, -0.245f, -1.335f, -0.245f)
                lineTo(4.662f, 0.0f)
                curveToRelative(0.217f, 0.455f, 0.338f, 0.964f, 0.338f, 1.5f)
                verticalLineToRelative(19.857f)
                curveToRelative(0.0f, 1.308f, 0.941f, 2.5f, 2.242f, 2.63f)
                curveToRelative(1.496f, 0.15f, 2.758f, -1.021f, 2.758f, -2.487f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.583f)
                lineToRelative(-2.582f, 2.582f)
                close()
            }
        }
        .build()
        return _script!!
    }

private var _script: ImageVector? = null
