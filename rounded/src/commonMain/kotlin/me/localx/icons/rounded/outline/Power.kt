package me.localx.icons.rounded.outline

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

public val Icons.Outline.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.849f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, false, 0.629f, 0.926f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 21.0f, 13.292f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 8.371f, 4.776f)
                arcTo(1.023f, 1.023f, 0.0f, false, false, 9.0f, 3.848f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.374f, -0.929f)
                arcToRelative(11.0f, 11.0f, 0.0f, true, false, 8.751f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 3.849f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(12.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 1.0f)
                lineTo(13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 7.0f)
                lineTo(11.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
