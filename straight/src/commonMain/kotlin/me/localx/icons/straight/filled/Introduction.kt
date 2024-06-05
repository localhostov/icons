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

public val Icons.Filled.Introduction: ImageVector
    get() {
        if (_introduction != null) {
            return _introduction!!
        }
        _introduction = Builder(name = "Introduction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 13.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(15.0f, 19.0f)
                verticalLineToRelative(5.0f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-7.0f)
                lineTo(0.0f, 17.0f)
                lineTo(0.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(24.0f, 2.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-5.962f, 0.004f)
                lineToRelative(-2.822f, 2.37f)
                curveToRelative(-0.526f, 0.336f, -1.215f, -0.041f, -1.215f, -0.665f)
                lineToRelative(-0.002f, -7.707f)
                curveToRelative(0.0f, -1.104f, 0.895f, -2.0f, 1.999f, -2.0f)
                lineTo(21.999f, 0.0f)
                curveToRelative(1.105f, 0.0f, 2.001f, 0.895f, 2.001f, 2.0f)
                close()
            }
        }
        .build()
        return _introduction!!
    }

private var _introduction: ImageVector? = null
