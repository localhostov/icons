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

public val Icons.Filled.SkullCow: ImageVector
    get() {
        if (_skullCow != null) {
            return _skullCow!!
        }
        _skullCow = Builder(name = "SkullCow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 0.0f)
                curveToRelative(0.0f, 2.609f, 2.009f, 4.758f, 4.562f, 4.981f)
                lineToRelative(-2.337f, 6.196f)
                curveToRelative(-0.664f, 1.895f, 0.19f, 4.001f, 1.986f, 4.899f)
                lineToRelative(1.928f, 0.683f)
                lineToRelative(1.552f, 7.241f)
                horizontalLineToRelative(8.617f)
                lineToRelative(1.552f, -7.241f)
                lineToRelative(1.811f, -0.633f)
                lineToRelative(0.117f, -0.05f)
                curveToRelative(1.796f, -0.898f, 2.65f, -3.005f, 1.979f, -4.922f)
                lineToRelative(-2.328f, -6.174f)
                curveToRelative(2.552f, -0.223f, 4.562f, -2.371f, 4.562f, -4.981f)
                close()
                moveTo(8.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _skullCow!!
    }

private var _skullCow: ImageVector? = null
