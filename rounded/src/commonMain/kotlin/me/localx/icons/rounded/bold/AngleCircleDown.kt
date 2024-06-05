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

public val Icons.Bold.AngleCircleDown: ImageVector
    get() {
        if (_angleCircleDown != null) {
            return _angleCircleDown!!
        }
        _angleCircleDown = Builder(name = "AngleCircleDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, 9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 12.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.008f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, -2.45f, -0.991f)
                lineToRelative(-3.1f, -3.05f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.1f, -2.139f)
                lineToRelative(3.1f, 3.043f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, false, 0.705f, 0.0f)
                lineToRelative(3.1f, -3.044f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.1f, 2.139f)
                lineToRelative(-3.1f, 3.052f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 12.0f, 16.008f)
                close()
            }
        }
        .build()
        return _angleCircleDown!!
    }

private var _angleCircleDown: ImageVector? = null
