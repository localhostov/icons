package me.localx.icons.rounded.filled

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

public val Icons.Filled.WindWarning: ImageVector
    get() {
        if (_windWarning != null) {
            return _windWarning!!
        }
        _windWarning = Builder(name = "WindWarning", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 24.0f)
                arcToRelative(4.241f, 4.241f, 0.0f, false, true, -3.943f, -2.667f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.886f, -0.666f)
                curveTo(9.72f, 22.649f, 12.991f, 22.337f, 13.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(1.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(11.0f, 16.0f)
                curveTo(16.276f, 16.139f, 16.272f, 23.863f, 11.0f, 24.0f)
                close()
                moveTo(20.0f, 19.0f)
                arcToRelative(4.241f, 4.241f, 0.0f, false, true, -3.943f, -2.667f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.886f, -0.666f)
                curveTo(18.72f, 17.649f, 21.991f, 17.337f, 22.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(15.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                curveTo(25.276f, 11.139f, 25.272f, 18.863f, 20.0f, 19.0f)
                close()
                moveTo(20.0f, 9.0f)
                lineTo(17.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                curveToRelative(-0.009f, -2.337f, -3.281f, -2.648f, -4.057f, -0.667f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.886f, -0.666f)
                curveTo(17.616f, -0.415f, 23.952f, 0.421f, 24.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 9.0f)
                close()
                moveTo(7.0f, 0.0f)
                curveTo(-2.251f, 0.294f, -2.249f, 13.707f, 7.0f, 14.0f)
                curveTo(16.251f, 13.706f, 16.249f, 0.293f, 7.0f, 0.0f)
                close()
                moveTo(7.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 11.0f)
                close()
                moveTo(8.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 7.0f)
                lineTo(6.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _windWarning!!
    }

private var _windWarning: ImageVector? = null
