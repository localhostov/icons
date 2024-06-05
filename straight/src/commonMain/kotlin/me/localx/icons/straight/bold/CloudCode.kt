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

public val Icons.Bold.CloudCode: ImageVector
    get() {
        if (_cloudCode != null) {
            return _cloudCode!!
        }
        _cloudCode = Builder(name = "CloudCode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.212f, 14.044f)
                lineToRelative(1.896f, 1.896f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.257f, -2.257f)
                curveToRelative(-0.471f, -0.471f, -0.729f, -1.096f, -0.729f, -1.76f)
                reflectiveCurveToRelative(0.259f, -1.291f, 0.729f, -1.761f)
                lineToRelative(2.254f, -2.254f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.893f, 1.894f)
                close()
                moveTo(15.016f, 10.029f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(1.893f, 1.894f)
                lineToRelative(-1.896f, 1.896f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.258f, -2.258f)
                curveToRelative(0.47f, -0.47f, 0.728f, -1.095f, 0.728f, -1.759f)
                reflectiveCurveToRelative(-0.259f, -1.291f, -0.729f, -1.76f)
                lineToRelative(-2.255f, -2.255f)
                close()
                moveTo(24.0f, 14.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -1.811f, 0.827f, -3.502f, 2.213f, -4.63f)
                curveToRelative(-0.133f, -0.859f, -0.213f, -1.795f, -0.213f, -2.37f)
                curveTo(2.0f, 4.514f, 5.554f, 1.0f, 10.091f, 1.0f)
                curveToRelative(3.25f, 0.0f, 6.225f, 2.084f, 7.524f, 5.171f)
                curveToRelative(3.651f, 0.754f, 6.385f, 4.018f, 6.385f, 7.829f)
                close()
                moveTo(21.0f, 14.0f)
                curveToRelative(0.0f, -2.593f, -2.026f, -4.78f, -4.611f, -4.979f)
                lineToRelative(-1.21f, -0.093f)
                lineToRelative(-0.149f, -1.105f)
                curveToRelative(-0.708f, -2.221f, -2.768f, -3.822f, -4.939f, -3.822f)
                curveToRelative(-2.902f, 0.0f, -5.091f, 2.149f, -5.091f, 5.0f)
                curveToRelative(0.0f, 0.611f, 0.147f, 1.954f, 0.329f, 2.704f)
                lineToRelative(0.273f, 1.124f)
                lineToRelative(-1.017f, 0.55f)
                curveToRelative(-0.978f, 0.529f, -1.585f, 1.534f, -1.585f, 2.622f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _cloudCode!!
    }

private var _cloudCode: ImageVector? = null
