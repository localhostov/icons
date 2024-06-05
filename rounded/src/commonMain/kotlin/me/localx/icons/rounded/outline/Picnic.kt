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

public val Icons.Outline.Picnic: ImageVector
    get() {
        if (_picnic != null) {
            return _picnic!!
        }
        _picnic = Builder(name = "Picnic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.283f, 9.034f)
                arcTo(3.008f, 3.008f, 0.0f, false, false, 20.93f, 8.0f)
                curveTo(19.5f, -2.6f, 4.492f, -2.591f, 3.07f, 8.0f)
                arcTo(3.018f, 3.018f, 0.0f, false, false, 0.046f, 11.425f)
                lineToRelative(1.059f, 7.424f)
                arcTo(6.024f, 6.024f, 0.0f, false, false, 7.037f, 24.0f)
                horizontalLineToRelative(9.957f)
                arcToRelative(6.025f, 6.025f, 0.0f, false, false, 5.932f, -5.151f)
                lineToRelative(1.059f, -7.424f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 23.283f, 9.034f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 6.911f, 6.0f)
                lineTo(5.089f, 8.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(18.2f, 10.0f)
                lineTo(14.35f, 13.857f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.706f, 0.0f)
                lineTo(9.792f, 10.0f)
                close()
                moveTo(20.946f, 18.565f)
                arcTo(4.018f, 4.018f, 0.0f, false, true, 16.994f, 22.0f)
                lineTo(7.037f, 22.0f)
                arcToRelative(4.018f, 4.018f, 0.0f, false, true, -3.955f, -3.435f)
                lineTo(2.023f, 11.142f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.012f, 10.0f)
                lineTo(6.967f, 10.0f)
                lineToRelative(5.265f, 5.271f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, false, 3.531f, 0.0f)
                lineTo(21.026f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.982f, 1.14f)
                close()
            }
        }
        .build()
        return _picnic!!
    }

private var _picnic: ImageVector? = null
