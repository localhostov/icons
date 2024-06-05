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

public val Icons.Bold.GlassEmpty: ImageVector
    get() {
        if (_glassEmpty != null) {
            return _glassEmpty!!
        }
        _glassEmpty = Builder(name = "GlassEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.08f, 1.135f)
                curveToRelative(-0.661f, -0.721f, -1.602f, -1.135f, -2.58f, -1.135f)
                lineTo(4.5f, 0.0f)
                curveToRelative(-0.975f, 0.0f, -1.913f, 0.411f, -2.574f, 1.128f)
                curveToRelative(-0.661f, 0.717f, -0.994f, 1.687f, -0.915f, 2.659f)
                lineToRelative(1.247f, 15.163f)
                curveToRelative(0.233f, 2.832f, 2.64f, 5.05f, 5.481f, 5.05f)
                horizontalLineToRelative(8.434f)
                curveToRelative(2.872f, 0.0f, 5.227f, -2.158f, 5.479f, -5.019f)
                lineToRelative(1.334f, -15.175f)
                curveToRelative(0.086f, -0.975f, -0.244f, -1.949f, -0.906f, -2.671f)
                close()
                moveTo(19.998f, 3.544f)
                lineToRelative(-1.334f, 15.175f)
                curveToRelative(-0.114f, 1.3f, -1.185f, 2.281f, -2.49f, 2.281f)
                lineTo(7.74f, 21.0f)
                curveToRelative(-1.292f, 0.0f, -2.386f, -1.008f, -2.491f, -2.295f)
                lineToRelative(-1.247f, -15.163f)
                curveToRelative(-0.016f, -0.19f, 0.075f, -0.32f, 0.13f, -0.38f)
                curveToRelative(0.056f, -0.06f, 0.177f, -0.161f, 0.368f, -0.161f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.191f, 0.0f, 0.312f, 0.102f, 0.368f, 0.162f)
                curveToRelative(0.056f, 0.061f, 0.146f, 0.191f, 0.13f, 0.382f)
                close()
            }
        }
        .build()
        return _glassEmpty!!
    }

private var _glassEmpty: ImageVector? = null
