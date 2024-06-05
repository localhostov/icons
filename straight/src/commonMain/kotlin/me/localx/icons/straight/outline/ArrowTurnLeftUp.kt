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

public val Icons.Outline.ArrowTurnLeftUp: ImageVector
    get() {
        if (_arrowTurnLeftUp != null) {
            return _arrowTurnLeftUp!!
        }
        _arrowTurnLeftUp = Builder(name = "ArrowTurnLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(11.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineTo(2.952f)
                lineTo(2.205f, 8.709f)
                lineToRelative(-1.409f, -1.419f)
                lineTo(7.516f, 0.613f)
                curveToRelative(0.817f, -0.817f, 2.151f, -0.817f, 2.97f, 0.002f)
                lineToRelative(6.718f, 6.675f)
                lineToRelative(-1.409f, 1.419f)
                lineTo(10.0f, 2.952f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftUp!!
    }

private var _arrowTurnLeftUp: ImageVector? = null
