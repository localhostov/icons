package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.LoopSquare: ImageVector
    get() {
        if (_loopSquare != null) {
            return _loopSquare!!
        }
        _loopSquare = Builder(name = "LoopSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.918f, 10.0f)
                horizontalLineToRelative(-1.918f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 3.584f, -2.916f, 6.5f, -6.5f, 6.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-1.918f)
                curveToRelative(-0.962f, 0.0f, -1.444f, -1.164f, -0.764f, -1.844f)
                lineToRelative(3.417f, -3.241f)
                curveToRelative(0.422f, -0.422f, 1.106f, -0.422f, 1.528f, 0.0f)
                lineToRelative(3.417f, 3.241f)
                curveToRelative(0.681f, 0.681f, 0.199f, 1.844f, -0.764f, 1.844f)
                close()
                moveTo(9.682f, 15.844f)
                curveToRelative(0.681f, -0.681f, 0.199f, -1.844f, -0.764f, -1.844f)
                horizontalLineToRelative(-1.918f)
                lineTo(7.0f, 6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-1.918f)
                curveToRelative(-0.962f, 0.0f, -1.444f, 1.164f, -0.764f, 1.844f)
                lineToRelative(3.417f, 3.241f)
                curveToRelative(0.422f, 0.422f, 1.106f, 0.422f, 1.528f, 0.0f)
                lineToRelative(3.417f, -3.241f)
                close()
            }
        }
        .build()
        return _loopSquare!!
    }

private var _loopSquare: ImageVector? = null
