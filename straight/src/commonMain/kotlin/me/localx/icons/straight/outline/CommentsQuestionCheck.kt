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

public val Icons.Outline.CommentsQuestionCheck: ImageVector
    get() {
        if (_commentsQuestionCheck != null) {
            return _commentsQuestionCheck!!
        }
        _commentsQuestionCheck = Builder(name = "CommentsQuestionCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.955f, 0.0f, -5.535f, -1.615f, -6.92f, -4.004f)
                curveToRelative(0.769f, -0.006f, 1.518f, -0.091f, 2.242f, -0.248f)
                curveToRelative(1.101f, 1.371f, 2.787f, 2.252f, 4.678f, 2.252f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.891f, -0.881f, -3.577f, -2.252f, -4.678f)
                curveToRelative(0.156f, -0.724f, 0.242f, -1.473f, 0.248f, -2.242f)
                curveToRelative(2.389f, 1.385f, 4.004f, 3.965f, 4.004f, 6.92f)
                close()
                moveTo(12.062f, 17.452f)
                curveToRelative(-0.957f, 0.348f, -1.985f, 0.548f, -3.062f, 0.548f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 9.0f)
                curveTo(0.0f, 4.037f, 4.037f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                curveToRelative(0.0f, 3.132f, -1.61f, 5.892f, -4.043f, 7.504f)
                lineToRelative(1.532f, 1.485f)
                lineToRelative(3.812f, -3.704f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.793f, 3.707f)
                curveToRelative(-0.385f, 0.385f, -0.894f, 0.578f, -1.403f, 0.578f)
                curveToRelative(-0.513f, 0.0f, -1.026f, -0.195f, -1.417f, -0.586f)
                lineToRelative(-2.024f, -1.962f)
                close()
                moveTo(9.0f, 16.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(2.0f, 5.141f, 2.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(9.536f, 4.048f)
                curveToRelative(-0.886f, -0.161f, -1.783f, 0.081f, -2.464f, 0.653f)
                curveToRelative(-0.682f, 0.572f, -1.072f, 1.41f, -1.072f, 2.299f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.297f, 0.131f, -0.576f, 0.358f, -0.767f)
                curveToRelative(0.229f, -0.194f, 0.522f, -0.273f, 0.832f, -0.216f)
                curveToRelative(0.391f, 0.068f, 0.724f, 0.401f, 0.793f, 0.794f)
                curveToRelative(0.093f, 0.53f, -0.213f, 0.905f, -0.502f, 1.065f)
                curveToRelative(-0.845f, 0.465f, -1.481f, 1.595f, -1.481f, 2.628f)
                verticalLineToRelative(0.495f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.495f)
                curveToRelative(0.0f, -0.312f, 0.26f, -0.773f, 0.447f, -0.876f)
                curveToRelative(1.125f, -0.621f, 1.729f, -1.893f, 1.506f, -3.163f)
                curveToRelative(-0.212f, -1.212f, -1.207f, -2.207f, -2.417f, -2.418f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _commentsQuestionCheck!!
    }

private var _commentsQuestionCheck: ImageVector? = null
