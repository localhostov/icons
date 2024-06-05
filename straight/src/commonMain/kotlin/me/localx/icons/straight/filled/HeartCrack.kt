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

public val Icons.Filled.HeartCrack: ImageVector
    get() {
        if (_heartCrack != null) {
            return _heartCrack!!
        }
        _heartCrack = Builder(name = "HeartCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 1.0f)
                curveToRelative(-1.65f, 0.0f, -3.17f, 0.67f, -4.32f, 1.77f)
                lineToRelative(2.73f, 2.73f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-2.86f, -2.86f)
                curveToRelative(-0.98f, -0.98f, -2.3f, -1.63f, -3.69f, -1.63f)
                curveToRelative(0.0f, 0.0f, -0.02f, 0.0f, -0.03f, 0.0f)
                curveTo(2.92f, 1.0f, 0.0f, 4.14f, 0.0f, 8.0f)
                curveToRelative(0.0f, 6.92f, 10.96f, 14.6f, 11.43f, 14.92f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.47f, -0.32f, 11.43f, -8.0f, 11.43f, -14.92f)
                curveToRelative(0.0f, -3.86f, -2.92f, -7.0f, -6.5f, -7.0f)
                close()
            }
        }
        .build()
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
