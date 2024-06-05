package me.localx.icons.rounded.outline

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

public val Icons.Outline.GunSquirt: ImageVector
    get() {
        if (_gunSquirt != null) {
            return _gunSquirt!!
        }
        _gunSquirt = Builder(name = "GunSquirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 6.0f)
                horizontalLineToRelative(-1.101f)
                curveToRelative(-0.465f, -2.279f, -2.484f, -4.0f, -4.899f, -4.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.424f)
                curveTo(1.237f, 3.198f, 0.0f, 4.955f, 0.0f, 7.0f)
                curveToRelative(0.0f, 1.909f, 1.088f, 3.552f, 2.665f, 4.394f)
                lineTo(0.108f, 20.333f)
                curveToRelative(-0.245f, 0.878f, -0.07f, 1.798f, 0.48f, 2.524f)
                curveToRelative(0.552f, 0.727f, 1.391f, 1.143f, 2.302f, 1.143f)
                curveToRelative(1.29f, 0.0f, 2.435f, -0.868f, 2.781f, -2.105f)
                lineToRelative(1.112f, -3.895f)
                horizontalLineToRelative(3.216f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.645f)
                lineToRelative(1.142f, -4.0f)
                horizontalLineToRelative(8.503f)
                curveToRelative(2.414f, 0.0f, 4.434f, -1.721f, 4.899f, -4.0f)
                horizontalLineToRelative(1.101f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(3.747f, 21.351f)
                curveToRelative(-0.107f, 0.382f, -0.459f, 0.649f, -0.856f, 0.649f)
                curveToRelative(-0.284f, 0.0f, -0.536f, -0.125f, -0.708f, -0.351f)
                curveToRelative(-0.172f, -0.228f, -0.225f, -0.504f, -0.15f, -0.772f)
                lineToRelative(2.552f, -8.919f)
                curveToRelative(0.139f, 0.012f, 0.274f, 0.042f, 0.416f, 0.042f)
                horizontalLineToRelative(1.416f)
                lineToRelative(-2.669f, 9.351f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(13.0f, 7.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _gunSquirt!!
    }

private var _gunSquirt: ImageVector? = null
