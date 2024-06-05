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

public val Icons.Filled.ClipboardUser: ImageVector
    get() {
        if (_clipboardUser != null) {
            return _clipboardUser!!
        }
        _clipboardUser = Builder(name = "ClipboardUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(0.171f)
                curveToRelative(0.413f, -1.164f, 1.525f, -2.0f, 2.829f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.304f, 0.0f, 2.416f, 0.836f, 2.829f, 2.0f)
                horizontalLineToRelative(0.171f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(9.5f, 10.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                close()
                moveTo(16.968f, 17.751f)
                curveToRelative(-0.559f, -2.173f, -2.648f, -3.751f, -4.968f, -3.751f)
                reflectiveCurveToRelative(-4.409f, 1.578f, -4.968f, 3.751f)
                curveToRelative(-0.138f, 0.535f, 0.184f, 1.08f, 0.719f, 1.217f)
                curveToRelative(0.537f, 0.141f, 1.08f, -0.184f, 1.217f, -0.719f)
                curveToRelative(0.33f, -1.282f, 1.633f, -2.249f, 3.032f, -2.249f)
                reflectiveCurveToRelative(2.702f, 0.967f, 3.032f, 2.249f)
                curveToRelative(0.116f, 0.452f, 0.522f, 0.751f, 0.968f, 0.751f)
                curveToRelative(0.082f, 0.0f, 0.166f, -0.01f, 0.25f, -0.032f)
                curveToRelative(0.535f, -0.137f, 0.857f, -0.683f, 0.719f, -1.217f)
                close()
            }
        }
        .build()
        return _clipboardUser!!
    }

private var _clipboardUser: ImageVector? = null
