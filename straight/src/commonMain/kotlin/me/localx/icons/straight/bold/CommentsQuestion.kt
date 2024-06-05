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

public val Icons.Bold.CommentsQuestion: ImageVector
    get() {
        if (_commentsQuestion != null) {
            return _commentsQuestion!!
        }
        _commentsQuestion = Builder(name = "CommentsQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 9.0f)
                curveTo(0.0f, 4.037f, 4.038f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(3.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.692f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(3.0f, 5.691f, 3.0f, 9.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(10.0f, 10.505f)
                curveToRelative(0.0f, -0.312f, 0.26f, -0.773f, 0.447f, -0.876f)
                curveToRelative(1.125f, -0.62f, 1.73f, -1.892f, 1.506f, -3.164f)
                curveToRelative(-0.212f, -1.212f, -1.207f, -2.206f, -2.417f, -2.417f)
                curveToRelative(-0.885f, -0.16f, -1.783f, 0.083f, -2.464f, 0.653f)
                curveToRelative(-0.682f, 0.572f, -1.072f, 1.41f, -1.072f, 2.299f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.297f, 0.13f, -0.576f, 0.358f, -0.767f)
                curveToRelative(0.23f, -0.194f, 0.523f, -0.272f, 0.833f, -0.216f)
                curveToRelative(0.391f, 0.068f, 0.724f, 0.401f, 0.793f, 0.793f)
                curveToRelative(0.093f, 0.532f, -0.212f, 0.907f, -0.501f, 1.066f)
                curveToRelative(-0.845f, 0.465f, -1.482f, 1.595f, -1.482f, 2.628f)
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
                moveTo(19.996f, 9.08f)
                curveToRelative(-0.008f, 1.159f, -0.199f, 2.274f, -0.54f, 3.322f)
                curveToRelative(0.948f, 0.91f, 1.544f, 2.184f, 1.544f, 3.598f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.415f, 0.0f, -2.688f, -0.597f, -3.598f, -1.544f)
                curveToRelative(-1.048f, 0.342f, -2.163f, 0.532f, -3.322f, 0.54f)
                curveToRelative(1.385f, 2.389f, 3.965f, 4.004f, 6.92f, 4.004f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.955f, -1.615f, -5.535f, -4.004f, -6.92f)
                close()
            }
        }
        .build()
        return _commentsQuestion!!
    }

private var _commentsQuestion: ImageVector? = null
