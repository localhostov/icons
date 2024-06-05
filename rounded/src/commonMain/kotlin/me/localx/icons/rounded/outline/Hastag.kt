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

public val Icons.Outline.Hastag: ImageVector
    get() {
        if (_hastag != null) {
            return _hastag!!
        }
        _hastag = Builder(name = "Hastag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 7.0f)
                lineTo(18.191f, 7.0f)
                lineToRelative(0.8f, -5.865f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.982f, -0.27f)
                lineTo(16.173f, 7.0f)
                lineTo(9.191f, 7.0f)
                lineToRelative(0.8f, -5.865f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 8.009f, 0.865f)
                lineTo(7.173f, 7.0f)
                lineTo(2.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 9.0f)
                lineTo(6.9f, 9.0f)
                lineToRelative(-0.818f, 6.0f)
                lineTo(1.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(5.809f, 17.0f)
                lineToRelative(-0.8f, 5.865f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.982f, 0.27f)
                lineTo(7.827f, 17.0f)
                horizontalLineToRelative(6.982f)
                lineToRelative(-0.8f, 5.865f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.982f, 0.27f)
                lineTo(16.827f, 17.0f)
                lineTo(22.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(17.1f, 15.0f)
                lineToRelative(0.818f, -6.0f)
                lineTo(23.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 7.0f)
                close()
                moveTo(15.082f, 15.0f)
                lineTo(8.1f, 15.0f)
                lineToRelative(0.818f, -6.0f)
                lineTo(15.9f, 9.0f)
                close()
            }
        }
        .build()
        return _hastag!!
    }

private var _hastag: ImageVector? = null
