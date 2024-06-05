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

public val Icons.Bold.FeedbackCycleLoop: ImageVector
    get() {
        if (_feedbackCycleLoop != null) {
            return _feedbackCycleLoop!!
        }
        _feedbackCycleLoop = Builder(name = "FeedbackCycleLoop", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(3.204f, 0.0f, 6.238f, 1.302f, 8.47f, 3.53f)
                lineToRelative(2.53f, -2.53f)
                verticalLineToRelative(5.909f)
                curveToRelative(0.0f, 0.603f, -0.488f, 1.091f, -1.091f, 1.091f)
                horizontalLineToRelative(-5.909f)
                lineToRelative(2.352f, -2.352f)
                curveToRelative(-1.674f, -1.671f, -3.95f, -2.648f, -6.352f, -2.648f)
                curveTo(7.038f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                close()
                moveTo(16.783f, 17.874f)
                curveToRelative(0.526f, 0.336f, 1.215f, -0.041f, 1.215f, -0.665f)
                lineToRelative(0.002f, -5.707f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.499f, -1.5f)
                lineToRelative(-5.001f, -0.003f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4.5f)
                lineToRelative(2.283f, 1.874f)
                close()
                moveTo(11.502f, 8.0f)
                horizontalLineToRelative(2.498f)
                reflectiveCurveToRelative(0.0f, -0.5f, 0.0f, -0.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.501f, -1.5f)
                lineToRelative(-5.001f, 0.003f)
                curveToRelative(-0.828f, 0.0f, -1.499f, 0.672f, -1.498f, 1.5f)
                verticalLineToRelative(5.707f)
                curveToRelative(0.001f, 0.624f, 0.691f, 1.001f, 1.216f, 0.665f)
                lineToRelative(0.783f, -0.643f)
                verticalLineToRelative(-1.732f)
                curveToRelative(0.0f, -0.936f, 0.365f, -1.815f, 1.027f, -2.477f)
                curveToRelative(0.661f, -0.66f, 1.539f, -1.023f, 2.472f, -1.023f)
                horizontalLineToRelative(0.004f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                curveToRelative(-2.402f, 0.0f, -4.678f, -0.976f, -6.352f, -2.648f)
                lineToRelative(2.352f, -2.352f)
                lineTo(2.091f, 16.0f)
                curveToRelative(-0.602f, 0.0f, -1.091f, 0.488f, -1.091f, 1.091f)
                verticalLineToRelative(5.909f)
                lineToRelative(2.53f, -2.53f)
                curveToRelative(2.232f, 2.228f, 5.266f, 3.53f, 8.47f, 3.53f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _feedbackCycleLoop!!
    }

private var _feedbackCycleLoop: ImageVector? = null
