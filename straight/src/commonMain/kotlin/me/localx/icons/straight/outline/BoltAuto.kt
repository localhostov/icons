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

public val Icons.Outline.BoltAuto: ImageVector
    get() {
        if (_boltAuto != null) {
            return _boltAuto!!
        }
        _boltAuto = Builder(name = "BoltAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.705f, 9.298f)
                curveToRelative(-0.43f, -0.801f, -1.261f, -1.298f, -2.169f, -1.298f)
                horizontalLineToRelative(-3.801f)
                lineTo(11.758f, 0.0f)
                horizontalLineToRelative(-3.321f)
                lineTo(0.36f, 12.177f)
                curveToRelative(-0.498f, 0.75f, -0.542f, 1.712f, -0.113f, 2.51f)
                curveToRelative(0.435f, 0.811f, 1.274f, 1.313f, 2.191f, 1.313f)
                horizontalLineToRelative(3.774f)
                lineToRelative(-2.023f, 8.0f)
                horizontalLineToRelative(3.321f)
                lineToRelative(8.077f, -12.177f)
                curveToRelative(0.502f, -0.757f, 0.547f, -1.725f, 0.117f, -2.525f)
                close()
                moveTo(13.921f, 10.718f)
                lineToRelative(-6.964f, 10.5f)
                lineToRelative(1.825f, -7.218f)
                lineTo(2.438f, 14.0f)
                curveToRelative(-0.262f, 0.0f, -0.387f, -0.182f, -0.429f, -0.259f)
                curveToRelative(-0.048f, -0.09f, -0.109f, -0.268f, 0.018f, -0.459f)
                lineTo(8.991f, 2.782f)
                lineToRelative(-1.825f, 7.218f)
                horizontalLineToRelative(6.37f)
                curveToRelative(0.24f, 0.0f, 0.358f, 0.152f, 0.407f, 0.243f)
                curveToRelative(0.04f, 0.074f, 0.116f, 0.267f, -0.022f, 0.475f)
                close()
                moveTo(22.001f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-2.822f, -9.745f)
                curveToRelative(-0.371f, -0.75f, -1.155f, -1.242f, -2.042f, -1.255f)
                curveToRelative(-0.843f, 0.013f, -1.626f, 0.505f, -1.998f, 1.255f)
                lineToRelative(-2.816f, 9.745f)
                horizontalLineToRelative(2.138f)
                lineToRelative(0.565f, -2.0f)
                horizontalLineToRelative(4.381f)
                lineToRelative(0.592f, 2.0f)
                close()
                moveTo(17.593f, 20.0f)
                lineToRelative(1.392f, -4.925f)
                curveToRelative(0.043f, -0.039f, 0.101f, -0.066f, 0.158f, -0.073f)
                curveToRelative(0.104f, 0.01f, 0.181f, 0.055f, 0.222f, 0.107f)
                lineToRelative(0.014f, 0.036f)
                lineToRelative(1.438f, 4.856f)
                horizontalLineToRelative(-3.224f)
                close()
            }
        }
        .build()
        return _boltAuto!!
    }

private var _boltAuto: ImageVector? = null
