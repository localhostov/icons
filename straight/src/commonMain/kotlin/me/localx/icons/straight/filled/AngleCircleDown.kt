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

public val Icons.Filled.AngleCircleDown: ImageVector
    get() {
        if (_angleCircleDown != null) {
            return _angleCircleDown!!
        }
        _angleCircleDown = Builder(name = "AngleCircleDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(13.414f, 15.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.828f, 0.0f)
                lineTo(5.913f, 10.741f)
                lineTo(7.327f, 9.327f)
                lineTo(12.0f, 14.0f)
                lineToRelative(4.712f, -4.711f)
                lineTo(18.126f, 10.7f)
                close()
            }
        }
        .build()
        return _angleCircleDown!!
    }

private var _angleCircleDown: ImageVector? = null
