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

public val Icons.Bold.DiamondExclamation: ImageVector
    get() {
        if (_diamondExclamation != null) {
            return _diamondExclamation!!
        }
        _diamondExclamation = Builder(name = "DiamondExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.462f, 8.105f)
                lineTo(15.889f, 1.533f)
                curveToRelative(-2.144f, -2.145f, -5.633f, -2.145f, -7.778f, 0.0f)
                lineTo(1.538f, 8.105f)
                curveToRelative(-2.144f, 2.145f, -2.144f, 5.634f, 0.0f, 7.778f)
                horizontalLineToRelative(0.0f)
                lineToRelative(6.573f, 6.573f)
                curveToRelative(1.072f, 1.072f, 2.48f, 1.607f, 3.889f, 1.607f)
                reflectiveCurveToRelative(2.817f, -0.536f, 3.889f, -1.607f)
                lineToRelative(6.573f, -6.573f)
                curveToRelative(2.144f, -2.145f, 2.144f, -5.634f, 0.0f, -7.778f)
                close()
                moveTo(20.341f, 13.762f)
                lineToRelative(-6.573f, 6.573f)
                curveToRelative(-0.975f, 0.976f, -2.562f, 0.974f, -3.536f, 0.0f)
                lineToRelative(-6.573f, -6.573f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.975f, -0.975f, -0.975f, -2.562f, 0.0f, -3.536f)
                lineToRelative(6.573f, -6.572f)
                curveToRelative(0.975f, -0.975f, 2.562f, -0.975f, 3.536f, 0.0f)
                lineToRelative(6.572f, 6.572f)
                curveToRelative(0.975f, 0.975f, 0.975f, 2.562f, 0.0f, 3.536f)
                close()
                moveTo(13.5f, 16.499f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.5f, 7.499f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _diamondExclamation!!
    }

private var _diamondExclamation: ImageVector? = null
