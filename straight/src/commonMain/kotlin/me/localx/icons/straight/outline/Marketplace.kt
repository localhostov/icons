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

public val Icons.Outline.Marketplace: ImageVector
    get() {
        if (_marketplace != null) {
            return _marketplace!!
        }
        _marketplace = Builder(name = "Marketplace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 14.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.882f)
                lineToRelative(0.945f, 6.436f)
                curveToRelative(0.214f, 1.462f, 1.49f, 2.564f, 2.968f, 2.564f)
                horizontalLineToRelative(4.944f)
                curveToRelative(1.478f, 0.0f, 2.753f, -1.103f, 2.968f, -2.564f)
                lineToRelative(0.946f, -6.436f)
                horizontalLineToRelative(-1.889f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(15.0f, 14.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(20.964f, 21.146f)
                curveToRelative(-0.072f, 0.487f, -0.497f, 0.854f, -0.989f, 0.854f)
                horizontalLineToRelative(-4.944f)
                curveToRelative(-0.492f, 0.0f, -0.917f, -0.367f, -0.989f, -0.855f)
                lineToRelative(-0.608f, -4.145f)
                horizontalLineToRelative(8.14f)
                lineToRelative(-0.609f, 4.146f)
                close()
                moveTo(6.0f, 4.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(10.0f, 4.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(10.151f)
                curveToRelative(-0.019f, -0.093f, -0.32f, -2.0f, -0.32f, -2.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(22.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _marketplace!!
    }

private var _marketplace: ImageVector? = null
