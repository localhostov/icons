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
                moveToRelative(10.0f, 13.999f)
                verticalLineToRelative(-2.499f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.501f, -1.5f)
                lineToRelative(4.499f, 0.002f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.897f, 2.0f, 2.002f)
                lineToRelative(-0.002f, 5.206f)
                curveToRelative(0.0f, 0.624f, -0.69f, 1.001f, -1.215f, 0.665f)
                lineToRelative(-2.283f, -1.874f)
                horizontalLineToRelative(-2.499f)
                curveToRelative(-1.105f, 0.0f, -2.001f, -0.896f, -2.001f, -2.001f)
                close()
                moveTo(2.999f, 11.57f)
                curveToRelative(0.225f, -4.806f, 4.174f, -8.57f, 8.99f, -8.57f)
                curveToRelative(1.687f, 0.0f, 3.322f, 0.473f, 4.735f, 1.348f)
                lineToRelative(-0.939f, 0.939f)
                curveToRelative(-0.632f, 0.632f, -0.184f, 1.714f, 0.71f, 1.714f)
                horizontalLineToRelative(4.49f)
                curveToRelative(0.554f, 0.0f, 1.004f, -0.449f, 1.004f, -1.004f)
                lineTo(21.989f, 1.506f)
                curveToRelative(0.0f, -0.894f, -1.081f, -1.342f, -1.713f, -0.71f)
                lineToRelative(-1.393f, 1.393f)
                curveToRelative(-2.01f, -1.414f, -4.408f, -2.189f, -6.893f, -2.189f)
                curveTo(5.567f, 0.0f, 0.302f, 5.021f, 0.001f, 11.43f)
                curveToRelative(-0.039f, 0.828f, 0.672f, 1.532f, 1.5f, 1.57f)
                curveToRelative(0.796f, 0.0f, 1.46f, -0.626f, 1.498f, -1.43f)
                close()
                moveTo(22.547f, 11.002f)
                curveToRelative(-0.822f, -0.021f, -1.53f, 0.601f, -1.569f, 1.428f)
                curveToRelative(-0.225f, 4.806f, -4.174f, 8.57f, -8.99f, 8.57f)
                curveToRelative(-1.687f, 0.0f, -3.322f, -0.473f, -4.735f, -1.348f)
                lineToRelative(0.939f, -0.939f)
                curveToRelative(0.632f, -0.632f, 0.184f, -1.714f, -0.71f, -1.714f)
                lineTo(2.992f, 16.999f)
                curveToRelative(-0.554f, 0.0f, -1.004f, 0.449f, -1.004f, 1.004f)
                verticalLineToRelative(4.491f)
                curveToRelative(0.0f, 0.894f, 1.081f, 1.342f, 1.713f, 0.71f)
                lineToRelative(1.393f, -1.393f)
                curveToRelative(2.01f, 1.414f, 4.408f, 2.189f, 6.893f, 2.189f)
                curveToRelative(6.421f, 0.0f, 11.687f, -5.021f, 11.987f, -11.43f)
                curveToRelative(0.039f, -0.828f, -0.601f, -1.53f, -1.428f, -1.568f)
                close()
                moveTo(11.503f, 8.0f)
                horizontalLineToRelative(2.498f)
                curveToRelative(0.0f, -1.105f, -0.896f, -2.001f, -2.002f, -2.0f)
                lineToRelative(-3.998f, 0.002f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.896f, -2.0f, 2.001f)
                verticalLineToRelative(5.206f)
                curveToRelative(0.001f, 0.624f, 0.691f, 1.001f, 1.216f, 0.665f)
                lineToRelative(0.783f, -0.643f)
                verticalLineToRelative(-1.592f)
                curveToRelative(0.0f, -0.814f, 0.224f, -1.63f, 0.723f, -2.272f)
                curveToRelative(0.681f, -0.877f, 1.691f, -1.368f, 2.776f, -1.368f)
                horizontalLineToRelative(0.004f)
                close()
            }
        }
        .build()
        return _feedbackCycleLoop!!
    }

private var _feedbackCycleLoop: ImageVector? = null
