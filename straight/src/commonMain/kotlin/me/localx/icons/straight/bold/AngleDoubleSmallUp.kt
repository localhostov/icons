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

public val Icons.Bold.AngleDoubleSmallUp: ImageVector
    get() {
        if (_angleDoubleSmallUp != null) {
            return _angleDoubleSmallUp!!
        }
        _angleDoubleSmallUp = Builder(name = "AngleDoubleSmallUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.928f, 12.111f)
                lineToRelative(-4.928f, -4.928f)
                lineToRelative(-4.928f, 4.928f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(5.281f, -5.281f)
                curveToRelative(0.943f, -0.944f, 2.592f, -0.944f, 3.535f, 0.0f)
                lineToRelative(5.281f, 5.281f)
                lineToRelative(-2.121f, 2.121f)
                close()
                moveTo(19.049f, 17.359f)
                lineToRelative(-5.867f, -5.867f)
                curveToRelative(-0.629f, -0.635f, -1.738f, -0.631f, -2.359f, -0.004f)
                lineToRelative(-5.871f, 5.871f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(4.928f, -4.927f)
                lineToRelative(4.928f, 4.927f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(11.064f, 13.616f)
                lineToRelative(-0.007f, -0.007f)
                lineToRelative(0.007f, 0.007f)
                close()
                moveTo(12.941f, 13.612f)
                lineToRelative(0.007f, -0.007f)
                lineToRelative(-0.007f, 0.007f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallUp!!
    }

private var _angleDoubleSmallUp: ImageVector? = null
