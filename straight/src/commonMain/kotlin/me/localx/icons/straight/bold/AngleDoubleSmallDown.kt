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

public val Icons.Bold.AngleDoubleSmallDown: ImageVector
    get() {
        if (_angleDoubleSmallDown != null) {
            return _angleDoubleSmallDown!!
        }
        _angleDoubleSmallDown = Builder(name = "AngleDoubleSmallDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.033f)
                curveToRelative(-0.445f, 0.0f, -0.864f, -0.173f, -1.178f, -0.488f)
                lineTo(4.951f, 6.674f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(4.928f, 4.928f)
                lineToRelative(4.928f, -4.928f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-5.87f, 5.871f)
                curveToRelative(-0.315f, 0.315f, -0.733f, 0.488f, -1.179f, 0.488f)
                close()
                moveTo(13.725f, 19.311f)
                lineToRelative(5.345f, -5.344f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-4.991f, 4.991f)
                lineToRelative(-4.896f, -4.896f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(5.25f, 5.25f)
                curveToRelative(0.472f, 0.472f, 1.1f, 0.732f, 1.768f, 0.732f)
                reflectiveCurveToRelative(1.296f, -0.26f, 1.768f, -0.732f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallDown!!
    }

private var _angleDoubleSmallDown: ImageVector? = null
