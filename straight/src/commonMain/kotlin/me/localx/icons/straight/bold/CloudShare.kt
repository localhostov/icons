package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.CloudShare: ImageVector
    get() {
        if (_cloudShare != null) {
            return _cloudShare!!
        }
        _cloudShare = Builder(name = "CloudShare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.35f, 19.0f)
                horizontalLineToRelative(-2.55f)
                arcToRelative(2.788f, 2.788f, 0.0f, false, true, -2.8f, -2.775f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, true, 2.218f, -2.792f)
                lineToRelative(2.165f, -0.557f)
                lineToRelative(-1.335f, -1.792f)
                arcToRelative(5.083f, 5.083f, 0.0f, false, true, -1.018f, -3.054f)
                arcToRelative(4.935f, 4.935f, 0.0f, false, true, 5.061f, -5.03f)
                arcToRelative(5.18f, 5.18f, 0.0f, false, true, 5.129f, 4.465f)
                lineToRelative(0.153f, 1.135f)
                lineToRelative(2.609f, -2.6f)
                horizontalLineToRelative(-0.006f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -7.885f, -6.0f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -8.061f, 8.03f)
                arcToRelative(8.045f, 8.045f, 0.0f, false, false, 0.69f, 3.27f)
                arcToRelative(5.953f, 5.953f, 0.0f, false, false, -2.72f, 4.925f)
                arcToRelative(5.792f, 5.792f, 0.0f, false, false, 5.8f, 5.775f)
                horizontalLineToRelative(4.9f)
                arcToRelative(6.027f, 6.027f, 0.0f, false, true, -2.35f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.0f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, -1.5f, 0.416f)
                lineToRelative(-2.477f, -1.416f)
                lineToRelative(2.477f, -1.416f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, 1.5f, 0.416f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, -3.014f)
                lineToRelative(-2.5f, 1.43f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, -1.5f, -0.416f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, 1.5f, -0.416f)
                lineToRelative(2.5f, 1.43f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, -3.014f)
                close()
            }
        }
        .build()
        return _cloudShare!!
    }

private var _cloudShare: ImageVector? = null
