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

public val Icons.Bold.Starfighter: ImageVector
    get() {
        if (_starfighter != null) {
            return _starfighter!!
        }
        _starfighter = Builder(name = "Starfighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 7.5f)
                lineTo(21.0f, 13.0f)
                lineTo(16.855f, 13.0f)
                curveToRelative(-0.8f, -17.412f, -8.921f, -17.378f, -9.71f, 0.0f)
                lineTo(3.0f, 13.0f)
                lineTo(3.0f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.509f, 1.509f, 0.0f, false, false, 2.733f, 0.854f)
                lineToRelative(2.9f, 2.9f)
                arcTo(2.58f, 2.58f, 0.0f, false, false, 9.938f, 22.0f)
                horizontalLineToRelative(4.124f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 4.309f, 1.25f)
                lineToRelative(2.9f, -2.9f)
                arcTo(1.509f, 1.509f, 0.0f, false, false, 24.0f, 19.5f)
                lineTo(24.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 6.0f)
                close()
                moveTo(10.0f, 17.25f)
                arcTo(53.314f, 53.314f, 0.0f, false, true, 11.242f, 5.577f)
                arcToRelative(3.794f, 3.794f, 0.0f, false, true, 1.516f, 0.0f)
                arcTo(53.314f, 53.314f, 0.0f, false, true, 14.0f, 17.25f)
                lineTo(14.0f, 19.0f)
                lineTo(10.0f, 19.0f)
                close()
                moveTo(3.0f, 16.379f)
                lineTo(3.0f, 16.0f)
                lineTo(7.016f, 16.0f)
                curveTo(7.0f, 16.593f, 7.0f, 17.029f, 7.0f, 17.25f)
                verticalLineToRelative(3.128f)
                close()
                moveTo(17.0f, 20.379f)
                lineTo(17.0f, 17.25f)
                curveToRelative(0.0f, -0.221f, 0.0f, -0.657f, -0.016f, -1.25f)
                lineTo(21.0f, 16.0f)
                verticalLineToRelative(0.379f)
                close()
            }
        }
        .build()
        return _starfighter!!
    }

private var _starfighter: ImageVector? = null
