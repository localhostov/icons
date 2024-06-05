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

public val Icons.Filled.PaperPlaneLaunch: ImageVector
    get() {
        if (_paperPlaneLaunch != null) {
            return _paperPlaneLaunch!!
        }
        _paperPlaneLaunch = Builder(name = "PaperPlaneLaunch", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(19.5f, 7.0f)
                lineToRelative(-8.231f, 1.295f)
                lineToRelative(-1.269f, 3.738f)
                curveToRelative(-0.002f, 0.508f, 0.0f, 1.968f, 1.881f, 1.968f)
                curveToRelative(0.326f, 0.0f, 0.651f, -0.089f, 0.943f, -0.267f)
                lineToRelative(11.104f, -6.735f)
                lineTo(12.827f, 0.267f)
                curveTo(12.57f, 0.11f, 12.289f, 0.003f, 12.0f, 0.003f)
                curveTo(10.0f, 0.003f, 10.0f, 1.64f, 10.0f, 1.96f)
                lineToRelative(1.256f, 3.784f)
                lineToRelative(8.244f, 1.256f)
                close()
            }
        }
        .build()
        return _paperPlaneLaunch!!
    }

private var _paperPlaneLaunch: ImageVector? = null
