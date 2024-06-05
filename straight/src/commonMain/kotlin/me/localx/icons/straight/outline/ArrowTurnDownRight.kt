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

public val Icons.Outline.ArrowTurnDownRight: ImageVector
    get() {
        if (_arrowTurnDownRight != null) {
            return _arrowTurnDownRight!!
        }
        _arrowTurnDownRight = Builder(name = "ArrowTurnDownRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.42f, 13.55f)
                lineToRelative(-5.68f, -6.22f)
                lineToRelative(-1.48f, 1.35f)
                lineToRelative(4.86f, 5.33f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.12f)
                lineToRelative(-4.86f, 5.33f)
                lineToRelative(1.48f, 1.35f)
                lineToRelative(5.65f, -6.19f)
                curveToRelative(0.82f, -0.82f, 0.82f, -2.15f, 0.03f, -2.94f)
                close()
            }
        }
        .build()
        return _arrowTurnDownRight!!
    }

private var _arrowTurnDownRight: ImageVector? = null
