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

public val Icons.Outline.BellRing: ImageVector
    get() {
        if (_bellRing != null) {
            return _bellRing!!
        }
        _bellRing = Builder(name = "BellRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.859f, 15.331f)
                lineToRelative(-3.772f, 6.155f)
                arcToRelative(5.235f, 5.235f, 0.0f, false, true, -3.87f, 2.477f)
                arcToRelative(5.315f, 5.315f, 0.0f, false, true, -0.628f, 0.037f)
                arcToRelative(5.212f, 5.212f, 0.0f, false, true, -3.0f, -0.955f)
                arcToRelative(4.741f, 4.741f, 0.0f, false, true, -6.689f, -6.566f)
                lineToRelative(-1.315f, -1.313f)
                arcToRelative(5.264f, 5.264f, 0.0f, false, true, 0.955f, -8.2f)
                lineToRelative(5.767f, -3.566f)
                arcToRelative(8.859f, 8.859f, 0.0f, false, true, 10.327f, 0.551f)
                lineToRelative(1.659f, -1.659f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                lineToRelative(-1.657f, 1.658f)
                arcToRelative(8.951f, 8.951f, 0.0f, false, true, 0.809f, 9.967f)
                close()
                moveTo(8.065f, 21.647f)
                lineTo(4.346f, 17.927f)
                arcToRelative(2.721f, 2.721f, 0.0f, false, false, 0.463f, 3.264f)
                arcToRelative(2.827f, 2.827f, 0.0f, false, false, 3.256f, 0.456f)
                close()
                moveTo(17.986f, 6.047f)
                arcToRelative(6.887f, 6.887f, 0.0f, false, false, -8.617f, -0.947f)
                lineToRelative(-5.777f, 3.566f)
                arcToRelative(3.265f, 3.265f, 0.0f, false, false, -0.592f, 5.086f)
                lineToRelative(7.29f, 7.291f)
                arcToRelative(3.265f, 3.265f, 0.0f, false, false, 5.093f, -0.6f)
                lineToRelative(3.755f, -6.125f)
                arcToRelative(6.937f, 6.937f, 0.0f, false, false, -1.152f, -8.276f)
                close()
                moveTo(19.265f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.591f, -1.808f)
                arcToRelative(8.633f, 8.633f, 0.0f, false, false, 3.315f, -5.407f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.953f, 0.43f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, true, -4.088f, 6.593f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.589f, 0.192f)
                close()
                moveTo(1.0f, 5.739f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, -1.594f)
                arcToRelative(10.692f, 10.692f, 0.0f, false, true, 6.713f, -4.125f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.4f, 1.96f)
                arcToRelative(8.636f, 8.636f, 0.0f, false, false, -5.513f, 3.354f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, 0.405f)
                close()
            }
        }
        .build()
        return _bellRing!!
    }

private var _bellRing: ImageVector? = null
