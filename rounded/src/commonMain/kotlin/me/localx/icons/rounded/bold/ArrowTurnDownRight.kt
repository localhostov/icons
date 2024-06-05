package me.localx.icons.rounded.bold

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

public val Icons.Bold.ArrowTurnDownRight: ImageVector
    get() {
        if (_arrowTurnDownRight != null) {
            return _arrowTurnDownRight!!
        }
        _arrowTurnDownRight = Builder(name = "ArrowTurnDownRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.97f, 16.97f)
                lineToRelative(-4.39f, 4.57f)
                curveToRelative(-0.29f, 0.31f, -0.69f, 0.46f, -1.08f, 0.46f)
                reflectiveCurveToRelative(-0.75f, -0.14f, -1.04f, -0.42f)
                curveToRelative(-0.6f, -0.58f, -0.62f, -1.52f, -0.04f, -2.12f)
                lineToRelative(3.33f, -3.46f)
                horizontalLineTo(5.5f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(14.25f)
                lineToRelative(-3.33f, -3.46f)
                curveToRelative(-0.57f, -0.6f, -0.56f, -1.55f, 0.04f, -2.12f)
                curveToRelative(0.6f, -0.57f, 1.55f, -0.56f, 2.12f, 0.04f)
                lineToRelative(4.41f, 4.59f)
                curveToRelative(1.34f, 1.34f, 1.34f, 3.56f, -0.02f, 4.93f)
                close()
            }
        }
        .build()
        return _arrowTurnDownRight!!
    }

private var _arrowTurnDownRight: ImageVector? = null
