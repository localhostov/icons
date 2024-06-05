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

public val Icons.Outline.SkullCow: ImageVector
    get() {
        if (_skullCow != null) {
            return _skullCow!!
        }
        _skullCow = Builder(name = "SkullCow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.438f, 4.981f)
                lineToRelative(2.328f, 6.174f)
                curveToRelative(0.672f, 1.917f, -0.183f, 4.023f, -1.979f, 4.922f)
                lineToRelative(-1.928f, 0.683f)
                lineToRelative(-1.552f, 7.241f)
                lineTo(7.691f, 24.001f)
                lineToRelative(-1.552f, -7.241f)
                lineToRelative(-1.928f, -0.683f)
                curveToRelative(-1.796f, -0.898f, -2.65f, -3.005f, -1.986f, -4.899f)
                lineToRelative(2.337f, -6.196f)
                curveTo(2.009f, 4.758f, 0.0f, 2.609f, 0.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.609f, -2.009f, 4.758f, -4.562f, 4.981f)
                close()
                moveTo(19.886f, 11.837f)
                lineToRelative(-2.578f, -6.837f)
                lineTo(6.691f, 5.0f)
                lineToRelative(-2.587f, 6.859f)
                curveToRelative(-0.317f, 0.907f, 0.087f, 1.938f, 0.951f, 2.401f)
                lineToRelative(2.805f, 0.98f)
                lineToRelative(1.448f, 6.759f)
                horizontalLineToRelative(5.383f)
                lineToRelative(1.448f, -6.759f)
                lineToRelative(2.805f, -0.98f)
                curveToRelative(0.863f, -0.463f, 1.269f, -1.494f, 0.942f, -2.424f)
                close()
            }
        }
        .build()
        return _skullCow!!
    }

private var _skullCow: ImageVector? = null
