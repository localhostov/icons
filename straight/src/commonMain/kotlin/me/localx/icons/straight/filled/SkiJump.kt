package me.localx.icons.straight.filled

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

public val Icons.Filled.SkiJump: ImageVector
    get() {
        if (_skiJump != null) {
            return _skiJump!!
        }
        _skiJump = Builder(name = "SkiJump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.759f, 12.266f)
                arcToRelative(3.974f, 3.974f, 0.0f, false, true, -2.068f, 2.257f)
                lineTo(0.849f, 23.93f)
                lineTo(0.026f, 22.106f)
                lineTo(5.0f, 19.862f)
                verticalLineTo(11.737f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, 0.879f, -2.122f)
                lineTo(9.781f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(9.959f)
                lineToRelative(1.062f, 1.071f)
                arcTo(3.009f, 3.009f, 0.0f, false, true, 14.0f, 7.25f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, true, -0.879f, 2.159f)
                lineToRelative(0.0f, -0.005f)
                curveToRelative(-0.008f, 0.008f, -0.01f, 0.018f, -0.018f, 0.026f)
                lineTo(7.0f, 15.116f)
                verticalLineToRelative(3.843f)
                lineToRelative(13.857f, -6.253f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.955f, -2.653f)
                lineToRelative(1.812f, -0.846f)
                arcTo(3.975f, 3.975f, 0.0f, false, true, 23.759f, 12.266f)
                close()
                moveTo(16.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 14.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 5.0f)
                close()
            }
        }
        .build()
        return _skiJump!!
    }

private var _skiJump: ImageVector? = null
