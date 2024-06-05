package me.localx.icons.straight.bold

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

public val Icons.Bold.AngleCircleRight: ImageVector
    get() {
        if (_angleCircleRight != null) {
            return _angleCircleRight!!
        }
        _angleCircleRight = Builder(name = "AngleCircleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, -9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 3.0f, 12.0f)
                close()
                moveTo(15.268f, 10.232f)
                lineTo(11.018f, 5.982f)
                lineTo(8.9f, 8.1f)
                lineToRelative(3.9f, 3.9f)
                lineTo(8.9f, 15.9f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -3.536f)
                close()
            }
        }
        .build()
        return _angleCircleRight!!
    }

private var _angleCircleRight: ImageVector? = null
