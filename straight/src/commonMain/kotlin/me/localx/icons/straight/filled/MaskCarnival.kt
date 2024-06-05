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

public val Icons.Filled.MaskCarnival: ImageVector
    get() {
        if (_maskCarnival != null) {
            return _maskCarnival!!
        }
        _maskCarnival = Builder(name = "MaskCarnival", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.0f)
                arcToRelative(34.177f, 34.177f, 0.0f, false, false, -9.979f, 1.587f)
                curveTo(13.238f, 8.549f, 15.828f, 7.0f, 19.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 1.686f, -6.0f, 5.0f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 8.0f)
                curveToRelative(0.0f, -3.314f, -2.686f, -5.0f, -6.0f, -5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 7.0f)
                curveToRelative(3.172f, 0.0f, 5.762f, 1.549f, 5.979f, 4.587f)
                arcTo(34.184f, 34.184f, 0.0f, false, false, 1.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(1.0f)
                curveTo(0.0f, 22.311f, 4.386f, 24.0f, 7.0f, 24.0f)
                arcToRelative(5.334f, 5.334f, 0.0f, false, false, 3.055f, -1.168f)
                arcTo(3.615f, 3.615f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(3.615f, 3.615f, 0.0f, false, true, 1.945f, 0.832f)
                arcTo(5.334f, 5.334f, 0.0f, false, false, 17.0f, 24.0f)
                curveToRelative(2.614f, 0.0f, 7.0f, -1.689f, 7.0f, -13.0f)
                lineTo(24.0f, 10.0f)
                close()
                moveTo(6.123f, 19.362f)
                curveTo(4.583f, 19.756f, 4.242f, 17.815f, 3.77f, 15.0f)
                arcToRelative(34.574f, 34.574f, 0.0f, false, true, 6.262f, 1.619f)
                lineToRelative(0.962f, 0.379f)
                curveTo(8.761f, 17.216f, 7.3f, 19.061f, 6.123f, 19.362f)
                close()
                moveTo(17.849f, 19.362f)
                curveToRelative(-1.175f, -0.3f, -2.638f, -2.146f, -4.871f, -2.364f)
                lineToRelative(0.962f, -0.379f)
                arcTo(34.574f, 34.574f, 0.0f, false, true, 20.2f, 15.0f)
                curveTo(19.73f, 17.815f, 19.389f, 19.756f, 17.849f, 19.362f)
                close()
            }
        }
        .build()
        return _maskCarnival!!
    }

private var _maskCarnival: ImageVector? = null
