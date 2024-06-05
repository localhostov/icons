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
                moveToRelative(24.0f, 6.0f)
                horizontalLineToRelative(-2.101f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                lineTo(5.0f, 2.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.493f)
                lineTo(0.108f, 20.333f)
                curveToRelative(-0.245f, 0.878f, -0.07f, 1.798f, 0.48f, 2.524f)
                curveToRelative(0.552f, 0.727f, 1.391f, 1.143f, 2.302f, 1.143f)
                curveToRelative(1.29f, 0.0f, 2.435f, -0.868f, 2.781f, -2.105f)
                lineToRelative(1.112f, -3.895f)
                horizontalLineToRelative(3.216f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.645f)
                lineToRelative(1.142f, -4.0f)
                horizontalLineToRelative(8.503f)
                curveToRelative(2.414f, 0.0f, 4.435f, -1.721f, 4.899f, -4.0f)
                horizontalLineToRelative(2.101f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.747f, 21.351f)
                curveToRelative(-0.107f, 0.382f, -0.459f, 0.649f, -0.856f, 0.649f)
                curveToRelative(-0.284f, 0.0f, -0.536f, -0.125f, -0.708f, -0.351f)
                curveToRelative(-0.172f, -0.228f, -0.225f, -0.504f, -0.15f, -0.772f)
                lineToRelative(2.54f, -8.877f)
                horizontalLineToRelative(1.844f)
                lineToRelative(-2.669f, 9.351f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _gunSquirt!!
    }

private var _gunSquirt: ImageVector? = null
