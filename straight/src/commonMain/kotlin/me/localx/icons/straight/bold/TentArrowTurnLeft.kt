package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.TentArrowTurnLeft: ImageVector
    get() {
        if (_tentArrowTurnLeft != null) {
            return _tentArrowTurnLeft!!
        }
        _tentArrowTurnLeft = Builder(name = "TentArrowTurnLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 2.982f)
                horizontalLineTo(4.0f)
                verticalLineTo(-0.018f)
                lineTo(0.293f, 3.775f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(3.707f, 3.793f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(14.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(4.518f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.518f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                lineTo(2.427f, 19.574f)
                curveToRelative(-0.554f, 0.908f, -0.573f, 2.004f, -0.053f, 2.931f)
                curveToRelative(0.524f, 0.934f, 1.523f, 1.514f, 2.606f, 1.514f)
                horizontalLineToRelative(14.039f)
                curveToRelative(1.083f, 0.0f, 2.082f, -0.58f, 2.606f, -1.515f)
                curveToRelative(0.521f, -0.927f, 0.501f, -2.022f, -0.082f, -2.977f)
                lineTo(12.0f, 6.0f)
                close()
                moveTo(15.262f, 21.024f)
                lineToRelative(-3.262f, -4.524f)
                lineToRelative(-3.268f, 4.534f)
                lineToRelative(-3.679f, 0.006f)
                lineToRelative(6.947f, -9.597f)
                lineToRelative(6.935f, 9.576f)
                lineToRelative(-3.673f, 0.006f)
                close()
            }
        }
        .build()
        return _tentArrowTurnLeft!!
    }

private var _tentArrowTurnLeft: ImageVector? = null
