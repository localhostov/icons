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
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.0f, -2.643f)
                arcToRelative(4.009f, 4.009f, 0.0f, false, false, -1.967f, -1.222f)
                curveTo(13.357f, 2.051f, 15.972f, 2.0f, 16.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineToRelative(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                arcToRelative(4.763f, 4.763f, 0.0f, false, false, -3.988f, 2.544f)
                arcTo(5.864f, 5.864f, 0.0f, false, false, 9.447f, 0.105f)
                lineTo(8.553f, 1.9f)
                curveToRelative(1.457f, 0.728f, 2.251f, 2.12f, 2.415f, 4.24f)
                arcTo(4.008f, 4.008f, 0.0f, false, false, 9.0f, 7.357f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 5.155f, 13.91f)
                arcTo(3.917f, 3.917f, 0.0f, false, false, 5.0f, 15.0f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, false, 3.155f, 3.91f)
                arcTo(3.917f, 3.917f, 0.0f, false, false, 8.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(3.917f, 3.917f, 0.0f, false, false, -0.155f, -1.09f)
                arcTo(4.007f, 4.007f, 0.0f, false, false, 19.0f, 15.0f)
                arcToRelative(3.917f, 3.917f, 0.0f, false, false, -0.155f, -1.09f)
                arcTo(4.007f, 4.007f, 0.0f, false, false, 22.0f, 10.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 8.0f)
                close()
                moveTo(4.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 10.0f)
                close()
                moveTo(7.0f, 15.0f)
                arcToRelative(1.989f, 1.989f, 0.0f, false, true, 0.481f, -1.284f)
                arcTo(4.016f, 4.016f, 0.0f, false, false, 9.0f, 12.643f)
                arcToRelative(4.016f, 4.016f, 0.0f, false, false, 1.519f, 1.073f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 7.0f, 15.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(1.988f, 1.988f, 0.0f, false, true, -1.519f, -3.284f)
                arcTo(4.016f, 4.016f, 0.0f, false, false, 12.0f, 17.643f)
                arcToRelative(4.016f, 4.016f, 0.0f, false, false, 1.519f, 1.073f)
                arcTo(1.988f, 1.988f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(15.0f, 17.0f)
                arcToRelative(1.988f, 1.988f, 0.0f, false, true, -1.519f, -3.284f)
                arcTo(4.016f, 4.016f, 0.0f, false, false, 15.0f, 12.643f)
                arcToRelative(4.016f, 4.016f, 0.0f, false, false, 1.519f, 1.073f)
                arcTo(1.988f, 1.988f, 0.0f, false, true, 15.0f, 17.0f)
                close()
                moveTo(18.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _grape!!
    }

private var _grape: ImageVector? = null
