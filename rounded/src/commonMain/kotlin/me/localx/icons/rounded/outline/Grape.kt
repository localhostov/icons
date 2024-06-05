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

public val Icons.Outline.Grape: ImageVector
    get() {
        if (_grape != null) {
            return _grape!!
        }
        _grape = Builder(name = "Grape", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, false, -7.0f, -2.618f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, false, -1.967f, -1.23f)
                curveTo(13.389f, 1.618f, 16.927f, 1.205f, 17.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                curveToRelative(-0.3f, -3.828f, -5.018f, -3.987f, -6.99f, -0.438f)
                curveTo(11.428f, 1.517f, 9.216f, -1.1f, 8.105f, 0.553f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.553f, 1.9f)
                curveToRelative(1.46f, 0.73f, 2.252f, 2.129f, 2.413f, 4.258f)
                arcTo(3.984f, 3.984f, 0.0f, false, false, 9.0f, 7.382f)
                arcToRelative(3.991f, 3.991f, 0.0f, true, false, -3.828f, 6.529f)
                arcToRelative(3.985f, 3.985f, 0.0f, false, false, 3.0f, 5.0f)
                arcToRelative(3.984f, 3.984f, 0.0f, true, false, 7.656f, 0.0f)
                arcToRelative(3.985f, 3.985f, 0.0f, false, false, 3.0f, -5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 22.0f, 10.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 8.0f)
                close()
                moveTo(4.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 10.0f)
                close()
                moveTo(7.0f, 15.0f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, true, 0.5f, -1.3f)
                arcTo(3.991f, 3.991f, 0.0f, false, false, 9.0f, 12.618f)
                arcTo(3.991f, 3.991f, 0.0f, false, false, 10.505f, 13.7f)
                arcTo(1.994f, 1.994f, 0.0f, true, true, 7.0f, 15.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.5f, 18.7f)
                arcTo(3.991f, 3.991f, 0.0f, false, false, 12.0f, 17.618f)
                arcTo(3.991f, 3.991f, 0.0f, false, false, 13.505f, 18.7f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(15.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.5f, 13.7f)
                arcTo(3.991f, 3.991f, 0.0f, false, false, 15.0f, 12.618f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, false, 1.5f, 1.086f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 17.0f)
                close()
                moveTo(18.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _grape!!
    }

private var _grape: ImageVector? = null
