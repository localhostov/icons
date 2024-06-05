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

public val Icons.Filled.Marketplace: ImageVector
    get() {
        if (_marketplace != null) {
            return _marketplace!!
        }
        _marketplace = Builder(name = "Marketplace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 15.0f)
                verticalLineToRelative(-0.5f)
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
                close()
                moveTo(15.0f, 14.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(24.0f, 7.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(7.5f, 2.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 2.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20.948f, 9.0f)
                horizontalLineToRelative(3.052f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-0.182f)
                curveToRelative(-0.399f, -1.68f, -1.449f, -3.106f, -2.87f, -4.0f)
                close()
                moveTo(10.15f, 22.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(14.052f)
                curveToRelative(-1.421f, 0.894f, -2.471f, 2.32f, -2.87f, 4.0f)
                horizontalLineToRelative(-2.379f)
                lineToRelative(1.282f, 8.726f)
                curveToRelative(0.014f, 0.095f, 0.047f, 0.182f, 0.067f, 0.274f)
                close()
            }
        }
        .build()
        return _marketplace!!
    }

private var _marketplace: ImageVector? = null
