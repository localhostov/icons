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

public val Icons.Bold.PaperPlaneLaunch: ImageVector
    get() {
        if (_paperPlaneLaunch != null) {
            return _paperPlaneLaunch!!
        }
        _paperPlaneLaunch = Builder(name = "PaperPlaneLaunch", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 5.41f)
                lineToRelative(-1.5f, -4.37f)
                curveToRelative(0.0f, -0.177f, 0.045f, -0.351f, 0.131f, -0.505f)
                curveToRelative(0.279f, -0.502f, 0.912f, -0.683f, 1.415f, -0.404f)
                lineToRelative(11.454f, 6.368f)
                lineToRelative(-11.456f, 6.37f)
                curveToRelative(-0.321f, 0.179f, -0.714f, 0.174f, -1.029f, -0.015f)
                curveToRelative(-0.077f, -0.045f, -0.148f, -0.1f, -0.212f, -0.163f)
                curveToRelative(-0.194f, -0.195f, -0.303f, -0.459f, -0.302f, -0.734f)
                lineToRelative(1.499f, -4.457f)
                lineToRelative(8.5f, -1.0f)
                lineToRelative(-8.5f, -1.09f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.5f, 15.0f)
                lineTo(6.5f, 15.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(2.916f, 5.0f, 0.0f, 7.916f, 0.0f, 11.5f)
                reflectiveCurveToRelative(2.916f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _paperPlaneLaunch!!
    }

private var _paperPlaneLaunch: ImageVector? = null
