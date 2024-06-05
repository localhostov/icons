package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Raindrops: ImageVector
    get() {
        if (_raindrops != null) {
            return _raindrops!!
        }
        _raindrops = Builder(name = "Raindrops", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 24.0f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, true, -7.0f, -7.0f)
                curveToRelative(0.0f, -1.927f, 1.474f, -4.58f, 4.379f, -7.885f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, true, 5.241f, 0.0f)
                curveTo(22.526f, 12.42f, 24.0f, 15.073f, 24.0f, 17.0f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 17.0f, 24.0f)
                close()
                moveTo(17.0f, 10.931f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, false, -0.368f, 0.166f)
                curveTo(13.954f, 14.142f, 13.0f, 16.143f, 13.0f, 17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                curveToRelative(0.0f, -0.857f, -0.954f, -2.858f, -3.633f, -5.9f)
                arcTo(0.481f, 0.481f, 0.0f, false, false, 17.0f, 10.931f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 12.483f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 6.983f)
                curveTo(0.0f, 6.175f, 0.246f, 4.74f, 2.375f, 1.642f)
                arcToRelative(3.821f, 3.821f, 0.0f, false, true, 6.249f, 0.0f)
                curveTo(10.754f, 4.74f, 11.0f, 6.175f, 11.0f, 6.983f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 12.483f)
                close()
                moveTo(5.5f, 3.0f)
                arcToRelative(0.773f, 0.773f, 0.0f, false, false, -0.653f, 0.342f)
                curveTo(3.052f, 5.955f, 3.0f, 6.886f, 3.0f, 6.983f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                curveToRelative(0.0f, -0.1f, -0.052f, -1.028f, -1.848f, -3.642f)
                arcTo(0.772f, 0.772f, 0.0f, false, false, 5.5f, 3.0f)
                close()
            }
        }
        .build()
        return _raindrops!!
    }

private var _raindrops: ImageVector? = null
