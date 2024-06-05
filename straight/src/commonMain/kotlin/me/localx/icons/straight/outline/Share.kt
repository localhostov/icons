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

public val Icons.Outline.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.333f, 14.667f)
                arcToRelative(4.66f, 4.66f, 0.0f, false, false, -3.839f, 2.024f)
                lineTo(8.985f, 13.752f)
                arcToRelative(4.574f, 4.574f, 0.0f, false, false, 0.005f, -3.488f)
                lineToRelative(6.5f, -2.954f)
                arcToRelative(4.66f, 4.66f, 0.0f, true, false, -0.827f, -2.643f)
                arcToRelative(4.633f, 4.633f, 0.0f, false, false, 0.08f, 0.786f)
                lineTo(7.833f, 8.593f)
                arcToRelative(4.668f, 4.668f, 0.0f, true, false, -0.015f, 6.827f)
                lineToRelative(6.928f, 3.128f)
                arcToRelative(4.736f, 4.736f, 0.0f, false, false, -0.079f, 0.785f)
                arcToRelative(4.667f, 4.667f, 0.0f, true, false, 4.666f, -4.666f)
                close()
                moveTo(19.333f, 2.0f)
                arcToRelative(2.667f, 2.667f, 0.0f, true, true, -2.666f, 2.667f)
                arcTo(2.669f, 2.669f, 0.0f, false, true, 19.333f, 2.0f)
                close()
                moveTo(4.667f, 14.667f)
                arcTo(2.667f, 2.667f, 0.0f, true, true, 7.333f, 12.0f)
                arcTo(2.67f, 2.67f, 0.0f, false, true, 4.667f, 14.667f)
                close()
                moveTo(19.333f, 22.0f)
                arcTo(2.667f, 2.667f, 0.0f, true, true, 22.0f, 19.333f)
                arcTo(2.669f, 2.669f, 0.0f, false, true, 19.333f, 22.0f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
