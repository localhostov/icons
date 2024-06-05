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

public val Icons.Outline.BowArrow: ImageVector
    get() {
        if (_bowArrow != null) {
            return _bowArrow!!
        }
        _bowArrow = Builder(name = "BowArrow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(18.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.586f)
                lineTo(17.361f, 5.225f)
                arcTo(13.4f, 13.4f, 0.0f, false, false, 1.418f, 4.141f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -1.4f, 2.294f)
                arcTo(3.144f, 3.144f, 0.0f, false, false, 0.925f, 9.0f)
                lineToRelative(6.329f, 6.33f)
                lineTo(4.586f, 18.0f)
                lineTo(1.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(2.586f, 20.0f)
                lineTo(1.293f, 21.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineTo(4.0f, 21.414f)
                lineTo(4.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(6.0f, 19.414f)
                lineToRelative(2.668f, -2.668f)
                lineTo(15.0f, 23.075f)
                arcTo(3.146f, 3.146f, 0.0f, false, false, 17.229f, 24.0f)
                arcToRelative(2.922f, 2.922f, 0.0f, false, false, 0.336f, -0.018f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 2.294f, -1.4f)
                arcTo(13.4f, 13.4f, 0.0f, false, false, 18.775f, 6.639f)
                lineTo(22.0f, 3.414f)
                lineTo(22.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(2.339f, 7.588f)
                arcToRelative(1.158f, 1.158f, 0.0f, false, true, -0.333f, -0.944f)
                arcToRelative(1.109f, 1.109f, 0.0f, false, true, 0.5f, -0.826f)
                arcTo(11.261f, 11.261f, 0.0f, false, true, 8.645f, 4.011f)
                arcToRelative(11.383f, 11.383f, 0.0f, false, true, 7.3f, 2.633f)
                lineTo(8.668f, 13.918f)
                close()
                moveTo(18.182f, 21.488f)
                arcToRelative(1.109f, 1.109f, 0.0f, false, true, -0.826f, 0.5f)
                arcToRelative(1.155f, 1.155f, 0.0f, false, true, -0.944f, -0.333f)
                lineToRelative(-6.33f, -6.329f)
                lineToRelative(7.275f, -7.274f)
                arcTo(11.386f, 11.386f, 0.0f, false, true, 18.182f, 21.493f)
                close()
            }
        }
        .build()
        return _bowArrow!!
    }

private var _bowArrow: ImageVector? = null
