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

public val Icons.Outline.QuillPenStory: ImageVector
    get() {
        if (_quillPenStory != null) {
            return _quillPenStory!!
        }
        _quillPenStory = Builder(name = "QuillPenStory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.764f, 0.004f)
                curveToRelative(-1.999f, -0.019f, -5.919f, 0.29f, -9.266f, 2.667f)
                curveToRelative(-2.279f, 1.618f, -6.044f, 5.745f, -6.457f, 11.329f)
                horizontalLineToRelative(-2.041f)
                verticalLineToRelative(2.298f)
                lineToRelative(-3.113f, 1.125f)
                curveToRelative(-1.386f, 0.554f, -2.159f, 2.064f, -1.797f, 3.513f)
                lineToRelative(0.767f, 3.063f)
                horizontalLineToRelative(14.287f)
                lineToRelative(0.768f, -3.064f)
                curveToRelative(0.361f, -1.448f, -0.412f, -2.958f, -1.829f, -3.525f)
                lineToRelative(-3.082f, -1.113f)
                verticalLineToRelative(-2.298f)
                horizontalLineToRelative(-1.952f)
                curveToRelative(0.063f, -0.734f, 0.188f, -1.44f, 0.37f, -2.112f)
                curveToRelative(1.283f, -0.06f, 5.005f, -0.461f, 9.042f, -3.031f)
                curveToRelative(2.476f, -1.576f, 4.243f, -4.124f, 5.252f, -7.572f)
                lineToRelative(0.37f, -1.265f)
                lineToRelative(-1.318f, -0.016f)
                close()
                moveTo(13.371f, 19.279f)
                curveToRelative(0.462f, 0.185f, 0.72f, 0.689f, 0.6f, 1.171f)
                lineToRelative(-0.388f, 1.549f)
                lineTo(2.417f, 21.999f)
                lineToRelative(-0.387f, -1.548f)
                curveToRelative(-0.121f, -0.483f, 0.137f, -0.987f, 0.567f, -1.16f)
                lineToRelative(4.402f, -1.59f)
                verticalLineToRelative(-1.702f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.702f)
                lineToRelative(4.371f, 1.578f)
                close()
                moveTo(17.386f, 7.169f)
                curveToRelative(-1.886f, 1.2f, -3.7f, 1.869f, -5.159f, 2.245f)
                curveToRelative(1.352f, -1.287f, 3.334f, -3.152f, 4.773f, -4.415f)
                curveToRelative(-2.341f, 0.739f, -4.391f, 1.997f, -5.857f, 3.077f)
                curveToRelative(1.132f, -1.749f, 2.493f, -3.051f, 3.513f, -3.775f)
                curveToRelative(2.247f, -1.595f, 4.818f, -2.112f, 6.687f, -2.252f)
                curveToRelative(-0.894f, 2.297f, -2.221f, 4.016f, -3.957f, 5.121f)
                close()
            }
        }
        .build()
        return _quillPenStory!!
    }

private var _quillPenStory: ImageVector? = null
