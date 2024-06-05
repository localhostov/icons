package me.localx.icons.rounded.filled

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

public val Icons.Filled.ArrowTurnDownRight: ImageVector
    get() {
        if (_arrowTurnDownRight != null) {
            return _arrowTurnDownRight!!
        }
        _arrowTurnDownRight = Builder(name = "ArrowTurnDownRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.13f, 12.89f)
                lineToRelative(-5.41f, -5.59f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.02f)
                curveToRelative(-0.4f, 0.38f, -0.41f, 1.02f, -0.02f, 1.41f)
                lineToRelative(5.14f, 5.3f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineTo(21.42f)
                lineToRelative(-5.14f, 5.3f)
                curveToRelative(-0.38f, 0.4f, -0.37f, 1.03f, 0.02f, 1.41f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.28f, 0.7f, 0.28f)
                reflectiveCurveToRelative(0.52f, -0.1f, 0.72f, -0.3f)
                lineToRelative(5.4f, -5.58f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.01f, -4.23f)
                close()
            }
        }
        .build()
        return _arrowTurnDownRight!!
    }

private var _arrowTurnDownRight: ImageVector? = null
