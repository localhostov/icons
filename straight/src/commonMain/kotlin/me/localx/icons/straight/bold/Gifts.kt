package me.localx.icons.straight.bold

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

public val Icons.Bold.Gifts: ImageVector
    get() {
        if (_gifts != null) {
            return _gifts!!
        }
        _gifts = Builder(name = "Gifts", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.011f, 14.037f)
                curveToRelative(0.037f, -0.025f, 0.073f, -0.051f, 0.109f, -0.078f)
                curveToRelative(0.972f, -0.729f, 1.169f, -2.108f, 0.44f, -3.08f)
                reflectiveCurveToRelative(-2.108f, -1.169f, -3.08f, -0.44f)
                curveToRelative(-1.339f, 1.004f, -1.842f, 2.771f, -1.98f, 3.56f)
                curveToRelative(-0.138f, -0.789f, -0.641f, -2.556f, -1.98f, -3.56f)
                curveToRelative(-0.972f, -0.729f, -2.351f, -0.532f, -3.08f, 0.44f)
                reflectiveCurveToRelative(-0.532f, 2.351f, 0.44f, 3.08f)
                curveToRelative(0.036f, 0.027f, 0.072f, 0.052f, 0.109f, 0.078f)
                curveToRelative(-1.688f, 0.248f, -2.989f, 1.706f, -2.989f, 3.463f)
                verticalLineToRelative(3.5f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 8.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                lineTo(13.5f, 8.0f)
                curveToRelative(0.075f, 0.0f, 1.623f, 0.393f, 2.221f, 0.841f)
                curveToRelative(0.518f, 0.388f, 0.936f, 0.844f, 1.279f, 1.322f)
                verticalLineToRelative(-1.662f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.879f)
                lineToRelative(2.439f, -2.439f)
                lineTo(11.939f, 0.439f)
                lineToRelative(-1.939f, 1.939f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 2.379f)
                lineTo(5.061f, 0.439f)
                lineTo(2.939f, 2.561f)
                lineToRelative(2.439f, 2.439f)
                horizontalLineToRelative(-1.879f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(24.0f, 24.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.756f, -1.3f, -3.214f, -2.989f, -3.463f)
                close()
                moveTo(15.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _gifts!!
    }

private var _gifts: ImageVector? = null
