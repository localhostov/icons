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
                moveToRelative(1.037f, 5.889f)
                lineToRelative(-1.043f, -1.7f)
                lineToRelative(6.735f, -4.127f)
                lineToRelative(1.042f, 1.706f)
                close()
                moveTo(22.274f, 16.217f)
                lineTo(18.149f, 22.9f)
                lineTo(19.849f, 23.951f)
                lineTo(23.974f, 17.267f)
                close()
                moveTo(20.924f, 14.6f)
                lineTo(16.0f, 22.583f)
                arcToRelative(2.879f, 2.879f, 0.0f, false, true, -2.13f, 1.394f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, true, -0.38f, 0.023f)
                arcToRelative(2.887f, 2.887f, 0.0f, false, true, -2.052f, -0.854f)
                lineToRelative(-0.963f, -0.963f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -6.614f, -6.617f)
                lineToRelative(-3.008f, -3.009f)
                arcToRelative(2.911f, 2.911f, 0.0f, false, true, 0.452f, -4.486f)
                lineToRelative(7.762f, -4.75f)
                arcToRelative(8.362f, 8.362f, 0.0f, false, true, 9.709f, 0.489f)
                lineToRelative(1.892f, -1.892f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.9f, 1.9f)
                arcToRelative(8.449f, 8.449f, 0.0f, false, true, 0.742f, 9.368f)
                close()
                moveTo(9.01f, 20.718f)
                lineTo(5.318f, 17.023f)
                arcToRelative(2.719f, 2.719f, 0.0f, false, false, 0.491f, 3.211f)
                arcToRelative(2.825f, 2.825f, 0.0f, false, false, 3.201f, 0.484f)
                close()
                moveTo(18.13f, 5.9f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -8.0f, -0.878f)
                lineToRelative(-7.752f, 4.736f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, -0.373f, 0.649f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.262f, 0.736f)
                lineToRelative(10.586f, 10.589f)
                arcToRelative(0.886f, 0.886f, 0.0f, false, false, 0.759f, 0.26f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.67f, -0.441f)
                lineToRelative(4.92f, -7.973f)
                arcToRelative(6.445f, 6.445f, 0.0f, false, false, -1.072f, -7.678f)
                close()
            }
        }
        .build()
        return _bellRing!!
    }

private var _bellRing: ImageVector? = null
