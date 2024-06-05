package me.localx.icons.rounded.filled

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
                moveTo(15.363f, 2.636f)
                curveTo(13.52f, 0.792f, 10.964f, -0.167f, 8.349f, 0.023f)
                curveTo(3.823f, 0.343f, 0.0f, 4.589f, 0.0f, 9.296f)
                verticalLineToRelative(5.038f)
                curveToRelative(0.0f, 2.021f, 1.642f, 3.666f, 3.661f, 3.666f)
                horizontalLineToRelative(4.477f)
                curveToRelative(5.187f, 0.0f, 9.509f, -3.667f, 9.839f, -8.349f)
                curveToRelative(0.185f, -2.613f, -0.768f, -5.17f, -2.613f, -7.016f)
                close()
                moveTo(9.0f, 14.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                close()
                moveTo(10.447f, 9.629f)
                curveToRelative(-0.447f, 0.246f, -0.447f, 0.318f, -0.447f, 0.371f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.308f, 1.038f, -1.879f, 1.481f, -2.123f)
                curveToRelative(0.29f, -0.159f, 0.595f, -0.535f, 0.502f, -1.066f)
                curveToRelative(-0.069f, -0.392f, -0.402f, -0.725f, -0.793f, -0.793f)
                curveToRelative(-0.306f, -0.056f, -0.602f, 0.022f, -0.832f, 0.216f)
                curveToRelative(-0.228f, 0.19f, -0.358f, 0.47f, -0.358f, 0.767f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.889f, 0.391f, -1.727f, 1.072f, -2.299f)
                curveToRelative(0.681f, -0.572f, 1.577f, -0.814f, 2.463f, -0.653f)
                curveToRelative(1.209f, 0.211f, 2.204f, 1.205f, 2.417f, 2.417f)
                curveToRelative(0.223f, 1.272f, -0.382f, 2.543f, -1.506f, 3.164f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.955f, 0.0f, -5.535f, -1.615f, -6.92f, -4.004f)
                lineToRelative(0.04f, -0.04f)
                curveToRelative(5.787f, -0.442f, 10.47f, -4.744f, 10.852f, -10.164f)
                curveToRelative(0.017f, -0.234f, 0.01f, -0.466f, 0.012f, -0.699f)
                lineToRelative(0.013f, -0.013f)
                curveToRelative(2.389f, 1.385f, 4.004f, 3.965f, 4.004f, 6.92f)
                close()
            }
        }
        .build()
        return _commentsQuestion!!
    }

private var _commentsQuestion: ImageVector? = null
