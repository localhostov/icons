package me.localx.icons.rounded.filled

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

public val Icons.Filled.Grape: ImageVector
    get() {
        if (_grape != null) {
            return _grape!!
        }
        _grape = Builder(name = "Grape", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.105f, 0.553f)
                curveToRelative(1.113f, -1.652f, 3.32f, 0.961f, 3.9f, 2.009f)
                curveTo(13.982f, -0.987f, 18.7f, -0.828f, 19.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                curveToRelative(-0.074f, -1.8f, -3.63f, -1.383f, -3.971f, 3.193f)
                arcToRelative(2.995f, 2.995f, 0.0f, true, true, -2.063f, 0.0f)
                curveToRelative(-0.155f, -2.151f, -0.946f, -3.565f, -2.415f, -4.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.105f, 0.553f)
                close()
                moveTo(8.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 9.0f)
                close()
                moveTo(11.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 15.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 18.0f)
                close()
                moveTo(19.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 6.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _grape!!
    }

private var _grape: ImageVector? = null
