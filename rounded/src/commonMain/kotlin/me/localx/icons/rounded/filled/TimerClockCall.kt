package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.TimerClockCall: ImageVector
    get() {
        if (_timerClockCall != null) {
            return _timerClockCall!!
        }
        _timerClockCall = Builder(name = "TimerClockCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.657f, 14.856f)
                curveToRelative(-1.193f, -1.142f, -3.09f, -1.138f, -4.28f, 0.006f)
                lineToRelative(-1.906f, 1.606f)
                curveToRelative(-3.198f, -1.357f, -5.474f, -3.637f, -6.932f, -6.945f)
                lineToRelative(1.6f, -1.897f)
                curveToRelative(0.557f, -0.579f, 0.863f, -1.339f, 0.863f, -2.145f)
                reflectiveCurveToRelative(-0.304f, -1.559f, -0.857f, -2.138f)
                curveToRelative(0.0f, 0.0f, -1.852f, -2.407f, -1.883f, -2.438f)
                curveToRelative(-1.207f, -1.207f, -3.17f, -1.206f, -4.327f, -0.047f)
                lineToRelative(-1.15f, 1.004f)
                curveTo(0.635f, 3.012f, 0.001f, 4.565f, 0.001f, 6.238f)
                curveTo(0.001f, 13.874f, 10.127f, 24.0f, 17.763f, 24.0f)
                curveToRelative(1.673f, 0.0f, 3.227f, -0.634f, 4.421f, -1.833f)
                lineToRelative(0.912f, -1.05f)
                curveToRelative(1.205f, -1.207f, 1.205f, -3.171f, 0.0f, -4.378f)
                curveToRelative(-0.031f, -0.03f, -2.439f, -1.883f, -2.439f, -1.883f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.239f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.239f, 5.0f, -5.0f)
                reflectiveCurveTo(21.761f, 0.0f, 19.0f, 0.0f)
                close()
                moveTo(19.586f, 7.0f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _timerClockCall!!
    }

private var _timerClockCall: ImageVector? = null
