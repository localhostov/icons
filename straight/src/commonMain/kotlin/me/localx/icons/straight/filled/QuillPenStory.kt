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

public val Icons.Filled.QuillPenStory: ImageVector
    get() {
        if (_quillPenStory != null) {
            return _quillPenStory!!
        }
        _quillPenStory = Builder(name = "QuillPenStory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.498f, 2.671f)
                curveToRelative(-3.197f, 2.27f, -4.585f, 5.494f, -5.148f, 7.331f)
                curveToRelative(-0.665f, 1.178f, -1.1f, 2.501f, -1.287f, 3.998f)
                horizontalLineToRelative(-2.062f)
                verticalLineToRelative(2.298f)
                lineToRelative(-3.113f, 1.125f)
                curveToRelative(-1.386f, 0.554f, -2.159f, 2.064f, -1.797f, 3.513f)
                lineToRelative(0.767f, 3.063f)
                horizontalLineToRelative(14.287f)
                lineToRelative(0.768f, -3.064f)
                curveToRelative(0.361f, -1.448f, -0.412f, -2.958f, -1.829f, -3.525f)
                lineToRelative(-3.082f, -1.113f)
                verticalLineToRelative(-2.298f)
                horizontalLineToRelative(-1.927f)
                curveToRelative(0.051f, -0.341f, 0.112f, -0.677f, 0.195f, -1.0f)
                horizontalLineToRelative(-0.012f)
                curveToRelative(1.59f, -4.897f, 5.974f, -8.919f, 9.513f, -9.333f)
                curveToRelative(-3.154f, 2.231f, -5.32f, 5.233f, -6.689f, 7.629f)
                curveToRelative(1.939f, -0.285f, 4.286f, -0.95f, 6.422f, -2.467f)
                curveTo(23.208f, 5.488f, 24.0f, 0.07f, 24.0f, 0.07f)
                curveToRelative(0.0f, 0.0f, -5.796f, -0.74f, -10.502f, 2.601f)
                close()
            }
        }
        .build()
        return _quillPenStory!!
    }

private var _quillPenStory: ImageVector? = null
