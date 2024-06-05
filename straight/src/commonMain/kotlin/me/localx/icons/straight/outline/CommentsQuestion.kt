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

public val Icons.Outline.CommentsQuestion: ImageVector
    get() {
        if (_commentsQuestion != null) {
            return _commentsQuestion!!
        }
        _commentsQuestion = Builder(name = "CommentsQuestion", defaultWidth = 512.0.dp,
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
                moveTo(18.0f, 9.0f)
                curveTo(18.0f, 4.037f, 13.963f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.037f, 0.0f, 9.0f)
                verticalLineToRelative(9.0f)
                lineTo(9.0f, 18.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, -4.037f, 9.0f, -9.0f)
                close()
                moveTo(2.0f, 9.0f)
                curveToRelative(0.0f, -3.859f, 3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(10.0f, 10.505f)
                curveToRelative(0.0f, -0.312f, 0.26f, -0.773f, 0.447f, -0.876f)
                curveToRelative(1.124f, -0.621f, 1.729f, -1.892f, 1.506f, -3.164f)
                curveToRelative(-0.213f, -1.212f, -1.208f, -2.206f, -2.417f, -2.417f)
                curveToRelative(-0.886f, -0.161f, -1.783f, 0.081f, -2.463f, 0.653f)
                curveToRelative(-0.682f, 0.572f, -1.072f, 1.41f, -1.072f, 2.299f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.297f, 0.13f, -0.576f, 0.358f, -0.767f)
                curveToRelative(0.23f, -0.193f, 0.526f, -0.271f, 0.832f, -0.216f)
                curveToRelative(0.391f, 0.068f, 0.725f, 0.401f, 0.793f, 0.793f)
                curveToRelative(0.093f, 0.531f, -0.212f, 0.907f, -0.502f, 1.066f)
                curveToRelative(-0.845f, 0.465f, -1.481f, 1.595f, -1.481f, 2.628f)
                verticalLineToRelative(0.495f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.495f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _commentsQuestion!!
    }

private var _commentsQuestion: ImageVector? = null
