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
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.008f, 12.0f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, -0.991f, 2.45f)
                lineToRelative(-3.05f, 3.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.139f, -2.1f)
                lineToRelative(3.043f, -3.1f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-3.044f, -3.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.139f, -2.1f)
                lineToRelative(3.052f, 3.1f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 16.008f, 12.0f)
                close()
            }
        }
        .build()
        return _angleCircleRight!!
    }

private var _angleCircleRight: ImageVector? = null
