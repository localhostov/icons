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

public val Icons.Bold.QuillPenStory: ImageVector
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
                curveToRelative(-0.513f, 0.909f, -0.889f, 1.905f, -1.124f, 2.998f)
                horizontalLineToRelative(-2.226f)
                verticalLineToRelative(2.484f)
                lineToRelative(-2.437f, 0.975f)
                curveToRelative(-1.617f, 0.647f, -2.518f, 2.41f, -2.095f, 4.099f)
                lineToRelative(0.86f, 3.442f)
                horizontalLineToRelative(13.342f)
                lineToRelative(0.86f, -3.442f)
                curveToRelative(0.423f, -1.689f, -0.478f, -3.452f, -2.096f, -4.099f)
                lineToRelative(-2.436f, -0.975f)
                verticalLineToRelative(-2.484f)
                horizontalLineToRelative(-1.744f)
                curveToRelative(1.59f, -4.897f, 5.974f, -8.919f, 9.513f, -9.333f)
                curveToRelative(-3.154f, 2.231f, -5.32f, 5.233f, -6.689f, 7.629f)
                curveToRelative(1.939f, -0.285f, 4.286f, -0.95f, 6.422f, -2.467f)
                curveTo(23.208f, 5.488f, 24.0f, 0.07f, 24.0f, 0.07f)
                curveToRelative(0.0f, 0.0f, -5.796f, -0.74f, -10.502f, 2.601f)
                close()
                moveTo(12.322f, 19.244f)
                curveToRelative(0.231f, 0.093f, 0.36f, 0.344f, 0.3f, 0.586f)
                lineToRelative(-0.292f, 1.17f)
                lineTo(3.671f, 21.0f)
                lineToRelative(-0.292f, -1.17f)
                curveToRelative(-0.061f, -0.241f, 0.068f, -0.493f, 0.299f, -0.585f)
                lineToRelative(4.322f, -1.729f)
                lineToRelative(4.321f, 1.729f)
                close()
            }
        }
        .build()
        return _quillPenStory!!
    }

private var _quillPenStory: ImageVector? = null
