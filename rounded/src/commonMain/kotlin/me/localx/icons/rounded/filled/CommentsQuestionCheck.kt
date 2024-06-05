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

public val Icons.Filled.CommentsQuestionCheck: ImageVector
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
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.955f, 0.0f, -5.535f, -1.615f, -6.92f, -4.004f)
                lineToRelative(0.04f, -0.04f)
                curveToRelative(1.804f, -0.138f, 3.499f, -0.651f, 4.992f, -1.455f)
                lineToRelative(1.974f, 1.914f)
                curveToRelative(0.392f, 0.392f, 0.905f, 0.586f, 1.418f, 0.586f)
                curveToRelative(0.509f, 0.0f, 1.017f, -0.191f, 1.399f, -0.575f)
                lineToRelative(2.793f, -2.707f)
                curveToRelative(0.396f, -0.384f, 0.406f, -1.018f, 0.021f, -1.414f)
                reflectiveCurveToRelative(-1.018f, -0.405f, -1.414f, -0.021f)
                lineToRelative(-2.814f, 2.707f)
                lineToRelative(-1.662f, -1.611f)
                curveToRelative(2.36f, -1.853f, 3.93f, -4.543f, 4.145f, -7.586f)
                curveToRelative(0.017f, -0.234f, 0.01f, -0.466f, 0.012f, -0.699f)
                lineToRelative(0.013f, -0.013f)
                curveToRelative(2.389f, 1.385f, 4.004f, 3.965f, 4.004f, 6.92f)
                close()
                moveTo(8.138f, 18.0f)
                lineTo(3.661f, 18.0f)
                curveToRelative(-2.019f, 0.0f, -3.661f, -1.645f, -3.661f, -3.666f)
                verticalLineToRelative(-5.038f)
                curveTo(0.0f, 4.589f, 3.823f, 0.343f, 8.349f, 0.023f)
                curveToRelative(2.615f, -0.19f, 5.17f, 0.769f, 7.014f, 2.612f)
                reflectiveCurveToRelative(2.798f, 4.402f, 2.613f, 7.016f)
                curveToRelative(-0.33f, 4.682f, -4.652f, 8.349f, -9.839f, 8.349f)
                close()
                moveTo(10.25f, 13.25f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                close()
                moveTo(11.953f, 6.465f)
                curveToRelative(-0.213f, -1.212f, -1.208f, -2.206f, -2.417f, -2.417f)
                curveToRelative(-0.886f, -0.161f, -1.783f, 0.081f, -2.463f, 0.653f)
                curveToRelative(-0.682f, 0.572f, -1.072f, 1.41f, -1.072f, 2.299f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.297f, 0.13f, -0.576f, 0.358f, -0.767f)
                curveToRelative(0.23f, -0.193f, 0.526f, -0.271f, 0.832f, -0.216f)
                curveToRelative(0.391f, 0.068f, 0.725f, 0.401f, 0.793f, 0.793f)
                curveToRelative(0.093f, 0.531f, -0.212f, 0.907f, -0.502f, 1.066f)
                curveToRelative(-0.443f, 0.244f, -1.481f, 0.815f, -1.481f, 2.123f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.053f, 0.0f, -0.125f, 0.447f, -0.371f)
                curveToRelative(1.124f, -0.621f, 1.729f, -1.892f, 1.506f, -3.164f)
                close()
            }
        }
        .build()
        return _commentsQuestionCheck!!
    }

private var _commentsQuestionCheck: ImageVector? = null
