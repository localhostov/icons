package me.localx.icons.rounded.bold

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

public val Icons.Bold.Grape: ImageVector
    get() {
        if (_grape != null) {
            return _grape!!
        }
        _grape = Builder(name = "Grape", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.5f)
                arcToRelative(5.491f, 5.491f, 0.0f, false, false, -8.487f, -4.611f)
                curveTo(13.649f, 3.12f, 15.975f, 3.0f, 16.0f, 3.0f)
                curveToRelative(0.7f, 0.0f, 1.0f, 0.38f, 1.0f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(5.371f, 5.371f, 0.0f, false, false, -3.8f, 1.879f)
                arcTo(5.383f, 5.383f, 0.0f, false, false, 10.171f, 0.158f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.829f, 2.842f)
                curveToRelative(0.961f, 0.48f, 1.608f, 1.381f, 1.661f, 4.048f)
                arcTo(5.5f, 5.5f, 0.0f, true, false, 6.729f, 16.939f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 10.542f, 0.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 22.0f, 11.5f)
                close()
                moveTo(5.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 7.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.0f, 11.5f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(16.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 19.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 14.0f)
                close()
            }
        }
        .build()
        return _grape!!
    }

private var _grape: ImageVector? = null
