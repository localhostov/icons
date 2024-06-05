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

public val Icons.Outline.Messages: ImageVector
    get() {
        if (_messages != null) {
            return _messages!!
        }
        _messages = Builder(name = "Messages", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(14.854f)
                curveToRelative(0.0f, 0.794f, 0.435f, 1.52f, 1.134f, 1.894f)
                curveToRelative(0.318f, 0.171f, 0.667f, 0.255f, 1.015f, 0.255f)
                curveToRelative(0.416f, 0.0f, 0.831f, -0.121f, 1.19f, -0.36f)
                lineToRelative(2.661f, -1.774f)
                verticalLineToRelative(3.131f)
                horizontalLineToRelative(10.697f)
                lineToRelative(3.964f, 2.643f)
                curveToRelative(0.36f, 0.24f, 0.774f, 0.361f, 1.19f, 0.361f)
                curveToRelative(0.348f, 0.0f, 0.696f, -0.085f, 1.015f, -0.256f)
                curveToRelative(0.7f, -0.374f, 1.134f, -1.1f, 1.134f, -1.894f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.23f, 17.979f)
                curveToRelative(-0.019f, 0.012f, -0.075f, 0.048f, -0.152f, 0.007f)
                curveToRelative(-0.079f, -0.042f, -0.079f, -0.109f, -0.079f, -0.131f)
                lineTo(1.999f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                lineTo(6.697f, 15.0f)
                lineToRelative(-4.467f, 2.979f)
                close()
                moveTo(22.0f, 21.855f)
                curveToRelative(0.0f, 0.021f, 0.0f, 0.089f, -0.079f, 0.131f)
                curveToRelative(-0.079f, 0.041f, -0.133f, 0.005f, -0.151f, -0.007f)
                lineToRelative(-4.467f, -2.979f)
                horizontalLineToRelative(-9.303f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(14.854f)
                close()
            }
        }
        .build()
        return _messages!!
    }

private var _messages: ImageVector? = null
