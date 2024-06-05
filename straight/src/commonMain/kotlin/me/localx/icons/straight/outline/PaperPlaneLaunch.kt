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

public val Icons.Outline.PaperPlaneLaunch: ImageVector
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
                moveTo(11.5f, 6.661f)
                lineToRelative(-1.5f, -4.701f)
                curveToRelative(0.0f, -1.191f, 0.886f, -1.749f, 1.384f, -1.891f)
                curveToRelative(0.492f, -0.139f, 1.003f, -0.07f, 1.443f, 0.197f)
                lineToRelative(11.102f, 6.732f)
                lineToRelative(-11.104f, 6.735f)
                curveToRelative(-0.292f, 0.178f, -0.618f, 0.267f, -0.943f, 0.267f)
                curveToRelative(-1.881f, 0.0f, -1.883f, -1.46f, -1.881f, -1.968f)
                lineToRelative(1.5f, -4.694f)
                verticalLineToRelative(-0.678f)
                close()
                moveTo(12.126f, 2.181f)
                lineToRelative(1.239f, 3.75f)
                lineToRelative(4.635f, 1.07f)
                lineToRelative(-4.635f, 1.07f)
                lineToRelative(-1.239f, 3.749f)
                lineToRelative(7.945f, -4.819f)
                lineToRelative(-7.945f, -4.818f)
                close()
            }
        }
        .build()
        return _paperPlaneLaunch!!
    }

private var _paperPlaneLaunch: ImageVector? = null
