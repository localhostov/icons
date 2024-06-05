package me.localx.icons.rounded.outline

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

public val Icons.Outline.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.327f, 18.422f)
                curveToRelative(0.728f, 1.034f, 1.673f, 2.229f, 1.673f, 3.078f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                curveToRelative(0.0f, -0.775f, 0.961f, -2.008f, 1.692f, -3.069f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.635f, -0.009f)
                close()
                moveTo(21.45f, 13.864f)
                lineTo(12.778f, 22.536f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -7.071f, 0.0f)
                lineToRelative(-4.242f, -4.243f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -7.071f)
                lineToRelative(5.709f, -5.71f)
                lineToRelative(-2.856f, -2.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.422f, -1.406f)
                lineToRelative(2.848f, 2.884f)
                lineToRelative(1.548f, -1.55f)
                lineToRelative(-0.843f, -0.843f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(13.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                close()
                moveTo(20.036f, 12.45f)
                lineTo(11.55f, 3.964f)
                lineTo(9.993f, 5.522f)
                lineTo(14.711f, 10.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.422f, 1.4f)
                lineToRelative(-4.709f, -4.765f)
                lineToRelative(-5.7f, 5.7f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.243f)
                lineToRelative(4.242f, 4.243f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, false, 4.243f, 0.0f)
                close()
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
