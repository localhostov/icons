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

public val Icons.Bold.PepperHot: ImageVector
    get() {
        if (_pepperHot != null) {
            return _pepperHot!!
        }
        _pepperHot = Builder(name = "PepperHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.061f, 1.923f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.878f, -0.846f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 0.62f, 0.776f)
                arcTo(5.161f, 5.161f, 0.0f, false, true, 12.0f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, false, -0.562f, -1.525f)
                arcTo(5.045f, 5.045f, 0.0f, false, true, 7.061f, 1.923f)
                close()
                moveTo(3.96f, 5.805f)
                arcTo(1.948f, 1.948f, 0.0f, false, true, 4.0f, 6.192f)
                lineTo(4.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(7.0f, 6.192f)
                arcToRelative(4.839f, 4.839f, 0.0f, false, false, -0.1f, -1.0f)
                arcTo(4.888f, 4.888f, 0.0f, false, false, 5.561f, 2.718f)
                arcTo(1.624f, 1.624f, 0.0f, false, true, 5.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcTo(4.6f, 4.6f, 0.0f, false, false, 3.439f, 4.839f)
                arcTo(1.906f, 1.906f, 0.0f, false, true, 3.96f, 5.805f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(0.652f)
                arcToRelative(12.572f, 12.572f, 0.0f, false, true, -3.727f, 8.865f)
                arcTo(11.756f, 11.756f, 0.0f, false, true, 11.967f, 24.0f)
                arcTo(11.778f, 11.778f, 0.0f, false, true, 0.0f, 12.409f)
                curveToRelative(0.0f, -0.157f, 0.0f, -0.313f, 0.01f, -0.467f)
                arcToRelative(3.062f, 3.062f, 0.0f, false, true, 6.048f, -0.548f)
                curveTo(6.586f, 13.69f, 7.842f, 14.0f, 9.0f, 14.0f)
                arcToRelative(2.866f, 2.866f, 0.0f, false, false, 3.0f, -3.012f)
                arcToRelative(6.053f, 6.053f, 0.0f, false, true, 4.173f, -5.7f)
                curveTo(16.042f, 4.1f, 15.62f, 3.0f, 14.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                curveToRelative(1.03f, 0.0f, 4.221f, 0.4f, 4.67f, 5.116f)
                arcTo(6.009f, 6.009f, 0.0f, false, true, 24.0f, 11.0f)
                close()
                moveTo(21.0f, 11.0f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, false, -0.156f, -0.911f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -5.676f, 0.009f)
                arcToRelative(2.941f, 2.941f, 0.0f, false, false, -0.168f, 0.914f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 9.0f, 17.0f)
                curveToRelative(-3.051f, 0.0f, -5.134f, -1.752f, -5.866f, -4.934f)
                lineToRelative(-0.126f, 0.008f)
                curveTo(3.0f, 12.185f, 3.0f, 12.3f, 3.0f, 12.409f)
                arcTo(8.608f, 8.608f, 0.0f, false, false, 11.884f, 21.0f)
                arcToRelative(8.756f, 8.756f, 0.0f, false, false, 6.278f, -2.615f)
                arcTo(9.55f, 9.55f, 0.0f, false, false, 21.0f, 11.652f)
                close()
            }
        }
        .build()
        return _pepperHot!!
    }

private var _pepperHot: ImageVector? = null
