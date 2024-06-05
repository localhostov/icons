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

public val Icons.Filled.ArrowTurnLeftUp: ImageVector
    get() {
        if (_arrowTurnLeftUp != null) {
            return _arrowTurnLeftUp!!
        }
        _arrowTurnLeftUp = Builder(name = "ArrowTurnLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineTo(2.952f)
                lineToRelative(5.795f, 5.758f)
                lineToRelative(1.409f, -1.419f)
                lineTo(10.486f, 0.616f)
                curveToRelative(-0.819f, -0.819f, -2.153f, -0.82f, -2.97f, -0.002f)
                lineTo(0.795f, 7.291f)
                lineToRelative(1.409f, 1.419f)
                lineTo(8.0f, 2.952f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftUp!!
    }

private var _arrowTurnLeftUp: ImageVector? = null
