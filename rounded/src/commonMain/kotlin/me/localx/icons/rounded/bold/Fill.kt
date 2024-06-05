package me.localx.icons.rounded.bold

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

public val Icons.Bold.Fill: ImageVector
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
                moveTo(21.452f, 14.569f)
                lineTo(13.632f, 22.389f)
                arcToRelative(5.508f, 5.508f, 0.0f, false, true, -7.778f, 0.0f)
                lineToRelative(-4.243f, -4.243f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -7.778f)
                lineToRelative(3.818f, -3.818f)
                lineToRelative(-2.99f, -2.989f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, -2.122f)
                lineToRelative(2.989f, 2.99f)
                lineToRelative(1.881f, -1.881f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.13f, -2.109f)
                lineToRelative(12.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.109f, 2.13f)
                close()
                moveTo(19.329f, 12.45f)
                lineTo(11.55f, 4.671f)
                lineTo(9.671f, 6.55f)
                lineTo(13.561f, 10.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 2.122f)
                lineToRelative(-3.889f, -3.89f)
                lineToRelative(-3.818f, 3.818f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.536f)
                lineToRelative(4.243f, 4.243f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.536f, 0.0f)
                close()
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
