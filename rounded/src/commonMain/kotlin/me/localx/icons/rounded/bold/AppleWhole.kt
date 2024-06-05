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

public val Icons.Bold.AppleWhole: ImageVector
    get() {
        if (_appleWhole != null) {
            return _appleWhole!!
        }
        _appleWhole = Builder(name = "AppleWhole", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.341f, 6.0f)
                horizontalLineToRelative(-0.349f)
                arcToRelative(6.92f, 6.92f, 0.0f, false, false, 2.547f, -1.516f)
                arcToRelative(5.769f, 5.769f, 0.0f, false, false, 1.453f, -3.356f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.12f, -1.12f)
                arcToRelative(5.769f, 5.769f, 0.0f, false, false, -3.356f, 1.453f)
                arcTo(5.47f, 5.47f, 0.0f, false, false, 13.2f, 4.248f)
                arcTo(10.808f, 10.808f, 0.0f, false, false, 11.749f, 0.668f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.5f, 1.664f)
                arcTo(8.209f, 8.209f, 0.0f, false, true, 10.449f, 6.0f)
                lineTo(8.659f, 6.0f)
                arcTo(8.845f, 8.845f, 0.0f, false, false, 0.0f, 15.0f)
                curveToRelative(-0.194f, 5.655f, 5.933f, 10.877f, 11.074f, 8.32f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.948f, 0.017f)
                curveTo(18.138f, 25.882f, 24.181f, 20.578f, 24.0f, 15.0f)
                arcTo(8.845f, 8.845f, 0.0f, false, false, 15.341f, 6.0f)
                close()
                moveTo(15.341f, 21.0f)
                arcToRelative(1.817f, 1.817f, 0.0f, false, true, -0.916f, -0.315f)
                arcTo(4.833f, 4.833f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(4.74f, 4.74f, 0.0f, false, false, -2.308f, 0.657f)
                arcTo(2.065f, 2.065f, 0.0f, false, true, 8.659f, 21.0f)
                curveToRelative(-7.477f, -0.246f, -7.474f, -11.756f, 0.0f, -12.0f)
                horizontalLineToRelative(6.682f)
                curveTo(22.82f, 9.247f, 22.814f, 20.756f, 15.341f, 21.0f)
                close()
            }
        }
        .build()
        return _appleWhole!!
    }

private var _appleWhole: ImageVector? = null
