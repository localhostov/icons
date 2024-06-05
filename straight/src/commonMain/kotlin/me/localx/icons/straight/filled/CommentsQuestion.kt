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

public val Icons.Filled.CommentsQuestion: ImageVector
    get() {
        if (_commentsQuestion != null) {
            return _commentsQuestion!!
        }
        _commentsQuestion = Builder(name = "CommentsQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 0.0f)
                curveTo(4.038f, 0.0f, 0.0f, 4.037f, 0.0f, 9.0f)
                verticalLineToRelative(9.0f)
                lineTo(9.0f, 18.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(13.963f, 0.0f, 9.0f, 0.0f)
                close()
                moveTo(10.0f, 14.077f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.077f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.077f)
                close()
                moveTo(10.447f, 9.629f)
                curveToRelative(-0.188f, 0.103f, -0.447f, 0.563f, -0.447f, 0.876f)
                verticalLineToRelative(0.495f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.495f)
                curveToRelative(0.0f, -1.033f, 0.637f, -2.163f, 1.481f, -2.628f)
                curveToRelative(0.29f, -0.159f, 0.595f, -0.535f, 0.502f, -1.066f)
                curveToRelative(-0.069f, -0.392f, -0.402f, -0.725f, -0.793f, -0.793f)
                curveToRelative(-0.306f, -0.056f, -0.602f, 0.022f, -0.832f, 0.216f)
                curveToRelative(-0.228f, 0.19f, -0.358f, 0.47f, -0.358f, 0.767f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.889f, 0.391f, -1.727f, 1.072f, -2.299f)
                curveToRelative(0.681f, -0.572f, 1.577f, -0.814f, 2.463f, -0.653f)
                curveToRelative(1.209f, 0.211f, 2.204f, 1.205f, 2.417f, 2.417f)
                curveToRelative(0.223f, 1.272f, -0.382f, 2.543f, -1.506f, 3.164f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.955f, 0.0f, -5.535f, -1.615f, -6.92f, -4.004f)
                horizontalLineToRelative(0.0f)
                curveToRelative(6.011f, -0.043f, 10.873f, -4.905f, 10.916f, -10.916f)
                horizontalLineToRelative(0.0f)
                curveToRelative(2.389f, 1.385f, 4.004f, 3.965f, 4.004f, 6.92f)
                close()
            }
        }
        .build()
        return _commentsQuestion!!
    }

private var _commentsQuestion: ImageVector? = null
