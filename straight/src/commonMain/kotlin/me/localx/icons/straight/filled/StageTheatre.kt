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

public val Icons.Filled.StageTheatre: ImageVector
    get() {
        if (_stageTheatre != null) {
            return _stageTheatre!!
        }
        _stageTheatre = Builder(name = "StageTheatre", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 16.0f)
                curveToRelative(1.426f, 1.762f, 3.0f, 4.489f, 3.0f, 8.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-3.11f, -1.398f, -7.638f, -4.65f, -8.0f, -12.0f)
                curveToRelative(-0.362f, 7.35f, -4.89f, 10.602f, -8.0f, 12.0f)
                lineTo(0.0f, 14.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(9.041f, 2.0f)
                horizontalLineToRelative(-2.018f)
                curveToRelative(-0.234f, 3.376f, -1.616f, 5.36f, -3.023f, 6.5f)
                verticalLineToRelative(2.377f)
                curveToRelative(2.136f, -1.234f, 4.738f, -3.767f, 5.041f, -8.877f)
                close()
                moveTo(20.0f, 8.5f)
                curveToRelative(-1.407f, -1.14f, -2.788f, -3.124f, -3.023f, -6.5f)
                horizontalLineToRelative(-2.018f)
                curveToRelative(0.302f, 5.11f, 2.904f, 7.643f, 5.041f, 8.877f)
                verticalLineToRelative(-2.377f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.426f, 1.762f, -3.0f, 4.489f, -3.0f, 8.0f)
                close()
            }
        }
        .build()
        return _stageTheatre!!
    }

private var _stageTheatre: ImageVector? = null
