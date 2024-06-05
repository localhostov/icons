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

public val Icons.Bold.UpRight: ImageVector
    get() {
        if (_upRight != null) {
            return _upRight!!
        }
        _upRight = Builder(name = "UpRight", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.83f, 23.3f)
                lineTo(0.71f, 16.18f)
                lineTo(10.4f, 6.49f)
                lineTo(5.05f, 1.0f)
                horizontalLineToRelative(14.54f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.91f, 0.0f, 1.76f, 0.35f, 2.4f, 1.0f)
                curveToRelative(0.64f, 0.64f, 1.0f, 1.5f, 0.99f, 2.41f)
                verticalLineToRelative(14.53f)
                reflectiveCurveToRelative(-5.48f, -5.33f, -5.48f, -5.33f)
                lineTo(7.83f, 23.3f)
                close()
                moveTo(4.95f, 16.18f)
                lineToRelative(2.88f, 2.88f)
                lineToRelative(9.66f, -9.66f)
                lineToRelative(2.51f, 2.44f)
                lineTo(20.0f, 4.41f)
                curveToRelative(0.0f, -0.14f, -0.07f, -0.23f, -0.12f, -0.29f)
                curveToRelative(-0.05f, -0.05f, -0.15f, -0.12f, -0.28f, -0.12f)
                horizontalLineToRelative(-7.44f)
                reflectiveCurveToRelative(2.45f, 2.51f, 2.45f, 2.51f)
                lineTo(4.95f, 16.18f)
                close()
            }
        }
        .build()
        return _upRight!!
    }

private var _upRight: ImageVector? = null
