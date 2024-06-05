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

public val Icons.Outline.CrystalBall: ImageVector
    get() {
        if (_crystalBall != null) {
            return _crystalBall!!
        }
        _crystalBall = Builder(name = "CrystalBall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.448f, 7.577f)
                lineToRelative(-1.472f, 2.944f)
                curveToRelative(0.008f, 0.159f, 0.024f, 0.317f, 0.024f, 0.478f)
                curveToRelative(0.0f, 2.242f, -0.82f, 4.347f, -2.305f, 6.0f)
                lineTo(5.306f, 16.999f)
                curveToRelative(-1.484f, -1.653f, -2.306f, -3.765f, -2.306f, -6.0f)
                curveTo(3.0f, 6.037f, 7.037f, 2.0f, 12.0f, 2.0f)
                curveToRelative(0.94f, 0.0f, 1.846f, 0.146f, 2.698f, 0.414f)
                lineToRelative(2.352f, -1.176f)
                curveToRelative(-1.514f, -0.787f, -3.229f, -1.239f, -5.05f, -1.239f)
                curveTo(5.935f, 0.0f, 1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 2.644f, 0.94f, 5.148f, 2.646f, 7.139f)
                lineToRelative(-2.646f, 3.528f)
                verticalLineToRelative(2.333f)
                lineTo(23.0f, 24.0f)
                verticalLineToRelative(-2.333f)
                lineToRelative(-2.642f, -3.523f)
                curveToRelative(1.707f, -1.99f, 2.642f, -4.489f, 2.642f, -7.144f)
                curveToRelative(0.0f, -1.195f, -0.198f, -2.344f, -0.552f, -3.423f)
                close()
                moveTo(3.25f, 22.0f)
                lineToRelative(2.25f, -3.0f)
                horizontalLineToRelative(13.0f)
                lineToRelative(2.25f, 3.0f)
                lineTo(3.25f, 22.0f)
                close()
                moveTo(16.0f, 4.0f)
                lineToRelative(2.667f, -1.333f)
                lineToRelative(1.333f, -2.667f)
                lineToRelative(1.333f, 2.667f)
                lineToRelative(2.667f, 1.333f)
                lineToRelative(-2.667f, 1.333f)
                lineToRelative(-1.333f, 2.667f)
                lineToRelative(-1.333f, -2.667f)
                lineToRelative(-2.667f, -1.333f)
                close()
                moveTo(14.667f, 9.333f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(1.167f, 2.333f)
                close()
            }
        }
        .build()
        return _crystalBall!!
    }

private var _crystalBall: ImageVector? = null
